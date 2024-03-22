package com.librarymanagement.application;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.librarymanagement.library.Library;
import com.librarymanagement.admin.*;
public class Main {

	public static void main(String[] args) {
		List<Admin> admins=new ArrayList<>();
		Admin a1=new Admin("santhosh", 413313);
		Admin a2=new Admin("santhish",765846);
		admins.add(a1);
		admins.add(a2);
		List<Library> libraries=new ArrayList();
		Library l1=new Library("Chennai Central Library", 31231, "Chennai", 10000,admins);
		Library l2=new Library("Tenkasi Central Library", 53314, "Tenkasi", 500,admins);
		libraries.add(l1);
		libraries.add(l2);
		System.out.println(libraries);
	}
}

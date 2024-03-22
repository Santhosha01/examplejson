package com.librarymanagement.library;

import java.util.List;

import com.librarymanagement.admin.Admin;

public class Library {
   String Name;
   long LibraryId;
   String Location;
   int Totalcapacity;
   List<Admin> admin;

public Library(String name, long libraryId, String location, int totalcapacity, List<Admin> admin) {
	super();
	Name = name;
	LibraryId = libraryId;
	Location = location;
	Totalcapacity = totalcapacity;
	this.admin = admin;
}
public List<Admin> getAdmin() {
	return admin;
}
public void setAdmin(List<Admin> admin) {
	this.admin = admin;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public long getLibraryId() {
	return LibraryId;
}
public void setLibraryId(long libraryId) {
	LibraryId = libraryId;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
public int getTotalcapacity() {
	return Totalcapacity;
}
public void setTotalcapacity(int totalcapacity) {
	Totalcapacity = totalcapacity;
}
@Override
public String toString() {
	return "Library [Name=" + Name + ", LibraryId=" + LibraryId + ", Location=" + Location + ", Totalcapacity="
			+ Totalcapacity + ", admin=" + admin + "]";
} 
}

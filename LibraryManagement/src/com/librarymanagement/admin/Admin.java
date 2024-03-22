package com.librarymanagement.admin;

public class Admin {
   String Name;
   long AdminId;
public Admin(String name, long adminId) {
	super();
	Name = name;
	AdminId = adminId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public long getAdminId() {
	return AdminId;
}
public void setAdminId(long adminId) {
	AdminId = adminId;
}
@Override
public String toString() {
	return "Admin [Name=" + Name + ", AdminId=" + AdminId + "]";
}
   
}

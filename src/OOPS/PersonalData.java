package OOPS;

public class PersonalData {
	
private String name;
private String surname;
private int yearOfBirth;
private int id;
private int sin;
private String address;
private String email;

public PersonalData(String name, String surname, int yearOfBirth, int id, int sin, String address, String email) {
	super();
	this.name = name;
	this.surname = surname;
	this.yearOfBirth = yearOfBirth;
	this.id = id;
	this.sin = sin;
	this.address = address;
	this.email = email;
}
public PersonalData() {
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public int getYearOfBirth() {
	return yearOfBirth;
}
public void setYearOfBirth(int yearOfBirth) {
	this.yearOfBirth = yearOfBirth;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSin() {
	return sin;
}
public void setSin(int sin) {
	this.sin = sin;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void print() {
	System.out.println("name: "+name);
	System.out.println("surname: "+surname);
	System.out.println("year of birth: "+yearOfBirth);
	System.out.println("id: "+id);
	System.out.println("sin: "+sin);
	System.out.println("address: "+address);
	System.out.println("E-mail: "+email);
	System.out.println("You are protected!");
}
	

} 




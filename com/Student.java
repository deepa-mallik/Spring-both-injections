package com;

public class Student {
	
	private int id;
	private String name,address,grade,email;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Student() {	
		System.out.println("default constructor\n");	
	}  

    public Student(int id, String name, String address, String grade, String email) {      
    	this.id = id;  
    	this.name = name;
    	this.address = address;
    	this.grade =  grade;
    	this.email = email;
    }
	
    public void display1(){  
        System.out.println("The student is "+id+"\n"+"name is "+name+"\n"+"the address is "
    +address + "\n"+"the grade is " +grade + "\n"  +"the email is " +email+"\n");
        
    }
	
    public void display2(){  
        System.out.println("The student is "+id+"\n"+"name is "+name+"\n"+"the address is "
    +address + "\n"+"the grade is " +grade + "\n"  +"the email is " +email+"\n");
        
    }

}

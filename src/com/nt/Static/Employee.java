package com.nt.Static;

public class Employee {
	int empid;
	String ename;
	static String company="NIT";
	
	Employee(int empid,String ename){
		this.empid=empid;
		this.ename=ename;
	}
	void display() {
		System.out.println(empid+" "+ename+" "+company);
	}

	public static void main(String[] args) {
		Employee obj=new Employee(101,"Gagan");
		obj.display();
		Employee obj2=new Employee(102,"Sanu");
		obj2.display();

	}

}

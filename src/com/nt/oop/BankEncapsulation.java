package com.nt.oop;

public class BankEncapsulation {
	private String Cname;
	private String Addrs;
	private Double Accno;

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getAddrs() {
		return Addrs;
	}

	public void setAddrs(String addrs) {
		Addrs = addrs;
	}

	public Double getAccno() {
		return Accno;
	}

	public void setAccno(Double accno) {
		Accno = accno;
	}
	
public static class SBI{

	public static void main(String[] args) {
		BankEncapsulation obj=new BankEncapsulation();
		obj.setCname("My name is Gagan");
		obj.setAccno(695874621d);
		obj.setAddrs("I belongs to Odisha");
		
		System.out.println(obj.getCname());
		System.out.println(obj.getAccno());
		System.out.println(obj.getAddrs());

	}

}
}

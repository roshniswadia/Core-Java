package com;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee extends Person implements Externalizable {

	private int empId;

	private String empName;

	private Address address;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee() {
		super();
		System.out.println("employee constructor called");
	}

	public Employee(String name, String nationality, int empId, String empName, Address address) {
		super(name, nationality);
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		setName((String) in.readObject());
		setNationality((String) in.readObject());
		empId = in.readInt();
		empName = (String) in.readObject();
		address = (Address) in.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(getName());
		out.writeObject(getNationality());
		out.writeInt(empId);
		out.writeObject(empName);
		out.writeObject(address);
	}

	

}

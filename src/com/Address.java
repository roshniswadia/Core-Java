package com;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Address implements Externalizable{

	private String street;
	private int pinCode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	public Address() {
		System.out.println("Address Constructor Called");
	}
	public Address(String street, int pinCode) {
		super();
		this.street = street;
		this.pinCode = pinCode;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		street = (String) in.readObject();
		pinCode = (int) in.readInt();
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(street);
		out.writeInt(pinCode);
		
	}
	
	
}

package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {

	public static void main(String[] args) {

		Address address = new Address("Wakad", 111);
		Employee emp = new Employee("Roshni", "Indian", 1, "Roshni", address);

		try {

			System.out.println("Before Serialization : " + emp.getEmpId() + " | " + emp.getEmpName() + " | " + emp.getName()
					+ " | " + emp.getNationality() + " | " + emp.getAddress());

			FileOutputStream fout = new FileOutputStream("serialObject.ser");
			ObjectOutputStream objOut = new ObjectOutputStream(fout);
			objOut.writeObject(emp);

		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Employee empNew = null;

		FileInputStream fin;
		try {
			fin = new FileInputStream("serialObject.ser");
			ObjectInputStream objIn = new ObjectInputStream(fin);
			
			empNew = (Employee) objIn.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("After Deserialization");
		System.out.println("Person Name" + empNew.getName());
		System.out.println("Person Nationality" + empNew.getNationality());
		System.out.println("Employee Id" + empNew.getEmpId());
		System.out.println("Employee Name" + empNew.getEmpName());
		System.out.println("Employee Address street" + empNew.getAddress().getStreet());
		System.out.println("Employee Address pin" + empNew.getAddress().getPinCode());
		

	}
}

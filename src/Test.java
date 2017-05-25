import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {

		Man man = new Man("Male", "Black", "Anderw", "Delhi");

		/*
		 * Serializing Man's instance
		 */
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("serialObject.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(man);

		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}

		/*
		 * Deserializing Man's instance
		 */
		Man manout = null;

		try {
			FileInputStream fileInputStream = new FileInputStream("serialobject.ser");
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
			manout = (Man) inputStream.readObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}

		/*
		 * Printing values from deserialized Man's object
		 */
		System.out.println("Printing value of Deserailized Man's instance :");
		System.out.println("Gender: " + manout.getGender());
		System.out.println("Color: " + manout.getColor());
		System.out.println("Name: " + manout.getName());
		System.out.println("Address: " + manout.getAddress());

	}

}

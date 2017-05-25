import java.io.Serializable;

public class Man extends Human implements Serializable {

	private static final long serialVersionUID = 1L;  
	 private String name;  
	 private String address;  
	  
	 Man(String gender, String color, String name, String address) {  
	  super(gender, color);  
	  this.name = name;  
	  this.address = address;  
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
}

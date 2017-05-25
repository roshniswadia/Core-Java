package GenericsExample;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
	
	public static void main(String[] args) {
		List<?> testList = new ArrayList<String>();
		List<Object> testStringList = new ArrayList<Object>();
		
		//testList.add("Roshni"); testList is readonly | you cannot add anything
		testStringList.add("Roshni");
	}

}

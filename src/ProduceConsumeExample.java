import java.util.ArrayList;
import java.util.List;
import java.lang.Thread;

public class ProduceConsumeExample {
	
	public static void main(String[] args) {
		List<Integer> sharedList = new ArrayList<Integer>();
		int size = 3;
		
		Thread producer = new Thread(new Produce(sharedList, size),"Producer");
		Thread consumer = new Thread(new Consume(sharedList, size),"Consumer");
		
		producer.start();
		consumer.start();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

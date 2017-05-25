import java.util.List;

public class Consume implements Runnable {

	private final List<Integer> sharedList;
	private final int SIZE;
	
	public Consume(List<Integer> sharedList, int size) {
		
		this.sharedList=sharedList;
		this.SIZE= size;
	}
	
	@Override
	public void run() {
		while(true){
		try {
			System.out.println("Consuming " +consume());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		}
	}

	
	public int consume() throws InterruptedException{
		
		while(sharedList.size()==0){
			synchronized (sharedList) {
				System.out.println("Thread " + Thread.currentThread().getName()+ " waiting for data to be produced");
				sharedList.wait();
			}
		}
	
		synchronized (sharedList) {
			int value = sharedList.remove(0);
			sharedList.notifyAll();
			return value;
		}
	}
	
	
}

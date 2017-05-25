import java.util.List;

public class Produce implements Runnable {

	private final List<Integer> sharedList;
	private final int SIZE;
	
	public Produce(List<Integer> sharedList,int size) {
		this.sharedList = sharedList;
		this.SIZE = size;
	}

	@Override
	public void run() {
		for(int i = 0;i<6;i++){
			try {
				System.out.println("Producing "+i);
				produce(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void produce(int value) throws InterruptedException {

		while (sharedList.size() == SIZE) {
			synchronized (sharedList) {
				System.out.println("Thread "+Thread.currentThread().getName()+" Waiting for List to be Empty");
				sharedList.wait();
			}
		}
		
		synchronized(sharedList){
			sharedList.add(value);
			sharedList.notifyAll();
		}
	}

}

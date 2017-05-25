package com;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	private final BlockingQueue<Integer> sharedQueue;
	
	public Consumer(BlockingQueue<Integer> blockingQueue) {
		this.sharedQueue = blockingQueue;
	}

	@Override
	public void run() {
		while(true){
			try {
				System.out.println("Consumed: "+ sharedQueue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}

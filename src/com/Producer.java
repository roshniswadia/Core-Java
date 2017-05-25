package com;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	private final BlockingQueue<Integer> blockingQueue;
	
	public Producer(BlockingQueue<Integer> blockingQueue) {
		this.blockingQueue=blockingQueue;
	}

	@Override
	public void run() {
		for(int i= 0;i<6;i++){
			System.out.println("Produced : "+i);
			try {
				blockingQueue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

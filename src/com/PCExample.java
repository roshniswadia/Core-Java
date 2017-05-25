package com;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PCExample {
	
	public static void main(String[] args) {
		
		BlockingQueue blockingQueue = new LinkedBlockingQueue<Integer>();
		
		Thread producer = new Thread(new Producer(blockingQueue));
		Thread consumer = new Thread(new Consumer(blockingQueue));
		
		producer.start();
		consumer.start();

		
	}

}

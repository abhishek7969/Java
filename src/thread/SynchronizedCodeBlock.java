package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchronizedCodeBlock {
	
	private static Object lock1 = new Object();
	private static Object lock2 = new Object();
	
	private static Random random = new Random();
	
	private static List<Integer> list1 = new ArrayList<Integer>();
	
	private static List<Integer> list2 = new ArrayList<Integer>();
	
	/**
	 * stageOne stageTwo are 2 independent code which can be executed by 2 different thread separately , since when we use synchronized at the method level, it acquired the 
	 * monitor lock,as there is only one monitor lock, the thread has to wait. solution is to create a two different object lock and thread can wait on those lock. As we are 
	 * locking on different object. No two thread can run the same method at the same time.
	 * 
	 * these method don't write to the same data.
	 * @throws InterruptedException
	 */
	
	/*public static synchronized void stageOne() throws InterruptedException{
	Thread.sleep(1);
	list1.add(random.nextInt(100));
	}
	
	public static synchronized void stageTwo() throws InterruptedException{
	Thread.sleep(1);
	list2.add(random.nextInt(100));
	}*/
	
	public static  void stageOne() throws InterruptedException{
		synchronized (lock1) {
			Thread.sleep(1);
			list1.add(random.nextInt(100));
		}		
	}
		
	public static  void stageTwo() throws InterruptedException{
		synchronized (lock2) {
			Thread.sleep(1);
			list2.add(random.nextInt(100));
		}
	}
	
	
	public static void process() throws InterruptedException{
		for(int i = 0; i<1000; i++){
			stageOne();
			stageTwo();
		}
	}
	
	public  static void main(String[] args) throws InterruptedException {
		
		System.out.println("Starting...");
		long start = System.currentTimeMillis();
		
//		process(); // can make two threads to do this processing 
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					process();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			  }
			});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					process();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			  }
			});
		
		t1.start(); t2.start();
		
		t1.join();t2.join();
		
		
		long end = System.currentTimeMillis();
		System.out.println("Time taken "+ (end-start));
		
		System.out.println("List 1 size = "+list1.size() + " ---  List 2 size = "+ list2.size());
		
		
	}

}

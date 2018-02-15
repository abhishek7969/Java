package thread.ReentrantLock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Processor {
	
	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition con = lock.newCondition();
	
	/**
	 * Await and signal as wait and notify can only be applied on the synchronized code block;
	 */
	
	public void increment(){
		for(int i = 1 ; i<=10000 ; i++){
			count++;
		}
	}
	
	public void producer() throws InterruptedException{
		lock.lock();
		System.out.println("In producer waiting");
		con.await();
		System.out.println("Woken Up !!!");
		
		
		increment();
		lock.unlock();
		
	}

	@SuppressWarnings("resource")
	public void consumer() throws InterruptedException{
		Thread.sleep(2000);
		lock.lock();

		System.out.println("Acquired the lock !!");
		System.out.println("Press return key !!");
		
		new Scanner(System.in).nextLine();
		System.out.println("Return pressed !!");
		
		con.signal();
		
		increment();
		lock.unlock();
	}
	
	public void finished(){
		System.out.println(count);
	}
}

package thread;

public class SynchronizedKeyword_1 {
	
	private int count = 0;
	public synchronized void increment(){
		count++;
	}
	
	public static void main(String[] args) {
		SynchronizedKeyword_1  sn = new SynchronizedKeyword_1();
		sn.doWork();
	}
	
	public void doWork(){
		
		Thread t1 = new Thread(new Runnable (){
			public void run(){
				for(int i =0 ;i <10000; i++){
					//count++; its a 3 step process get the value of count , add 1 to it and again assign it to the count.
					increment();
				}
			}			
		});
		
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				for(int i =0 ; i< 10000 ; i++){
					//count++;
					increment();
				}
			}
		});
		t1.start();
		t2.start();
		
		
		try {
			t1.join(); t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Count value = "+ count );
	}
	

}

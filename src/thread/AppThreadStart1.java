package thread;

public class AppThreadStart1 {

	public static void main(String[] args) {
		Runner r1 = new Runner();
		r1.start();
		
		Runner r2 = new Runner();
		r2.start();
	}
	
}


class Runner extends Thread{
	public void run(){
		
		for(int i=0; i<10 ;i++){
			System.out.println("Hello "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

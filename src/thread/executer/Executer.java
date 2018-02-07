package thread.executer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Executer {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		for(int i =0 ;i<5;i++){
			Runnable worker = new WorkerThread(" "+i);
			es.execute(worker);
		}
		es.shutdown();
		
		while(!es.isTerminated()){
		}
		System.out.println("finished all theread.");
	}
}

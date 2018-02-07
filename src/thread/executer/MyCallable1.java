package thread.executer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/**
 * invokeAll() implementation
 * @author Abhishek.Kumar
 *
 */
public class MyCallable1{
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Set<Callable<String>> callables = new HashSet<Callable<String>>();
		
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return Thread.currentThread().getName()+ " Task 1";
		    }
		});
		
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return Thread.currentThread().getName()+" Task 2";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return Thread.currentThread().getName()+" Task 3";
		    }
		});

		/**
		 * invoke any implementation
		 */
		String result = executorService.invokeAny(callables);
		System.out.println(result);
		
		
		/**
		 * invoke all implementation
		 */
		List<Future<String>> futures = executorService.invokeAll(callables);

		for(Future<String> future : futures){
		    System.out.println("future.get = " + future.get());
		}

		executorService.shutdown();
	}

	

}

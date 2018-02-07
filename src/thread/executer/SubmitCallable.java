package thread.executer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Future<String> future = executorService.submit(new Callable<String>(){
			public String call(){
				System.out.println("called executable");
				return "Retuened from call method";
			}
		});
		System.out.println(future.get());
	}

}

package thread.executer;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(5)	;
		Future<String> future = executor.submit(new Callable<String>() {
			public String call(){
				System.out.println("Annonium callable !!");
				return "Test run callable";
			}
		});
		System.out.println(future.get());
	}

}

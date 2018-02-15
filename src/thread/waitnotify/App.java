package thread.waitnotify;

public class App {

	public static void main(String[] args) {
		Processor pro = new Processor();

		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pro.producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pro.consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

}

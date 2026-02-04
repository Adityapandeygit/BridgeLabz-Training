package java_8_features.functionalInterface.functionalInterfaces;

public class BackgroundJobExecution {
	public static void main(String[] args) {
		Runnable backgroundTask = new Runnable() {
			public void run() {
				System.out.println("Background job started...");

                try {
                    Thread.sleep(3000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Background job completed.");
			}
		};
		Thread t = new Thread(backgroundTask);
        t.start();

        System.out.println("Main method finished (without waiting).");
	}
}

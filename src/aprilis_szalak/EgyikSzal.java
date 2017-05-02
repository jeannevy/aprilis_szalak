package aprilis_szalak;

public class EgyikSzal implements Runnable {
	
	public Boolean isRunning;

	public EgyikSzal () {
		this.isRunning = false;
	}
	
	public void run() {
		while (this.isRunning == true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

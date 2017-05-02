package aprilis_szalak;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static HashMap<Integer, Thread> threadMap = new HashMap<Integer, Thread>();
	static HashMap<Integer, EgyikSzal> egyikSzalMap = new HashMap<Integer, EgyikSzal>();

		
	private static void startThreads(int howMany) {
		EgyikSzal szal = new EgyikSzal();
		szal.isRunning = true;
		for (int i = 0; i < howMany; i++) {
			
			Thread threadx = new Thread(szal);
			Integer it = i;
			Main.threadMap.put(it, threadx);
			Main.egyikSzalMap.put(it, szal);
			threadx.start();
		}
	}
	
	private static int howManyThread() {
		System.out.println("hany szalat akarsz inditani?\n");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int number = sc.nextInt();
		sc.close();
		return number;
	}
	
	private static void showStatus() {
		for (Map.Entry<Integer, Thread> e: Main.threadMap.entrySet()) {
			Integer key = e.getKey();
//			Thread thread = e.getValue();
			EgyikSzal szal = Main.egyikSzalMap.get(key);
			System.out.printf("Szal: %d. isRunning: \n", key.intValue());
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) 	{	
		while (true) {
			Integer count = Main.howManyThread();
			Main.startThreads(count);
			Main.showStatus();
			Main.egyikSzalMap.get(2).isRunning = false;
			Main.showStatus();
			
//			 hany szalat akarsz inditani
//			 szalak inditasa, ha nagyobb mint nulla azaz valid input
//			 melyik szalat akarod leloni?
//			 sttáuszt kiirat
//			 indit még szalat
//			 leallitja az összeset
////			
		}

	}

}

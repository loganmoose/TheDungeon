
public class theDungon {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//printTitle();
		
		levelInit();
		
		
	}
	
//☺ ☻
//	♣ ♠ ♥
//	∩
	//♀
	//¥
	//☼
	//°
	//░

	public static void levelInit(){
		move moverr = new move();
		moverr.setup(5, 7);
		moverr.setDefaultDoor(5,6);
		
		move.playerX = 3;
		move.playerY = 3;
		
		
		

		while (true) {
			Messagebox m = new Messagebox();
		//	m.printBox("TRUMP VACATION IN RUSSIA", '■' , '$');
			char[][] map = new char[move.maxWallX + 1][move.maxWallY + 1];
			
			

			makeWalls(map, '■', '■', '■', '■' );
			
			//setEntity puts objects & charachetr on map

			setEntity(map);
			

			printMap(map);
			
			
			moverr.directon(move.playerX, move.playerY);
			
			
			
		//	m.printBox("TRUMP VACATION IN RUSSIA", '■' , '$');

		}
	}
	
	
	
	public static void setEntity(char[][] a) {

		a[move.playerX][move.playerY] = '☺'; //character pos

		a[move.object1X][move.object1Y] = '|'; // object in room 
	}
	
	public static void SetObject(char[][] a) {

		

	}

	static void makeWalls(char[][] a, char top, char bottom, char leftWall, char rightWall ) {

		// top = '■';
		// bottom = '■';
		// leftWall = '■';
	//	 rightWall = '■';
		
		for (int i = 0; i < move.maxWallX + 1; i++) {
			a[move.minWallX][i] = leftWall;
		}

		for (int i = 0; i < move.maxWallX + 1; i++) {
			a[move.maxWallX][i] = rightWall;
		}

		for (int i = 0; i < move.maxWallY + 1; i++) {
			a[i][0] = top;
		}

		for (int i = 0; i < move.maxWallY + 1; i++) {
			a[i][move.maxWallY - 1] = bottom;
		}
		
		
	}

	static void printMap(char[][] a) {
		for (int i = 0; i < move.maxWallX; i++) {

			System.out.println("");
			
			for (int q = 0; q <= move.maxWallX; q++) {
				
				
				
				System.out.print(a[q][i] + "░");

			}
		}
		
	}
static void printTitle(){
		
		//gradients --->  ¦¦¦   Spikes --> ? ? Other --> †   P?????
		
		
		
		System.out.println("  ______                              ______   ");
		System.out.println(" /_  __/______  ______ ___  ____     / ____/_____________ _____  ___   ");
		System.out.println("  / / / ___/ / / / __ `__ \\/ __ \\   / __/ / ___/ ___/ __ `/ __ \\/ _ \\  ");
		System.out.println(" / / / /  / /_/ / / / / / / /_/ /  / /___(__  ) /__/ /_/ / /_/ /  __/");
		System.out.println("/_/ /_/   \\__,_/_/ /_/ /_/ .___/  /_____/____/\\___/\\__,_/ .___/\\___/ ");
		System.out.println("                        /_/                            /_/  ");
		System.out.println("");
		sleepQuietly(2000);
		System.out.println("In Soviet Russia");
		System.out.println("");
		sleepQuietly(1000);
		System.out.println("You do not Deport Mexicans");
		System.out.println("");
		sleepQuietly(1000);
		System.out.println("Mexicans Deport");
		System.out.println("");
		sleepQuietly(1000);
		System.out.println("__   _______ _   _ ");
		System.out.println("\\ \\ / /  _  | | | |");
		System.out.println(" \\ V /| | | | | | |");
		System.out.println("  \\ / | | | | | | |");
		System.out.println("  | | \\ \\_/ / |_| |");
		System.out.println("  \\_/  \\___/ \\___/");
		sleepQuietly(2000);
	}
	
	public static void sleepQuietly(long duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			// ignore this exception
		}
	}
}


public class theDungon {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		moverr.setup(3, 3);

		move.playerX = 3;
		move.playerY = 3;
		
		
		move.object1X =  7 ;
		move.object1Y = 6;

		while (true) {
			Messagebox m = new Messagebox();
		//	m.printBox("TRUMP VACATION IN RUSSIA", '■' , '$');
			char[][] map = new char[8][8];

			makeWalls(map, '■', '■', '■', '■' );

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
		
		for (int i = 0; i < 8; i++) {
			a[0][i] = leftWall;
		}

		for (int i = 0; i < 8; i++) {
			a[7][i] = rightWall;
		}

		for (int i = 0; i < 8; i++) {
			a[i][0] = top;
		}

		for (int i = 0; i < 8; i++) {
			a[i][7] = bottom;
		}
	}

	static void printMap(char[][] a) {

		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][0] + "░");

		}

		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][1] + "░");

		}
		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][2] + "░");

		}

		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][3] + "░");

		}

		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][4] + "░");

		}
		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][5] + "░");

		}
		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][6] + "░");

		}
		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][7] + "░");

		}

	}
}

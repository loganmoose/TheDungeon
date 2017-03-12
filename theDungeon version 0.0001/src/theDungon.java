
public class theDungon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		move moverr = new move();
		moverr.setup(3, 3);

		move.playerX = 3;
		move.playerY = 3;

		while (true) {

			char[][] map = new char[8][8];

			makeWalls(map);

			moverr.directon(move.playerX, move.playerY);

			Setcharacter(map);

			printMap(map);

		}
	}

	public static void Setcharacter(char[][] a) {

		a[move.playerX][move.playerY] = '@';

	}

	static void makeWalls(char[][] a) {

		for (int i = 0; i < 8; i++) {
			a[0][i] = '|';
		}

		for (int i = 0; i < 8; i++) {
			a[7][i] = '|';
		}

		for (int i = 0; i < 8; i++) {
			a[i][0] = '_';
		}

		for (int i = 0; i < 8; i++) {
			a[i][7] = '_';
		}
	}

	static void printMap(char[][] a) {

		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][0] + " ");

		}

		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][1] + " ");

		}
		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][2] + " ");

		}

		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][3] + " ");

		}

		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][4] + " ");

		}
		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][5] + " ");

		}
		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][6] + " ");

		}
		System.out.println("");

		for (int i = 0; i < 8; i++) {

			System.out.print(a[i][7] + " ");

		}

	}
}

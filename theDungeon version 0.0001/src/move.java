import java.util.Scanner;

public class move {

	public static int playerX;
	public static int playerY;
	
	
	public static int minWallX = 0;
	public static int minWallY = 0;
	
	public static int maxWallX = 13;
	public static int maxWallY = maxWallX;
	
	public static int object1X;
	public static int object1Y;

	public void setDefaultDoor(int xpos, int ypos){
		move.object1X = xpos;
		move.object1Y = ypos;
	}
	
	public void setup(int xpos, int ypos) {

		xpos = 3;
		ypos = 3;
	}

	public void directon(int xpos, int ypos) {
		Scanner input = new Scanner(System.in);
		String choice;
		String gibby = "restart";
		String up = "w";
		String down = "s";
		String left = "d";
		String right = "a";

		int step = 1;

		choice = input.nextLine();

		if (choice.equals(up)) {

			move.playerY = move.playerY - step;
			
			if(move.playerY - step < minWallY){
				move.playerY = move.playerY + 1;
			}
			else 
			{
				
			}
			

		}

		else if (choice.equals(down)) {

			move.playerY = move.playerY + step;

			
			if(move.playerY + step > maxWallY){
				move.playerY = move.playerY - 1;
			}
			else 
			{
				
			}
		}

		if (choice.equals(left)) {

			move.playerX = move.playerX + step;
			if(move.playerX + step > maxWallX ){
				move.playerX = move.playerX - 1;
			}
			else{
				
			}
			
		}

		else if (choice.equals(right)) {

			move.playerX = move.playerX - step;
			if(move.playerX - step < minWallX ){
				move.playerX = move.playerX + 1;
			}
			else{
				
			}
			
			
		}

		if (choice.equals(gibby)) {

			move.playerX = 3;
			move.playerY = 3;

			System.out.println("setting position to (" + move.playerX + "," + move.playerY + ")");
		}

	}
}

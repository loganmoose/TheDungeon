import java.util.Scanner;


public class mexican {
	static String apple = "You have moved North...";
	public static void main(String[] args) {
		System.out.println("You arrive in a tavern... suddenly the lights go out ");
		System.out.println("A steely mexican accented voice comes upr/n/");
		System.out.println("Well well Donald..."
				+ "You have done well young savage, but your skills are put to test... You have lost the luxury of the wonderful MAP!"
				+ "You are in a room with dimensions unknown to you, play... put your skills to test...");
		System.out.println("use the awsd controls...");

	position location = position.sEntry;
	boolean Gameover = false;
	Scanner inputString = new Scanner(System.in);
	while (Gameover != true){
	
		switch(location) {
		
		
		case sEntry:
			int choice = 0;
			Scanner input=new Scanner(System.in);
    		
    		input.nextLine();
            switch (inputString.nextLine()) {
            case "a":
            	
            	System.out.println("You have moved east...");
            	location = position.sEast1;
            	break;
            			case "w":
            	System.out.println("You noob, you killed yourself");
            	Gameover = true;
            	break;
            case "d":
            	System.out.println("You have moved west...");
            	location = position.sWest1;
            	break;
            case "s":
            	System.out.println("You ran into a mexican");
            	//don't forget to kill trump here...
            	Gameover = true;
            	break;
            }
			break;
			//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		case sEast1:
			switch (inputString.nextLine()) {
			case "a" : 
				System.out.println("You ran into a spiky wall... death for you!");
            	//don't forget to kill trump here...
            	Gameover = true;
            	break;
			case "w":
				System.out.println("YOu have moved North...");
				location = position.sNorth2;
				break;
			case "s":
				System.out.println("You ran into a spiky wall... death for you!");
            	//don't forget to kill trump here...
            	Gameover = true;
            	break;
			case "d":
				System.out.println("You have moved back to the entrance");
				location = position.sEntry;
				break;
				
			}
			break;
			//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
				
			case sWest1:
				switch (inputString.nextLine()) {
				case "a":
					System.out.println("You have moved back to the entrance");
					location = position.sEntry;
					break;
				case "s":
					System.out.println("You ran into a spiky wall... death for you!");
	            	//don't forget to kill trump here...
	            	Gameover = true;
	            	break;
				case "d":
					System.out.println("You ran into a spiky wall... death for you!");
	            	//don't forget to kill trump here...
	            	Gameover = true;
	            	break;
				case "w":
					System.out.println(apple);
				location = position.sNorth3;
				break;				
				
				
				
				}
				break;
				
		//-----------------------------------------------------------------------------------------------------
			case sNorth2:
				switch (inputString.nextLine()) {
				case "a":
					System.out.println("You ran into a mexican");
	            	//don't forget to kill trump here...
	            	Gameover = true;
	            	break;
				case "s":
					location = position.sWest1;
					break;
				case "d":
					System.out.println("You ran into a spiky wall... death for you!");
	            	//don't forget to kill trump here...
	            	Gameover = true;
	            	break;
				case "w":
					System.out.println("You have moved north...");
					location = position.sNorth4;
					break;		
				
				
				
				}
			break;
		//----------------------------------------------------------------------------------------------------------
			case sNorth4:
				switch (inputString.nextLine()) {
				case "a":
					System.out.println("Good, you have made it to the next level");
					Gameover = true;
					break;
				case "s":
					System.out.println("You have moved south...");
					location = position.sNorth2;
					break;		
				default:
					System.out.println("You ran into a spiky wall... death for you!");
	            	//don't forget to kill trump here...
	            	Gameover = true;
	            	break;
				
				
				
				}
			break;
			
			
			}
		
		
		
		}
		
		
		
		
		
		
	}
	
	}
	


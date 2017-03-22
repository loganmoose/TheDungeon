

	// WARNING!! THIS IS A PRECURSER TO COOKIN STRINGS WITH STATES! chance for much bugs, you know what I mean?
import java.util.Scanner;
		 
		/*
		 * This package provides an example of how to implement a choose-your-own-adventure game
		 * using a state machine model and case statements.
		 * 
		 * This is not a object-oriented approach to this kind of game, and it is limited in
		 * scalability, but it is simple to implement.
		 */
		 

		public class CookinstringsNEWSTYLEOFCODE {
		    /* Here we are about to define all of the possible locations in our game!
		     */
		    public enum Room {
		            sTitle,
		            sRoom1,
		            sRoom2,
		            sRoom3,
		            sKitchen,
		            
		            };
		     
		    /*
		     *  Coding in this style only requires a single method.  In this case, we'll just use main()
		     */
		    public static void main(String[] args) {
		         
		        /*
		         * Create our state variable.  We'll call it "room" and it will be of type "Room".
		         * Using case this way to distinguish among different types of things is a java-ism.  If
		         * you find it confusing, you can call your state variable something completely different
		         * from the type name.
		         * 
		         * Note that we assign a starting location here and that we have to include 
		         */
		    	Room location = Room.sRoom1;
		         
		        /*
		         * We'll need to instantiate scanner object to read commands from the keyboard.  We'll
		         * also need a string variable to store the results that come
		         */
		        Scanner inputString = new Scanner(System.in);
		         
		        // We will use a boolean variable to end the game when we choose.
		        boolean gameOver = false;
		 
		         
		        // Our game will loop continuously until we set gameOver = true
		        while (!gameOver) {
		         
		            /*
		             * This gigantic nested switch statement contains the code and descriptions for our games.
		             * The top-level switch statement selects the location we are in, while the nested switch
		             * statements allow us to select among the different action options in each room.
		             */
		            switch(location) {
		             
		            /*
		             *  This is our title screen.  Once we print our title, we automatically move the player into our sEntry location.
		             */
		            case sTitle :

		 
		                break;
		                 
		            /*
		             * ------------------------------------------------------------------------------------------------------------------------------------------
		             * The entryway to our house
		             */
		            case sRoom1 :
		System.out.println(".o88b.  .d88b.   .d88b.  db   dD d888888b d8b   db");
		System.out.println("d8P  Y8 .8P  Y8. .8P  Y8. 88 ,8P'   `88'   888o  88");
		System.out.println("8P      88    88 88    88 88,8P      88    88V8o 88");
		System.out.println("8b      88    88 88    88 88`8b      88    88 V8o88");
		System.out.println("Y8b  d8 `8b  d8' `8b  d8' 88 `88.   .88.   88  V888");
		System.out.println(" `Y88P'  `Y88P'   `Y88P'  YP   YD Y888888P VP   V8P ");
		System.out.println("");
		System.out.println(".d8888. d888888b d8888b. d888888b d8b   db  d888b  .d8888.");
		System.out.println("88'  YP `~~88~~' 88  `8D   `88'   888o  88 88' Y8b 88'  YP");
		System.out.println("`8bo.      88    88oobY'    88    88V8o 88 88      `8bo.");
		System.out.println("  `Y8b.    88    88`8b      88    88 V8o88 88  ooo   `Y8b.");
		System.out.println("db   8D    88    88 `88.   .88.   88  V888 88. ~8~ db   8D");
		System.out.println("`8888Y'    YP    88   YD Y888888P VP   V8P  Y888P  `8888Y'");
		System.out.println("                ");
		
		                		System.out.println("WELCOME TO COOKIN STRINGS WINDOWS 10 BETA!");
		        		
		        		System.out.println("You have entered a house full of mysterious objects called chars!!!!");
		        		
		        		System.out.println("You are in the center of a 3 by 3 room. You move 1 by 1. ");
		       
		        		System.out.println("You can only move in 4 cardinal directions, north, south, east, and west.");int choice = 0;
		      
		        		System.out.println("You can move <north> <south> <east> or <west>");
		        		
		        		System.out.println("You can collect chars by pressing the corresponding direction key");
		        	
		        		System.out.println("The chars are single letters, that when put together, make the PASSWORD");
		        		
		        		System.out.println("The password lets you put together all of the chars to make STRINGS!!!!");
		        	
		        		System.out.println("");
		        	
		        		System.out.println("");
		        		
		        		System.out.println("You are in the center of room 1");
		        
		        		
		        		int decision = 0;

		        		Scanner input=new Scanner(System.in);
		        		choice = input.nextInt();
		        		input.nextLine();
		                switch (inputString.nextLine()) {
		                case "north":
		                case "n":
		                	System.out.println("there is a char next to you. It says 'a' ");
		        			System.out.println("note this char down on your computer's notepad. You may need it later...");
		        			System.out.println("Down to the center of the room we go!");
		                    location = location.sRoom1;
		                    break;
		                case "south":
		                case "s" :
		                    System.out.println("\r\n\r\nYou have found the entrance to another room, ENTER THE DRAGON! \r\n");
		                    location = location.sRoom2;
		                    break;                  
		                case "east":
		                case "e" :
		                    System.out.println("\r\n\r\nA vast expanse of nothingness you see!!! BACK TO THE CENTER U GO!\r\n");
		                    location = location.sRoom1;
		                    break;
		                case "west":
		                case "w":
		                    System.out.println("\r\n\r\nYou happen to run into an Inferno Dragon chained up in the corner.r\n" +
		                            "  You feel like crying, so you run back to the center of the room.\r\n");
		                    break;                  
		                default:
		                    System.out.println("\r\n\r\n You can only type in the text inside the <>. Example, <north> means you can only type in 'north' \r\n");
		                    break;
		                } // End local choices
		            break;
		             
		            /*
		             * ------------------------------------------------------------------------------------------------------------------------------------------
		             * Room 2
		             */
		            case sRoom2 :
		            	String apple = "apple";
		                System.out.println("" +
		                        "ROOM 2 you have found.\r\n\r\n" +
		                        "You are in the center of Room 2.\r\n" +
		                        "" +
		                        "To the <north> lies the entry to Room 1\r\n\r\n" +
		                        "Remember the cardinal directions... you can go <north>, <south>, <east>, or <west> "
		                        );
		 
		                /*
		                 * Actions the player can take in this room.
		                 */
		                switch (inputString.nextLine()) {
		                case "north":
		                case "n":
		                    System.out.println("\r\n\r\nYou walk back into your house.\r\n");
		                    location = location.sRoom1;
		                    break;
		                case "south":
		                case "s":
		                	System.out.println("You have found a char! However, it is locked inside of a box! You will find the password in this room...");
		                	location = location.sRoom2;
		                	break;
		                case "east":
		                case "e":
		                	System.out.println("It seems you have found a key! On it, the letter says E. r/n/"
		                			+ "\r\n You have reached the box with the char"
		                			+ " you slowly open it... it reads 'e' "
		                			+ "you may want to note this down for later..."
		                			+ "By the way, the password to opening the door to Room 3 is <apple>");
		                location = location.sRoom2;
		                break;
		                case "west":
		                case "w":
		                	System.out.println("You have reached the door to ROOM 3!"
		                		+	"\r\n but you need to enter the password... ");
		                	switch (inputString.nextLine()){
		                	case "apple":
		                		System.out.println("Yay, on to Room 3 we go...");
		                	default:
		                		System.out.println("Nope, not today son");
		                		location = location.sRoom2;
		                	}
		                default:
		                    System.out.println("\r\n\r\nI'm not sure what you want to do.\r\n");
		                    break;
		                } // End local choices
		            break;
		             
		            /*
		             * ------------------------------------------------------------------------------------------------------------------------------------------
		             * Room 3
		             */
		            case sRoom3 :
		                System.out.println("Welcome to Room 3");
		                System.out.println("This is where it all comes into play"
		                		+ "\r\n You must find the last 3 chars to continue..."
		                		+ "\r\n However, each wrong move spells DEATH!!!");
		 
		                /*
		                 * Actions the player can take in this room.
		                 */
		                switch (inputString.nextLine()) {
		                case "south":
		                case "s":
		                    System.out.println("\r\n\r\nYou walk down, and you are hit by a moose thing!\r\n");
		                    gameOver = true;
			                break;
		                case "north":
		                case "n": 
		                	System.out.println("You run back to Room 2...");
		                	location = location.sRoom2;
		                	break;
		                case "west":
		                case "w":
		                	System.out.println("\r\n\r\nYou walk there, and you are hit by some apple thing!\r\n");
		                    gameOver = true;
			                break;
		                case "east":
		                case "e":
		                	System.out.println("You did it! You have found 3 chars! - 'p' 'p' and 'l'");
		                	location = location.sKitchen;
		                default:
		                    System.out.println("\r\n\r\nI'm not sure what you want to do.\r\n");
		                    break;
		                } // End local choices
		            break;
		             
		             
		            /*
		             * ------------------------------------------------------------------------------------------------------------------------------------------
		             * The Kitchen
		             */         
		            
		            case sKitchen:
		            	System.out.println("The final level of Cookin Strings...");
		            	System.out.println("The password awaits you."
		            			+ "\r\n If you get it right, I congratulate you as the greatest gamer of all time."
		            			+ "\r\n If you fail, the kitchen will KILL YOU");
		            	System.out.println("Use your chars to type an all lowercase password..");
		            	 switch (inputString.nextLine()) {
		            	 case "pealp" :
		            		 System.out.println("YOU WIN!");
		            		 gameOver = true;
				                break;
		            	 default: 
		            		 System.out.println("Nope, not today son");
		            		 gameOver = true;
				                break;
		            	 
		            	 }
		            
		            
		            
		            
		            
		            
		            default:
		                System.out.println("\r\n\r\nIt should not be possible for you to end up here.\r\n");
		                gameOver = true;
		                break;
		            } // End location options
		             
		        } // End while loop
		 
		    // Exit our program
		    System.out.println("\r\n\r\nGAME OVER\r\n");
		    return;
		     
		    } // End main()
		// End class ()


}

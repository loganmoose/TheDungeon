
public class Messagebox {
public void printBox(String Message, int format){
	
	int msgLength = Message.length ();
	System.out.print("+");
	for (int i=0; i < msgLength + 1; i++) {
		System.out.print("■");
	}
	System.out.print("+\n");
	System.out.println("| "+ Message + " |");
	System.out.println("+■■■■■■■■■■■■■■■■■■■■+");
}
}

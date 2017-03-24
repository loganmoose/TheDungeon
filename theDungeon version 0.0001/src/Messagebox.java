
public class Messagebox {
public void printBox(String Message, char format , char corner){
	//this method is so we can print text to the screen in a groovy text pox like pokermanz
	
	
	int msgLength = Message.length();
	System.out.print(corner);
	for (int i=0; i < msgLength + 3; i++) {
		System.out.print(format);
	}
	System.out.print(corner + "\n");
	
	
	// formatting for the text boxes so box will fit the text
	System.out.println(format + " "+ Message + " " + format);
	
	
	System.out.print(corner);
	for (int i=0; i < msgLength + 3; i++) {
		System.out.print(format);
	}
	System.out.print(corner + "\n");
}

public void bar(){
	
}

}

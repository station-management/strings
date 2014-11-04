package charfinder;

public class CharFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CharFinder cf = new CharFinder();
		
		String s = "Praktikum";
		
		System.out.println("the first Character of " +s+ " is " + cf.getFirstChar(s));
		
		System.out.println("the last Character of " +s+ " is " + cf.getLastChar(s));		
		
		System.out.println(s + " length ist " + s.length());		
		
		cf.printAllCharPositions(s);
		
		//Character t = s.charAt(0);  //Was ist char 0?
		
		//System.out.println(t);
		
		//System.out.println(s + " length ist " + s.length());  //Wie lang ist der String Praktiukm?
		
		//Character l = s.charAt(s.length() -1);
		//System.out.println(l);
	}
	
	Character getFirstChar(String s) {
		Character ch = s.charAt(0);
		
		return ch;
		
	}
	
	Character getLastChar(String s){
		
		Character ch = s.charAt(s.length()-1);
		
		return ch;
		
	}
	
	void printAllCharPositions(String s){
		
		Integer currentPosition = 0;
		Integer lastPosition = s.length() - 1;
		
		while(currentPosition <= lastPosition){
			
			System.out.println(s.charAt(currentPosition) + " is at Position " + currentPosition);
			
			currentPosition++;
		}
	}

	
	void getCharPos(String s, Character toFind){
		
		Integer currentPosition = 0;
		Integer lastPosition = s.length() - 1;
		
		Boolean found = false;
		
		//while
		
		while (currentPosition <= lastPosition);

		if (s.charAt(currentPosition) == toFind) {

		System.out.println(toFind + " is at position " + currentPosition + "of " + s);

		found = true;

		}
			
		currentPosition++;	
		
		//if
		
	    if (found == false) {

		System.out.println(toFind + " was not found");
		
	    }
	}

}
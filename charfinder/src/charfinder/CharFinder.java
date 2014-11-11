package charfinder;

public class CharFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CharFinder cf = new CharFinder();

		String s = "Praktikum";

		System.out.println("the first Character of " + s + " is "
				+ cf.getFirstChar(s));

		System.out.println("the last Character of " + s + " is "
				+ cf.getLastChar(s));

		System.out.println(s + " length ist " + s.length());

		cf.printAllCharPositions(s);

		// Character t = s.charAt(0); //Was ist char 0?

		// System.out.println(t);

		// System.out.println(s + " length ist " + s.length()); //Wie lang ist
		// der String Praktiukm?

		// Character l = s.charAt(s.length() -1);
		// System.out.println(l);

		// cf.countCharOccAlaForLoop(s, 'k'); // zu forSchleife

		cf.countCharOccAlaWhile(s, 'k'); // zu whileSchleife
	}

	Character getFirstChar(String s) {
		Character ch = s.charAt(0);

		return ch;

	}

	Character getLastChar(String s) {

		Character ch = s.charAt(s.length() - 1);

		return ch;

	}

	void printAllCharPositions(String s) {

		Integer currentPosition = 0;
		Integer lastPosition = s.length() - 1;

		while (currentPosition <= lastPosition) {

			System.out.println(s.charAt(currentPosition) + " is at Position "
					+ currentPosition);

			currentPosition++;
		}
	}

	void getCharPos(String s, Character toFind) {

		Integer currentPosition = 0;
		Integer lastPosition = s.length() - 1;

		Boolean found = false;

		// while

		while (currentPosition <= lastPosition)
			;

		if (s.charAt(currentPosition) == toFind) {

			System.out.println(toFind + " is at position " + currentPosition
					+ "of " + s);

			found = true;

		}

		currentPosition++;

		// if

		if (found == false) {

			System.out.println(toFind + " was not found");

		}
	}

	// *ForSchleifeAnfang

	void countCharOccAlaForLoop(String s, Character toFind) {

		s = s.toLowerCase();

		Integer stringLength = s.length();
		Integer charOcc = 0;

		for (Integer i = 0; i < stringLength; i++) {

			if (s.charAt(i) != toFind) {
				continue;
			} else {
				charOcc++;
			}
		}

		if (charOcc == 0) {
			System.out.println("'" + toFind + "' was not found in " + s);
		} else {
			if (charOcc == 1) {
				System.out.println("There is " + charOcc + " occurence of '"
						+ toFind + "' in " + s);
			} else {
				System.out.println("There are " + charOcc + " occurences of '"
						+ toFind + "' in " + s);
			}
		}
	}

	// *ForSchleifeEnde

	// *WhileSchleifeAnfang
	void countCharOccAlaWhile(String s, Character toFind) {

		s = s.toLowerCase();

		Integer charOcc = 0;
		Integer currentPosition = 0;

		while (currentPosition < s.length()) {

			if (s.charAt(currentPosition) != toFind) {
				currentPosition++;
				
				continue;
				
			} else {

				currentPosition++;
				charOcc++;
			}
		}
	}
	// *WhileSchleifeEnde
}
	
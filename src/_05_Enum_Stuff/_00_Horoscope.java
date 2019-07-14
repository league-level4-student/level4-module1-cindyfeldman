package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	static // 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void zodiacState() {
		String zodiac = "";
		
	JOptionPane.showOptionDialog(null, "Choose your zodiac", "Custom Buttons", 0, -1, null, Zodiac.values(), 0);
		
		
	}
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		zodiacState();
		Zodiac zodiac = Zodiac.LIBRA ;
		
		switch(zodiac) {
		case ARIES: 
		zodiac = Zodiac.ARIES;
			System.out.println("ARIES");
			break;
		
		case TAURUS:
			zodiac = Zodiac.TAURUS;
			System.out.println("TAURUS");
		break;
		case GEMINI :
			zodiac = Zodiac.GEMINI;
		System.out.println("GEMINI");
		break;
		case CANCER: 
			zodiac = Zodiac.CANCER;
			System.out.println("CANCER");
			break;
		case LEO:
			zodiac = Zodiac.LEO;
			System.out.println("LEO");
			break;
		case VIRGO:
			zodiac = Zodiac.VIRGO;
			System.out.println("VIRGO");
			break;
		case LIBRA:
			zodiac = Zodiac.LIBRA;
			System.out.println("LIBRA");
			break;
		case SCORPIO:
			zodiac = Zodiac.SCORPIO;
			System.out.println("SCORPIO");
			break;
		case SAGITTARIUS:
			zodiac = Zodiac.SAGITTARIUS;
			System.out.println("SAGITTARIUS");
			break;
		case CAPRICORN:
			zodiac = Zodiac.CAPRICORN;
			System.out.println("CAPRICORN");
			break;
		case AQUARIUS:
			zodiac = Zodiac.AQUARIUS;
			System.out.println("AQUARIUS");
			break;
		case PISCES:
			zodiac = Zodiac.PISCES;
			System.out.println("PIECES");
			break;
		default :
			
		System.out.println("DEFault");
		break;
		}
	}
	
}

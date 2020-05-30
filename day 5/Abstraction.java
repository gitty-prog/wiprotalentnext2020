1.Bank
public class Bank{
public static void main(String[] args) {
		ICICIBank iciciBank = new ICICIBank();
		KotMBank kotMBank = new KotMBank();
                          System.out.println(iciciBank.getSavingInterestRate());
		System.out.println(iciciBank.getFixedInterestRate());
		System.out.println(kotMBank.getSavingInterestRate());
		System.out.println(kotMBank.getFixedInterestRate());
		GeneralBank gb1 = new ICICIBank();
		GeneralBank gb2 = new KotMBank();
		System.out.println(gb1.getSavingInterestRate());
		System.out.println(gb1.getFixedInterestRate());
		System.out.println(gb2.getSavingInterestRate());
		System.out.println(gb2.getFixedInterestRate());
	}
}
1.1 General Bank class
public abstract class GeneralBank {
              public abstract double getSavingInterestRate();
	public abstract double getFixedInterestRate();
}
1.2 ICICI bank class
public class ICICIBank extends GeneralBank {
@Override
	public double getSavingInterestRate() {
		return 4.0;
	}
              @Override
	public double getFixedInterestRate() {
		return 8.5;
	}
}
1.3 KotMbank class
public class KotMBank extends GeneralBank {
@Override
	public double getSavingInterestRate() {
		return 6.0;
	}
           @Override
	public double getFixedInterestRate() {
		return 9.0;
	}
}
2.Compartments
public abstract class Compartment {
	public abstract void notice();
}
First class.java:
public class FirstClass extends Compartment {
@Override
	public void notice() {
		System.out.println("Notice: You're in FirstClass");
	}
}
 General.java:
public class General extends Compartment {
@Override
	public void notice() {
		System.out.println("Notice: You're in General");
	}
}
Ladies.java:
public class Ladies extends Compartment {
@Override
	public void notice() {
		System.out.println("Notice: You're in Ladies");
	}
}
Luggage.java :
public class Luggage extends Compartment {
@Override
	public void notice() {
		System.out.println("Notice: You're in Luggage");
	}
}
TestCompartment.java:
import java.util.Random;
public class TestCompartment {
public static void main(String[] args) {
		Compartment[] compartments = new Compartment[10];
              Random rand = new Random();
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((4 - 1) + 1) + 1;
	         if (randomNum == 1)
	    		compartments[i] = new FirstClass();
	    	else if (randomNum == 2)
	    		compartments[i] = new Ladies();
	    	else if (randomNum == 3)
	    		compartments[i] = new General();
	    	else if (randomNum == 4)
	    		compartments[i] = new Luggage();
	    	compartments[i].notice();
	    }
	}
}
3. Musical instruments
import java.util.Random;
public class Instruments{
public static void main(String[] args) {
		Instrument[] instruments = new Instrument[10];
		Random rand = new Random();
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((3 - 1) + 1) + 1;
	    	if (randomNum == 1)
	    		instruments[i] = new Piano();
	    	else if (randomNum == 2)
	    		instruments[i] = new Flute();
	    	else if (randomNum == 3)
	    		instruments[i] = new Guitar();
	    	instruments[i].play();
	    }
	    for (int i = 0; i < 10; i++) {
	    	if (instruments[i] instanceof Piano) 
	    		System.out.println("Piano is stored at index " + i);
	    	else if (instruments[i] instanceof Flute) 
	    		System.out.println("Flute is stored at index " + i);
	    	else if (instruments[i] instanceof Guitar) 
	    		System.out.println("Guitar is stored at index " + i);
	    }
}
}
Flute.java:
public class Flute extends Instrument {
@Override
	public void play() {
		System.out.println("Flute is playing  toot toot toot toot");
}
}
Guitar.java:
public class Guitar extends Instrument {
@Override
	public void play() {
		System.out.println("Guitar is playing  tin  tin  tin");
}
}
Instrument.java:
public abstract class Instrument {
	public abstract void play();
}
Piano.java:
public class Piano extends Instrument {
@Override
	public void play() {
		System.out.println("Piano is playing  tan tan tan tan");
}
}



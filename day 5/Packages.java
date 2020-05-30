1.Compartment
public class Compartment {
	private double height;
	private double width;
	private double breadth;
	
	public Compartment(double height, double width, double breadth) {
		super();
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Compartment [height=" + height + ", width=" + width + ", breadth=" + breadth + "]";
	}

	
}
2.Four wheeler
import com.automobile.Ford;
import com.automobile.Logan;

public class FourWheeler {

	public static void main(String[] args) {
		Logan logan = new Logan("Logan XYZ", "WB16F2222", "Bob Biswas", 220, 1);
		logan.getModelName();
		logan.getOwnerName();
		logan.getRegistrationNumber();
		logan.speed();
		System.out.println("Has GPS? " + logan.gps());
		
		System.out.println();
		
		Ford ford = new Ford("Mustang GT", "WB16F4444", "Alice", 300, 1);
		ford.getModelName();
		ford.getOwnerName();
		ford.getRegistrationNumber();
		ford.speed();
		System.out.println("Has AC? " + ford.tempControl());
  }
}
3.Vehicle
import com.automobile.Honda;
import com.automobile.twowheeler.Hero;

public class Vehicle {

	public static void main(String[] args) {
		Hero hero = new Hero("Glamour 125", "WB16G1234", "Bob", 85);
		hero.getModelName();
		hero.getOwnerName();
		hero.getRegistrationNumber();
		hero.getSpeed();
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda City", "WB18G7777", "Peter", 110);
		honda.getModelName();
		honda.getOwnerName();
		honda.getRegistrationNumber();
		honda.getSpeed();
		honda.cdplayer();

	}

}
4.Foundation
import testpackage.Foundation;

public class Foundation {

	public static void main(String[] args) {
		Foundation foundation = new Foundation();

		foundation.Var4 = 5;
		
		System.out.println(foundation.Var4);
	}

}

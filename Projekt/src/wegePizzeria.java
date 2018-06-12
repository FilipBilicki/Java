
public class wegePizzeria extends Pizzeria {

	Pizza zrobPizza(String item) {
		if(item.equals("Wege")) {
			return new Wege();
		}
		else return null;
		
	}

	@Override
	public double koszt() {
		
		return 10;
	}
	
}

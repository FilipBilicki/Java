
public class nowaPizzeria extends Pizzeria {

	Pizza zrobPizza(String item) {
		if(item.equals("Hawajska")) {
			return new Hawajska();
		}
		else if (item.equals("Capri")) {
			return new Capri();
		}
		else return null;
	}

	@Override
	public double koszt() {
		
		return 10;
	}
}

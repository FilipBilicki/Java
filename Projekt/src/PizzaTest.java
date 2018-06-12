public class PizzaTest{
	public static void main(String[] args) {
		Pizzeria nowa = new nowaPizzeria();
		
		
		Pizza pizza = nowa.zamowPizza("Hawajska");
		pizza = new szynka(pizza);
		pizza = new pieczarki(pizza);
		pizza = new duza(pizza);
		
		System.out.println("filip zamowil " + pizza.pobierzOpis() + pizza.pobierzIngre() +" " + pizza.koszt());
	}
}
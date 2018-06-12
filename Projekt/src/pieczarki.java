
public class pieczarki extends pizzaDecorator{
Pizza pizza;

public pieczarki(Pizza pizza) {
	this.pizza=pizza;
}
public String pobierzOpis() {
	return pizza.pobierzOpis() + ", pieczarki";
}
public int pobierzSpicy() {
	return pizza.pobierzSpicy();
}
public String pobierzIngre() {
	return pizza.pobierzIngre();
}


public double koszt() {
	
	return pizza.koszt() + 4;
}
}
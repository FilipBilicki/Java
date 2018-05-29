
public class szynka extends pizzaDecorator{
Pizza pizza;

public szynka(Pizza pizza) {
	this.pizza=pizza;
}
public String pobierzOpis() {
	return pizza.pobierzOpis() + ", Pizza";
}
public String pobierzSpicy() {
	return pizza.pobierzSpicy();
}
public String pobierzIngre() {
	return pizza.pobierzIngre();
}
public double koszt(){
	return pizza.koszt() + 0.2;
}
}

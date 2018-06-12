public abstract class Pizza  {
String opis = "Pizza nieznana";
int spicy = 1;
String ingre = "niewiadome";
int size = 1;
int cena = 2;
double koszt = 1;
public String pobierzOpis() {
	return opis;
}
public int pobierzSpicy() {
return spicy;
}
public String pobierzIngre(){
	return ingre;
}
public double pobierzKoszt() {
	return koszt;
}

public abstract double koszt();


void przygotowanie() {
	System.out.println("Przygotowanie " + opis);
	System.out.println("Wyrabianie ciasta ");
	System.out.println("Dodawanie dodatków " + opis);
	
}

void wypiek(){
	System.out.println("Pieczenie: 25 minut");
}
void krojenie(){
	System.out.println("Krojenie pizzy");
}

void pakowanie(){
	System.out.println("Pizza jest ju¿ pakowana");
}
}
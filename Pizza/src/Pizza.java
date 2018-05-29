
public abstract class Pizza {
String opis = "Pizza nieznana";
String spicy ="nie wiadomy";
String ingre = "niewiadome";
 
public String pobierzOpis() {
	return opis;
}
public String pobierzSpicy() {
return spicy;
}
public String pobierzIngre(){
	return ingre;
}

//public abstract int Size();
public abstract double koszt();
//public abstract double kosztDostawy();
}

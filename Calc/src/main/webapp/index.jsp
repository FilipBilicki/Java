<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kalkulator kredytowy</title>
</head>
<body>
<form action="HelloServlet" method="get">
 <div>
        <label>Wnioskowana kwota kredytu: <input type="text" id="kwota" name="kwota"/></label>
        </div>
        <div>
        <label>Ilosc rat: <input type="text" id="ilosc_rat" name="ilosc_rat"/></label>
        </div>
        <div>
        <label>Oprocentowanie   : <input type="text" id="oprocentowanie" name="oprocentowanie"/></label>
        </div>
        <div>
        <label>Oplata stala: <input type="text" id="oplata_stala" name="oplata_stala"/></label>
        </div>
        <div>
        <label>Rodzaj rat : malejaca,<input type="radio" id="rodzaj_raty" name="rodzaj_raty" value="malejaca"/></label> 
       <label> stala: <input type="radio" id="rodzaj_raty" name="rodzaj_raty" value="stala"/></label>
        </div>
		<input type="submit" value="wyslij"/>
</form>
</body>
</html>
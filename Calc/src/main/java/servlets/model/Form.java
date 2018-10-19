package servlets.model;
 
public class Form {
   
    private int kwota;
    private int raty;
    private double procent;
    private double stale;
    private String rodzajRat;
    public Form() {}
 
    public Form(int kwota, int raty, double procent, double stale, String rodzajRat) {
        this.kwota = kwota;
        this.raty = raty;
        this.procent = procent;
        this.stale = stale;
        this.rodzajRat = rodzajRat;
    }
 
    public int getKwota() {
        return kwota;
    }
 
    public void setKwota(int kwota) {
        this.kwota = kwota;
    }
 
    public int getRaty() {
        return raty;
    }
 
    public void setRaty(int raty) {
        this.raty = raty;
    }
 
    public double getProcent() {
        return procent;
    }
 
    public void setProcent(double procent) {
        this.procent = procent;
    }
   
 
    public double getStale() {
        return stale;
    }
 
    public void setOplataStala(double stale) {
        this.stale = stale;
    }
 
    public String getRodzajRat() {
        return rodzajRat;
    }
 
    public void setRodzajRat(String rodzajRat) {
        this.rodzajRat = rodzajRat;
    }
    @Override
    public String toString() {
        return "Form [kwotaKredytu=" + kwota + ", iloscRat=" + raty + ", oprocentowanie=" + procent
                + ", oplataStala=" + stale + ", rodzajRat=" + rodzajRat + "] ";
    }
    
    }

    







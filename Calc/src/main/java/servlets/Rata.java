package servlets;
 
public class Rata {
    private int nrRaty;
    private int kwota;
    private double odsetki;
    private double stale;
    private double suma;

   
   
    public Rata(int nrRaty, int kwota, double odsetki, double stale, double suma ) 
    {
        this.nrRaty = nrRaty;
        this.kwota = kwota;
        this.odsetki = odsetki;
        this.stale = stale;
        this.suma = suma;
       
    }

    public int getNrRaty() {
		return nrRaty;
	}

	public void setNrRaty(int nrRaty) {
		this.nrRaty = nrRaty;
	}

	public int getKwota() {
		return kwota;
	}

	public void setKwota(int kwota) {
		this.kwota = kwota;
	}

	public double getOdsetki() {
		return odsetki;
	}

	public void setOdsetki(double odsetki) {
		this.odsetki = odsetki;
	}

	public double getStale() {
		return stale;
	}

	public void setStale(double stale) {
		this.stale = stale;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	@Override
    public String toString() {
        return "Rata [nrRaty=" + nrRaty + ", Kwota=" + kwota + ", odsetki=" + odsetki + ", Stale=" + stale + ", SumaRat=" + suma + "  ]";}
	}
  
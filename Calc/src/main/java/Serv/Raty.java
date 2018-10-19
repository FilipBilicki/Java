package Serv;
import java.util.ArrayList;
import java.util.List;

import servlets.model.Form;
import servlets.model.Rata;
 
public class Raty {
   
    public List<Rata> getRaty(Form form) {
        List<Rata> list = new ArrayList<>(form.getRaty());
        int kwota = form.getKwota() / form.getRaty();
        int pozostaly = form.getKwota();
        for(int x = 0; x < form.getRaty(); x++) {
        list.add(x, null);
        Rata rata = new Rata();
        rata.setNrRaty(x+1);
        if(form.getRodzajRat().equals("malejaca")) {
           rata.setKwota(kwota);
           rata.setOdsetki((pozostaly/12)*form.getProcent());
           pozostaly -= kwota;
           rata.setStale(form.getStale());
           rata.setSuma(rata.getKwota()+rata.getOdsetki()+rata.getStale());   
            }
            else {
                rata.setStale((form.getKwota() / form.getRaty()) * form.getProcent() + (form.getKwota() / form.getRaty())+form.getStale());
                rata.setKwota(form.getKwota() / form.getRaty());
                rata.setOdsetki(rata.getSuma() - rata.getKwota());
            }
            list.set(x, rata);
        }
        return list;
    }
   
}

package servlets;
 
import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import Serv.Raty;
import servlets.model.Form;
import servlets.model.Rata;
 
/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
    }
   
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("").append(request.getContextPath());
       
        Form form = new Form();
        Raty raty = new Raty();
       
        form.setKwota(Integer.parseInt(request.getParameter("kwota")));
        form.setRaty(Integer.parseInt(request.getParameter("ilosc_rat")));
        form.setProcent(Double.parseDouble(request.getParameter("oprocentowanie")));
        form.setOplataStala(Double.parseDouble(request.getParameter("oplata_stala")));
        form.setRodzajRat(request.getParameter("rodzaj_raty"));
               
 
 
        response.setContentType("text/html");
        List<Rata> list = raty.getRaty(form);
        response.getWriter().println("<table border = 2><tr><td>Nr raty "
            + "</td><td>Saldo kapitalu</td>"
                + "<td>Odsetki kredytu</td><td>Splata kredytu</td><td>Pelna rata</td>" );
        for(Rata rata:list) 
        {
            response.getWriter().println("<tr><td>"+ rata.getNrRaty() +  "</td>");
            response.getWriter().println("<td>"+ rata.getKwota()  + "</td>");
            response.getWriter().println("<td>"+ rata.getOdsetki()  + "</td>");
            response.getWriter().println("<td>"+ rata.getStale()  + "</td>");
            response.getWriter().println("<td>"+ rata.getSuma()  + "</td>");
        }
    }
public void showTable() throws IOException{
        String content = "";
        content += "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">";
        content += "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><title>Kredyt</title></head><body>"
                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">";
        System.out.println(content);
}
 
 
 
}
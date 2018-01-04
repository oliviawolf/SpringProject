import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class olivia extends htmltemplate {

    public static void oliviaPage() {
        SimpleWriter olivia = new SimpleWriter1L("WebContent/olivia.html");

        //code for olivias page

        htmltemplate.outputHeader("Surprise!", olivia);

        //include css code
        olivia.println(
                "<link href=\"homepageStyle.css\" rel=\"stylesheet\" type=\"text/css\"></link>");

        olivia.println("<body>");
        olivia.println("<h1> Olivia's Page! </h1>");
        olivia.println("<ul>");
        htmltemplate.createTabs("index.html", "Home", olivia, false);
        htmltemplate.createTabs("olivia.html", "Olivia's shit", olivia, true);
        htmltemplate.createTabs("rani.html", "Rani's shit", olivia, false);
        olivia.println("</ul>");

        olivia.println("<img src=\"funny pic.jpg\"><img>");
        htmltemplate.outputFooter(olivia);

    }

    public static void main(String[] args) {

    }

}

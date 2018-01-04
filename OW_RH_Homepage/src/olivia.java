import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class olivia extends htmltemplate {

    public static void oliviaPage() {
        SimpleWriter olivia = new SimpleWriter1L("WebContent/olivia.html");

        //code for olivias page

        outputHeader("Olivia's page", olivia);

        //include css code
        olivia.println(
                "<link href=\"olivia_style.css\" rel=\"stylesheet\" type=\"text/css\"></link>");

        olivia.println("<body>");
        olivia.println("<h1> Olivia's Page! </h1>");
        olivia.println("<ul>");
        htmltemplate.createTabs("olivia", olivia);
        olivia.println("</ul>");

        // olivia.println("<img src=\"funny pic.jpg\"><img>");
        htmltemplate.outputFooter(olivia);

    }

    public static void main(String[] args) {

    }

}

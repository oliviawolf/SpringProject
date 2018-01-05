import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class olivia extends htmltemplate {

    public static void oliviaPage() {
        SimpleWriter olivia = new SimpleWriter1L("WebContent/olivia.html");

        //code for olivias page

        outputHeader(tOlivia, olivia);

        //include css code
        olivia.println(
                "<link href=\"olivia_style.css\" rel=\"stylesheet\" type=\"text/css\"></link>");

        olivia.println("<h1>" + tOlivia + "</h1>");

        createTabs(tOlivia, olivia);

        //create a button
        olivia.println(
                "<input type=\"button\" value=\"click me\" onclick=\"myFunction()\" />");

        olivia.println(
                "<input type=\"button\" value=\"NO, click me\" onclick=\"myFunction2()\" />");

        olivia.println(
                "<img id=\"baby\" src=\"funny pic.jpg\" style=\"visibility:hidden\" width=\"400\" height=\"height\" />");
        //include javascript

        olivia.println("<script src=\"olivia.js\"></script>");

        // olivia.println("<img src=\"funny pic.jpg\"><img>");
        htmltemplate.outputFooter(olivia);

        olivia.close();
    }

    public static void main(String[] args) {

    }

}

import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Creates the rani.html page by using the same header and footer as other tabs
 * in the homepage but filling in a different body.
 *
 * @author Rani Hinnawi
 *
 */
public class rani extends olivia {

    public static String rTitle = "Rani Hinnawi",
            rFileName = "WebContent/rani.html";
    public static SimpleWriter rani = new SimpleWriter1L(rFileName);

    /**
     * Method used to create Rani's HTML file
     */
    public static void raniPage() {
        htmltemplate.outputHeader(rTitle, rani);

        rani.println(
                "<link href=\"rani_style.css\" rel=\"stylesheet\" type=\"text/css\"></link>");

        rani.println("<h1>" + rTitle + "</h1>");

        htmltemplate.createTabs("rani", rani);

        htmltemplate.outputFooter(rani);

        rani.close();
    }
}

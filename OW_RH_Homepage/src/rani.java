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

    public static SimpleWriter rani = new SimpleWriter1L("WebContent/" + fRani);

    /**
     * Method used to create Rani's HTML file
     */
    public static void raniPage() {
        htmltemplate.outputHeader(tRani, rani);

        rani.println(
                "<link href=\"rani_style.css\" rel=\"stylesheet\" type=\"text/css\"></link>");

        rani.println("<h1>" + tRani + "</h1>");

        htmltemplate.createTabs(tRani, rani);

        htmltemplate.outputFooter(rani);

        rani.close();
    }
}

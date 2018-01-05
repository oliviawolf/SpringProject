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

    public static String rTitle = "Rani Hinnawi", rFileName = "rani.html";
    public static SimpleWriter rani = new SimpleWriter1L(rFileName);

    /**
     * Method used to create Rani's HTML file
     */
    public static void raniPage() {
        htmltemplate.outputHeader(rTitle, rani);

        htmltemplate.createTabs("rani", rani);

        htmltemplate.outputFooter(rani);
    }
}

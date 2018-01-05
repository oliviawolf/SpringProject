import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
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
    public static SimpleReader raniText1 = new SimpleReader1L(
            "WebContent/rani_text1.txt");

    /**
     * Method used to create Rani's HTML file
     */
    public static void raniPage() {
        outputHeader(tRani, rani);

        rani.println(
                "<link href=\"rani_style.css\" rel=\"stylesheet\" type=\"text/css\"></link>");

        rani.println("<h1>" + tRani + "</h1>");

        createTabs(tRani, rani);
        rani.println("<hr>");

        rani.println("<p>");

        while (!raniText1.atEOS()) {
            String line = raniText1.nextLine();
            if (line.equals("") || line.equals(" ")) {
                rani.println("</p><p>");
            } else {
                rani.println(line);
            }
        }

        rani.println("</p>");

        outputFooter(rani);

        rani.close();
    }
}

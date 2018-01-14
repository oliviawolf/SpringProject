import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class Homepage extends rani {

    public static void main(String[] args) {
        //Ask user for output home name
        SimpleWriter out = new SimpleWriter1L();
        SimpleReader in = new SimpleReader1L();

        //Output title and header to home.
        outputHeader(tHome, home);

        //output css link
        home.println("<link href=\"" + cHome
                + "\" rel=\"stylesheet\" type=\"text/css\"></link>");

        //output header
        home.println("<h1>" + tHome + "</h1>");

        /*
         * Create tabs, maybe embedded within a colored/designed band. Link
         * other HTML pages to tabs. Later: prompt user for design preferences
         */

        createTabs(tHome, home);

        home.println("<hr>"); //output line
        home.println("<h2> Welcome to our site! </h2>");

        //code for Olivias page

        oliviaPage(olivia);

        //code for Rani's page

        raniPage(rani);

        //Upload background image (user inputed?)

        //Body

        //Footer
        outputFooter(home);

        //Close home
        home.close();
    }

}

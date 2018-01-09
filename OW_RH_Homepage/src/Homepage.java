import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class Homepage extends rani {

    public static void main(String[] args) {
        //Ask user for output file name
        SimpleWriter out = new SimpleWriter1L(),
                file = new SimpleWriter1L("WebContent/" + fHome);
        SimpleReader in = new SimpleReader1L();

        //Output title and header to file.
        outputHeader(tHome, file);

        //output css link
        file.println(
                "<link href=\"homepageStyle.css\" rel=\"stylesheet\" type=\"text/css\"></link>");

        //output header
        file.println("<h1>" + tHome + "</h1>");

        /*
         * Create tabs, maybe embedded within a colored/designed band. Link
         * other HTML pages to tabs. Later: prompt user for design preferences
         */

        createTabs(tHome, file);

        file.println("<hr>"); //output line
        file.println("<h2> Welcome to our site! </h2>");

        //code for Olivias page

        oliviaPage("WebContent/olivia.html");

        //code for Rani's page

        raniPage();

        //Upload background image (user inputed?)

        //Body

        //Footer
        outputFooter(file);

        //Close file
        file.close();
    }

}

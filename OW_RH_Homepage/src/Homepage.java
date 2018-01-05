import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class Homepage extends rani {

    public static void main(String[] args) {
        //Ask user for output file name
        SimpleWriter out = new SimpleWriter1L(),
                file = new SimpleWriter1L("WebContent/index.html");
        SimpleReader in = new SimpleReader1L();

        //Output title and header to file.
        outputHeader("Home", file);

        //output css link
        file.println(
                "<link href=\"homepageStyle.css\" rel=\"stylesheet\" type=\"text/css\"></link>");

        //output header
        file.println("<h1>" + home + "</h1>");

        /*
         * Create tabs, maybe embedded within a colored/designed band. Link
         * other HTML pages to tabs. Later: prompt user for design preferences
         */

        createTabs("home", file);

        file.println("<hr>"); //output line
        file.println("<h2> Welcome to our site! </h2>");

        //code for olivias page

        oliviaPage();

        //code for rani's page

        raniPage();

        //Upload background image (user inputed?)

        //Body

        //Footer
        outputFooter(file);

        //Close file
        file.close();
    }

}

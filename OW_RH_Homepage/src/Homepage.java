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
        //out.println("File name: ");

        //Create file
        //String fileName = in.nextLine();

        //Output title and header to file. Ask user for site name
        htmltemplate.outputHeader("Home", file);

        file.println(
                "<link href=\"homepageStyle.css\" rel=\"stylesheet\" type=\"text/css\"></link>");
        file.println("<body>");
        file.println("<h1> OliviaRani </h1>");

        /*
         * Create tabs, maybe embedded within a colored/designed band. Link
         * other HTML pages to tabs. Later: prompt user for design preferences
         */
        file.println("<ul>");
        htmltemplate.createTabs("home", file);
        file.println("</ul>");

        file.println("<hr>");
        file.println("<h2> Welcome to our site! </h2>");

        //code for olivias page

        oliviaPage();

        //code for rani's page

        SimpleWriter rani = new SimpleWriter1L("WebContent/rani.html");
        htmltemplate.outputHeader("Rani", rani);

        rani.println("<body>");
        rani.println("<h1> Rani's Page! </h1>");
        htmltemplate.createTabs("rani", rani);
        rani.println("</ul>");

        htmltemplate.outputFooter(rani);

        //Upload background image (user inputed?)

        //add css elements

        //file.println(
        //       "<link href=\"homepageStyle.css\" rel=\"stylesheet\" type=\"text/css\"></link>");
        //Body

        //Footer
        htmltemplate.outputFooter(file);

        //Close file
        file.close();
    }

}

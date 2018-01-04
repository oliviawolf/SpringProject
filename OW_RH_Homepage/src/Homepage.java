import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class Homepage extends htmltemplate {

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
        htmltemplate.createTabs("index.html", "Home", file, true);
        htmltemplate.createTabs("olivia.html", "Olivia's shit", file, false);
        htmltemplate.createTabs("rani.html", "Rani's shit", file, false);
        file.println("</ul>");

        file.println("<hr>");
        file.println("<h2> Welcome to our page! </h2>");

        SimpleWriter olivia = new SimpleWriter1L("WebContent/olivia.html");
        file.print("Click on this ");
        file.print("<a href=\"olivia.html\">link </a>");
        file.println("for a surprise :)");

        //code for olivias page

        htmltemplate.outputHeader("Surprise!", olivia);

        //include css code
        olivia.println(
                "<link href=\"homepageStyle.css\" rel=\"stylesheet\" type=\"text/css\"></link>");

        olivia.println("<body>");
        olivia.println("<h1> Olivia's Page! </h1>");
        olivia.println("<ul>");
        htmltemplate.createTabs("index.html", "Home", olivia, false);
        htmltemplate.createTabs("olivia.html", "Olivia's shit", olivia, true);
        htmltemplate.createTabs("rani.html", "Rani's shit", olivia, false);
        olivia.println("</ul>");

        olivia.println("<img src=\"funny pic.jpg\"><img>");
        htmltemplate.outputFooter(olivia);

        //code for rani's page

        SimpleWriter rani = new SimpleWriter1L("rani.html");
        htmltemplate.outputHeader("Rani", rani);

        rani.println("<body>");
        rani.println("<h1> Rani's Page! </h1>");
        rani.println("<ul>");
        htmltemplate.createTabs("index.html", "Home", rani, false);
        htmltemplate.createTabs("olivia.html", "Olivia's shit", rani, false);
        htmltemplate.createTabs("rani.html", "Rani's shit", rani, true);
        rani.println("</ul>");

        htmltemplate.outputFooter(rani);

        //Upload background image (user inputed?)

        //add css elements

        //file.println(
        //       "<link href=\"homepageStyle.css\" rel=\"stylesheet\" type=\"text/css\"></link>");
        //Body
        file.println("<body><p>Olivia is dope</p>");

        //Footer
        htmltemplate.outputFooter(file);

        //Close file
        file.close();
    }

}

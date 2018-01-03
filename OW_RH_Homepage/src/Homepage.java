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

        file.println("<body>");
        file.println("<h1> OliviaRani </h1>");
        file.println("<hr>");
        file.println("<h2> Welcome to our page! </h2>");

        SimpleWriter page2 = new SimpleWriter1L("WebContent/link.html");
        file.print("Click on this ");
        file.print("<a href=\"link.html\">link </a>");
        file.println("for a surprise :)");

        //code for page 2

        htmltemplate.outputHeader("Surprise!", page2);

        page2.println("<img src=\"funny pic.jpg\"><img>");
        htmltemplate.outputFooter(page2);

        //Upload background image (user inputed?)

        //Create tabs, maybe embedded within a colored/designed band. Link other HTML pages to tabs. Later: prompt user for design preferences

        //add css elements

        file.println(
                "<link href=\"homepageStyle.css\" rel=\"stylesheet\" type=\"text/css\"></link>");
        //Body
        file.println("<body><p>Olivia is dope</p>");

        //Footer
        htmltemplate.outputFooter(file);

        //Close file
        file.close();
    }

}

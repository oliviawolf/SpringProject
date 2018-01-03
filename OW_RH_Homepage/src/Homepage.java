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
        htmltemplate.outputHeader("test", file);

        //Upload background image (user inputed?)

        //Create tabs, maybe embedded within a colored/designed band. Link other HTML pages to tabs. Later: prompt user for design preferences

        //Body
        file.println("<body><p>Olivia is dope</p>");

        //Footer
        htmltemplate.outputFooter(file);

        //Close file
        file.close();
    }

}

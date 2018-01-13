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
        //Header
        outputHeader(tRani, rani);

        //Import style settings from CSS document
        rani.println(
                "<link href=\"rani_style.css\" rel=\"stylesheet\" type=\"text/css\"></link>");

        //Display title of page
        rani.println("<h1>" + tRani + "</h1>");

        //Create tabs and a bar below it separating common header from content
        createTabs(tRani, rani);
        rani.println("<hr>");

        //Read out paragraphs from text file
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

        //Create a button for comments
        createButton("Test", "comments()", rani);
        rani.println("<script src=\"rani.js\"></script>");

        //rani.println("<p><a href=\" \">Hello World!</a></p>");

        //Create a form to be emailed to rhinnawi95@gmail.com

        rani.println(
                "<form action=\"mailto:rhinnawi95@gmail.com\" method=\"get\">\r\n"
                        + "Subject: <input type=\"text\" name=\"subject\"><br/>\r\n"
                        + "Comment: <textarea name=\"body\"></textarea><br/>\r\n"
                        + "<input type=\"submit\" value=\"Send\">\r\n"
                        + "</form>");

        //Add Java compiler

        //Generate closing tags and close the file
        outputFooter(rani);
        rani.close();
    }
}

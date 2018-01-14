import components.simplewriter.SimpleWriter;

/**
 * Creates the rani.html page by using the same header and footer as other tabs
 * in the homepage but filling in a different body.
 *
 * @author Rani Hinnawi
 *
 */
public class rani extends olivia {

    /**
     * Method used to create Rani's HTML file
     */
    public static void raniPage(SimpleWriter rani) {
        //Header
        outputHeader(tRani, rani);

        //Import style settings from CSS document
        rani.println("<link href=\"" + cRani
                + "\" rel=\"stylesheet\" type=\"text/css\"></link>");

        //Display title of page
        rani.println("<h1>" + tRani + "</h1>");

        //Create tabs and a bar below it separating common header from content
        createTabs(tRani, rani);
        rani.println("<hr>");

        //Read out paragraphs from text file
        readFromFile(raniText1, rani);

        //Create a button for comments
        createButton("Test", "comments()", rani);
        rani.println("<script src=\"" + jRani + "\"></script>");

        //Create link to Java applet
        //rani.println("<p><a href=\" \">Hello World!</a></p>");

        //Create a form to be emailed to rhinnawi95@gmail.com

        //rani.println(
        //        "<form action=\"mailto:rhinnawi95@gmail.com\" method=\"get\">\r\n"
        //                + "Subject: <input type=\"text\" name=\"subject\"><br/>\r\n"
        //                + "Comment: <textarea name=\"body\"></textarea><br/>\r\n"
        //                + "<input type=\"submit\" value=\"Send\">\r\n"
        //                + "</form>");

        //Add Java compiler

        //Generate closing tags and close the file
        outputFooter(rani);
        rani.close();
    }
}

import components.simplewriter.SimpleWriter;

public class htmltemplate {
    //template to create different components of a well formatted html file

    //method to create headers
    public static void outputHeader(String title, SimpleWriter out) {

        out.println("<html>");
        out.println("<head>");
        out.println("<title>" + title + "</title>");
        out.println("</head>");

    }

    //method do create footers
    public static void outputFooter(SimpleWriter out) {
        out.println("</body>");
        out.println("</html>");
    }

    /**
     *
     * @param fileName
     *            Name of file being linked to
     * @param tabTitle
     *            Title of tab
     * @param file
     *            File being outputed to
     * @requires fileName is in the format "name.html"
     */
    public static void createTabs(String fileName, String tabTitle,
            SimpleWriter file, boolean active) {
        if (!active) {
            file.println("<li><a href=\"" + fileName + "\">" + tabTitle
                    + "</a></li>\r\n");
        } else {
            file.println("<li><a class=\"active\" href=\"" + fileName + "\">"
                    + tabTitle + "</a></li>\r\n");
        }
    }

    //different body methods
    public static void main(String[] args) {
    }
}

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

    //different body methods
    public static void main(String[] args) {
    }
}

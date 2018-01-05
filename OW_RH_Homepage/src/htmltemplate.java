import java.util.HashMap;
import java.util.Map;

import components.simplewriter.SimpleWriter;

/**
 * Pool of HTML template methods used to create different aspects of an HTML
 * file.
 *
 * @author Rani Hinnawi, Olivia Wolf
 *
 */
public class htmltemplate {

    public static String tHome = "Olivia & Rani", tOlivia = "Olivia",
            tRani = "Rani";
    public static String fHome = "index.html", fOlivia = "olivia.html",
            fRani = "rani.html";

    public static String[] fileNames = { fHome, fOlivia, fRani };
    public static String[] siteTitles = { tHome, tOlivia, tRani };

    public static final Map<String, String> files = new HashMap<>();
    static {
        for (int i = 0; i < siteTitles.length; i++) {
            files.put(siteTitles[i], fileNames[i]);
        }
    }

    /**
     * Outputs opening tags for HTML files
     *
     * @param out
     *            HTML file being outputed to
     */
    public static void outputHeader(String title, SimpleWriter out) {

        out.println("<html>");
        out.println("<head>");
        out.println("<title>" + title + "</title>");
        out.println("</head>");
        out.println("<body>");

    }

    /**
     * Outputs closing tags for HTML files
     *
     * @param out
     *            HTML file being outputed to
     */
    public static void outputFooter(SimpleWriter out) {
        out.println("</body>");
        out.println("</html>");
    }

    /**
     * Creates a horizontally aligned set of tabs linking to the home page and
     * each individual website created.
     *
     * @param user
     *            Name of user whose page is being created.
     * @param file
     *            File being outputed to
     * @updates file
     */
    public static void createTabs(String user, SimpleWriter file) {
        file.println("<ul>");
        for (int i = 0; i < siteTitles.length; i++) {
            boolean active = (siteTitles[i] == user);

            if (!active) {
                file.println("<li><a href=\"" + files.get(siteTitles[i]) + "\">"
                        + siteTitles[i] + "</a></li>\r\n");
            } else {
                file.println("<li><a class=\"active\" href=\""
                        + files.get(siteTitles[i]) + "\">" + siteTitles[i]
                        + "</a></li>\r\n");
            }
        }

        file.println("</ul>");
    }

    //different body methods
    public static void main(String[] args) {
    }
}

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

    public static String homepageFile = "index.html", oFile = "olivia.html",
            rFile = "rani.html";
    public static String[] fileNames = { homepageFile, oFile, rFile };
    public static String[] siteTitles = { "Olivia & Rani", "Olivia", "Rani" }; //Tentative names
    public static String[] keys = { "home", "olivia", "rani" };

    public static final Map<String, String> files = new HashMap<>(),
            titles = new HashMap<>();
    static {
        for (int i = 0; i < keys.length; i++) {
            files.put(keys[i], fileNames[i]);
            titles.put(keys[i], siteTitles[i]);
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
        for (int i = 0; i < keys.length; i++) {
            boolean active = (keys[i] == user);

            if (!active) {
                file.println("<li><a href=\"" + files.get(keys[i]) + "\">"
                        + titles.get(keys[i]) + "</a></li>\r\n");
            } else {
                file.println("<li><a class=\"active\" href=\""
                        + files.get(keys[i]) + "\">" + titles.get(keys[i])
                        + "</a></li>\r\n");
            }
        }

        file.println("</ul>");
    }

    //different body methods
    public static void main(String[] args) {
    }
}

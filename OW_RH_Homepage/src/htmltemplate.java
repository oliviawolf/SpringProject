import java.util.HashMap;
import java.util.Map;

import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Pool of HTML template methods used to create different aspects of an HTML
 * file.
 *
 * @author Rani Hinnawi, Olivia Wolf
 *
 */
public class htmltemplate {

    //Site titles
    public static String tHome = "Olivia & Rani", tOlivia = "Olivia",
            tRani = "Rani";

    //Output file names
    public static String fHome = "WebContent/Homepage/index.html",
            fOlivia = "WebContent/Olivia/olivia.html",
            fRani = "WebContent/Rani/rani.html";

    public static String[] fileNames = { fHome, fOlivia, fRani };
    public static String[] siteTitles = { tHome, tOlivia, tRani };

    public static final Map<String, String> files = new HashMap<>();
    static {
        for (int i = 0; i < siteTitles.length; i++) {
            files.put(siteTitles[i], fileNames[i]);
        }
    }

    //CSS files
    public static String cHome = "WebContent/Homepage/homepageStyle.css",
            cOlivia = "WebContent/Homepage/olivia_style.css",
            cRani = "WebContent/Homepage/rani_style.css";

    //Javascript files
    public static String jHome = "WebContent/Homepage/homepagejs.js",
            jOlivia = "WebContent/Homepage/olivia.js",
            jRani = "WebContent/Homepage/rani.js";

    //Additional WebContent files
    public static String song1 = "WebContent/Olivia/01 - Like A Star.mp3",
            audio2 = "WebContent/Olivia/audio2.mp3",
            audio3 = "WebContent/Olivia/audio3.mp3",
            funnyPic = "WebContent/Olivia/funny pic.jpg",
            raniText1File = "WebContent/Rani/rani_text1.txt";

    //Webpages, input and output files
    public static SimpleWriter home = new SimpleWriter1L(fHome),
            rani = new SimpleWriter1L(fRani),
            olivia = new SimpleWriter1L(fOlivia);
    public static SimpleReader raniText1 = new SimpleReader1L(raniText1File);

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

    /**
     * Creates a button that runs a function specified by String function.
     *
     * @param name
     *            Words to be written on button
     * @param function
     *            The function that is run when button is pressed
     * @param file
     *            File being outputed to
     * @updates file
     */
    public static void createButton(String name, String function,
            SimpleWriter file) {
        file.println("<input type=\"button\" value=\"" + name + "\" onclick=\""
                + function + "\"/>");

    }

    /**
     * Read text from text files and split it into paragraphs. Will update later
     * to allow for indenting paragraphs, maybe use separator from CSE
     * lab/project
     *
     * @param textFile
     *            .txt file being uploaded from
     * @param file
     *            HTML file being uploaded to
     * @updates file, textFile
     * @requires file to be an HTML file
     */
    public static void readFromFile(SimpleReader textFile, SimpleWriter file) {
        file.println("<p>");
        while (!textFile.atEOS()) {
            String line = textFile.nextLine();
            if (line.equals("") || line.equals(" ")) {
                file.println("</p><p>");
            } else {
                file.println(line);
            }
        }
        file.println("</p>");
    }
}

import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class olivia extends htmltemplate {

    public static void oliviaPage() {
        SimpleWriter olivia = new SimpleWriter1L("WebContent/olivia.html");

        //code for olivias page

        outputHeader(tOlivia, olivia);

        //include css code
        olivia.println(
                "<link href=\"olivia_style.css\" rel=\"stylesheet\" type=\"text/css\"></link>");

        olivia.println("<h1>" + tOlivia + "</h1>");

        createTabs(tOlivia, olivia);

        //add a song to page
        olivia.println(
                "<embed id=\"sound\" src=\"C:\\Users\\olivi\\Music\\A music\\01 - Like A Star.mp3\" autostart=\"false\" width=\"0\" height=\"0\">");
        //create button

        createButton("click me", "myFunction()", olivia);

        createButton("NO, click me", "myFunction2()", olivia);

        createButton("click to add your own image", "addImage()", olivia);

        createButton("play a song", "playSong()", olivia);

        createButton("pause", "pauseSong()", olivia);

        olivia.println(
                "<img id=\"baby\" src=\"funny pic.jpg\" style=\"visibility:hidden\" width=\"400\" height=\"height\" />");
        //include javascript

        //olivia.println(
        //      "<embed id=\"sound\" src=\"null\" autostart=\"false\" width=\"0\" height=\"0\">");
        olivia.println(
                "<img id=\"new\" src=\"null\" style=\"visibility:hidden\" width=\"400\" height=\"height\" />");

        olivia.println("<script src=\"olivia.js\"></script>");
        // olivia.println("<img src=\"funny pic.jpg\"><img>");
        htmltemplate.outputFooter(olivia);

        olivia.close();
    }

    //
    public static void main(String[] args) {

    }

}

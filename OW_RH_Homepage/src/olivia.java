import components.simplewriter.SimpleWriter;

public class olivia extends htmltemplate {

    public static void oliviaPage(SimpleWriter olivia) {
        //SimpleWriter olivia = new SimpleWriter1L(file);

        //code for olivias page

        outputHeader(tOlivia, olivia);

        //include css code
        olivia.println("<link href=\"" + cOlivia
                + "\" rel=\"stylesheet\" type=\"text/css\"></link>");

        olivia.println("<h1>" + tOlivia + "</h1>");

        olivia.println("<div class=\"date\">");
        olivia.println("<p id=\"date\"></p>");
        olivia.println("</div>");
        createTabs(tOlivia, olivia);

        olivia.println("<hr>");

        //add a song to page
        olivia.println("<embed id=\"sound\" src=\"" + song1
                + "\" autostart=\"false\" width=\"0\" height=\"0\">");

        olivia.println("<div class=\"tab\">");

        olivia.println(
                "<button class=\"tablinks\" onclick =\"openPage(event,'Buttons')\"> Buttons </button>");
        olivia.println(
                "<button class=\"tablinks\" onclick =\"openPage(event,'Music')\"> Music player </button>");
        olivia.println("</div>");

        olivia.println("<div id=\"Buttons\" class=\"tabcontent\">");

        olivia.println(
                "Click any of the buttons below to make some magic happen \n");
        olivia.println("<p></p>");

        createButton("click to update date", "upDate()", olivia);
        createButton("click me", "myFunction()", olivia);

        createButton("NO, click me", "myFunction2()", olivia);
        createButton("click to add your own image", "addImage()", olivia);
        olivia.println("<p></p>");
        olivia.println(
                "<img id=\"baby\" src=\"funny pic.jpg\" style=\"visibility:hidden\" width=\"400\" height=\"height\" />");
        olivia.println(
                "<img id=\"new\" src=\"null\" style=\"visibility:hidden\" width=\"400\" height=\"height\" />");

        olivia.println(" </div>");

        olivia.println("<div id=\"Music\" class=\"tabcontent\">");

        olivia.println("<audio controls=\"controls\" id=\"audio_player\">");
        olivia.println("<source src=\"" + audio2 + "\" type=\"audio/mpeg\" />");
        olivia.println(
                "Your browser does not support the audio element. \n </audio>");
        olivia.println("<p></p>");

        createButton("play a song", "playSong()", olivia);

        createButton("pause", "pauseSong()", olivia);

        createButton("play this instead", "chooseSong(\'" + audio3 + "\')",
                olivia);

        olivia.println("</div>");
        //create form to enter name

        olivia.println(
                "<form action=\"/action_page.php\" method=\"get\"> \n First name: <br> \n <input type=\"text\" name=\"firstname\"><br>");

        olivia.println("\n<input type=\"submit\" value=\"Submit\">\n");

        olivia.println("</form>");
        //create button

        //include javascript

        olivia.println("<script src=\"" + jOlivia + "\"></script>");
        // olivia.println("<img src=\"funny pic.jpg\"><img>");
        htmltemplate.outputFooter(olivia);

        olivia.close();
    }

}

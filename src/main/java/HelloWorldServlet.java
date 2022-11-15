import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    //doGET takes two objects the request and response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, world!</h1>");
        // will bring up a webpage with 404 error just type /hello (from urlPatterns above) then you can see "Hello, world! in H1 on a new webpage
        // allows browser to communicate to the java code on your server


    }
}

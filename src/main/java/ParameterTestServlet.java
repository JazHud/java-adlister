import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// to creat a servlet
    //1. Create a class the extends HttpServlet

    //2. Annotate the class with the @WebServlet annotation to specify which URL it maps to

    //3. Implement a protected doGet and/or doPost method that accepts two parameters: HttpServletRequest, and HttpServletResponse

//THIS FILE IS USED TO LINK INDEX HTML FILE to automatically populate when requested
@WebServlet(name= "ParameterTestServlet", urlPatterns = "/parameterTest") //2.
public class ParameterTestServlet extends HttpServlet { //1.

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String word = request.getParameter("word"); // this is from the input name attribute in the html file (it has to match == <input type="text" !!name="word"!! id="word")
        out.println("<h1> You entered " + word + "!</h1>"); //3.
    }
}
// make sure you shut down Tomcat if you need to use it later on
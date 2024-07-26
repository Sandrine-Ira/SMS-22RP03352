import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/view-cart")
public class viewcartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Item you have in your Cart are:</h2>");
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                out.println("<p>" + cookie.getValue() + "</p>");
            }
        } else {
            out.println("<p>Your cart is empty.</p>");
        }
        out.println("<a href='index.html'>Additem</a><br>"
                + "<html><body><a href='Removeitem.html'>Remove item</a><br>"
                + "<a href='Clearcart.html'>clear item</a>");
        out.println("</body></html>");
    }
}

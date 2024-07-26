import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/remove-item")
public class Removeitemservlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String item = request.getParameter("item");
        if (item != null) {
            Cookie cookie = new Cookie(item, null);
            cookie.setMaxAge(0); // delete the cookie
            response.addCookie(cookie);
        }
        response.sendRedirect("viewcartServlet");
    }
}

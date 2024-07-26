import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add-item")
public class Additem extends HttpServlet {
    //private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String item = request.getParameter("item");
        if (item != null && !item.trim().isEmpty()) {
            Cookie cookie = new Cookie(item, item);
            cookie.setMaxAge(60 * 60 * 24); // 1 day
            response.addCookie(cookie);
        }
        response.sendRedirect("viewcartServlet ");
      
       
    }
}

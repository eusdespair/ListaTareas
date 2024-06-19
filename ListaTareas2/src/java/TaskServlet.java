
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet(name = "TaskServlet", urlPatterns = {"/TaskServlet", "/AgregarTarea"})
public class TaskServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String task = request.getParameter("task");
        HttpSession session = request.getSession();
        List<String> tasks = (List<String>) session.getAttribute("tasks");
        if (tasks == null) {
            tasks = new ArrayList<>();
            session.setAttribute("tasks", tasks);
        }
        if (task != null && !task.trim().isEmpty()) {
            tasks.add(task);
        }
        request.setAttribute("tasks", tasks);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
 

}
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TablaMultiplicarServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int numero = Integer.parseInt(request.getParameter("numero"));

        if (numero >= 1 && numero <= 10) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("Tabla de Multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                out.println("<tr><td>" + numero + " x " + i + "</td><td>" + (numero * i) + "</td></tr>");
            }
            out.println("</table>");
        }
    }
}

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sumaacumulativa")
public class SumaAcumulativaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int numero = Integer.parseInt(request.getParameter("numero"));

        if (numero > 0) {
            int sumaAcumulativa = 0;
            for (int i = 1; i <= numero; i++) {
                sumaAcumulativa += i;
            }

            out.println("La suma acumulativa hasta " + numero + " es: " + sumaAcumulativa);
        }
    }
}

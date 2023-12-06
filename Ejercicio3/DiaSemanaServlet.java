import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DiaSemanaServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int numero = Integer.parseInt(request.getParameter("numero"));

        if (numero >= 1 && numero <= 7) {
            String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
            String dia = diasSemana[numero - 1];

            out.println("El día de la semana es: " + dia );
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Número fuera de rango (1-7)");
        }
    }
}

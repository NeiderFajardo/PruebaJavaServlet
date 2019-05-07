package servlets;

import modelo.GuardarTexto;
import modelo.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/guardarServlet")
public class guardarDatosServlet extends HttpServlet {
    String nombre, correo, contrasena;
    public Usuario usuario;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        usuario = new Usuario(req.getParameter("nombre").trim(),
                                req.getParameter("correo").trim(),
                                req.getParameter("contrasena").trim());

        guardarDatosUsuario(usuario.organizarDatos());
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.write("<html>\n" +
                "<head>\n" +
                "    <title>Usuarios</title>\n" +
                "</head>\n");
                out.write("<body>\n");
                out.write(" <h1>Aquí se listan todos los usuarios que se han registrado, pero me da pereza hacerlos</h1>\n");
                out.write("</body>\n" +
                "</html>");

        out.close();
        doGet(req, resp);

    }

    public void guardarDatosUsuario(String datos){
    try{
        GuardarTexto.escribirArchivo(datos);
    } catch(Exception e) {
        System.out.println("Error al obtener datos");
    }

    }
}

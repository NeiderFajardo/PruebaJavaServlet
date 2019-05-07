package modelo;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GuardarTexto {
    private static FileWriter lector;

    public static void escribirArchivo(String texto){
        try
        {
            //Hay que mirar bien lo de la ruta
            lector = new FileWriter("/home/neideralejandro/IdeaProjects/appPrueba1/src/modelo/prueba.txt",true);
            PrintWriter pw = new PrintWriter(lector);
            pw.println(texto);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                // Nuevamente aprovechamos el finally para
                // asegurarnos que se cierra el fichero.
                if (null != lector)
                    lector.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}

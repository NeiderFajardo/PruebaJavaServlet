package modelo;

public class Usuario {

    private String nombre;
    private String correo;
    private String contrasena;

    public Usuario(){

    }
    public Usuario(String n, String c, String con){
        nombre = n;
        correo = c;
        contrasena = con;
    }

    public String organizarDatos(){
        return "Nombre:"+this.nombre+",Correo:"+this.correo+",Contrasena:"+this.contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

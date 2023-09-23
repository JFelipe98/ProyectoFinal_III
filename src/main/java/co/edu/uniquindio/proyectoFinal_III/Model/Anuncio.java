package co.edu.uniquindio.proyectoFinal_III.Model;

public class Anuncio{
   public String nombre;
   public String codigo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Anuncio(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
}

package co.edu.uniquindio.proyectoFinal_III.Model;

public class Producto {

    public String nombre;
    public String tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Producto(String nombre, String tipo) {
        this.nombre=nombre;
        this.tipo=tipo;
    }
}

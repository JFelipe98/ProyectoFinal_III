package co.edu.uniquindio.proyectoFinal_III.Model;

public class Puja {
    public String codigo;
    public String fecha;
    public int ofertaInicial;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getOfertaInicial() {
        return ofertaInicial;
    }

    public void setOfertaInicial(int ofertaInicial) {
        this.ofertaInicial = ofertaInicial;
    }

    public Puja(String codigo, String fecha, int ofertaInicial) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.ofertaInicial = ofertaInicial;
    }
}

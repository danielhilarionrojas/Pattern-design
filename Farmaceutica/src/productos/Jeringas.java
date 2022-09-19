package productos;


public class Jeringas {

    private String descripcion;
    private boolean logo = false;
    private String marca;
    private String color;
    private boolean aguja = false;

    public boolean isAguja() {
        return aguja;
    }

    public void setAguja(boolean aguja) {
        this.aguja = aguja;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isLogo() {
        return logo;
    }

    public void setLogo(boolean logo) {
        this.logo = logo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
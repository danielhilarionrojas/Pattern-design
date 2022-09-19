package productos;

/**
 *
 * @author alejonba0498
 */
public class Pastillas {

    private String descripcion;
    private boolean logo = false;
    private String marca;
    private String color;
    private boolean blister = false;

    public boolean isBlister() {
        return blister;
    }

    public void setBlister(boolean blister) {
        this.blister = blister;
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

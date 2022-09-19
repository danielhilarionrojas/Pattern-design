package productos;

public class Jarabes {
       private String descripcion;
    private boolean logo=false;
    private String marca;
    private String color;
    private boolean embasePlastico=false;

    public boolean isEmbasePlastico() {
        return embasePlastico;
    }

    public void setEmbasePlastico(boolean embasePlastico) {
        this.embasePlastico = embasePlastico;
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


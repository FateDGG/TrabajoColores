package trabajocolores;

public class Galleta {

    private String colorBase;
    private String adornos;
    private String epoca;
    private String ingrediente;
    
    public Galleta(){
    }
    public String getIngrediente(){
        return ingrediente;
    }
    public void setIngrediente(String ingrediente){
        this.ingrediente=ingrediente;
    }
    public String getColorBase() {
        return colorBase;
    }

    public void setColorBase(String colorBase) {
        this.colorBase = colorBase;
    }

    public String getAdornos() {
        return adornos;
    }

    public void setAdornos(String adornos) {
        this.adornos = adornos;
    }

    public String getEpoca() {
        return epoca;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }
    
    public void comer(String fecha){
        System.out.println("Se están comiendo una galleta de gengibre en " + fecha);
    }
    public void cocinar(){
        System.out.println("Se deben hornear bien para que sepan rico");
    }
    public void gengibres(){
        System.out.println("El sabor a gengibre puede ser un poco fuerte si no se cocina bien");
    }
}

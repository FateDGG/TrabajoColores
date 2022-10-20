package trabajocolores;

public class Galleta {

    private String colorBase;
    private String adornos;
    private String epoca;
    
    public Galleta(){
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
    
    public void comer(String Comer){
        System.out.println("Se están comiendo una galleta de gengibre");
    }
}

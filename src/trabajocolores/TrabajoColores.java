package trabajocolores;
public class TrabajoColores {
    public static void main(String[] args) {
        Galleta gengibre=new Galleta();
        gengibre.setColorBase("Marron");
        gengibre.setAdornos("Verde y rojo");
        gengibre.setEpoca("Navidad");
        System.out.println(gengibre.getAdornos());
        gengibre.comer("navidad");
        gengibre.cocinar();
        gengibre.gengibres();
        
    }
    
}

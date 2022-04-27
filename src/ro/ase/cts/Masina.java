package ro.ase.cts;

public class Masina {
    private String dimensiune;
    private String forma;
    private String culoare;

    public Masina(String dimensiune, String forma, String culoare) {
        this.dimensiune = dimensiune;
        this.forma = forma;
        this.culoare = culoare;
    }

    public void afiseaza(){
        System.out.println("Masina "+this.culoare);
    }
}

package ro.ase.cts;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> culori = List.of(new String[]{"rosu", "galben", "rosu", "rosu", "galben", "rosu"});
        for(int i=0;i<culori.size();i++){
            Masina masina = FactoryCuloareMasina.getMasinaCuloare(culori.get(i));
            masina.afiseaza();
        }
    }
}

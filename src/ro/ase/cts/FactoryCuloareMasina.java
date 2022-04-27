package ro.ase.cts;

import java.util.HashMap;

public class FactoryCuloareMasina {
    private static HashMap<String,Masina> hm = new HashMap<>();

    public static Masina getMasinaCuloare(String culoare){
        Masina masina = null;

        if(hm.containsKey(culoare)){
            masina = hm.get(culoare);
        }else{
            masina = new Masina("12","patrat",culoare);
            hm.put(culoare,masina);
        }
        return masina;
    }

}

package org.example;

import java.util.ArrayList;
import java.util.List;

public enum Material {
    ALGODON,
    LINO,
    SEDA,
    LANA,
    NAILON,
    PANA,
    GASA,
    ACETATO,
    TERCIOPELO,
    GABARDINA,
    PIQUE,
    TUL,
    MEZCLILLA,
    CREPE,
    LYCRA,
    CHIFFON,
    CUERO,
    CUERINA,
    GOMA;


    public List<Material> esParaZapatos() {
        List<Material> materiales = new ArrayList<>();
        materiales.add(CUERO);
        materiales.add(CUERINA);
        materiales.add(GOMA);
        return materiales;
    }

    public List<Material> esParaSuperior() {
        List<Material> materiales = new ArrayList<>();
        materiales.add(ALGODON);
        materiales.add(LINO);
        materiales.add(SEDA);
        materiales.add(LANA);
        materiales.add(NAILON);
        materiales.add(GASA);
        materiales.add(PANA);
        materiales.add(TERCIOPELO);
        materiales.add(GABARDINA);
        materiales.add(TUL);
        materiales.add(MEZCLILLA);
        materiales.add(CREPE);
        materiales.add(LYCRA);
        materiales.add(CHIFFON);
        materiales.add(PIQUE);
        return materiales;
    }

    public List<Material> esParaInferior() {
        List<Material> materiales = new ArrayList<>();
        materiales.add(ALGODON);
        materiales.add(SEDA);
        materiales.add(GASA);
        materiales.add(PANA);
        materiales.add(TERCIOPELO);
        materiales.add(GABARDINA);
        materiales.add(MEZCLILLA);
        materiales.add(LYCRA);
        materiales.add(CUERINA);
        materiales.add(ACETATO);
        return materiales;
    }

    public List<Material> esParaAccesorios() {
        List<Material> materiales = new ArrayList<>();
        materiales.add(CUERO);
        materiales.add(GOMA);
        return materiales;
    }
}

package org.example;

import java.util.Set;

public class Atuendo {
    private Prenda superior;
    private Prenda inferior;
    private Prenda zapatos;
    private Set<Prenda> accesorios;


    public Atuendo(Prenda superior, Prenda inferior, Prenda zapatos, Set<Prenda> accesorios) {
        this.superior = superior;
        this.inferior = inferior;
        this.zapatos = zapatos;
        this.accesorios = accesorios;
    }

    public Prenda getSuperior() {
        return superior;
    }

    public void setSuperior(Prenda superior) {
        this.superior = superior;
    }

    public Prenda getInferior() {
        return inferior;
    }

    public void setInferior(Prenda inferior) {
        this.inferior = inferior;
    }

    public Prenda getZapatos() {
        return zapatos;
    }

    public void setZapatos(Prenda zapatos) {
        this.zapatos = zapatos;
    }

    public Set<Prenda> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Set<Prenda> accesorios) {
        this.accesorios = accesorios;
    }
}
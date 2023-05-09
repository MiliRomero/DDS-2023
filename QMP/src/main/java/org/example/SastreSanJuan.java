package org.example;

import java.awt.*;
import java.util.Optional;

public class SastreSanJuan extends Sastre {

  @Override
  protected Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador();
    borrador.especificarTipo(TipoPrenda.CHOMBA);
    borrador.especificarMaterial(Material.PIQUE);
    borrador.especificarColorPrimario(Color.green);
    return borrador.crearPrenda();
  }

  @Override
  protected Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador();
    borrador.especificarTipo(TipoPrenda.PANTALON);
    borrador.especificarMaterial(Material.ACETATO);
    borrador.especificarColorPrimario(Color.gray);
    return borrador.crearPrenda();
  }

  @Override
  protected Prenda fabricarZapatos() {
    Borrador borrador = new Borrador();
    borrador.especificarTipo(TipoPrenda.ZAPATILLAS);
    borrador.especificarMaterial(Material.CUERINA);
    borrador.especificarColorPrimario(Color.WHITE);
    return borrador.crearPrenda();
  }
}

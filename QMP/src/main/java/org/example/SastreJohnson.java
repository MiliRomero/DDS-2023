package org.example;

import java.awt.*;

public class SastreJohnson extends Sastre{
  @Override
  protected Prenda fabricarParteSuperior() {
    Borrador borrador = new Borrador();
    borrador.especificarTipo(TipoPrenda.CAMISA_MANGA_LARGA);
    borrador.especificarMaterial(Material.ALGODON);
    borrador.especificarColorPrimario(Color.WHITE);
    return borrador.crearPrenda();
  }

  @Override
  protected Prenda fabricarParteInferior() {
    Borrador borrador = new Borrador();
    borrador.especificarTipo(TipoPrenda.PANTALON);
    borrador.especificarMaterial(Material.ALGODON);
    borrador.especificarColorPrimario(Color.BLACK);
    return borrador.crearPrenda();
  }

  @Override
  protected Prenda fabricarZapatos() {
    Borrador borrador = new Borrador();
    borrador.especificarTipo(TipoPrenda.ZAPATOS);
    borrador.especificarMaterial(Material.CUERINA);
    borrador.especificarColorPrimario(Color.BLACK);
    return borrador.crearPrenda();
  }
}

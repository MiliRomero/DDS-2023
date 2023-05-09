package org.example;

import java.awt.*;
import java.util.Optional;

abstract class Sastre {
  public Uniforme fabricarUniforme(){
    return new Uniforme(this.fabricarParteSuperior(), this.fabricarParteInferior(), this.fabricarZapatos());
  }

  protected abstract Prenda fabricarParteSuperior();
  protected abstract Prenda fabricarParteInferior();
  protected abstract Prenda fabricarZapatos();
}

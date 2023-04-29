package org.example;

import java.awt.*;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Color colorPrimario;
  private Optional<Color> colorSecundario;

  public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Optional<Color> colorSecundario) {
    this.tipoPrenda = requireNonNull(tipoPrenda, "El tipo de prenda es obligatorio.");
    this.material = requireNonNull(material, "El material es obligatorio.");
    this.colorPrimario = requireNonNull(colorPrimario, "El color es obligatorio.");
    this.colorSecundario = colorSecundario;
  }

  public TipoPrenda getTipoPrenda() {
    return this.tipoPrenda;
  }

  public Material getTela() {
    return this.material;
  }

  public Color getColorPrimario() {
    return this.colorPrimario;
  }

  public Optional<Color> getColorSecundario() {
    return this.colorSecundario;
  }


}

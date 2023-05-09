package org.example;

import java.awt.*;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class Prenda {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Trama trama;
  private Color colorPrimario;
  private Optional<Color> colorSecundario;

  public Prenda(TipoPrenda tipoPrenda, Material material, Trama trama, Color colorPrimario, Optional<Color> colorSecundario) {
    this.tipoPrenda = tipoPrenda;
    this.material = material;
    this.trama = trama;
    this.colorPrimario = colorPrimario;
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

  public Material getMaterial() {
    return material;
  }

  public Trama getTrama() {
    return trama;
  }

  public void setTipoPrenda(TipoPrenda tipoPrenda) {
    this.tipoPrenda = tipoPrenda;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  public void setTrama(Trama trama) {
    this.trama = trama;
  }

  public void setColorPrimario(Color colorPrimario) {
    this.colorPrimario = colorPrimario;
  }

  public void setColorSecundario(Optional<Color> colorSecundario) {
    this.colorSecundario = colorSecundario;
  }
}

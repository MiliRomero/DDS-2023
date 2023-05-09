package org.example;

import static java.util.Objects.requireNonNull;

import java.awt.*;
import java.util.Optional;

public class Borrador {
  private TipoPrenda tipoPrenda;
  private Material material;
  private Trama trama = Trama.LISA;
  private Color colorPrimario;
  private Optional<Color> colorSecundario;

  public void especificarTipo(TipoPrenda tipo){
    requireNonNull(tipo, "El tipo de prenda es obligatorio.");
    this.tipoPrenda = tipo;
  }

  public void especificarMaterial(Material material){
    requireNonNull(material, "El material es obligatorio.");
    verificarCompatibilidadConTipoDePrenda(material);
    this.material = material;
  }

  private void verificarCompatibilidadConTipoDePrenda(Material material){
    requireNonNull(this.tipoPrenda, "El tipo de prenda es obligatorio.");
    boolean resultado = false;
    switch (this.tipoPrenda.getCategoriaTipo()){
      case CALZADO:
        resultado = material.esParaZapatos().contains(material);
        break;
      case PARTE_SUPERIOR:
        resultado = material.esParaSuperior().contains(material);
        break;
      case PARTE_INFERIOR:
        resultado = material.esParaInferior().contains(material);
        break;
      case ACCESORIOS:
        resultado = material.esParaAccesorios().contains(material);
        break;
    }

    if(resultado == false){
      throw new IllegalArgumentException("El tipo de prenda no es compatible con el material");
    }
  }

  public void especificarTrama(Trama trama){
    this.trama = (trama == null ? Trama.LISA : trama);
  }

  public void especificarColorPrimario(Color color){
    requireNonNull(color, "El color primario es obligatorio.");
    this.colorPrimario = color;
  }

  public void especificarColorSecundario(Color color){
    this.colorSecundario = Optional.ofNullable(color);
  }

  public Prenda crearPrenda(){
    return new Prenda(this.tipoPrenda, this.material, this.trama, this.colorPrimario, this.colorSecundario);
  }
}

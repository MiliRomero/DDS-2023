package org.example;

public enum TipoPrenda {
  ZAPATILLAS(Categoria.CALZADO),
  ZAPATOS(Categoria.CALZADO),
  CROCKS(Categoria.CALZADO),
  CAMISA_MANGA_CORTA(Categoria.PARTE_SUPERIOR),
  CAMISA_MANGA_LARGA(Categoria.PARTE_SUPERIOR),
  REMERA_MANGA_CORTA(Categoria.PARTE_SUPERIOR),
  REMERA_MANGA_LARGA(Categoria.PARTE_SUPERIOR),
  MUSCULOSA(Categoria.PARTE_SUPERIOR),
  PANTALON(Categoria.PARTE_INFERIOR),
  POLLERA(Categoria.PARTE_INFERIOR),
  ANTEOJOS(Categoria.ACCESORIOS);

  private Categoria categoria;

  private TipoPrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria getCategoriaTipo() {
    return this.categoria;
  }
}

class Tienda{
	var property ventas
	
	method ganancias(dia) = ventas.filter{venta => venta.esDeFecha(dia)}.sum{venta => venta.precioFinal()}
}

class Venta{
	var property prendasVendidas
	var property fecha = new Date()
	var property tipoPago //efectivo o tarjeta
	
	method calcularRecargo(prenda) = tipoPago.recargo(prenda)
	
	method esDeFecha(dia) = dia === fecha
	
	method precioFinal() = prendasVendidas.sum{prendaVendida => 
			prendaVendida.importeXCantVendida() + self.calcularRecargo(prendaVendida)} 
			
}

object efectivo{
	method recargo(prenda) = 0
}

class Tarjeta{
	const property cantCuotas
	const property coefFijo
	
	method recargo(prenda) = cantCuotas * coefFijo + (prenda.importeXCantVendida() * 0.01)
}


class Prenda{
	var property precioBase
	var property estado
	var property tipo
	
	method calcularPrecio() = estado.calcularPrecio(self)
}

class PrendaVendida{
	var property prenda
	var property cantVendida
	
	method importeXCantVendida() = prenda.calcularPrecio() * cantVendida
}

object nueva{
	method calcularPrecio(prenda) = prenda.precioBase()
}

class Promocion{
	var property valor
	
	method calcularPrecio(prenda) = nueva.calcularPrecio(prenda) - valor
}

object liquidacion{
	method calcularPrecio(prenda) = nueva.calcularPrecio(prenda) * 0.5
}







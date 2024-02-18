package com.bolsadeideas.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "facturas_items", schema = "JWT_SECURITY")
public class ItemFactura implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item-facturasequence-generator")
	@SequenceGenerator(name = "item-facturasequence-generator", sequenceName = "factura_item_sequence", allocationSize = 1)
	private Long id;

	private Integer cantidad;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="producto_id")
	private Producto producto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Double calcularImporte() {
		return cantidad.doubleValue() * producto.getPrecio();
	}
	
	private static final long serialVersionUID = 1L;

}

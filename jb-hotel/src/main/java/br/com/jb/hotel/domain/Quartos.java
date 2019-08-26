package br.com.jb.hotel.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@SuppressWarnings("serial")
@Entity
@Table(name = "QUARTOS")
public class Quartos extends AbstractEntity<Long>{
	
	@NotBlank(message = "O numero do quarto é obrigatório.")
	@Size(max = 4, message = "O numero deve conter no máximo 4 caracteres.")
	@Column(name = "numero", nullable = false, unique = true, length = 4)
	private int numero;
	
	@NotBlank(message = "O tipo do quarto é obrigatório.")
	@Size(max = 15, message = "O tipo do quarto deve conter no máximo 15 caracteres.")
	@Column(name = "tipo", nullable = false, unique = true, length = 15)
	private String tipo;
	
	@NotBlank(message = "O valor do quarto é obrigatório.")
	private BigDecimal valor;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}

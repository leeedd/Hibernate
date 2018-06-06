package br.com.db1.start.classes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.db1.start.tipos.TipoEndereco;

@Entity(name = "endereco")
public class Endereco {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	private String tipoLogradouro;
	
	@Column(nullable = false, length = 100)
	private String logradouro;
	
	@Column(nullable = false, length = 10)
	private String numero;
	
	@Column(length = 10)
	private String complemento;
	
	@Column(nullable = false, length = 8)
	private String cep;
	
	@Column(nullable = false, length =10, name = "Tipo")
	@Enumerated(EnumType.STRING)
	private TipoEndereco tipoEndereco;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Cidade cidade;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setNome(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}

package com.pweb2.kadernotas.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudante")
public class Estudante {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome;
	private Date data_nascimento;
	private BigDecimal nota1;
	private BigDecimal nota2;
	private BigDecimal nota3;
	private BigDecimal nota_final;
	
	@Enumerated(EnumType.STRING)
	private Situacao situacao;
	
	// Getters an setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public BigDecimal getNota1() {
		return nota1;
	}
	public void setNota1(BigDecimal nota1) {
		this.nota1 = nota1;
	}
	public BigDecimal getNota2() {
		return nota2;
	}
	public void setNota2(BigDecimal nota2) {
		this.nota2 = nota2;
	}
	public BigDecimal getNota3() {
		return nota3;
	}
	public void setNota3(BigDecimal nota3) {
		this.nota3 = nota3;
	}
	public BigDecimal getNota_final() {
		return nota_final;
	}
	public void setNota_final(BigDecimal nota_final) {
		this.nota_final = nota_final;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}	
}

package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Ponto {
	public Ponto() {
		super();
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double latitude;
    private double longitude;
    private String nome;
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Ponto [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", nome=" + nome + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

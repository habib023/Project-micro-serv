package com.example.demo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Collection;

@Entity

public class Produit implements Serializable {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY )
	private long idproduit;
	private String desinaiation;
	private String descreption;
	private double prix;
	private String photo;
	private int  quantites;
	
	public void setDesinaiation(String desinaiation) {
		this.desinaiation = desinaiation;
	}
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getPhoto() {
		return photo;
	}
	public Produit() {
		super();
	}
	
	public Produit( String desinaiation) {
		super();
		
		this.desinaiation = desinaiation;
		
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public long getIdproduit() {
		return idproduit;
	}
	public void setIdproduit(long idproduit) {
		this.idproduit = idproduit;
	}
	public int getQuantites() {
		return quantites;
	}
	public void setQuantites(int quantites) {
		this.quantites = quantites;
	}
	public String getDesinaiation() {
		return desinaiation;
	}
	
}
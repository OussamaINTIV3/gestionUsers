package com.inti.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private int age;
	private long cin;
	private long tel;
	private String numPasseport;
	public Utilisateur() {
	}
	public Utilisateur(String nom, String prenom, Date dateNaissance, int age, long cin, long tel,
			String numPasseport) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.cin = cin;
		this.tel = tel;
		this.numPasseport = numPasseport;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getCin() {
		return cin;
	}
	public void setCin(long cin) {
		this.cin = cin;
	}
	public long getTel() {
		return tel;
	}
	public void setTel(long tel) {
		this.tel = tel;
	}
	public String getNumPasseport() {
		return numPasseport;
	}
	public void setNumPasseport(String numPasseport) {
		this.numPasseport = numPasseport;
	}
	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", age=" + age + ", cin=" + cin + ", tel=" + tel + ", numPasseport=" + numPasseport + "]";
	}
	
	
}

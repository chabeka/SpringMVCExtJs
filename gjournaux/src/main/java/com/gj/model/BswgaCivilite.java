package com.gj.model;

// Generated 4 mars 2014 09:23:20 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;



/**
 * BswgaCivilite generated by hbm2java
 */
public class BswgaCivilite  {

	private Integer idCivilite;
	private String nom;
	private String abreviation;
	private String genre;
	private Integer ordre;
	private Set<BswgaAbonne> bswgaAbonnes = new HashSet<BswgaAbonne>(0);

	public BswgaCivilite() {
	}

	public BswgaCivilite(String nom, String abreviation, String genre,
			Integer ordre, Set<BswgaAbonne> bswgaAbonnes) {
		this.nom = nom;
		this.abreviation = abreviation;
		this.genre = genre;
		this.ordre = ordre;
		this.bswgaAbonnes = bswgaAbonnes;
	}

	public Integer getIdCivilite() {
		return this.idCivilite;
	}

	public void setIdCivilite(Integer idCivilite) {
		this.idCivilite = idCivilite;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAbreviation() {
		return this.abreviation;
	}

	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getOrdre() {
		return this.ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}

	public Set<BswgaAbonne> getBswgaAbonnes() {
		return this.bswgaAbonnes;
	}

	public void setBswgaAbonnes(Set<BswgaAbonne> bswgaAbonnes) {
		this.bswgaAbonnes = bswgaAbonnes;
	}

}

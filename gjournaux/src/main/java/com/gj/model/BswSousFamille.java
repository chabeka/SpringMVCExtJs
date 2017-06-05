package com.gj.model;

// Generated 4 mars 2014 09:23:20 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;


/**
 * BswSousFamille generated by hbm2java
 */
public class BswSousFamille   {

	private Integer idSousFamille;
	private BswFamille bswFamille;
	private String nom;
	private Set<BswJournal> bswJournals = new HashSet<BswJournal>(0);

	public BswSousFamille() {
	}

	public BswSousFamille(BswFamille bswFamille, String nom,
			Set<BswJournal> bswJournals) {
		this.bswFamille = bswFamille;
		this.nom = nom;
		this.bswJournals = bswJournals;
	}

	public Integer getIdSousFamille() {
		return this.idSousFamille;
	}

	public void setIdSousFamille(Integer idSousFamille) {
		this.idSousFamille = idSousFamille;
	}

	public BswFamille getBswFamille() {
		return this.bswFamille;
	}

	public void setBswFamille(BswFamille bswFamille) {
		this.bswFamille = bswFamille;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<BswJournal> getBswJournals() {
		return this.bswJournals;
	}

	public void setBswJournals(Set<BswJournal> bswJournals) {
		this.bswJournals = bswJournals;
	}

}
package com.gj.model;


import java.util.HashSet;
import java.util.Set;


/**
 * BswdtContenuFichier generated by hbm2java
 */
public class BswdtContenuFichier   {

	private Integer idContenuFichier;
	private String titre;
	private String urlFichier;
	private Set<BswdtUniteRedactionnelle> bswdtUniteRedactionnelles = new HashSet<BswdtUniteRedactionnelle>(
			0);

	public BswdtContenuFichier() {
	}

	public BswdtContenuFichier(String titre, String urlFichier,
			Set<BswdtUniteRedactionnelle> bswdtUniteRedactionnelles) {
		this.titre = titre;
		this.urlFichier = urlFichier;
		this.bswdtUniteRedactionnelles = bswdtUniteRedactionnelles;
	}

	public Integer getIdContenuFichier() {
		return this.idContenuFichier;
	}

	public void setIdContenuFichier(Integer idContenuFichier) {
		this.idContenuFichier = idContenuFichier;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getUrlFichier() {
		return this.urlFichier;
	}

	public void setUrlFichier(String urlFichier) {
		this.urlFichier = urlFichier;
	}

	public Set<BswdtUniteRedactionnelle> getBswdtUniteRedactionnelles() {
		return this.bswdtUniteRedactionnelles;
	}

	public void setBswdtUniteRedactionnelles(
			Set<BswdtUniteRedactionnelle> bswdtUniteRedactionnelles) {
		this.bswdtUniteRedactionnelles = bswdtUniteRedactionnelles;
	}

}

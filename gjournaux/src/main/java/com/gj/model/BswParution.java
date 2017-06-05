package com.gj.model;

// Generated 4 mars 2014 09:23:20 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonView;


/**
 * BswParution generated by hbm2java
 */
public class BswParution   {

	@JsonView
	private Integer idParution;
	@JsonIgnore
	private BswJournal bswJournal;
	@JsonView
	private String mensualite;
	@JsonView
	private String numero;
	@JsonView
	private Date dateRemiseBse;
	@JsonView
	private Date dateRemiseJournal;
	@JsonView
	private Date dateRemiseUrs;
	@JsonView
	private Date dateBat;
	@JsonView
	private Date dateImprimeur;
	@JsonView
	private Date dateLivraison;
	@JsonView
	private boolean closed;
	@JsonView
	private String commentaire;
	@JsonView
	private boolean horsSerie;
	@JsonView
	private Integer hsNumeroDebut;
	@JsonView
	private Integer hsNumeroFin;
	@JsonView
	private Date dateCreation;
	@JsonView
	private Date dateModification;
	@JsonView
	private String auteurCreation;
	@JsonView
	private String auteurModification;
	@JsonView
	private byte availableToFoliation;
	@JsonView
	private String sequencePagination;
	@JsonIgnore
	private Set<BswdfFichier> bswdfFichiers = new HashSet<BswdfFichier>(0);
	@JsonIgnore
	private Set<BswParution> bswParutionsForIdParutionFondCommun = new HashSet<BswParution>(0);
	@JsonIgnore
	private Set<BswgaTarif> bswgaTarifs = new HashSet<BswgaTarif>(0);
	@JsonIgnore
	private Set<BswParution> bswParutionsForIdParution = new HashSet<BswParution>(0);
	@JsonIgnore
	private Set<BswdtPage> bswdtPages = new HashSet<BswdtPage>(0);

	public BswParution() {
	}

	public BswParution(boolean closed, boolean horsSerie,
			byte availableToFoliation) {
		this.closed = closed;
		this.horsSerie = horsSerie;
		this.availableToFoliation = availableToFoliation;
	}

	public BswParution(BswJournal bswJournal, String mensualite, String numero,
			Date dateRemiseBse, Date dateRemiseJournal, Date dateRemiseUrs,
			Date dateBat, Date dateImprimeur, Date dateLivraison,
			boolean closed, String commentaire, boolean horsSerie,
			Integer hsNumeroDebut, Integer hsNumeroFin, Date dateCreation,
			Date dateModification, String auteurCreation,
			String auteurModification, byte availableToFoliation,
			String sequencePagination, Set<BswdfFichier> bswdfFichiers,
			Set<BswParution> bswParutionsForIdParutionFondCommun,
			Set<BswgaTarif> bswgaTarifs,
			Set<BswParution> bswParutionsForIdParution,
			Set<BswdtPage> bswdtPages) {
		this.bswJournal = bswJournal;
		this.mensualite = mensualite;
		this.numero = numero;
		this.dateRemiseBse = dateRemiseBse;
		this.dateRemiseJournal = dateRemiseJournal;
		this.dateRemiseUrs = dateRemiseUrs;
		this.dateBat = dateBat;
		this.dateImprimeur = dateImprimeur;
		this.dateLivraison = dateLivraison;
		this.closed = closed;
		this.commentaire = commentaire;
		this.horsSerie = horsSerie;
		this.hsNumeroDebut = hsNumeroDebut;
		this.hsNumeroFin = hsNumeroFin;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.auteurCreation = auteurCreation;
		this.auteurModification = auteurModification;
		this.availableToFoliation = availableToFoliation;
		this.sequencePagination = sequencePagination;
		this.bswdfFichiers = bswdfFichiers;
		this.bswParutionsForIdParutionFondCommun = bswParutionsForIdParutionFondCommun;
		this.bswgaTarifs = bswgaTarifs;
		this.bswParutionsForIdParution = bswParutionsForIdParution;
		this.bswdtPages = bswdtPages;
	}

	public Integer getIdParution() {
		return this.idParution;
	}

	public void setIdParution(Integer idParution) {
		this.idParution = idParution;
	}

	public BswJournal getBswJournal() {
		return this.bswJournal;
	}

	public void setBswJournal(BswJournal bswJournal) {
		this.bswJournal = bswJournal;
	}

	public String getMensualite() {
		return this.mensualite;
	}

	public void setMensualite(String mensualite) {
		this.mensualite = mensualite;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getDateRemiseBse() {
		return this.dateRemiseBse;
	}

	public void setDateRemiseBse(Date dateRemiseBse) {
		this.dateRemiseBse = dateRemiseBse;
	}

	public Date getDateRemiseJournal() {
		return this.dateRemiseJournal;
	}

	public void setDateRemiseJournal(Date dateRemiseJournal) {
		this.dateRemiseJournal = dateRemiseJournal;
	}

	public Date getDateRemiseUrs() {
		return this.dateRemiseUrs;
	}

	public void setDateRemiseUrs(Date dateRemiseUrs) {
		this.dateRemiseUrs = dateRemiseUrs;
	}

	public Date getDateBat() {
		return this.dateBat;
	}

	public void setDateBat(Date dateBat) {
		this.dateBat = dateBat;
	}

	public Date getDateImprimeur() {
		return this.dateImprimeur;
	}

	public void setDateImprimeur(Date dateImprimeur) {
		this.dateImprimeur = dateImprimeur;
	}

	public Date getDateLivraison() {
		return this.dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public boolean isClosed() {
		return this.closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public boolean isHorsSerie() {
		return this.horsSerie;
	}

	public void setHorsSerie(boolean horsSerie) {
		this.horsSerie = horsSerie;
	}

	public Integer getHsNumeroDebut() {
		return this.hsNumeroDebut;
	}

	public void setHsNumeroDebut(Integer hsNumeroDebut) {
		this.hsNumeroDebut = hsNumeroDebut;
	}

	public Integer getHsNumeroFin() {
		return this.hsNumeroFin;
	}

	public void setHsNumeroFin(Integer hsNumeroFin) {
		this.hsNumeroFin = hsNumeroFin;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateModification() {
		return this.dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public String getAuteurCreation() {
		return this.auteurCreation;
	}

	public void setAuteurCreation(String auteurCreation) {
		this.auteurCreation = auteurCreation;
	}

	public String getAuteurModification() {
		return this.auteurModification;
	}

	public void setAuteurModification(String auteurModification) {
		this.auteurModification = auteurModification;
	}

	public byte getAvailableToFoliation() {
		return this.availableToFoliation;
	}

	public void setAvailableToFoliation(byte availableToFoliation) {
		this.availableToFoliation = availableToFoliation;
	}

	public String getSequencePagination() {
		return this.sequencePagination;
	}

	public void setSequencePagination(String sequencePagination) {
		this.sequencePagination = sequencePagination;
	}

	public Set<BswdfFichier> getBswdfFichiers() {
		return this.bswdfFichiers;
	}

	public void setBswdfFichiers(Set<BswdfFichier> bswdfFichiers) {
		this.bswdfFichiers = bswdfFichiers;
	}

	public Set<BswParution> getBswParutionsForIdParutionFondCommun() {
		return this.bswParutionsForIdParutionFondCommun;
	}

	public void setBswParutionsForIdParutionFondCommun(
			Set<BswParution> bswParutionsForIdParutionFondCommun) {
		this.bswParutionsForIdParutionFondCommun = bswParutionsForIdParutionFondCommun;
	}

	public Set<BswgaTarif> getBswgaTarifs() {
		return this.bswgaTarifs;
	}

	public void setBswgaTarifs(Set<BswgaTarif> bswgaTarifs) {
		this.bswgaTarifs = bswgaTarifs;
	}

	public Set<BswParution> getBswParutionsForIdParution() {
		return this.bswParutionsForIdParution;
	}

	public void setBswParutionsForIdParution(
			Set<BswParution> bswParutionsForIdParution) {
		this.bswParutionsForIdParution = bswParutionsForIdParution;
	}

	public Set<BswdtPage> getBswdtPages() {
		return this.bswdtPages;
	}

	public void setBswdtPages(Set<BswdtPage> bswdtPages) {
		this.bswdtPages = bswdtPages;
	}

}
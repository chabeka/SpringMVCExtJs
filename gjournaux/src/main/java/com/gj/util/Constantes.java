package com.gj.util;

import java.math.BigDecimal;
import java.util.Date;


public class Constantes {

	// utilisée pour l'affichage d'un image
	public static final String BASE_DIRECTORY = "/bd_abonnes";

	public static final String BASE_DIRECTORY_PHOTO_PERSONNE = "/photos_personne";

	public static final boolean DEBUG_SERVEUR = false;
	public static final String PROJET_NAME = "bs_2012_abonnes";

	// Profils admin, chef etablissement,
	public static final Integer ACCES_SIMPLE_MEMBRE = 0;
	public static final Integer ACCES_ADMIN_LECTEUR = 20;
	public static final Integer ACCES_ADMIN = 100;
	public static final Integer ACCES_ADMIN_BAYARD = 700; // clin d'oeil
	// commande shell
	// 'chmod'
	public static final String ACCES_LIB_SIMPLE_MEMBRE = "Simple membre";
	public static final String ACCES_LIB_ADMIN_LECTEUR = "Lecteur";
	public static final String ACCES_LIB_ADMIN = "Administrateur";
	public static final String ACCES_LIB_ADMIN_BAYARD = "Administrateur BAYARD";

	// Coordonnée (tel que dans la table coordonnée)
	public static final String s_COORD_PARTICULIER = "particulier";
	public static final String s_COORD_PROFESSIONNEL = "professionnel";

	// id des Pays
	public static final Integer ID_PAYS_FRANCE = new Integer(1);

	public static final String CIVILITE_M = "1";
	// tel que dans les types énumérés de la bdd (civilité)
	public static final String CIV_MASCULIN = "M";
	public static final String CIV_FEMININ = "F";
	public static final String CIV_MIXTE = "Mixte";
	// tel que dans les types énumérés de la bdd (personne)
	public static final String SEXE_MASCULIN = "M";
	public static final String SEXE_FEMININ = "F";
	public static final String SEXE_NC = "NC";

	// tel que dans les types énumérés de la bdd (modele)
	public static final String MODELE_EMAIL = "mail";
	public static final String MODELE_COURRIER = "courrier";

	// ---
	public static final Integer ANNEE_COURANTE = new Integer(new Date().getYear() + 1900);

	// Nom de classe
	// public static final String CLASSE_PERSONNE = "Personne";

	// Mots clefs utilisables dans le mail
	public static final String SYMBOLE_CIVILITE = "#CIVILITE";
	public static final String SYMBOLE_CIVILITE_COURTE = "#CIV";

	public static final String SYMBOLE_NOM = "#NOM";
	public static final String SYMBOLE_PRENOM = "#PRENOM";
	public static final String SYMBOLE_SOCIETE = "#SOCIETE";
	public static final String SYMBOLE_NOM_JOURNAL = "#NOMJOURNAL";
	public static final String SYMBOLE_NUM_DEBUT = "#NUMDEBUT";
	public static final String SYMBOLE_NUM_FIN = "#NUMFIN";

	public static final String SYMBOLE_ADRESSE_ABONNE = "#ADRESSEABONNE";
	public static final String SYMBOLE_CODE_POSTAL = "#CODEPOSTAL";
	public static final String SYMBOLE_VILLE = "#VILLE";
	public static final String SYMBOLE_PAYS = "#PAYS";
	public static final String SYMBOLE_NUM_ABONNE = "#NUMABONNE";
	public static final String SYMBOLE_ABONNEMENT = "#ABONNEMENT";
	public static final String SYMBOLE_PRIX_TTC = "#PRIXTCC";
	public static final String SYMBOLE_PRIX_HT = "#PRIXHT";
	public static final String SYMBOLE_NB_EX = "#NBEX";
	public static final String SYMBOLE_LOGIN = "#LOGIN";
	public static final String SYMBOLE_PASSWORD = "#MOTDEPASSE";
	// Tiers Payeur
	public static final String SYMBOLE_ADRESSE_FACTURE = "#ADRESSEFACTURE";
	public static final String SYMBOLE_DEST_PAYEUR = "#PAYEURDEST";
	public static final String SYMBOLE_ADRESSE_PAYEUR = "#PAYEURADRESSE";
	public static final String SYMBOLE_CODEPOSTAL_PAYEUR = "#PAYEURCODEPOSTAL";
	public static final String SYMBOLE_VILLE_PAYEUR = "#PAYEURVILLE";
	public static final String SYMBOLE_PAYS_PAYEUR = "#PAYEURPAYS";

	// Mots clés utilisé dans le modèle RTF
	public static final String SYMBOLE_COURRIER_DATE = "[DATE]";
	public static final String SYMBOLE_COURRIER_NOM_EXPEDITEUR = "[NOM_EXPEDITEUR]";
	public static final String SYMBOLE_COURRIER_ADRESSE_EXPEDITEUR = "[ADRESSE_EXPEDITEUR]";
	public static final String SYMBOLE_COURRIER_DESTINATAIRE_ABONNE = "[DESTINATAIRE]";
	public static final String SYMBOLE_COURRIER_DESTINATAIRE_COMPLEMENT_ABONNE = "[DESTINATAIRE_COMPLEMENT]";
	public static final String SYMBOLE_COURRIER_ADRESSE_LIGNE_1_ABONNE = "[ADRESSE_LIGNE_1]";
	public static final String SYMBOLE_COURRIER_NUM_VOIE_ABONNE = "[NUM_VOIE]";
	public static final String SYMBOLE_COURRIER_LIB_VOIE_ABONNE = "[LIB_VOIE]";
	public static final String SYMBOLE_COURRIER_ADRESSE_LIGNE_3_ABONNE = "[ADRESSE_LIGNE_3]";
	public static final String SYMBOLE_COURRIER_CP_ABONNE = "[CP]";
	public static final String SYMBOLE_COURRIER_VILLE_ABONNE = "[VILLE]";
	public static final String SYMBOLE_COURRIER_CEDEX_ABONNE = "[CEDEX]";
	public static final String SYMBOLE_COURRIER_PAYS_ABONNE = "[PAYS]";
	//
	public static final String SYMBOLE_COURRIER_REF_ABONNE = "[REF_ABONNE]";
	public static final String SYMBOLE_COURRIER_OBJET = "[OBJET]";
	public static final String SYMBOLE_COURRIER_CONTENU = "[CONTENU]";
	public static final String SYMBOLE_COURRIER_SIGNATURE = "[SIGNATURE]";

	// mots clés RTF
	public static final String SYMBOLE_COURRIER_SAUT_DE_LIGNE = "\\par ";
	public static final String SYMBOLE_COURRIER_SAUT_DE_PAGE = "\\page ";
	public static final String SYMBOLE_COURRIER_SEPARATEUR_CORPS = "\\viewkind4\\uc1\\pard\\";
	public static final String SYMBOLE_COURRIER_EURO = "\\'80";
	public static final String SYMBOLE_COURRIER_OE_m = "\\'9c";
	public static final String SYMBOLE_COURRIER_OE = "\\'9c";
	public static final String SYMBOLE_COURRIER_ACCENT_CIRCONFLEXE = " ^";

	// saut de ligne
	public static final String SYMBOLE_SAUT_DE_LIGNE = "\n";
	// Commentaire pour un historique d'envoi de mail
	public static final String COMMENTAIRE_HISTORIQUE_EMAILING = "Enregistrement automatique suite à l'envoi d'un e-mail";

	// --------------------------------------
	// Emailing demande de cration de diplome
	public static final String OBJET_EMAIL_DEMANDE_CREATION_DIPLOME = "Demande de création de diplôme";

	// Constante d'alignement des boutons de formulaire EDIT
	// (enregistrer/annuler)
	public static final int ALIGNEMENT_BOUTON_EDIT = 3;

	// Factures
	public static final int MONTANT_SCALE = 2;
	public static final int POURCENTAGE_TVA_SCALE = 4;
	public static final int ROUNDING_MODE = BigDecimal.ROUND_HALF_UP;
	private static final BigDecimal BD_ZERO_TMP = new BigDecimal(0);
	public static final BigDecimal BD_ZERO = Constantes.BD_ZERO_TMP.setScale(Constantes.MONTANT_SCALE);
	// ---
	public static final String FACTURE_STATUT_INITIAL = "Solde initial";
	public static final String FACTURE_STATUT_PARTIEL = "Solde partiel";
	// public static final String FACTURE_STATUT_NEGATIF =
	// "Solde négatif (trop perçu)";
	public static final String FACTURE_STATUT_SOLDE = "Soldée";

	// Chemin de fer
	public static final String CDF_ACCUEIL = Langue.LABEL_TITRE_PAGE_GESTION_JOURNAUX;
	public static final String CDF_TABLEAU_DE_BORD = Langue.LABEL_TITRE_ONGLET_JOURNAL_TABLEAU_BORD;
	public static final String CDF_GESTION_NUMEROS = Langue.LABEL_TITRE_PAGE_NUMEROS_GESTION;
	public static final String CDF_NUMERO = Langue.NUMERO;
	public static final String CDF_GESTION_ABONNE = Langue.LABEL_TITRE_PAGE_ABONNES_GESTION;
	public static final String CDF_ABONNE = Langue.ABONNE;
	public static final String CDF_ABONNEMENT = Langue.ABONNEMENT;
	public static final String CDF_MODELE = Langue.MODELE;

	public static final int CDF_ID_ACCUEIL = 1;
	public static final int CDF_ID_TABLEAU_DE_BORD = 2;
	public static final int CDF_ID_GESTION_NUMEROS = 3;
	public static final int CDF_ID_NUMERO = 4;
	public static final int CDF_ID_GESTION_ABONNE = 5;
	public static final int CDF_ID_ABONNE = 6;
	public static final int CDF_ID_ABONNEMENT = 7;
	public static final int CDF_ID_PAIEMENT = 8;
	public static final int CDF_ID_MODELE = 9;

	public static final String CDF_TYPE_JOURNAL = Langue.JOURNAL;
	public static final String CDF_TYPE_NUMERO = Langue.NUMERO;
	public static final String CDF_TYPE_CLIENT = Langue.CLIENT;
	public static final String CDF_TYPE_ABONNE = Langue.ABONNE;
	public static final String CDF_TYPE_ABONNEMENT = Langue.ABONNEMENT;
	public static final String CDF_TYPE_PAIEMENT = Langue.PAIEMENT;
	public static final String CDF_TYPE_MODELE = Langue.MODELE;

	// ---
	public static final String OPERATEUR_INFERIEUR = "<";
	public static final String OPERATEUR_SUPERIEUR = ">";
	public static final String OPERATEUR_DIFFERENT = "!=";
	public static final String OPERATEUR_EGAL = "=";

	public static final String ETOILE = "*";

	// ---
	// actions
	public static final String ACTION_EXPORTER = "exporter";
	public static final String ACTION_EMAILING = "emailing";
	public static final String ACTION_SUPPRIMER = "supprimer";
	public static final String ACTION_SUSPENDRE = "suspendre";
	public static final String ACTION_RENOUVELER = "renouveler";

	//public static final String DOWNLOAD_URL = GWT.getModuleBaseURL() + "download";
	public static final String PARAM_DOWNLOAD_TYPE = "downloadType";
	public static final String PARAM_DOWNLOAD_ROUTAGE = "routage";
	public static final String PARAM_DOWNLOAD_ABONNES = "abonnes";
	public static final String PARAM_DOWNLOAD_ABONNES_PDF = "abonnesPdf";
	public static final String PARAM_DOWNLOAD_COURRIER = "courrier";
	public static final String PARAM_DOWNLOAD_ABONNEMENTS_ENTRE_DATE_REMISE_EN_BANQUE = "abonnements_entre_date_remise_en_banque";

	public static final String PARAM_HQL_CODE_ABONNES = "hqlcode";

	public static final String PARAM_IDS_ABONNES = "idsAbonnes";
	public static final String PARAM_ID_PARUTION = "idParution";
	public static final String PARAM_ID_JOURNAL = "idJournal";
	public static final String PARAM_ID_MODELE = "idModele";
	public static final String PARAM_ID_MODELE_TIERS_PAYEUR = "idModeleTiersPayeur";
	public static final String PARAM_ID_CLIENT = "idClient";
	public static final String PARAM_ID_TRANSACTION = "idTransaction";
	public static final String PARAM_ID_USER = "idUser";

	public static final String LINE_SEPARATOR = "\n";

	public static final String GOTO_ABONNE = "gotoAbonne";

	public static final String GOTO_ABONNEMENT_PAIEMENT = "gotoAbonnementPaiement";

	public static final String UPLOAD_CSV = "uploadCSV";

	public static final String TAXE_HT = "HT";
	public static final String TAXE_TTC = "TTC";

	public static final String EURO = "€";
	public static final String OE_m = "œ";
	public static final String OE = "Œ";
	public static final String ACCENT_CIRCONFLEXE = "^";

	public static enum BSW_TYPE_BORDEREAU {
		TYPE_PAIEMENT, TYPE_DEPOT
	};

	// pour dialogbox
	public final static String BUTTON_STYLE_ACTION_FORM = "button-actionForm";
	public final static String OK = Langue.OK;

}

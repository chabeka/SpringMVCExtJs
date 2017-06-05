package com.gj.util;

public class Langue {

	// --------------------- entités ---------------------
	// bse
	public static final String BSE = "Bse";
	public static final String BSE_MAJ = Langue.BSE.toUpperCase();
	public static final String BSE_MIN = Langue.BSE.toLowerCase();

	// client
	public static final String CLIENT = "Client";
	public static final String CLIENTS = Langue.CLIENT + "s";
	public static final String CLIENT_MIN = Langue.CLIENT.toLowerCase();
	public static final String CLIENTS_MIN = Langue.CLIENTS.toLowerCase();

	// journal
	public static final String JOURNAL = "Journal";
	public static final String JOURNAUX = "Journaux";
	public static final String JOURNAL_MIN = Langue.JOURNAL.toLowerCase();
	public static final String JOURNAUX_MIN = Langue.JOURNAUX.toLowerCase();

	// abonnés
	public static final String ABONNE = "Abonné";
	public static final String ABONNE_S = Langue.ABONNE + "(s)";
	public static final String ABONNES = Langue.ABONNE + "s";
	public static final String ABONNE_MIN = Langue.ABONNE.toLowerCase();
	public static final String ABONNE_S_MIN = Langue.ABONNE_S.toLowerCase();
	public static final String ABONNES_MIN = Langue.ABONNES.toLowerCase();
	public static final String TYPES_ABONNE = "Types d'" + Langue.ABONNE_MIN;
	public static final String TYPE_ABONNE = "Type d'" + Langue.ABONNE_MIN;
	public static final String TYPE_ABONNE_MIN = "type d'" + Langue.ABONNE_MIN;
	public static final String TYPES_ABONNE_MIN = "types d'" + Langue.ABONNE_MIN;
	public static final String NEW_TYPE_ABONNE = "Nouveau " + Langue.TYPE_ABONNE_MIN;
	public static final String SANS_NOM = "Sans nom";

	public static final String FICHIER_ABONNES = "Fichier " + Langue.ABONNES_MIN;
	// abonnement
	public static final String ABONNEMENT = "Abonnement";
	public static final String ABONNEMENTS = Langue.ABONNEMENT + "s";
	public static final String ABONNEMENT_MIN = Langue.ABONNEMENT.toLowerCase();
	public static final String ABONNEMENTS_MIN = Langue.ABONNEMENTS.toLowerCase();

	// exemplaire
	public static final String EXEMPLAIRE = "Exemplaire";
	public static final String EXEMPLAIRES = Langue.EXEMPLAIRE + "s";
	public static final String EXEMPLAIRE_MIN = Langue.EXEMPLAIRE.toLowerCase();
	public static final String EXEMPLAIRES_MIN = Langue.EXEMPLAIRES.toLowerCase();

	// tarifs
	public static final String TARIF = "Tarif";
	public static final String TARIFS = Langue.TARIF + "s";
	public static final String TARIF_MIN = Langue.TARIF.toLowerCase();
	public static final String TARIFS_MIN = Langue.TARIFS.toLowerCase();
	public static final String NEW_TARIF = "Nouveau " + Langue.TARIF_MIN;

	// modes expe
	public static final String EXPE = "Expédition";
	public static final String EXPE_S = "Expédition(s)";
	public static final String EXPES = "Expéditions";
	public static final String EXPEDIE = "Expédié";
	public static final String EXPEDIES = "Expédiés";

	public static final String EXPE_MIN = Langue.EXPE.toLowerCase();
	public static final String EXPE_S_MIN = Langue.EXPE_S.toLowerCase();
	public static final String EXPES_MIN = Langue.EXPES.toLowerCase();
	public static final String EXPEDIE_MIN = Langue.EXPEDIE.toLowerCase();
	public static final String EXPEDIES_MIN = Langue.EXPEDIES.toLowerCase();

	public static final String MODE = "Mode";
	public static final String MODES = Langue.MODE + "s";
	public static final String MODE_S = Langue.MODE + "(s)";
	public static final String MODE_MIN = Langue.MODE.toLowerCase();
	public static final String MODES_MIN = Langue.MODES.toLowerCase();
	public static final String MODE_S_MIN = Langue.MODE_S.toLowerCase();
	public static final String MODE_EXPE = Langue.MODE + " d'" + Langue.EXPE_MIN;
	public static final String MODE_S_EXPE = Langue.MODE_S + " d'" + Langue.EXPE_MIN;
	public static final String MODES_EXPE = Langue.MODES + " d'" + Langue.EXPE_MIN;
	public static final String MODE_EXPE_MIN = Langue.MODE_MIN + " d'" + Langue.EXPE_MIN;
	public static final String MODES_EXPE_MIN = Langue.MODES_MIN + " d'" + Langue.EXPE_MIN;
	public static final String MODE_S_EXPE_MIN = Langue.MODE_S_MIN + " d'" + Langue.EXPE_MIN;
	public static final String NEW_MODE_EXPE = "Nouveau " + Langue.MODE_EXPE_MIN;

	// parutions
	public static final String NUMERO = "Numéro";
	public static final String NUMEROS = Langue.NUMERO + "s";
	public static final String NUMERO_MIN = Langue.NUMERO.toLowerCase();
	public static final String NUMEROS_MIN = Langue.NUMEROS.toLowerCase();

	// paiements
	public static final String PAIEMENT = "Paiement";
	public static final String PAIEMENTS = Langue.PAIEMENT + "s";
	public static final String PAIEMENT_MIN = Langue.PAIEMENT.toLowerCase();
	public static final String PAIEMENTS_MIN = Langue.PAIEMENTS.toLowerCase();

	// dépôt
	public static final String DEPOT = "Dépôt";
	public static final String DEPOTS = Langue.DEPOT + "s";
	public static final String DEPOT_MIN = Langue.DEPOT.toLowerCase();
	public static final String DEPOTS_MIN = Langue.DEPOTS.toLowerCase();

	// factures
	public static final String FACTURE = "Facture";
	public static final String FACTURES = Langue.FACTURE + "s";
	public static final String FACTURE_S = Langue.FACTURE + "(s)";
	public static final String FACTURE_MIN = Langue.FACTURE.toLowerCase();
	public static final String FACTURES_MIN = Langue.FACTURES.toLowerCase();
	public static final String FACTURE_S_MIN = Langue.FACTURE_S.toLowerCase();

	// secteurs/paroisses
	public static final String SECTEUR = "Secteur";
	public static final String SECTEURS = Langue.SECTEUR + "s";
	public static final String SECTEUR_MIN = Langue.SECTEUR.toLowerCase();
	public static final String SECTEURS_MIN = Langue.SECTEURS.toLowerCase();
	public static final String NEW_SECTEUR = "Nouveau " + Langue.SECTEUR_MIN;
	public static final String NOM = "Nom";

	// RESPONSABLE DES ABONNE
	public static final String RESPONSABLE_ABONNE = "Responsables";
	public static final String RESPONSABLE_ABONNE_MIN = Langue.RESPONSABLE_ABONNE.toLowerCase();

	// modèle
	public static final String MODELE = "Modèle";
	public static final String MODELE_EMAIL = Langue.MODELE + " de mail";
	public static final String MODELE_COURRIER = Langue.MODELE + " de courrier";

	// TVA
	public static final String TVA = "TVA";
	public static final String HT = "HT";
	public static final String TTC = "TTC";
	public static final String NEW_TAUX = "Nouveau taux";
	public static final String PRIX_UNITAIRE = "Prix unitaire";
	public static final String PRIX_1_HT = Langue.PRIX_UNITAIRE + " " + Langue.HT;
	public static final String PRIX_1_TTC = Langue.PRIX_UNITAIRE + " " + Langue.TTC;
	public static final String EURO = "€";

	// ---
	// -------------------- Général --------------------

	// Recherche / ListBox
	public static final String SELECTION_INVITE = "Sélectionner...";
	public static final String LB_INDIFFERENT = "Indifférent";
	public static final String LB_TOUS = "Tous";
	public static final String RECH_LIBRE = "Recherche libre";
	public static final String SELECT_ETAB = "Veuillez sélectionner un établissement";
	public static final String SELECT_CLIENT = "Veuillez sélectionner un " + Langue.CLIENT_MIN;
	public static final String SELECT_TARIF = "Veuillez sélectionner un " + Langue.TARIF_MIN;
	public static final String SELECT_MODE_EXPE = "Veuillez sélectionner un " + Langue.MODE_EXPE_MIN;

	// RadioButton
	public static final String RB_OUI = "Oui";
	public static final String RB_NON = "Non";

	public static final String N = "N°";

	public static final String SUPPRIMER = "Supprimer";
	public static final String ENREGISTRER = "Enregistrer";
	public static final String ANNULER = "Annuler";
	public static final String QUITTER = "Quitter";
	public static final String AJOUTER = "Ajouter";
	public static final String FERMER = "Fermer";
	public static final String MODIFIER = "Modifier";
	public static final String RECHERCHER = "Rechercher";
	public static final String IMPRIMER = "Imprimer";
	public static final String EXPORTER = "Exporter";
	public static final String EMAILING = "Emailing";
	public static final String RENOUVELER = "Renouveler";
	public static final String SUSPENDRE = "Suspendre";
	public static final String FACTURER = "Facturer";
	public static final String GERER = "Gérer";
	public static final String RECHARGER_PAGE = "Recharger la page";

	public static final String GESTION = "Gestion";
	public static final String EXPORT = "Exporter";
	public static final String EXPORT_PDF = "Exporter en Pdf";
	public static final String ENREGISTREMENT = "Enregistrement";
	public static final String SUPPRESSION = "Suppression";
	public static final String MODIFICATION = "Modification";

	public static final String OK = "OK";

	// boutons
	public static final String LABEL_BT_SUPPRIMER = Langue.SUPPRIMER;
	public static final String LABEL_BT_ENREGISTRER = Langue.ENREGISTRER;
	public static final String LABEL_BT_ENREGISTRER_ET_SUIVANT = Langue.ENREGISTRER + " et passer au " + Langue.SUIVANT;
	public static final String SUIVANT = "suivant";
	public static final String LABEL_BT_ANNULER = Langue.ANNULER;
	public static final String LABEL_BT_QUITTER = Langue.QUITTER;
	public static final String LABEL_BT_FERMER = Langue.FERMER;
	public static final String LABEL_BT_AJOUTER = Langue.AJOUTER;
	public static final String LABEL_BT_APPLIQUER_MODIFS = "Appliquer les modifications";
	public static final String LABEL_BT_MODIFIER = Langue.MODIFIER;
	public static final String LABEL_BT_RECHERCHER = Langue.RECHERCHER;
	public static final String LABEL_BT_IMPRIMER = Langue.IMPRIMER;
	public static final String LABEL_BT_EXPORTER = Langue.EXPORTER;
	public static final String LABEL_BT_EMAILING = Langue.EMAILING;
	public static final String LABEL_BT_RENOUVELER = Langue.RENOUVELER;
	public static final String LABEL_BT_SUSPENDRE = Langue.SUSPENDRE;
	public static final String LABEL_BT_FACTURER = Langue.FACTURER;
	public static final String LABEL_BT_LISTE_ABONNES = "Liste des " + Langue.ABONNES_MIN;
	public static final String LABEL_BT_GERER_ABONNES = Langue.GERER + " les " + Langue.ABONNES_MIN;
	public static final String LABEL_BT_GERER_TARIFS = Langue.GERER + " les " + Langue.TARIFS_MIN;
	public static final String LABEL_BT_GERER_MODES_EXPE = Langue.GERER + " les " + Langue.MODES_EXPE_MIN;
	public static final String LABEL_BT_GERER_SECTEURS = Langue.GERER + " les " + Langue.SECTEURS_MIN;
	public static final String LABEL_BT_GERER_RESPONSABLE_ABONNE = Langue.GERER + " les " + Langue.RESPONSABLE_ABONNE_MIN;
	public static final String LABEL_BT_GERER_TYPES_ABONNE = Langue.GERER + " les " + Langue.TYPES_ABONNE_MIN;
	public static final String LABEL_BT_AUCUN_PAR_DEFAUT = "Aucun par défaut";
	public static final String LABEL_BT_GERER_NUMEROS = Langue.GERER + " les " + Langue.NUMEROS_MIN;
	public static final String LABEL_BT_EXPORT = Langue.EXPORT;
	public static final String LABEL_BT_EXPORT_PDF = Langue.EXPORT_PDF;
	public static final String LABEL_BT_ENVOI_MAIL = "Envoi par mail";
	public static final String LABEL_BT_ENVOI_COURRIER = "Envoi par courrier";
	public static final String LABEL_BT_NEW_PAROISSE = Langue.NEW_SECTEUR;
	public static final String LABEL_BT_NEW_MODELE_EMAIL = "Nouveau modèle email";
	public static final String LABEL_BT_NEW_MODELE_COURRIER = "Nouveau modèle courrier";

	public static final String LABEL_BT_NEW_TAUX = Langue.NEW_TAUX;
	public static final String LABEL_BT_NEW_TARIF = Langue.NEW_TARIF;
	public static final String LABEL_BT_NEW_MODE_EXPEDITION = Langue.NEW_MODE_EXPE;
	public static final String LABEL_BT_NEW_SECTEUR = Langue.NEW_SECTEUR;
	public static final String LABEL_BT_NEW_TYPE_ABONNE = Langue.NEW_TYPE_ABONNE;
	public static final String LABEL_BT_NEW_NUMERO = "Nouveau " + Langue.NUMERO_MIN;
	public static final String LABEL_BT_NEW_ABONNE = "Nouvel " + Langue.ABONNE_MIN;
	public static final String LABEL_BT_NEW_ABONNEMENT = "Nouvel " + Langue.ABONNEMENT_MIN;
	public static final String LABEL_BT_EXPORT_RESULTATS = Langue.EXPORTER + " tous les résultats";
	public static final String LABEL_BT_EXPORT_SELECTION = Langue.EXPORTER + " la sélection";

	public static final String LABEL_BT_EMAILING_RESULTATS = Langue.EMAILING + " sur tous les résultats";
	public static final String LABEL_BT_EMAILING_SELECTION = Langue.EMAILING + " sur la sélection";

	public static final String LABEL_BT_RELANCE_MAIL = "Relancer par mail";
	public static final String LABEL_BT_ENREGISTRER_PAIEMENT = Langue.ENREGISTRER + " un paiement";
	public static final String LABEL_BT_ENREGISTRER_FACTURER = Langue.ENREGISTRER + " et " + Langue.FACTURER;
	public static final String LABEL_BT_ENREGISTRER_DEPOSER_PAIEMENT = Langue.ENREGISTRER + " et déposer un paiement";
	public static final String LABEL_BT_RECHARGER_PAGE = Langue.RECHARGER_PAGE;
	public static final String LABEL_BT_RETOURNER_ACCUEIL = "Retourner à la page d'accueil";
	public static final String LABEL_BT_RESTER_SUR_PAGE = "Rester sur cette page";

	public static final String LABEL_BT_EDITER_BORDEREAU_PAIEMENT = "Editer un bordereau de date de paiment";
	public static final String LABEL_BT_EDITER_BORDEREAU_DEPOT = "Editer un bordereau de date dépôt";
	public static final String LABEL_BT_EXPORTER_ABO_DATE_REMISE_EN_BANQUE = "Exporter les abonnements";
	public static final String LABEL_BT_ETAT_MOUVEMENTS = "Etat des mouvements";
	public static final String LABEL_BT_IMPRIMER_FACTURES = "Imprimer les " + Langue.FACTURES_MIN;
	public static final String LABEL_BT_IMPORTER_ABONNES = "Importer les abonnes";
	public static final String LABEL_BT_TOUT_SELECTIONNER = "Tout sélectionner";
	public static final String LABEL_BT_TOUT_DESELECTIONNER = "Tout désélectionner";

	// coordonées
	public static final String LABEL_TITRE_COORDONEES_ADRESSE_LIVRAISON = "Adresse de livraison";

	public static final String LABEL_SOUSTITRE_COORDONEES_ADRESSE_POSTALE = "Adresse postale";
	public static final String LABEL_CHAMP_COORDONEES_CHOIX_FORMAT = "Format d'adresse pour ";
	public static final String LABEL_CHAMP_COORDONEES_COMPLEMENT_NOM = "Complément de Nom";
	public static final String LABEL_CHAMP_COORDONEES_ADRESSE = "Adresse";
	public static final String LABEL_CHAMP_COORDONEES_COMPLEMENT_ADRESSE = "Complément adresse";
	public static final String LABEL_CHAMP_COORDONEES_CODE_POSTAL = "Code postal";
	public static final String LABEL_CHAMP_COORDONEES_VILLE = "Ville";
	public static final String LABEL_CHAMP_COORDONEES_PAYS = "Pays";

	public static final String LABEL_SOUSTITRE_COORDONEES_TELEPHONE_MAIL = "Téléphone/Mail";
	public static final String LABEL_CHAMP_COORDONEES_TELEPHONE = "Téléphone";
	public static final String LABEL_CHAMP_COORDONEES_FAX = "Fax";
	public static final String LABEL_CHAMP_COORDONEES_MOBILE = "Mobile";
	public static final String LABEL_CHAMP_COORDONEES_EMAIL = "Email";
	public static final String LABEL_CHAMP_COORDONEES_SITE_WEB = "Site Web";

	// lien
	public static final String LABEL_LIEN_AIDE_MODELE = "Aide sur les modèles";

	public static final String LABEL_LIEN_RELANCE_MAIL = "Relance par mail";
	public static final String LABEL_LIEN_RELANCE_COURRIER = "Relance par courrier";
	public static final String LABEL_LIEN_RELANCE_NOTIF_MAIL_CONFIM_ABONNEMENT = "Notification mail de confirmation d'abonnement";

	// erreurs
	public static final String MSG_ERREUR_CHARG_PERMISSIONS = "Erreur lors du chargement des droits utilisateur";
	public static final String MSG_ERREUR_REQUETE_HQL = "Erreur dans la construction de la requete HQL";
	public static final String MSG_ERREUR_CHARG_LISTE = "Erreur lors du chargement de la liste";
	public static final String MSG_ERREUR_CHARG = "Erreur lors du chargement";
	public static final String MSG_ERREUR_MODIF = "Erreur lors de la modification";

	public static final String MSG_ERREUR_DELETE = "Erreur lors de la suppression";
	public static final String MSG_ERREUR_SAVE = "Erreur lors de l'enregistrement";
	public static final String MSG_ERREUR_SUSPEND = "Erreur lors de la suspension d'abonnement";
	public static final String MSG_ERREUR_VERIF_DELETE = "Vérifications avant suppression : Echec";
	public static final String MSG_ERREUR_SEND_EMAIL = "Erreur lors de l'envoi des mails";
	public static final String MSG_ERREUR_RECUP_PARUTION_EN_COURS = "Erreur lors de la recuperation de la parution en cours";
	// messages (info/confirm....)
	public static final String MSG_INACCESSIBLE = "Vous essayez d'accéder à un élément qui n'existe plus !";
	public static final String MSG_CONFIRM_SUPPRESSION = "Veuillez confirmer la suppression...";
	public static final String MSG_CORRIGER_ERREUR = "Merci de corriger les informations suivantes : ";
	public static final String MSG_CONFIRM_EMAIL = "Veuillez confirmer l'envoi des mails ...";
	public static final String MSG_AUCUN_MODELE_SELECTIONNE = "Aucun modèle selectionné";
	public static final String MSG_AUCUN_ABONNE_A_RELANCER = "Aucun abonné à relancer";
	public static final String MSG_NUMERO_FIN_NON_CONFORME = "Le numero de fin ne correspond à ce qu'il devrait être au vu du numero de début et du tarif choisi. Voulez-vous continuer?";

	// popup
	public static final String LABEL_TITRE_IMPORT_RESULTAT = "Résultat de l'import";

	// ---
	// -------------------- Gestion des journaux --------------------

	public static final String LABEL_TITRE_PAGE_GESTION_JOURNAUX = "Gestion des " + Langue.JOURNAUX_MIN;

	public static final String LABEL_TITRE_FILTRES = "Filtres";
	public static final String LABEL_TITRE_FICHIERS_ABONNES = "Fichiers " + Langue.ABONNES_MIN;

	public static final String LABEL_CHAMP_GESTION_JOURNAUX_RECHERCHE_BSE = Langue.BSE_MAJ;
	public static final String LABEL_CHAMP_GESTION_JOURNAUX_RECHERCHE_CLIENT = Langue.CLIENT;
	public static final String LABEL_CHAMP_GESTION_JOURNAUX_RECHERCHE_JOURNAL = Langue.JOURNAL;
	public static final String LABEL_CHAMP_GESTION_JOURNAUX_RECHERCHE_LIBRE = Langue.RECH_LIBRE;

	public static final String LABEL_TITRE_COLONNE_GESTION_JOURNAUX_BSE = Langue.BSE_MAJ;
	public static final String LABEL_TITRE_COLONNE_GESTION_JOURNAUX_CLIENT = Langue.CLIENT;
	public static final String LABEL_TITRE_COLONNE_GESTION_JOURNAUX_REF_CLIENT = "Ref. " + Langue.CLIENT;
	public static final String LABEL_TITRE_COLONNE_GESTION_JOURNAUX_JOURNAL = Langue.JOURNAL;
	public static final String LABEL_TITRE_COLONNE_GESTION_JOURNAUX_REF_JOURNAL = "Ref. " + Langue.JOURNAL;
	public static final String LABEL_TITRE_COLONNE_GESTION_JOURNAUX_NB_ABONNES = "Nb d'abonnés";

	public static final String LABEL_CHAMP_GESTION_JOURNAUX_BASE_CLIENT = "Base des " + Langue.ABONNES_MIN + " du " + Langue.CLIENT_MIN;

	public static final String LABEL_CHAMP_GESTION_JOURNAUX_INFO = "Cliquez sur un journal pour accéder à son tableau de bord";
	// ---
	// -------------------- Gestion d'un journal --------------------

	public static final String LABEL_TITRE_PAGE_JOURNAL = Langue.JOURNAL;

	// onglets
	public static final String LABEL_TITRE_ONGLET_JOURNAL_TABLEAU_BORD = "Tableau de bord";
	public static final String LABEL_TITRE_ONGLET_JOURNAL_RELANCES = "Relances";
	public static final String LABEL_TITRE_ONGLET_JOURNAL_COMPTA = "Comptabilité";
	public static final String LABEL_TITRE_ONGLET_JOURNAL_PARAM = "Paramètres";
	public static final String LABEL_TITRE_ONGLET_JOURNAL_IMPORT = "Import";

	public static final String LABEL_TITRE_ONGLET_ABONNE_ABONNE = Langue.ABONNE;
	public static final String LABEL_TITRE_ONGLET_ABONNE_ABONNEMENTS = "Abonnements";
	public static final String LABEL_TITRE_ONGLET_ABONNEMENT_ABONNEMENT = "Abonnement";
	public static final String LABEL_TITRE_ONGLET_ABONNEMENT_PAIEMENT = "Paiements";
	public static final String LABEL_TITRE_ONGLET_ABONNEMENT_FACTURE = "Factures";

	// --- Tableau de bord ---

	// titres parties
	public static final String LABEL_TITRE_JOURNAL_TBORD_EDITEUR_CLIENT = "Editeur / " + Langue.CLIENT;
	public static final String LABEL_TITRE_JOURNAL_TBORD_GESTION_TARIFS = "Gestion des " + Langue.TARIFS_MIN;
	public static final String LABEL_TITRE_JOURNAL_TBORD_GESTION_MODES_EXPE = "Gestion des " + Langue.MODES_EXPE_MIN;
	public static final String LABEL_TITRE_JOURNAL_TBORD_GESTION_ABONNES = "Gestion des " + Langue.ABONNES_MIN;
	public static final String LABEL_TITRE_JOURNAL_TBORD_GESTION_NUMEROS = "Gestion des " + Langue.NUMEROS_MIN;
	public static final String LABEL_TITRE_JOURNAL_TBORD_EXPORT_ROUTAGE = "Export routage";

	public static final String LABEL_TITRE_JOURNAL_TBORD_EVOLUION_ABONNES = "Evolution des " + Langue.ABONNES_MIN;

	// champs
	public static final String LABEL_CHAMP_JOURNAL_TBORD_ABONNEMENTS_TARIF = Langue.ABONNEMENTS_MIN + " au " + Langue.TARIF_MIN;
	public static final String LABEL_CHAMP_JOURNAL_TBORD_ABONNEMENT_TARIF = Langue.ABONNEMENT_MIN + " au " + Langue.TARIF_MIN;
	public static final String LABEL_CHAMP_JOURNAL_TBORD_ABONNE_S_TARIF = Langue.ABONNE_S_MIN + " au " + Langue.TARIF_MIN;
	public static final String LABEL_CHAMP_JOURNAL_TBORD_EXEMPLAIRE_EXPE_PAR = Langue.EXEMPLAIRE_MIN + " " + Langue.EXPEDIE_MIN + " par";
	public static final String LABEL_CHAMP_JOURNAL_TBORD_EXEMPLAIRES_EXPES_PAR = Langue.EXEMPLAIRES_MIN + " " + Langue.EXPEDIES_MIN + " par";
	public static final String LABEL_CHAMP_JOURNAL_TBORD_ABONNES = Langue.ABONNES_MIN;
	public static final String LABEL_CHAMP_JOURNAL_TBORD_ABONNE = Langue.ABONNE_MIN;
	public static final String LABEL_CHAMP_JOURNAL_TBORD_ABONNE_ECHU = Langue.ABONNE_MIN + " échu au";
	public static final String LABEL_CHAMP_JOURNAL_TBORD_ABONNES_ECHUS = Langue.ABONNES_MIN + " échus au";
	public static final String LABEL_CHAMP_JOURNAL_TBORD_PLUS_ABONNE_DEPUIS_1_AN = "personne non abonnée depuis plus d'un an";;
	public static final String LABEL_CHAMP_JOURNAL_TBORD_PLUS_ABONNES_DEPUIS_1_AN = "personnes non abonnées depuis plus d'un an";;
	public static final String LABEL_CHAMP_JOURNAL_TBORD_FACTURES_ATTENTE_PAIEMENT = Langue.FACTURES_MIN + " en attente de " + Langue.PAIEMENT_MIN;
	public static final String LABEL_CHAMP_JOURNAL_TBORD_FACTURE_ATTENTE_PAIEMENT = Langue.FACTURE_MIN + " en attente de " + Langue.PAIEMENT_MIN;
	public static final String LABEL_CHAMP_JOURNAL_TBORD_N_COURANT = Langue.N + " courant";
	public static final String LABEL_CHAMP_JOURNAL_TBORD_N_SUIVANT = Langue.N + " suivant";
	public static final String LABEL_CHAMP_JOURNAL_TBORD_CHOIX_NUMERO = "Choix " + Langue.NUMERO_MIN;

	// --- Relances ---
	public static final String LABEL_CHAMP_JOURNAL_RELANCES_ECHEANCE = "Echéance de la relance";
	public static final String LABEL_CHAMP_JOURNAL_RELANCES_VOUS_VOULEZ_RELANCER = "Vous voulez relancer : ";
	public static final String LABEL_CHAMP_JOURNAL_RELANCES_ABONNEMENTS_ECHUS_CE_NUMERO = "Les abonnements échus à ce numéro uniquement";
	public static final String LABEL_CHAMP_JOURNAL_RELANCES_ABONNEMENTS_ECHUS_CE_NUMERO_OU_PRECEDENT = "Les abonnements échus à ce numéro ou à un précédént";
	public static final String LABEL_CHAMP_JOURNAL_RELANCES_TARIFS = Langue.TARIFS + " concernés";
	public static final String LABEL_CHAMP_JOURNAL_RELANCES_SECTEURS = "Filtrer par " + Langue.SECTEUR;
	public static final String LABEL_CHAMP_JOURNAL_RELANCES_TYPES_ABONNE = "Filtrer par " + Langue.TYPE_ABONNE;

	public static final String LABEL_CHAMP_JOURNAL_RELANCES_PAR_EMAIL = "par email";
	public static final String LABEL_CHAMP_JOURNAL_RELANCES_PAR_COURRIER = "par courrier";

	public static final String LABEL_TITRE_JOURNAL_RELANCES_TARIFS = Langue.TARIFS + " concernés";
	public static final String LABEL_TITRE_JOURNAL_RELANCES_SECTEURS = Langue.SECTEURS + " concernées";
	public static final String LABEL_TITRE_JOURNAL_RELANCES_TYPES_ABONNE = Langue.TYPES_ABONNE + " concernés";
	public static final String LABEL_TITRE_JOURNAL_RELANCES_NOMBRE_ABONNE = "est concerné par cette relance";
	public static final String LABEL_TITRE_JOURNAL_RELANCES_NOMBRE_ABONNES = "sont concernés par cette relance";
	public static final String LABEL_TITRE_JOURNAL_RELANCES_PRISE_EN_COMPTE = "Prise en compte";

	public static final String LABEL_CHAMP_JOURNAL_RELANCES_CHOIX_MODELE_ABONNE = "Modèle de relance abonné";
	public static final String LABEL_CHAMP_JOURNAL_RELANCES_CHOIX_MODELE_TIERS_PAYEUR = "Modèle de relance tiers payeur";

	// --- Comptabilite ---
	public static final String LABEL_TITRE_JOURNAL_COMPTA_TRANSACTIONS = "Transactions enregistrées depuis l'espace abonnés avec comme mode de paiement chèque ou virement.";
	public static final String LABEL_TITRE_JOURNAL_COMPTA_TRANSACTIONS_AIDE = "Utilisez cette interface à la réception d'un chèque ou d'un virement.";

	public static final String LABEL_TITRE_JOURNAL_COMPTA_TRANSACTIONS_ATTENTE = "Voir les transactions en attente";
	public static final String LABEL_TITRE_JOURNAL_COMPTA_BORDEREAU_PAIEMENT = "Bordereau de date de paiement";
	public static final String LABEL_TITRE_JOURNAL_COMPTA_BORDEREAU_DEPOT = "Bordereau de date de dépôt";
	public static final String LABEL_TITRE_JOURNAL_COMPTA_EXPORT_ABO_REMISE_EN_BANQUE = "Export les abonnements (date de remise en banque)";
	public static final String LABEL_TITRE_JOURNAL_COMPTA_MOUVEMENTS = "Mouvements";
	public static final String LABEL_TITRE_JOURNAL_COMPTA_EDITER_FACTURES = "Editer les " + Langue.FACTURES_MIN;
	public static final String LABEL_TITRE_JOURNAL_COMPTA_RECH_FACTURES = "Rechercher les " + Langue.FACTURES_MIN;

	public static final String LABEL_CHAMP_JOURNAL_COMPTA_PAIEMENT_DEBUT = Langue.PAIEMENT + " effectué entre le";
	public static final String LABEL_CHAMP_JOURNAL_COMPTA_PAIEMENT_FIN = " et le";

	public static final String LABEL_CHAMP_JOURNAL_COMPTA_DEPOT_DEBUT = Langue.DEPOT + " effectué entre le";
	public static final String LABEL_CHAMP_JOURNAL_COMPTA_DEPOT_FIN = " et le";

	public static final String LABEL_CHAMP_JOURNAL_COMPTA_MOUVEMENT_DEBUT = "Etat entre le";
	public static final String LABEL_CHAMP_JOURNAL_COMPTA_MOUVEMENT_FIN = " et le";

	public static final String LABEL_CHAMP_JOURNAL_COMPTA_FACTURE_DEBUT = Langue.FACTURES + " du";
	public static final String LABEL_CHAMP_JOURNAL_COMPTA_FACTURE_FIN = " au";

	public static final String LABEL_CHAMP_JOURNAL_COMPTA_REF_FACTURE = "Format " + Langue.FACTURE_MIN;

	// --- Parametres ---
	// public static final String LABEL_TITRE_JOURNAL_PARAM_SECTEURS =
	// Langue.SECTEURS;
	// public static final String LABEL_TITRE_JOURNAL_PARAM_TYPES_ABONNE =
	// Langue.TYPES_ABONNE;
	public static final String LABEL_TITRE_JOURNAL_PARAM_GESTION_SECTEURS = "Gestion des " + Langue.SECTEURS_MIN;
	public static final String LABEL_TITRE_JOURNAL_PARAM_GESTION_DES_RESPONSABLES_ABONNE = "Gestion des " + Langue.RESPONSABLE_ABONNE_MIN;
	public static final String LABEL_TITRE_JOURNAL_PARAM_GESTION_TYPES_ABONNE = "Gestion des " + Langue.TYPES_ABONNE_MIN;
	public static final String LABEL_TITRE_JOURNAL_PARAM_TYPES_TVA = "Taux de " + Langue.TVA;
	public static final String LABEL_TITRE_JOURNAL_PARAM_FORMATS = "Formats de référence " + Langue.FACTURE_MIN + " et " + Langue.ABONNE_MIN;
	public static final String LABEL_TITRE_JOURNAL_PARAM_GESTION_MODELES = "Gestion des modèles";
	public static final String LABEL_TITRE_JOURNAL_PARAM_GESTION_MODELES_EMAIL = Langue.LABEL_TITRE_JOURNAL_PARAM_GESTION_MODELES + " de mail";
	public static final String LABEL_TITRE_JOURNAL_PARAM_GESTION_MODELES_COURRIER = Langue.LABEL_TITRE_JOURNAL_PARAM_GESTION_MODELES + " de courrier";

	public static final String LABEL_CHAMP_JOURNAL_PARAM_FORMAT_FACTURE = "Format " + Langue.FACTURE_MIN;
	public static final String LABEL_CHAMP_JOURNAL_PARAM_FORMAT_CLIENT = "Format " + Langue.CLIENT_MIN;

	// ---
	public static final String LABEL_TITRE_SECTEURS_NEW_SECTEUR = Langue.NEW_SECTEUR;
	public static final String LABEL_TITRE_TYPES_ABONNE_NEW_TYPE = Langue.NEW_TYPE_ABONNE;
	public static final String LABEL_TITRE_MODELE_EMAIL_NEW_TYPE = Langue.NEW_TYPE_ABONNE;

	public static final String LABEL_CHAMP_SECTEURS_NOM_SECTEUR = "Nom de la " + Langue.SECTEUR_MIN;
	public static final String LABEL_CHAMP_TYPES_ABONNE_NOM_TYPE = "Nom du " + Langue.TYPE_ABONNE_MIN;

	// ---
	// -------------------- Gestion des tarifs --------------------
	public static final String LABEL_TITRE_PAGE_TARIFS_GESTION = "Gestion des " + Langue.TARIFS_MIN;

	public static final String LABEL_TITRE_COLONNE_TARIFS_NOM_TARIF = "Nom du " + Langue.TARIF_MIN;
	public static final String LABEL_TITRE_COLONNE_TARIFS_NB_NUMEROS = "Nb de " + Langue.NUMEROS_MIN;
	public static final String LABEL_TITRE_COLONNE_TARIFS_TVA = Langue.TVA;
	public static final String LABEL_TITRE_COLONNE_TARIFS_PRIX_HT = Langue.PRIX_1_HT;
	public static final String LABEL_TITRE_COLONNE_TARIFS_PRIX_TTC = Langue.PRIX_1_TTC;
	public static final String LABEL_CHAMP_TARIFS_INFO_VISIBILITE = "Visibilité du tarif dans l'espace abonnés";

	public static final String LABEL_TITRE_PAGE_TARIFS_NEW_TARIF = Langue.NEW_TARIF;
	public static final String LABEL_TITRE_PAGE_TARIFS_MODIF_TARIF = Langue.MODIFICATION + " d'un " + Langue.TARIF_MIN;
	public static final String LABEL_CHAMP_TARIFS_NOM_TARIF = "Nom du " + Langue.TARIF_MIN;
	public static final String LABEL_CHAMP_TARIFS_NB_NUM = "Nb " + Langue.NUMEROS_MIN + " à servir";
	public static final String LABEL_CHAMP_TARIFS_DUREE = "Durée";
	public static final String LABEL_CHAMP_TARIFS_TVA = Langue.TVA;
	public static final String LABEL_CHAMP_TARIFS_PRIX_UNITAIRE = Langue.PRIX_UNITAIRE;
	public static final String LABEL_CHAMP_TARIFS_PRIX_HT = Langue.PRIX_1_HT;
	public static final String LABEL_CHAMP_TARIFS_PRIX_TTC = Langue.PRIX_1_TTC;
	public static final String LABEL_CHAMP_TARIFS_DEVISE = Langue.EURO;
	public static final String LABEL_COMMENTAIRE_TARIFS_NB_NUM = "(0 si illimité)";
	public static final String LABEL_COMMENTAIRE_TARIFS_HT = "(Le TTC est calculé automatiquement)";
	public static final String LABEL_COMMENTAIRE_TARIFS_TTC = "(Le HT est calculé automatiquement)";
	public static final String LABEL_TARIF_INVALIDE = "Le tarif saisi est invalide...";

	// ---
	// -------------------- Gestion des modes d'expédition --------------------
	public static final String LABEL_TITRE_PAGE_MODES_EXPEDITION_GESTION = "Gestion des " + Langue.MODES_EXPE_MIN;

	public static final String LABEL_TITRE_COLONNE_MODES_EXPEDITION_MODE = Langue.MODE;
	public static final String LABEL_TITRE_COLONNE_MODES_EXPEDITION_TYPE = "Type";
	public static final String LABEL_TITRE_COLONNE_MODES_EXPEDITION_DEFAUT = "Déf";

	public static final String LABEL_TITRE_PAGE_MODES_EXPEDITION_NEW_MODE_EXPEDITION = "Nouveau " + Langue.MODE_EXPE_MIN;
	public static final String LABEL_TITRE_PAGE_MODES_EXPEDITION_EDIT_MODE_EXPEDITION = "Modification d'un " + Langue.MODE_EXPE_MIN;

	public static final String LABEL_CHAMP_MODES_EXPEDITION_MODE = Langue.MODE;
	public static final String LABEL_CHAMP_MODES_EXPEDITION_TYPE = "Type";
	public static final String LABEL_CHAMP_MODES_EXPEDITION_ADRESSE_SPECIFIQUE_LIVRAISON = "Adresse spécifique de livraison";

	// ---
	// -------------------- Gestion des secteurs --------------------
	public static final String LABEL_TITRE_PAGE_SECTEURS_GESTION = "Gestion des " + Langue.SECTEURS_MIN;

	public static final String LABEL_TITRE_COLONNE_SECTEURS_NOM = Langue.NOM;
	public static final String LABEL_TITRE_COLONNE_SECTEURS = Langue.SECTEUR + "s";
	public static final String LABEL_TITRE_COLONNE_SECTEURS_DEFAUT = "Déf";

	public static final String LABEL_TITRE_PAGE_SECTEURS_NEW_SECTEUR = "Nouveau " + Langue.SECTEUR_MIN;
	public static final String LABEL_TITRE_PAGE_SECTEURS_EDIT_SECTEUR = "Modification d'un " + Langue.SECTEUR_MIN;

	public static final String LABEL_CHAMP_SECTEURS_NOM = Langue.NOM;

	// ---
	// -------------------- Gestion des responsables abonnes
	// --------------------
	public static final String LABEL_TITRE_PAGE_RESPONSABLE_GESTION = "Gestion des " + Langue.RESPONSABLE_ABONNE_MIN;
	public static final String LABEL_TITRE_COLONNE_RESPONSABLE_NOM = Langue.RESPONSABLE_ABONNE;

	// ---
	// -------------------- Gestion des types d'abonnes --------------------
	public static final String LABEL_TITRE_PAGE_TYPES_ABONNE_GESTION = "Gestion des " + Langue.TYPES_ABONNE_MIN;

	public static final String LABEL_TITRE_COLONNE_TYPES_ABONNE_NOM = Langue.NOM;
	public static final String LABEL_TITRE_COLONNE_TYPES_ABONNE_DEFAUT = "Déf";

	public static final String LABEL_TITRE_PAGE_TYPES_ABONNE_NEW_TYPE_ABONNE = "Nouveau " + Langue.TYPE_ABONNE_MIN;
	public static final String LABEL_TITRE_PAGE_TYPES_ABONNE_EDIT_TYPE_ABONNE = "Modification d'un " + Langue.TYPE_ABONNE_MIN;

	public static final String LABEL_CHAMP_TYPES_ABONNE_NOM = Langue.NOM;

	// ---
	// -------------------- Gestion des numéros --------------------
	public static final String LABEL_TITRE_PAGE_NUMEROS_GESTION = "Gestion des " + Langue.NUMEROS_MIN;

	public static final String LABEL_TITRE_COLONNE_NUMEROS_NUMERO = Langue.NUMERO;
	public static final String LABEL_TITRE_COLONNE_NUMEROS_DATE_EXPEDITION = "Date d'" + Langue.EXPE_MIN;
	public static final String LABEL_TITRE_COLONNE_NUMEROS_LIBELLE = "Libellé";

	public static final String LABEL_TITRE_PAGE_NUMEROS_NEW_NUMERO = "Nouveau " + Langue.NUMERO;

	public static final String LABEL_CHAMP_NUMEROS_NUMERO = Langue.NUMERO;
	public static final String LABEL_CHAMP_NUMEROS_DATE_EXPEDITION = "Date d'" + Langue.EXPE_MIN;
	public static final String LABEL_CHAMP_NUMEROS_LIBELLE = "Libellé";
	public static final String LABEL_CHAMP_NUMEROS_NUMERO_HORS_SERIE = "Ce " + Langue.NUMERO_MIN + " est un hors série";

	public static final String LABEL_TITRE_NUMEROS_CONDITION_HORS_SERIE = "Condition hors série";
	public static final String LABEL_CHAMP_NUMEROS_CONDITION_HORS_SERIE_PART_1 = "Pour recevoir ce numéro hors série, les abonnés doivent être abonnés du N°";
	public static final String LABEL_CHAMP_NUMEROS_CONDITION_HORS_SERIE_PART_2 = " au N°";
	public static final String LABEL_TITRE_NUMEROS_CONDITION_TARIFS = Langue.TARIFS + " concernés par ce " + Langue.NUMERO;

	// ---
	// -------------------- Gestion des abonnés --------------------
	public static final String LABEL_TITRE_PAGE_ABONNES_GESTION = "Gestion des " + Langue.ABONNES_MIN;

	public static final String LABEL_TITRE_ABONNES_FILTRE = "Filtres";
	public static final String LABEL_CHAMP_ABONNES_NUMERO_DEBUT = "N° de debut ";
	public static final String LABEL_CHAMP_ABONNES_NUMERO_FIN = "N° de fin ";
	public static final String LABEL_CHAMP_ABONNES_NUMERO_COURANT = "N° courant ";
	public static final String LABEL_CHAMP_ABONNES_REF_ABONNE = "Réf." + Langue.ABONNE_MIN;
	public static final String LABEL_CHAMP_ABONNES_SECTEUR = Langue.SECTEUR;
	public static final String LABEL_CHAMP_ABONNES_TYPE_ABONNE = Langue.TYPE_ABONNE;
	public static final String LABEL_CHAMP_ABONNES_MODES_EXPEDITION = Langue.MODE_EXPE;
	public static final String LABEL_CHAMP_ABONNES_TARIFS = Langue.TARIF;

	public static final String LABEL_CHAMP_ABONNES_REQUETE = "Requête personnalisée";
	public static final String LABEL_CHAMP_ABONNES_RECHERCHE = "Recherche libre";

	public static final String LABEL_TITRE_COLONNE_ABONNES_AUTO = "Auto";
	public static final String LABEL_TITRE_COLONNE_ABONNES_REF_ABONNE = "Réf." + Langue.ABONNE_MIN;
	public static final String LABEL_TITRE_COLONNE_ABONNES_ABONNE = Langue.ABONNE;
	public static final String LABEL_TITRE_COLONNE_ABONNES_ADRESSE = "Adresse";
	public static final String LABEL_TITRE_COLONNE_ABONNES_VILLE = "Ville";
	public static final String LABEL_TITRE_COLONNE_ABONNES_SECTEUR = "Secteur";
	public static final String LABEL_TITRE_COLONNE_ABONNES_TELEPHONE = "Téléphone / Mobile";
	public static final String LABEL_TITRE_COLONNE_ABONNES_EMAIL = "Email";
	public static final String LABEL_TITRE_COLONNE_ABONNES_TYPE_ABONNE = "Type d'abonné";
	public static final String LABEL_TITRE_COLONNE_NB_ABONNES_ABONNEMENTS = "Nb d' abonnements";
	public static final String LABEL_TITRE_COLONNE_ABONNES_TARIFS = "Tarifs";
	public static final String LABEL_TITRE_COLONNE_ABONNES_MODES_EXPEDITION = "Modes d'expédition";
	public static final String LABEL_TITRE_COLONNE_ABONNES_NUMERO_FIN = "N° de fin";
	public static final String LABEL_TITRE_COLONNE_ABONNES_NUMERO_DEBUT = "N° de début";
	public static final String LABEL_TITRE_COLONNE_ABONNES_JOURNAL = "Journal";
	public static final String LABEL_TITRE_COLONNE_ABONNES_DATE_CREATION = "Date de création";
	public static final String LABEL_TITRE_COLONNE_ABONNES_CREATEUR = "Créateur";
	public static final String LABEL_TITRE_COLONNE_ABONNES_DERNIERE_MODIF = "Dernière modification";
	public static final String LABEL_TITRE_COLONNE_ABONNES_MODIFICATEUR = "Modificateur";
	public static final String NON_PRECISE = "Non précisé";
	public static final String NON_PRECISEE = "Non précisée";

	// ---
	// -------------------- Modifier un abonné --------------------
	public static final String LABEL_TITRE_PAGE_MOD_ABONNE = "Modifier un " + Langue.ABONNE_MIN;

	public static final String LABEL_TITRE_ABONNE_ABONNE_IDENTITE = "Identité";
	public static final String LABEL_CHAMP_ABONNE_ABONNE_SOCIETE = "Société";
	public static final String LABEL_CHAMP_ABONNE_ABONNE_CIVILITE = "Civilité";
	public static final String LABEL_CHAMP_ABONNE_ABONNE_NOM = "Nom";
	public static final String LABEL_CHAMP_ABONNE_ABONNE_PRENOM = "Prénom";

	public static final String LABEL_CHAMP_ABONNE_ABONNE_LOGIN = "Identifiant";
	public static final String LABEL_CHAMP_ABONNE_ABONNE_PASSWORD = "Mot de passe";
	public static final String LABEL_CHAMP_ABONNE_ABONNE_INFO_LOGIN = "Compte d'accès à l'espace abonnés";

	public static final String LABEL_TITRE_ABONNE_ABONNE_JOURNAL = "Journal: ";
	public static final String LABEL_CHAMP_ABONNE_ABONNE_REF_ABONNE = "Référence " + Langue.ABONNE_MIN;
	public static final String LABEL_CHAMP_ABONNE_ABONNE_REF_AUTOMATIQUE = "Référence automatique";
	public static final String LABEL_CHAMP_ABONNE_ABONNE_TYPE_ABONNE = "Type d'" + Langue.ABONNE_MIN;
	public static final String LABEL_CHAMP_ABONNE_ABONNE_SECTEUR = Langue.SECTEUR;
	public static final String LABEL_CHAMP_ABONNE_ABONNE_COMMENTAIRES = "Commentaires";

	public static final String LABEL_CHAMP_ABONNE_ABONNEMENT_FILTRE = "Filtre journal";

	public static final String LABEL_TITRE_COLONNE_ABONNE_ABONNEMENT_DATE = "Date";
	public static final String LABEL_TITRE_COLONNE_ABONNE_ABONNEMENT_JOURNAL = "Journal";
	public static final String LABEL_TITRE_COLONNE_ABONNE_ABONNEMENT_ABONNEMENT = "Abonnement";
	public static final String LABEL_TITRE_COLONNE_ABONNE_ABONNEMENT_NB_EXEMPLAIRES = "Nb Ex.";
	public static final String LABEL_TITRE_COLONNE_ABONNE_ABONNEMENT_MONTANT_HT = "Montant HT";
	public static final String LABEL_TITRE_COLONNE_ABONNE_ABONNEMENT_MONTANT_TTC = "Montant TTC";
	public static final String LABEL_TITRE_COLONNE_ABONNE_ABONNEMENT_SOLDE = "Solde";
	public static final String LABEL_TITRE_COLONNE_ABONNE_ABONNEMENT_MONTANT_PAYE = "Montant payé";

	public static final String LABEL_DERNIERE_REF_ABONNE = "Dernière référence " + Langue.ABONNE_MIN;

	// ---
	// -------------------- Modification abonnement --------------------
	public static final String LABEL_TITRE_PAGE_ABONNEMENT_ABONNEMENTS_NEW_ABONNEMENT = "Nouvel abonnement";
	public static final String LABEL_TITRE_PAGE_ABONNEMENT_ABONNEMENTS_MOD_ABONNEMENT = "Modification abonnement";

	public static final String LABEL_TITRE_ABONNEMENT_ABONNEMENTS_DEFINITION = "Définition de l'abonnement";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_JOURNAL = "Journal";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_TARIF = Langue.TARIF;
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_NB_EXEMPLAIRES = "Nombre d'exemplaires de l'abonnement";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_NUMERO_DEBUT = "Numéro de début";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_NUMERO_FIN = "Numéro de fin";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_EXPEDITION = "Expédition";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_DATE = "Date";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_REABONNEMENT = "Réabonnement";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_RENOUVELLEMENT_AUTO = "Renouvellement auto";
	public static final String LABEL_TITRE_ABONNEMENT_ABONNEMENTS_ABONNEMENTS_INFORMATIONS = "Informations facturation";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_REF_FACTURE = "Réf. Facture";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_NUMERO_COURANT = "Numéro courant";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_MENSUALITE = "Mensualité";

	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_MONTANT_HT = "Montant H.T.";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_TAUX_TVA = "Taux " + Langue.TVA;
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_MONTANT_TVA = "Montant T.T.C.";
	public static final String LABEL_TITRE_ABONNEMENT_ABONNEMENTS_ADRESSE_FACTURATION = "Adresse de facturation";
	public static final String LABEL_CHAMP_ABONNEMENT_ABONNEMENTS_ADRESSE_FACTURATION_DIFFERENTE = "Adresse de facturation différente de l'" + Langue.ABONNE_MIN;

	public static final String LABEL_TITRE_PAGE_ABONNEMENT_PAIEMENTS_PAIEMENT = "Paiement abonnement";

	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_PAIEMENTS_DATE = "Date";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_PAIEMENTS_MODE = "Mode paiement";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_PAIEMENTS_LIBELLE = "Libellé/N° Chèque";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_PAIEMENTS_MONTANT = "Montant";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_PAIEMENTS_SOLDE = "Solde";
	public static final String LABEL_CHAMP_ABONNEMENT_PAIEMENTS_MONTANT_TOTAL_TVA = "Montant total T.T.C.";
	public static final String LABEL_CHAMP_ABONNEMENT_PAIEMENTS_SOLDE = "Solde";
	public static final String LABEL_TITRE_ABONNEMENT_PAIEMENTS_ENREGISTRER_EDITER = "Enregistrer/Editer un paiement";
	public static final String LABEL_CHAMP_ABONNEMENT_PAIEMENTS_DATE_PAIEMENT = "Date du paiement";
	public static final String LABEL_CHAMP_ABONNEMENT_PAIEMENTS_MODE_PAIEMENT = "Mode de paiement";
	public static final String LABEL_CHAMP_ABONNEMENT_PAIEMENTS_LIBELLE = "Libellé/N° Chèque";
	public static final String LABEL_CHAMP_ABONNEMENT_PAIEMENTS_MONTANT = "Montant";
	public static final String LABEL_CHAMP_ABONNEMENT_PAIEMENTS_BANQUE = "Banque";

	public static final String LABEL_TITRE_COLONNE_TRANSACTION_REFERENCE_BANQUE = "Réf bancaire";
	public static final String LABEL_TITRE_COLONNE_TRANSACTION_DATE = "Date";
	public static final String LABEL_TITRE_COLONNE_TRANSACTION_MONTANT = "Montant";
	public static final String LABEL_TITRE_COLONNE_TRANSACTION_NOM = "Nom";
	public static final String LABEL_TITRE_COLONNE_TRANSACTION_PRENOM = "Prénom";
	public static final String LABEL_TITRE_COLONNE_TRANSACTION_VILLE = "Ville";
	public static final String LABEL_TITRE_COLONNE_TRANSACTION_CP = "CP";
	public static final String LABEL_TITRE_COLONNE_TRANSACTION_NOM_TARIF = "Nom du tarif";

	public static final String LABEL_TITRE_PAGE_ABONNEMENT_FACTURES_FACTURES = "Factures";

	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_DATE = "Date";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_REF_FACTURE = "Référence facture";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_JOURNAL = "Journal";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_SOLDE = "Solde";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_DESIGNATION = "Désignation";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_QUANTITE = "Quantité";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_PRIX_UNITAIRE_HT = "Prix unitaire HT";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_TVA = Langue.TVA;
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_MONTANT = "Montant";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_MONTANT_HT = "Montant HT";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_MONTANT_TTC = "Montant TTC";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_TOTAL_TTC = "Total TTC";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_TOTAL_HT = "Total HT";
	public static final String LABEL_TITRE_COLONNE_ABONNEMENT_FACTURES_TOTAL_TVA = "Total " + Langue.TVA;

	public static final String LABEL_CHAMP_ABONNEMENT_FACTURES_REF_FACTURE = "Référence facture";
	public static final String LABEL_CHAMP_ABONNEMENT_FACTURES_REF_CLIENT = "Référence client";
	public static final String LABEL_CHAMP_ABONNEMENT_FACTURES_DATE = "Date";
	public static final String LABEL_CHAMP_ABONNEMENT_FACTURES_OBSERVATIONS = "Obsvervations";
	public static final String LABEL_CHAMP_ABONNEMENT_FACTURES_RESTE = "Reste à payer: ";

	public static final String LABEL_TITRE_ABONNEMENT_FACTURES_HISTORIQUE = "Historique des paiements";
	public static final String ABONNE_DB_DOUBLON_TITLE = "Doublons existants";
	public static final String ABONNE_DB_SUSPENDRE_TITLE = Langue.SUSPENDRE + ' ' + Langue.ABONNEMENTS;
	public static final String ABONNE_DB_MAILING_TITLE = Langue.EMAILING;
	public static final String LABEL_BT_NEW_PAIEMENT = "Ajouter un paiement";
	public static final String LABEL_INFO_PAIEMENT_NON_MODIFIABLE = "Vous ne pouvez pas modifier les paiements avant d'enregistrer les changements sur l'abonnement";
	public static final String LABEL_CHAMP_PAIEMENT_MODE_PAIEMENT = "Mode de paiement";
	public static final String LABEL_CHAMP_PAIEMENT_LIBELLE = "Libelle/N° Cheque";
	public static final String LABEL_CHAMP_PAIEMENT_MONTANT = "Montant";
	public static final String LABEL_CHAMP_PAIEMENT_SOLDE = "Solde";
	public static final String LABEL_CHAMP_PAIEMENT_BANQUE = "Banque";
	public static final String LABEL_CHAMP_PAIEMENT_COMMENTAIRE = "Commentaire";
	public static final String LABEL_CHAMP_PAIEMENT_DATE = "Date de paiement";
	public static final String LABEL_CHAMP_PAIEMENT_DATE_DEPOT = "Date de dépôt";
	public static final String LABEL_CHAMP_PAIEMENT_DATE_ENCAISSEMENT = "Date d'encaissement";
	public static final String LABEL_CHAMP_ABONNE_IMPORTER = "Fichier à importer";
	public static final String LABEL_CHAMP_NOM_PAYEUR = "Nom du payeur";
	public static final String LABEL_CHAMP_NB_CHEQUE = "Nombre de chèques";
	public static final String LABEL_CHAMP_IMPORT_FICHER = "Veuillez selectionner un fichier à importer depuis l'annuaire V1";
	public static final String ABONNEMENT_DB_MAILING_TITLE = Langue.EMAILING;
	// ---
	// -------------------- Modification modèle --------------------
	// Titres
	public static final String LABEL_TITRE_MODELE_DEFINITION = "Définition du modèle";
	public static final String LABEL_TITRE_MODELE_CORPS_EMAIL = "Email";
	public static final String LABEL_TITRE_MODELE_CORPS_COURRIER = "Courrier postal";

	// Champs
	public static final String LABEL_CHAMP_MODELE_NOM = "Nom du modèle";
	public static final String LABEL_CHAMP_MODELE_EXPEDITEUR = "Nom de l'expéditeur";
	public static final String LABEL_CHAMP_MODELE_ADRESSE_EXPEDITION = "Adresse d'expédition";
	public static final String LABEL_CHAMP_MODELE_EMAIL_EXPEDITION = "Email d'expédition";
	public static final String LABEL_CHAMP_MODELE_OBJET_COURRIER = " Objet du courrier";
	public static final String LABEL_CHAMP_MODELE_OBJET_EMAIL = "Objet du mail";
	public static final String LABEL_CHAMP_MODELE_CONTENU_COURRIER = "Contenu du courrier";
	public static final String LABEL_CHAMP_MODELE_CONTENU_EMAIL = "Contenu du mail";
	public static final String LABEL_CHAMP_MODELE_SIGNATURE = "Signature";

	//
	public static final String LABEL_AIDE = "Liste des variables clés, concernant l'abonné, faisant appel à des données de la base";
	// Aides
	public static final String LABEL_AIDE_CIVILITE = "Civilité abonné (ex:Mme)";
	public static final String LABEL_AIDE_CIVILITE_COURTE = "Civilité abonné (ex:Madame)";
	public static final String LABEL_AIDE_NOM = "Nom abonné";
	public static final String LABEL_AIDE_PRENOM = "Prénom abonné";
	public static final String LABEL_AIDE_ADRESSE_ABONNE = "Adresse abonné";
	public static final String LABEL_AIDE_ADRESSE_FACTURE = "Adresse facture";
	public static final String LABEL_AIDE_CODE_POSTAL = "Code postal abonné";
	public static final String LABEL_AIDE_VILLE = "Ville abonné";
	public static final String LABEL_AIDE_PAYS = "Pays abonné";
	public static final String LABEL_AIDE_NUMERO_ABONNE = "Numéro d'abonné";
	public static final String LABEL_AIDE_NUMERO_DEBUT_ABONNEMENT = "Numéro début abt";
	public static final String LABEL_AIDE_NUMERO_FIN_ABONNEMENT = "Numéro fin abt";
	public static final String LABEL_AIDE_ABONNEMENT = "Abonnement";
	public static final String LABEL_AIDE_PRIX_TTC = "Prix TTC";
	public static final String LABEL_AIDE_PRIX_HT = "Prix HT";
	public static final String LABEL_AIDE_NB_EXEMPLAIRES = "Nombre d'exemplaires";
	public static final String LABEL_AIDE_LOGIN = "Identifiant utilisateur";
	public static final String LABEL_AIDE_PASSWORD = "Mot de passe";
	public static final String LABEL_AIDE_DESTINATAIRE_PAYEUR = "Destinatire payeur";
	public static final String LABEL_AIDE_ADRESSE_PAYEUR = "Adresse payeur";
	public static final String LABEL_AIDE_CODEPOSTAL_PAYEUR = "Code postal payeur";
	public static final String LABEL_AIDE_VILLE_PAYEUR = "Ville payeur";
	public static final String LABEL_AIDE_PAYS_PAYEUR = "Pays payeur";

	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_TITRE = "Informations sur la transaction";
	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_VALIDER_CHEQUE = "Accuser la réception du chèque/virement";
	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_VALIDATION = "En cliquant sur le bouton '" + Langue.LABEL_COMPABILITE_TRANSACTIONS_INFO_VALIDER_CHEQUE
			+ "', les informations saisies par l'abonné seront automatiquement enregistrées dans la base de données.";

	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_REFERENCE_BANQUE = "Référence bancaire";
	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_DATE = "Date";
	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_MONTANT = "Montant";
	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_NOM = "Nom";
	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_PRENOM = "Prenom";
	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_VILLE = "Ville";
	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_CODE_POSTAL = "Code postal";
	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_STATUT = "Statut";
	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_MODE_DE_PAIEMENT = "Mode de paiement";

	public static final String LABEL_COMPABILITE_TRANSACTIONS_INFO_LOG = "Log";
	public static final String LABEL_COMPABILITE_TRANSACTIONS_RETOUR_SERVEUR_OK = "Opération effectuée avec succès";
	public static final String LABEL_COMPABILITE_TRANSACTIONS_RETOUR_SERVEUR_NOK = "Erreur lors du traitement : aucune opération n'a été effectuée";

	public static final String LABEL_MODE_PAIEMENT_ABREVIATION_CHEQUE = "chq";
	public static final String LABEL_MODE_PAIEMENT_ABREVIATION_CARTE_BANCAIRE = "cb";
	public static final String LABEL_MODE_PAIEMENT_ABREVIATION_VIREMENT = "virt";

}

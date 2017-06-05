package com.gj.util;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.gj.model.BswParution;



public class Utils {

	
	/**
	 * Generates modelMap to return in the modelAndView
	 * @param <T>
	 * @return
	 */
	public static <T> Map<String,Object> getMap(List<T> objects) throws ObjectNullExecption{
		
		if (objects == null){
			throw new ObjectNullExecption();
		}
		Map<String,Object> modelMap = new HashMap<String,Object>(3);
		modelMap.put("total", objects.size());
		modelMap.put("data", objects);
		modelMap.put("success", true);
		
		return modelMap;
	}
	
	/**
	 * Generates modelMap to return in the modelAndView
	 * @param <T>
	 * @return
	 */
	public static <T> Map<String,Object> getMap(Object object) throws ObjectNullExecption{
		
		if (object == null){
			throw new ObjectNullExecption();
		}
		Map<String,Object> modelMap = new HashMap<String,Object>(3);
		modelMap.put("data", object);
		modelMap.put("success", true);
		
		return modelMap;
	}
	
	/**
	 * Generates modelMap to return in the modelAndView in case
	 * of exception
	 * @param msg message
	 * @return
	 */
	public static Map<String,Object> getModelMapError(String msg){

		Map<String,Object> modelMap = new HashMap<String,Object>(2);
		modelMap.put("message", msg);
		modelMap.put("success", false);

		return modelMap;
	}
	
	
	// PARUTION JOURNAL
	
	/**
	 * retourne la plus proche parution déjà sortie à une date donnee - on
	 * exclut les hors serie
	 */
	public static BswParution getParutionPrecedenteForDate(final Set setParutions, final Date dateLimite) {
		BswParution pCourante = null;
		// pour vérifier qu'on ait bien la plus proche
		Date dateParutionCourante = null;

		final Iterator<BswParution> itP = setParutions.iterator();
		while (itP.hasNext()) {
			final BswParution parution = itP.next();
			final Date dateLivraison = parution.getDateLivraison();
			if (dateLivraison != null) {
				if (dateParutionCourante == null) {
					if (dateLivraison.before(dateLimite)) {
						if (!parution.isHorsSerie()) {
							pCourante = parution;
							dateParutionCourante = dateLivraison;
						}
					}
				} else {
					if (dateLivraison.before(dateLimite) && dateLivraison.after(dateParutionCourante)) {
						if (!parution.isHorsSerie()) {
							pCourante = parution;
							dateParutionCourante = dateLivraison;
						}
					}
				}
			}
		}
		return pCourante;
	}
	
	/**
	 * retourne la parution/numéro courante. Dans le contexte de Gestion
	 * d'Abonnés, on exclut les hors serie
	 **/
	public static BswParution getCurrentRelaese(final Collection setParutions) {
		BswParution pCourante = null;

		final Date now = new Date();

		pCourante = getParutionCouranteForDate(setParutions, now);

		return pCourante;
	}
	/**
	 * retourne la parution/numéro 'courante' pour une date donnée. Dans le
	 * contexte de Gestion d'Abonnés, on exclut les hors serie
	 **/
	public static BswParution getParutionCouranteForDate(final Collection setParutions, final Date dateLimite) {
		BswParution pCourante = null;
		// pour vérifier qu'on ait bien la plus proche
		Date dateParutionCourante = null;

		final Iterator<BswParution> itP = setParutions.iterator();
		while (itP.hasNext	()) {
			final BswParution parution = itP.next();
			final Date dateLivraison = parution.getDateLivraison();
			if (dateLivraison != null) {
				if (dateParutionCourante == null) {
					if (dateLivraison.after(dateLimite)) {
						if (!parution.isHorsSerie()) {
							pCourante = parution;
							dateParutionCourante = dateLivraison;
						}
					}
				} else {
					if (dateLivraison.after(dateLimite) && dateLivraison.before(dateParutionCourante)) {
						if (!parution.isHorsSerie()) {
							pCourante = parution;
							dateParutionCourante = dateLivraison;
						}
					}
				}
			}
		}
		return pCourante;
	}
	
	/** 
	 * return string format 'N°25 - 26/11/09' 
	 * 
	 */
	public static String getRelaeseDateFormat(final BswParution parution) {
		if (parution == null) {
			return "";
		}
		String libelle = "";
		if (parution.getNumero() != null) {
			libelle += "N°" + parution.getNumero();
			String dl = parution.getDateLivraison().toString();
			if (dl != null) {
				dl = dl.replace("-", "/");
				libelle += " - " + dl;
			}
		} else {
			String dl = parution.getDateLivraison().toString();
			if (dl != null) {
				libelle += "" + dl;
			} else {
				libelle += "(non renseigné)";
			}
		}

		return libelle;
	}
	public static BswParution getParutionSuivanteByNumero(final Collection<BswParution> setParutions, final String numero) {
		BswParution parution = null;

		final Iterator<BswParution> iP = setParutions.iterator();
		while (iP.hasNext()) {
			final BswParution p = iP.next();
			if (p.getNumero() != null && p.getNumero().equals(numero)) {
				if (iP.hasNext()) {
					return iP.next();
				} else {
					return null;
				}
				// parution = p;
			}
		}

		return parution;
	}
}

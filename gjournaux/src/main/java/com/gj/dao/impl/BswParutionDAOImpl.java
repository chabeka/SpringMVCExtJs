package com.gj.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.gj.dao.IParutionDAO;
import com.gj.model.BswJournal;
import com.gj.model.BswParution;



@Repository
public class BswParutionDAOImpl extends AbstractGenericDAO<BswParution, Long> implements IParutionDAO {

	/**
	 * Returns the list of the {@link BswParution} of a {@link BswJournal} 
	 * or all {@link BswParution} if idJournal is null
	 */
	@SuppressWarnings("unchecked")
	public List<BswParution> getParutions(final Integer idJournal) {
		List<BswParution> resultat = new ArrayList<BswParution>(); 
		// Si le select n'est pas, retourne un objet journal et parution
			String sql = "select p from BswParution as p ";
			sql += " inner join p.bswJournal as j";
			if (idJournal != null) {
				sql += " where j.idJournal = " + idJournal;
			}
			sql += " order by p.mensualite";
			Query query = currentSession().createQuery(sql);
			resultat = query.list();

		return resultat;
	}

}

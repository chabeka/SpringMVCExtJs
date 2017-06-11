package com.gj.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.gj.dao.IBswJournalDAO;
import com.gj.model.BswJournal;



@Repository
public class BwsJournalDAOImpl extends AbstractGenericDAO<BswJournal, Long> implements IBswJournalDAO {

	public List<BswJournal> getByName(String name) {
		String sql = "from BswJournal as j where j.titre like ?";
		Query query = currentSession().createQuery(sql);
		query.setString(0, "%"+name+"%");
		return (List<BswJournal>) query.list();

	}

	public BswJournal getByIdJournal(Integer idJournal) {
		BswJournal j = (BswJournal) currentSession().get(BswJournal.class, idJournal);
		return j;
	}


	public List<BswJournal> getJournauxByIdClient(Integer idClient, Integer start, Integer limit) {
		// TODO Auto-generated method stub
		return null;
	}

	public BswJournal addBswJournal(BswJournal journal) {
		return saveOrUpdate(journal);
	}
	
}

package com.gj.manager;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gj.dao.IBswJournalDAO;
import com.gj.model.BswJournal;

@Service
public class BswJournalManager {

	@Autowired
	IBswJournalDAO bswJournalDAO;
	
	
	public BswJournalManager() {

	}
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public List<BswJournal> listBswJournal(String name){
		List<BswJournal> listJournal = (List<BswJournal>) bswJournalDAO.getByName(name);
		return listJournal;	
	}

	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public BswJournal getJournalById(Integer idJournal){
		return bswJournalDAO.getByIdJournal(idJournal);
	}
}

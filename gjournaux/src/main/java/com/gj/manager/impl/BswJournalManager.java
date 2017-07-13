package com.gj.manager.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gj.dao.IBswJournalDAO;
import com.gj.manager.IBswJournalManager;
import com.gj.model.BswJournal;

@Service
public class BswJournalManager implements IBswJournalManager{

	@Autowired
	IBswJournalDAO bswJournalDAO;
	
	
	public BswJournalManager() {

	}
	
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public List<BswJournal> allBswJournal(){
		List<BswJournal> listJournal = (List<BswJournal>) bswJournalDAO.getAll();
		return listJournal;	
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
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public BswJournal addBswJournal(BswJournal journal){
		return bswJournalDAO.addBswJournal(journal);
	}
}

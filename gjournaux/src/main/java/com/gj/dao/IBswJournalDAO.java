package com.gj.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.gj.model.BswJournal;


public interface IBswJournalDAO extends GenericDAO<BswJournal, Long>{


	public List<BswJournal> getByName(String name);
	public BswJournal getByIdJournal(Integer idJournal);
	public BswJournal addBswJournal(BswJournal journal);
	
	// BSWJOURNAL
	
	public List getJournauxByIdClient(Integer idClient, Integer start, Integer limit);
}

package com.gj.manager;

import java.util.List;

import com.gj.model.BswJournal;

public interface IBswJournalManager {


	public List<BswJournal> allBswJournal();
	
	public List<BswJournal> listBswJournal(String name);

	public BswJournal getJournalById(Integer idJournal);
	
	public BswJournal addBswJournal(BswJournal journal);
}

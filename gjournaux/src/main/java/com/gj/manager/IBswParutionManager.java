package com.gj.manager;

import java.util.List;


import com.gj.model.BswParution;

public interface IBswParutionManager {

	public  List<BswParution> getParutions(final Integer idJournal);
	
	public  BswParution addBswParutions(BswParution parution);
}

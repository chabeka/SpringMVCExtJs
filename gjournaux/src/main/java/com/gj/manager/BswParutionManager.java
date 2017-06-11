package com.gj.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.gj.dao.IParutionDAO;
import com.gj.model.BswJournal;
import com.gj.model.BswParution;




@Service
public class BswParutionManager {
	
	
	@Autowired
	IParutionDAO bswParutionDAO;

	/**
	 * Returns the list of the {@link BswParution} of a {@link BswJournal} 
	 * or all {@link BswParution} if idJournal is null
	 */
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public  List<BswParution> getParutions(final Integer idJournal) {
		return bswParutionDAO.getParutions(idJournal);
		
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public  BswParution addBswParutions(BswParution parution) {
		return bswParutionDAO.saveOrUpdate(parution);
		
	}
	
}

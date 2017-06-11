package com.gj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gj.model.BswParution;



public interface IParutionDAO extends GenericDAO<BswParution, Long> {
	
	public List<BswParution> getParutions(final Integer idJournal);

}

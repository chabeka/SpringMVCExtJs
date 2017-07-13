package com.bsw.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.gj.manager.IBswJournalManager;
import com.gj.manager.IBswParutionManager;
import com.gj.model.BswJournal;
import com.gj.model.BswParution;
import com.gj.util.ObjectNullExecption;
import com.gj.util.Utils;


@Controller
public class ControllerJG {
	
	
	@Autowired
	private IBswJournalManager bswJournalManager;
	
	@Autowired
	private IBswParutionManager bswParutionManager;
	
	// TEST
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap model) {
		model.addAttribute("message", "Hello Spring WEB MVC!");
		return "hello";
	}
	
	
	// BSWJOURNAL
	
	@RequestMapping(value="services/journaux", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Map<String, ? extends Object> getJournaux() throws Exception{
						
		try{
			List<BswJournal> bswJournals = bswJournalManager.allBswJournal();
			return Utils.getMap(bswJournals);		
		}catch (Exception e) {
			// TODO: handle exception
		}
		return Utils.getModelMapError("");	
	}
	@RequestMapping(value="services/journaux/{nameLike}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Map<String, ? extends Object> getJournauxByNameLike(@PathVariable("nameLike") String nameLike) throws Exception{
		
		try{
			List<BswJournal> bswJournals = bswJournalManager.listBswJournal(nameLike);
			return Utils.getMap(bswJournals);		
		}catch (Exception e) {
			// TODO: handle exception
		}
		return Utils.getModelMapError("");	
	}
	
	@RequestMapping(value="services/journal/{idJournal}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Map<String, ? extends Object> getJournal(@PathVariable("idJournal") Integer idJournal) throws Exception{
		
		try{
			BswJournal bswJournals = bswJournalManager.getJournalById(idJournal);
			return Utils.getMap(bswJournals);		
		}catch (Exception e) {
			// TODO: handle exception
		}
		return Utils.getModelMapError("Problem to get journal with id = " + idJournal);	
	}
	
	 @RequestMapping(value = "services/journaux", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")  
	 public @ResponseBody Map<String, ? extends Object> addBswJournal(@RequestBody BswJournal journal) {
		 System.out.println("-----------------");
		 System.out.println(journal.toString());
		 System.out.println("-----------------");
			try{
				Object j = bswJournalManager.addBswJournal(journal);
				return Utils.getMap(j);	
			}catch (Exception e) {
				// TODO: handle exception
			}
			return Utils.getModelMapError("Problem to create BswJournal");
	 }
	 
	 
	 // BSWPARUTION
 
    @RequestMapping( value = "services/parutions/{idJournal}", method = RequestMethod.GET, produces = "application/json")
    public  @ResponseBody Map<String, ? extends Object> getParutions(@PathVariable("idJournal") Integer idJournal){
    	 
		try{
			List<BswParution> parutions = bswParutionManager.getParutions(idJournal);
			return Utils.getMap(parutions);		
		}catch (Exception e) {
			// TODO: handle exception
		}
		return Utils.getModelMapError("Problem to load BswParution of BswJournal with idJournal = " + idJournal);
    }

    @RequestMapping(value="services/parutions", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public @ResponseBody Map<String, ? extends Object> addBswParution(@RequestBody BswParution parution){
    	
    	try {
    		Object p = bswParutionManager.addBswParutions(parution);
			return Utils.getMap(p);
		} catch (ObjectNullExecption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return Utils.getModelMapError("Problem to save BswParution");
    }
	    
}
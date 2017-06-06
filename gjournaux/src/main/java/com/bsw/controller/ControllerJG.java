package com.bsw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gj.manager.BswJournalManager;
import com.gj.model.BswJournal;
import com.gj.util.Utils;


@Controller
public class ControllerJG {
	
	
	@Autowired
	private BswJournalManager bswJournalManager;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(ModelMap model) {
		System.out.println("bswJournals.size()");
		model.addAttribute("message", "Hello Spring WEB MVC!");
		return "hello";
	}
	
	
	// BSWJOURNAL
	
	@RequestMapping(value="services/journaux", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Map<String, ? extends Object> getJournaux(String nameLike, String bse, String client, String journal) throws Exception{
		System.out.println("bswJournals.size()" + nameLike);
		
		Map<String, String> filtersmap = new HashMap<String, String>();
					
		if(!"".equals(bse)){
			filtersmap.put("nameLike", nameLike);
		}
		if(!"".equals(client)){
			filtersmap.put("bse", bse);					
		}
		if(!"".equals(journal)){
			filtersmap.put("client", client);			
		}
		if(!"".equals(nameLike)){
			filtersmap.put("journal", journal);			
		}
				
		try{
			List<BswJournal> bswJournals = bswJournalManager.listBswJournal(nameLike);
			System.out.println(bswJournals.size());
			return Utils.getMap(bswJournals);		
		}catch (Exception e) {
			// TODO: handle exception
		}
		return Utils.getModelMapError("");
		
	}
}
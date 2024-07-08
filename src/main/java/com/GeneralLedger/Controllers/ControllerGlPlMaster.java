package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import com.GeneralLedger.Models.GlPlMaster;
import com.GeneralLedger.Services.ServiceGlPlMaster;

@RestController
public class ControllerGlPlMaster {	
	@Autowired
	ServiceGlPlMaster servGlPlMaster;
	
	@GetMapping("/GeneralLedger/getglplmasterlist")
	public List<GlPlMaster> getGlPpMasterList(){
		return servGlPlMaster.getGlPlMasterList();
	}
	
	@GetMapping("/GeneralLedger/getglplmastercu")
	public List<GlPlMaster> getGlPlMasterCU(String plCode){
		return servGlPlMaster.getGlPlMasterCU(plCode);
	}
	
	@PostMapping("/GeneralLedger/saveupdglplmaster")
	public String saveUpdateGlPlMaster(@RequestBody GlPlMaster plCode) {
		return servGlPlMaster.saveUpdateGlPlMaster(plCode);
	
	}
	
	@GetMapping("/GeneralLedger/getglplmasterstslist")
	public List<GlPlMaster> getGlPlMasterStatus(String glPlSts){
		return servGlPlMaster.getGlPlMasterSts(glPlSts);
	}
	
	@GetMapping("/GeneralLedger/getglplmstdesc")
	public String getGlPlMstDesc(String glPlCode) {
		return servGlPlMaster.getGlPlMstDesc(glPlCode);
	}

}

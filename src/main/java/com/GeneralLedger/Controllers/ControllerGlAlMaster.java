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

import com.GeneralLedger.Models.GlAlMaster;
import com.GeneralLedger.Services.ServiceGlAlMaster;

@RestController
public class ControllerGlAlMaster {
	@Autowired
	ServiceGlAlMaster servGlAlMaster;
	
	@GetMapping("/GeneralLedger/getglalmasterlist")
	public List<GlAlMaster> getGlAlMasterList(){
		return servGlAlMaster.getGlAlMasterList();
	}
	
	@GetMapping("/GeneralLedger/getglalmastercu")
	public List<GlAlMaster> getGlMasterCU(String alCode){
		return servGlAlMaster.getGlAlMasterCU(alCode);
	}
	
	@PostMapping("/GeneralLedger/saveupdglalmaster")
	public String saveUpdateGlAlMaster(@RequestBody GlAlMaster alCode) {
		return servGlAlMaster.saveUpdateGlAlMaster(alCode);
	
	}
	
	@GetMapping("/GeneralLedger/getglalmasterstslist")
	public List<GlAlMaster> getGlAlMasterStatus(String alStatus){
		return servGlAlMaster.getGlAlMasterSts(alStatus);
	}
	
	@GetMapping("/GeneralLedger/getglalmstdesc")
	public String getGlAlMstDesc(String glAlCode) {
		return servGlAlMaster.getGlAlMstDesc(glAlCode);
	}

}

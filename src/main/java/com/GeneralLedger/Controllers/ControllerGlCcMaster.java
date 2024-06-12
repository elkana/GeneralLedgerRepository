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

import com.GeneralLedger.Models.GlCcMaster;
import com.GeneralLedger.Models.GlTypeMaster;
import com.GeneralLedger.Services.ServiceGlCcMaster;

@RestController
public class ControllerGlCcMaster {
	@Autowired
	ServiceGlCcMaster servGlCcMaster;
	
	@GetMapping("/GeneralLedger/getglccmasterlist")
	public List<GlCcMaster> getGlCcMasterList(){
		return servGlCcMaster.getGlCcMasterList();
	}
	
	@GetMapping("/GeneralLedger/getglccmastercu")
	public List<GlCcMaster> getGlCcMasterCU(String glCcSts){
		return servGlCcMaster.getGlCcMasterCU(glCcSts);
	}
	
	@PostMapping("/GeneralLedger/saveupdglccmaster")
	public String saveUpdateGlCcMaster(@RequestBody GlCcMaster ccCode) {
		return servGlCcMaster.saveUpdateGlCcMaster(ccCode);
	
	}
}

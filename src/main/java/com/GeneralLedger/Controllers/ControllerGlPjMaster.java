package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlPjMaster;
import com.GeneralLedger.Services.ServiceGlPjMaster;

@RestController
public class ControllerGlPjMaster {
	
	@Autowired
	ServiceGlPjMaster servPjMaster;
	
	@GetMapping("/GeneralLedger/getpjmasterlistall")
	public List<GlPjMaster> getGlPjMaster(){
		return servPjMaster.getGlPjMaster();
	}
	
	@GetMapping("/GeneralLedger/getglpjstatuslist")
	public List<GlPjMaster> getPjStatus(String status){
		return servPjMaster.getGlPjStatus(status);
	}
	
	@PostMapping("/GeneralLedger/saveupdpjmaster")
	public String saveUpdatePjMaster(@RequestBody GlPjMaster pjmaster) {
		return servPjMaster.saveUpdatePjMaster(pjmaster);
	
	}
	
	@GetMapping("/GeneralLedger/getpjcodesingle")
	public Optional<GlPjMaster> getPjCode(String code) {
		return servPjMaster.getPjCode(code);
	}
	
	@GetMapping("/GeneralLedger/getmstpjdesc")
	public String getMstPjDesc(String code) {
		return servPjMaster.getMstPjDesc(code);
	}
	
	@DeleteMapping("/GeneralLedger/deletebyglpjcode")
	public String DelPjMaster(String code) {
		return servPjMaster.DelPjMasterByPjCode(code);
	
	}


}

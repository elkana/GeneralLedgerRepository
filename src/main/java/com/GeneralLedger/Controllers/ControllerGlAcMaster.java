package com.GeneralLedger.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlAcMaster;
import com.GeneralLedger.Services.ServiceGlAcMaster;

@RestController
public class ControllerGlAcMaster {
	
	@Autowired
	ServiceGlAcMaster servAcMst;
	
	@GetMapping("/GeneralLedger/getglacmstlistall")
	public List<GlAcMaster> getGlAcMst(){
		return servAcMst.getGlAcMaster();
	}

}

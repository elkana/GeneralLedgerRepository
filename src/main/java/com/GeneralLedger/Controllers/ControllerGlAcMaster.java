package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/GeneralLedger/getaccodesingle")
	public Optional<GlAcMaster> getAcCode(String code) {
		return servAcMst.getAcCode(code);
	}
	
	@PostMapping("/GeneralLedger/saveupdacmster")
	public String saveUpdateProduksi(@RequestBody GlAcMaster acmaster) {
		return servAcMst.saveUpdateAcMaster(acmaster) ;
	
	}

}

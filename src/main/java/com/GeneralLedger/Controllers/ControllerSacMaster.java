package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlSacMaster;
import com.GeneralLedger.Services.ServiceGlSacMaster;


@RestController
public class ControllerSacMaster {
	
	@Autowired
	ServiceGlSacMaster servSacMst;
	
	@GetMapping("/GeneralLedger/getglsacmstlistall")
	public List<GlSacMaster> getGlSacMst(){
		return servSacMst.getGlSacMaster();
	}
	
	@GetMapping("/GeneralLedger/getglsacstslist")
	public List<GlSacMaster> getGlSacSts(String status){
		return servSacMst.getGlSacSts(status);
	}
	
	@GetMapping("/GeneralLedger/getsacaccsingle")
	public Optional<GlSacMaster> getSacCode(String acc,String subacc) {
		return servSacMst.getSacCode(acc, subacc);
	}
	
	@GetMapping("/GeneralLedger/getmstaccsubdesc")
	public String getAccSubDesc(String code) {
		return servSacMst.getAccSubDesc(code);
	}
	
	@PostMapping("/GeneralLedger/saveupdsacmster")
	public String saveUpdateSac(@RequestBody GlSacMaster sacmaster) {
		return servSacMst.saveUpdateSacMaster(sacmaster) ;
	
	}

}

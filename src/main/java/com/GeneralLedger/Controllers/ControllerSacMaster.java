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
	
	@GetMapping("/GeneralLedger/getsacaccsingle")
	public Optional<GlSacMaster> getSacCode(String acc) {
		return servSacMst.getSacCode(acc);
	}
	
	@PostMapping("/GeneralLedger/saveupdsacmster")
	public String saveUpdateSac(@RequestBody GlSacMaster sacmaster) {
		return servSacMst.saveUpdateSacMaster(sacmaster) ;
	
	}

}

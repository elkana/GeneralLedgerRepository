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
	
	@GetMapping("/GeneralLedger/getglsacbyacclist")
	public List<GlSacMaster> getGlSacByAcc(String acc){
		return servSacMst.getGlSacByAcc(acc);
	}
	
	@GetMapping("/GeneralLedger/getglsacbystsacclist")
	public List<GlSacMaster> getGlSacByStsAcc(String status,String acc){
		return servSacMst.getGlSacByStsAcc(status, acc);
	}
	
	@GetMapping("/GeneralLedger/getglsacbysubacclist")
	public List<GlSacMaster> getGlSacBySubAcc(String subacc){
		return servSacMst.getGlSacBySubAcc(subacc);
	}
	
	@GetMapping("/GeneralLedger/getglsacbystssublist")
	public List<GlSacMaster> getGlSacByStsSubAcc(String status,String subacc){
		return servSacMst.getGlSacByStsSubAcc(status, subacc);
	}
	
	@GetMapping("/GeneralLedger/getglsacbydesclist")
	public List<GlSacMaster> getGlSacByDesc(String desc){
		return servSacMst.getGlSacByDesc(desc);
	}
	
	@GetMapping("/GeneralLedger/getglsacbystsdesclist")
	public List<GlSacMaster> getGlSacByStsDesc(String status,String desc){
		return servSacMst.getGlSacByStsDesc(status, desc);
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

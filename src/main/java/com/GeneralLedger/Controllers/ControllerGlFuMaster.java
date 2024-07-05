package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlFuMaster;
import com.GeneralLedger.Services.ServiceGlFuMaster;

@RestController
public class ControllerGlFuMaster {
	
	@Autowired
	ServiceGlFuMaster servFuMaster;
	
	@GetMapping("/GeneralLedger/getfumasterlistall")
	public List<GlFuMaster> getGlFuMaster(){
		return servFuMaster.getGlFuMaster();
	}
	
	@GetMapping("/GeneralLedger/getglfustatuslist")
	public List<GlFuMaster> getFuStatus(String status, Integer Seqno){
		return servFuMaster.getGlFuStatus(status, Seqno);
	}
	
	@PostMapping("/GeneralLedger/saveupdfumaster")
	public String saveUpdateFuMaster(@RequestBody GlFuMaster fumaster) {
		return servFuMaster.saveUpdateFuMaster(fumaster);
	
	}
	
	@GetMapping("/GeneralLedger/getfuseqsingle")
	public Optional<GlFuMaster> getFuseqNo(Integer seq) {
		return servFuMaster.getFuSeqNo(seq);
	}
	
	@GetMapping("/GeneralLedger/getmstfudesc")
	public String getMstFuDesc(String code) {
		return servFuMaster.getMstFuDesc(code);
	}
	
	@DeleteMapping("/GeneralLedger/deletebyseqno")
	public String DelFuMaster(Integer seqno) {
		return servFuMaster.DelFuMasterById(seqno);
	
	}

}

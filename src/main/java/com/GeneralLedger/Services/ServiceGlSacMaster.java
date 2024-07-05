package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlSacMaster;
import com.GeneralLedger.Repository.IGlSacMaster;

@Service
public class ServiceGlSacMaster {
	
	@Autowired
	IGlSacMaster repoSacMst;
	
	public List<GlSacMaster> getGlSacMaster(){
		return repoSacMst.findAll();
	}
	
	public List<GlSacMaster> getGlSacSts(String status){
		return repoSacMst.findByglsmacstatus(status);
	}
	
	public Optional<GlSacMaster> getSacCode(String acc,String subacc){
	    return repoSacMst.findByglsmsacaccAndGlsmsacsub(acc, subacc);
	}
	
	public String getAccSubDesc(String code) {
		return repoSacMst.getMstAccSubDesc(code);
	}
	
	public String saveUpdateSacMaster(GlSacMaster sacmaster) {
		repoSacMst.save(sacmaster);
		return "Submit Successfully";
	}

}

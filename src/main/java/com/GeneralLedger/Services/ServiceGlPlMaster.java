package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlPlMaster;
import com.GeneralLedger.Repository.IGlPlMasterRepository;

@Service
public class ServiceGlPlMaster {
	
	@Autowired
	IGlPlMasterRepository repoGlPlMaster;
	
	public List<GlPlMaster> getGlPlMasterList(){
		return repoGlPlMaster.findAll();
	}
	
	public List<GlPlMaster> getGlPlMasterCU(String glPlSts){
		return repoGlPlMaster.findByGlPlStatus(glPlSts);
	}
	
	public String saveUpdateGlPlMaster(GlPlMaster plCode) {
		repoGlPlMaster.save(plCode);
		return "Submit Successfully";
	}

}

package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlCcMaster;
import com.GeneralLedger.Repository.IGlCcMasterRepository;

@Service
public class ServiceGlCcMaster {
	
	@Autowired
	IGlCcMasterRepository repoGlCcMaster;
	
	public List<GlCcMaster> getGlCcMasterList(){
		return repoGlCcMaster.findAll();
	}
	
	public Optional<GlCcMaster> getGlCcMasterCU(String ccCode){
		return repoGlCcMaster.findByGlCcCode(ccCode);
	}
	
	public List<GlCcMaster> getGlCcMasterSts(String glCcSts){
		return repoGlCcMaster.findByGlCcStatus(glCcSts);
	}
	
	public List<GlCcMaster> getGlByCcCode(String code){
		return repoGlCcMaster.findByGlCcCodeContaining(code);
	}
	
	public List<GlCcMaster> getGlByCcCodeSts(String status, String code){
		return repoGlCcMaster.findByGlCcStatusAndGlCcCodeContaining(status, code);
	}
	
	public List<GlCcMaster> getGlByCcDesc(String desc){
		return repoGlCcMaster.findByGlCcDescContaining(desc);
	}
	
	public List<GlCcMaster> getGlByCcDescSts(String status, String desc){
		return repoGlCcMaster.findByGlCcStatusAndGlCcDescContaining(status, desc);
	}
	
	public String saveUpdateGlCcMaster(GlCcMaster ccCode) {
		repoGlCcMaster.save(ccCode);
		return "Submit Successfully";
	}
	
	public String getGlCcMstDesc(String glCcCode) {
		return repoGlCcMaster.getGlCcMstDesc(glCcCode);
	}

}

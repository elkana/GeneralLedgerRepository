package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlPjMaster;
import com.GeneralLedger.Repository.IGlPjMasterRepository;


@Service
public class ServiceGlPjMaster {
	
	@Autowired
	IGlPjMasterRepository repoPjMaster;
	
	public List<GlPjMaster> getGlPjMaster(){
		return repoPjMaster.findAll();
	}
	
	public List<GlPjMaster> getGlPjStatus(String status){
		return repoPjMaster.findByglPjStatus(status);
	}
	
	public String saveUpdatePjMaster(GlPjMaster pjmaster) {
		repoPjMaster.save(pjmaster);
		return "Submit Successfully";
	}
	
	public Optional<GlPjMaster> getPjCode(String code){
	    return repoPjMaster.findByglPjCode(code);
	}
	
	public String getMstPjDesc(String code) {
		return repoPjMaster.getMstPjDesc(code);
	}
	
	public String DelPjMasterByPjCode(String code) {
		repoPjMaster.deleteById(code);;
		return "Delete Successfully";
	}


}

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
	
	public List<GlPjMaster> getGlByPjCode(String code){
		return repoPjMaster.findByglPjCodeContaining(code);
	}
	
	public List<GlPjMaster> getGlByPjCodeSts(String status,String code){
		return repoPjMaster.findByglPjStatusAndGlPjCodeContaining(status, code);
	}
	
	public List<GlPjMaster> getGlByPjDesc(String desc){
		return repoPjMaster.findByglPjDescContaining(desc);
	}
	
	public List<GlPjMaster> getGlByPjDescSts(String status,String desc){
		return repoPjMaster.findByglPjStatusAndGlPjDescContaining(status, desc);
	}
	
	public List<GlPjMaster> getGlByPjStartDate(String dt){
		return repoPjMaster.getByPjStartList(dt);
	}
	
	public List<GlPjMaster> getGlByPjEndDate(String dt){
		return repoPjMaster.getByPjEndList(dt);
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

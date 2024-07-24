package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlAcMaster;
import com.GeneralLedger.Repository.IGlAcMasterRepository;

@Service
public class ServiceGlAcMaster {
	@Autowired
	IGlAcMasterRepository repoAcMst;
	
	public List<GlAcMaster> getGlAcMaster(){
		return repoAcMst.findAll();
	}
	
	public List<GlAcMaster> getGlAcStatus(String status){
		return repoAcMst.findByglamacstatus(status);
	}
	
	public List<GlAcMaster> getGlAcTypeSts(String status,String type){
		return repoAcMst.findByglamacstatusAndGlamactype(status, type);
	}
	
	public List<GlAcMaster> getGlAcTypeStsCode(String status,String type, String code){
		return repoAcMst.findByglamacstatusAndGlamactypeAndGlamaccodeContaining(status, type, code);
	}
	
	public List<GlAcMaster> getGlAcTypeStsDesc(String status,String type, String desc){
		return repoAcMst.findByglamacstatusAndGlamactypeAndGlamacdescContaining(status, type, desc);
	}
	
	public List<GlAcMaster> getGlAcTypeStsDesc2(String status,String type, String desc2){
		return repoAcMst.findByglamacstatusAndGlamactypeAndGlamacdesc2Containing(status, type, desc2);
	}
	
	public List<GlAcMaster> getGlByAcCode(String code){
		return repoAcMst.findByglamaccodeContaining(code);
	}
	
	public List<GlAcMaster> getGlByAcCodeSts(String status, String code){
		return repoAcMst.findByglamacstatusAndGlamaccodeContaining(status, code);
	}
	
	public List<GlAcMaster> getGlByAcDesc(String desc){
		return repoAcMst.findByglamacdescContaining(desc);
	}
	
	public List<GlAcMaster> getGlByAcDescSts(String status, String desc){
		return repoAcMst.findByglamacstatusAndGlamacdescContaining(status, desc);
	}
	
	public List<GlAcMaster> getGlByAcDesc2(String desc2){
		return repoAcMst.findByglamacdesc2Containing(desc2);
	}
	
	public List<GlAcMaster> getGlByAcDesc2Sts(String status, String desc2){
		return repoAcMst.findByglamacstatusAndGlamacdesc2Containing(status, desc2);
	}
	
	public Optional<GlAcMaster> getAcCode(String code){
	    return repoAcMst.findByglamaccode(code);
	}
	
	public String getAccDesc(String code) {
		return repoAcMst.getMstAccDesc(code);
	}
	
	public String saveUpdateAcMaster(GlAcMaster acmaster) {
		repoAcMst.save(acmaster);
		return "Submit Successfully";
	}

}

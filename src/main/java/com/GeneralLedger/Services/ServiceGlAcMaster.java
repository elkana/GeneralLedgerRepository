package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlAcMaster;
import com.GeneralLedger.Models.GlTypeMaster;
import com.GeneralLedger.Repository.IGlAcMasterRepository;

@Service
public class ServiceGlAcMaster {
	@Autowired
	IGlAcMasterRepository repoAcMst;
	
	public List<GlAcMaster> getGlAcMaster(){
		return repoAcMst.findAll();
	}
	
	public Optional<GlAcMaster> getAcCode(String code){
	    return repoAcMst.findByglamaccode(code);
	}
	
	public String saveUpdateAcMaster(GlAcMaster acmaster) {
		repoAcMst.save(acmaster);
		return "Submit Successfully";
	}

}

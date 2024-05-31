package com.GeneralLedger.Services;

import java.util.List;

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

}

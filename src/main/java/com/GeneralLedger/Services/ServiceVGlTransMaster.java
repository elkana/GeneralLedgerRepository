package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.VGlTransMaster;
import com.GeneralLedger.Repository.IVGlTransMasterRepository;


@Service
public class ServiceVGlTransMaster {

	@Autowired
	IVGlTransMasterRepository repoVgtm;
	
	public List<VGlTransMaster> GgtVTransList(){
		return repoVgtm.findAll();
	}
	
	public Optional<VGlTransMaster> GgtVTransCU(String reffNo){
		return repoVgtm.findByVgtmRef(reffNo);
	}
	
	public List<VGlTransMaster> getRefNoList(String refno){
		return repoVgtm.findByvgtmRef(refno);
	}
	
	
}

package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlCcdDetail;
import com.GeneralLedger.Repository.IGlCcdDetailRepository;

@Service
public class ServiceGlCcdDetail {
	
	@Autowired
	IGlCcdDetailRepository repoGlCcdDtl;
	
	public List<GlCcdDetail> getGlCcdDetailList(){
		return repoGlCcdDtl.findAll();
	}
	
	public List<GlCcdDetail> getGlCcdDtlByCode(String ccdCode){
		return repoGlCcdDtl.findByglCcDtlCode(ccdCode);
	}
		
	public String saveUpdateGlCcdDetail(GlCcdDetail ccdCs) {
		repoGlCcdDtl.save(ccdCs);
		return "Submit Successfully";
	}

}

package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlPlDetail;
import com.GeneralLedger.Repository.IGlPlDetailRepository;

@Service
public class ServiceGlPlDetail {
	
	@Autowired
	IGlPlDetailRepository repoGlPlDetail;
	
	public List<GlPlDetail> getGlPlDetailList(){
		return repoGlPlDetail.findAll();
	}
	
	public List<GlPlDetail> getGlPlDetailCU(String glPlDtlSts){
		return repoGlPlDetail.findByGlPlDtlStatus(glPlDtlSts);
	}
	
	public String saveUpdateGlPlDetail(GlPlDetail plDtlCode) {
		repoGlPlDetail.save(plDtlCode);
		return "Submit Successfully";
	}

}

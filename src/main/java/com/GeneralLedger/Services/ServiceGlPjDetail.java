package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlPjDetail;
import com.GeneralLedger.Repository.IGlPjDetailRepository;

@Service
public class ServiceGlPjDetail {
	
	@Autowired
	IGlPjDetailRepository repoPjDetail;
	
	
	public List<GlPjDetail> getGlPjDtlCode(String code){
		return repoPjDetail.findByglPjDtlCode(code);
	}
	
	public Optional<GlPjDetail> getGlPjDtlCodeSeq(String code, Integer seq){
	    return repoPjDetail.findByglPjDtlCodeAndGlPjDtlSeqNo(code, seq);
	}
	
	public String saveUpdatePjDetail(GlPjDetail pjdetail) {
		repoPjDetail.save(pjdetail);
		return "Submit Successfully";
	}
	
	public String getDelPjDetail(String code, Integer seq) {
		repoPjDetail.getDelPjDtl(code, seq);
		return "Delete Successfully";
	}

}

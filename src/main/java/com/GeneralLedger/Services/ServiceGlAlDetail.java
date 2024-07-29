package com.GeneralLedger.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlAlDetail;
import com.GeneralLedger.Repository.IGlAlDetailRepository;

@Service
public class ServiceGlAlDetail {
	@Autowired
	IGlAlDetailRepository repoGlAlDetail;
	
	public List<GlAlDetail> getGlAlDetailList(){
		return repoGlAlDetail.findAll();
	}
	
	public List<GlAlDetail> getGlAlDtlByCodeList(String glAlDtlCode){
		return repoGlAlDetail.findByGlAlDtlCode(glAlDtlCode);
	}
	
	public Optional<GlAlDetail> getGlAlDetailCU(String glAlDtlCode, Integer glAlDtlSeqNo){
		return repoGlAlDetail.findByGlAlDtlCodeAndGlAlDtlSeqNo(glAlDtlCode,glAlDtlSeqNo);
	}
		
	public String saveUpdateGlAlDetail(GlAlDetail alDtlCode) {
		repoGlAlDetail.save(alDtlCode);
		return "Submit Successfully";
	}
	
}

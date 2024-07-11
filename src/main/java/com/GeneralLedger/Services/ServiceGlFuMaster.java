package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlFuMaster;
import com.GeneralLedger.Repository.IGlFuMasterRepository;


@Service
public class ServiceGlFuMaster {
	
	@Autowired
	IGlFuMasterRepository repoFuMaster;
	
	public List<GlFuMaster> getGlFuMaster(){
		return repoFuMaster.findAll();
	}
	
	public List<GlFuMaster> getGlFuStatus(String status,Integer Seqno){
		return repoFuMaster.findByglFuStatusAndGlFuSeq(status, Seqno);
	}
	
	public List<GlFuMaster> getGlCodeFu(String code){
		return repoFuMaster.findByglFuCodeContaining(code);
	}
	
	public List<GlFuMaster> getGlDescFu(String desc){
		return repoFuMaster.findByglFuDescContaining(desc);
	}
	
	public List<GlFuMaster> getGlStsFu(String status){
		return repoFuMaster.findByglFuStatus(status);
	}
	
	public String saveUpdateFuMaster(GlFuMaster fumaster) {
		repoFuMaster.save(fumaster);
		return "Submit Successfully";
	}
	
	public Optional<GlFuMaster> getFuSeqNo(Integer seq){
	    return repoFuMaster.findByglFuSeq(seq);
	}
	
	public String getMstFuDesc(String code) {
		return repoFuMaster.getMstFuDesc(code);
	}
	
	public String DelFuMasterById(Integer Seq) {
		repoFuMaster.deleteById(Seq);
		return "Delete Successfully";
	}

}

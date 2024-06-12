package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlGltDet;
import com.GeneralLedger.Models.GlTypeMaster;
import com.GeneralLedger.Repository.IGlGltDtailRepository;


@Service
public class ServiceGlGltDetail {
	@Autowired
	IGlGltDtailRepository repoGltDtl;
	
	public List<GlGltDet> getJournalMstList(String reffNo){
		return repoGltDtl.findByGlGltDtlRef(reffNo);
	}
	
	
	public String saveUpdateJournal(GlGltDet glt) {
		repoGltDtl.save(glt);
		return "Submit Successfully";
	}
	
	public String execPostJuournal(String p_reffno, String msg) {
		return repoGltDtl.runPostJournal(p_reffno, msg);
		
	}
}

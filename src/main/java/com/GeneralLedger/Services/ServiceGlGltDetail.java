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
	
	public Optional<GlGltDet> getJournalMstCu(String reffNo){
		return repoGltDtl.findByGlGltDtlRef(reffNo);
	}
	
	public List<GlGltDet> getJournalMstList(){
		return repoGltDtl.findAll();
	}
	
	public String saveUpdateJournal(GlGltDet glt) {
		repoGltDtl.save(glt);
		return "Submit Successfully";
	}
}

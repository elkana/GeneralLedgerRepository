package com.GeneralLedger.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlGltDet;
import com.GeneralLedger.Repository.IGlGltDtailRepository;


@Service
public class ServiceGlGltDetail {
	@Autowired
	IGlGltDtailRepository repoGltDtl;
	
	public List<GlGltDet> getJournalMstCu(String reffNo){
		return repoGltDtl.findByGlGltDtlRef(reffNo);
	}
}

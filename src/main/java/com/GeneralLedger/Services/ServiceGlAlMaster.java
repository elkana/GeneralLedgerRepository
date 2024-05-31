package com.GeneralLedger.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.GeneralLedger.Models.GlAlMaster;
import com.GeneralLedger.Repository.IGlAlMasterRepository;



@Service
public class ServiceGlAlMaster {
	@Autowired
	IGlAlMasterRepository repoGlAlMaster;
	
	public List<GlAlMaster> getGlAlMaster(String alcode){
		return repoGlAlMaster.findAll();
	}

}

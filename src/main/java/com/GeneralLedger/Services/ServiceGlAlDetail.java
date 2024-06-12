package com.GeneralLedger.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.GeneralLedger.Models.GlAlDetail;
import com.GeneralLedger.Repository.IGlAlDetailRepository;

@Service
public class ServiceGlAlDetail {
	@Autowired
	IGlAlDetailRepository repoGlAlDetail;
	
	public List<GlAlDetail> getGlAlDetail(String alcodemsdtl){
		return repoGlAlDetail.findAll();
	}
	
}

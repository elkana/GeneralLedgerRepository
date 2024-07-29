package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import com.GeneralLedger.Models.GlAlDetail;
import com.GeneralLedger.Services.ServiceGlAlDetail;

@RestController
public class ControllerGlAlDetail {
	
	@Autowired
	ServiceGlAlDetail servGlAlDetail;
	
	@GetMapping("/GeneralLedger/getglaldetaillist")
	public List<GlAlDetail> getGlAlDetailList(){
		return servGlAlDetail.getGlAlDetailList();
	}
	
	@GetMapping("/GeneralLedger/getglaldtlbycodelist")
	public List<GlAlDetail> getGlAlDtlByCodeList(String glAlDtlCode){
		return servGlAlDetail.getGlAlDtlByCodeList(glAlDtlCode);
	}
	
	@GetMapping("/GeneralLedger/getglaldetailcu")
	public Optional<GlAlDetail> getGlAlDetailCU(String glAlDtlCode, Integer glAlDtlSeqNo){
		return servGlAlDetail.getGlAlDetailCU(glAlDtlCode, glAlDtlSeqNo);
	}
	
	@PostMapping("/GeneralLedger/saveupdglaldetail")
	public String saveUpdateGlAlDetail(@RequestBody GlAlDetail alDtlCode) {
		return servGlAlDetail.saveUpdateGlAlDetail(alDtlCode);	
	}	
	
}

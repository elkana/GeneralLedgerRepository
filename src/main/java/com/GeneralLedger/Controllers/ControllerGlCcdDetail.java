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

import com.GeneralLedger.Models.GlCcMaster;
import com.GeneralLedger.Models.GlCcdDetail;
import com.GeneralLedger.Services.ServiceGlCcdDetail;

@RestController
public class ControllerGlCcdDetail {
	
	@Autowired
	ServiceGlCcdDetail servGlCcdDtl;
	
	@GetMapping("/GeneralLedger/getglccdetaillist")
	public List<GlCcdDetail> getGlCcdDetailList(){
		return servGlCcdDtl.getGlCcdDetailList();
	}
	
	@GetMapping("/GeneralLedger/getglccdetailbycode")
	public List<GlCcdDetail> getGlCcdDtlByCode(String ccdCode){
		return servGlCcdDtl.getGlCcdDtlByCode(ccdCode);
	}
	
	@PostMapping("/GeneralLedger/saveupdglccdetail")
	public String saveUpdateGlCcdDetail(@RequestBody GlCcdDetail ccdCs) {
		return servGlCcdDtl.saveUpdateGlCcdDetail(ccdCs);
	
	}		
	
}

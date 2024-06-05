package com.GeneralLedger.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlGltDet;
import com.GeneralLedger.Services.ServiceGlGltDetail;


@RestController
public class ControllerGlGltDetail {
	@Autowired
	ServiceGlGltDetail servGltDtl;
	
	@GetMapping("/journal/getjournalcu")
	public List<GlGltDet> getJournalMstCu(String reffNo){
		return servGltDtl.getJournalMstCu(reffNo);
	}
}

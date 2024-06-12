package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlGltDet;
import com.GeneralLedger.Models.GlTypeMaster;
import com.GeneralLedger.Services.ServiceGlGltDetail;


@RestController
public class ControllerGlGltDetail {
	@Autowired
	ServiceGlGltDetail servGltDtl;
	
	@GetMapping("/journal/getjournallist")
	public List<GlGltDet> getJournalMstCu(String reffNo){
		return servGltDtl.getJournalMstList(reffNo);
	}
	
	
	@GetMapping("/journal/execpostjournal")
	public String execPostJuournal(String p_reffno,  String msg) {
		return servGltDtl.execPostJuournal(p_reffno, msg) ;
	}

	
	@PostMapping("/journal/saveupdjournal")
	public String saveUpdateProduksi(@RequestBody GlGltDet glt) {
		return servGltDtl.saveUpdateJournal(glt);	
	}
	
}

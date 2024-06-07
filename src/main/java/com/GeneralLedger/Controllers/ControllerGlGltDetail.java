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
	
	@GetMapping("/journal/getjournalcu")
	public Optional<GlGltDet> getJournalMstCu(String reffNo){
		return servGltDtl.getJournalMstCu(reffNo);
	}
	
	@GetMapping("/journal/getjournallist")
	public List<GlGltDet> getJournalMstList(){
		return servGltDtl.getJournalMstList();
	}
	
	@PostMapping("/journal/saveupdjournal")
	public String saveUpdateProduksi(@RequestBody GlGltDet glt) {
		return servGltDtl.saveUpdateJournal(glt);
	
	}
}

package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlFuDetail;
import com.GeneralLedger.Models.GlPjDetail;
import com.GeneralLedger.Services.ServiceGlFuDetail;
import com.GeneralLedger.Services.ServiceGlPjDetail;

@RestController
public class ControllerGlPjDetail {
	
	@Autowired
	ServiceGlPjDetail servPjDetail;
	
	@GetMapping("/GeneralLedger/getglpjdtllist")
	public List<GlPjDetail> getPjDtlCode(String code){
		return servPjDetail.getGlPjDtlCode(code);
	}
	
	@GetMapping("/GeneralLedger/getpjdtlsingle")
	public Optional<GlPjDetail> getPjDtlCodeSeq(String code, Integer seq) {
		return servPjDetail.getGlPjDtlCodeSeq(code, seq);
	}
	
	@PostMapping("/GeneralLedger/saveupdpjdetail")
	public String saveUpdateFuMaster(@RequestBody GlPjDetail pjdetail) {
		return servPjDetail.saveUpdatePjDetail(pjdetail);
	
	}
	
	@GetMapping("/GeneralLedger/deletepjdtlsingle")
	public String getDelPjDtl(String code, Integer seq) {
		servPjDetail.getDelPjDetail(code, seq);
		return "Delete Successfully";
	}

}

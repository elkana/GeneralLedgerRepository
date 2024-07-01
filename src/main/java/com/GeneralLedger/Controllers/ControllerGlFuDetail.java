package com.GeneralLedger.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.GeneralLedger.Models.GlFuDetail;
import com.GeneralLedger.Services.ServiceGlFuDetail;

@RestController
public class ControllerGlFuDetail {
	
	@Autowired
	ServiceGlFuDetail servFuDetail;
	
	@GetMapping("/GeneralLedger/getglfudtllist")
	public List<GlFuDetail> getFuDtlSeqCode(Integer mstseq, String code){
		return servFuDetail.getGlFuDtlSeqCode(mstseq, code);
	}
	
	@GetMapping("/GeneralLedger/getfudtlsingle")
	public Optional<GlFuDetail> getFuDtlSeqNo(Integer mstseq, Integer dtlseq) {
		return servFuDetail.getGlFuDtlSeqNo(mstseq, dtlseq);
	}
	
	@PostMapping("/GeneralLedger/saveupdfudetail")
	public String saveUpdateFuMaster(@RequestBody GlFuDetail fudetail) {
		return servFuDetail.saveUpdateFuDetail(fudetail);
	
	}
	
	@GetMapping("/GeneralLedger/deletefudtlsingle")
	public String getDelFuDtl(Integer mstseq, Integer dtlseq) {
		servFuDetail.getDelFuDetail(mstseq, dtlseq);
		return "Delete Successfully";
	}
	

}

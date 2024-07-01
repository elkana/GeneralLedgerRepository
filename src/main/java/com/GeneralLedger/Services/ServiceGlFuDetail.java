package com.GeneralLedger.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GeneralLedger.Models.GlFuDetail;
import com.GeneralLedger.Repository.IGlFuDetailRepository;

@Service
public class ServiceGlFuDetail {
	
	@Autowired
	IGlFuDetailRepository repoFuDetail;
	
	
	public List<GlFuDetail> getGlFuDtlSeqCode(Integer mstseq, String code){
		return repoFuDetail.findByglFuSeqMstDetAndGlFuCodeDet(mstseq, code);
	}
	
	public Optional<GlFuDetail> getGlFuDtlSeqNo(Integer mstseq, Integer dtlseq){
	    return repoFuDetail.findByglFuSeqMstDetAndGlFuSeqDet(mstseq, dtlseq);
	}
	
	public String saveUpdateFuDetail(GlFuDetail fudetail) {
		repoFuDetail.save(fudetail);
		return "Submit Successfully";
	}
	
	public String getDelFuDetail(Integer mstseq, Integer dtlseq) {
		repoFuDetail.getDelFuDtl(mstseq, dtlseq);
		return "Delete Successfully";
	}
	
	/*public String DelFuDetailById(Integer mstseq, Integer dtlseq) {
		repoFuDetail.deleteById(null);
		return "Delete Successfully";
	}*/

}

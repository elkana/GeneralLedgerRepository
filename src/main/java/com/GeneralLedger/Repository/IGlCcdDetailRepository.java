package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlCcdDetail;
import com.GeneralLedger.Models.GlCcdDetailCompKey;

@Repository
public interface IGlCcdDetailRepository extends JpaRepository<GlCcdDetail,GlCcdDetailCompKey>{
	
	public List<GlCcdDetail> findByglCcDtlCode(String ccdCode);
	
	public Optional<GlCcdDetail> findByglCcDtlCodeAndGlCcDtlSeqNo(String ccdCode, Integer ccdSeq);

}

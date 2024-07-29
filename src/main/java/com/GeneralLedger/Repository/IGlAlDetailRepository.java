package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlAlDetail;
import com.GeneralLedger.Models.GlAlDetailCompKey;


public interface IGlAlDetailRepository extends JpaRepository<GlAlDetail,GlAlDetailCompKey>{
	
	public List<GlAlDetail> findByGlAlDtlCode(String glAlDtlCode);
	
	public Optional<GlAlDetail> findByGlAlDtlCodeAndGlAlDtlSeqNo(String glAlDtlCode, Integer glAlDtlSeqNo);

}

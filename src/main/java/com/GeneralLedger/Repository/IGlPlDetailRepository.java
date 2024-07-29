package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlPlDetail;
import com.GeneralLedger.Models.GlPlDetailCompKey;

@Repository
public interface IGlPlDetailRepository extends JpaRepository<GlPlDetail, GlPlDetailCompKey>{
	
	public List<GlPlDetail> findByGlPlDtlCode(String glPlDtlCode);
	
	public Optional<GlPlDetail> findByGlPlDtlCodeAndGlPlDtlTypeAndGlPlDtlAcc(String glPlDtlCode, String glPlDtlType, String glPlDtlAcc);

}

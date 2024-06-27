package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlPjDetail;
import com.GeneralLedger.Models.GlPjDetailCompKey;

@Repository
public interface IGlPjDetailRepository extends JpaRepository<GlPjDetail, GlPjDetailCompKey> {
	
    List<GlPjDetail> findByglPjDtlCode(String code);
	
	Optional<GlPjDetail> findByglPjDtlCodeAndGlPjDtlSeqNo(String code, Integer seq);

}

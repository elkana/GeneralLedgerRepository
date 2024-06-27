package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlFuDetail;
import com.GeneralLedger.Models.GlFuDetailCompKey;

@Repository
public interface IGlFuDetailRepository extends JpaRepository<GlFuDetail,GlFuDetailCompKey> {
	
	List<GlFuDetail> findByglFuSeqMstDetAndGlFuCodeDet(Integer mstseq, String code);
	
	Optional<GlFuDetail> findByglFuSeqMstDetAndGlFuSeqDet(Integer mstseq, Integer dtlseq);
	
}

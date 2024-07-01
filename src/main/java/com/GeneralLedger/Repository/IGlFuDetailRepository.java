package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlFuDetail;
import com.GeneralLedger.Models.GlFuDetailCompKey;

import jakarta.transaction.Transactional;

@Repository
public interface IGlFuDetailRepository extends JpaRepository<GlFuDetail,GlFuDetailCompKey> {
	
	List<GlFuDetail> findByglFuSeqMstDetAndGlFuCodeDet(Integer mstseq, String code);
	
	Optional<GlFuDetail> findByglFuSeqMstDetAndGlFuSeqDet(Integer mstseq, Integer dtlseq);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM gl_fu_det s WHERE s.fu_seq = ?1 AND s.fud_seq_det = ?2",nativeQuery = true)
    int getDelFuDtl(Integer mstseq, Integer dtlseq);
	
	
}

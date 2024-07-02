package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlPjDetail;
import com.GeneralLedger.Models.GlPjDetailCompKey;

import jakarta.transaction.Transactional;

@Repository
public interface IGlPjDetailRepository extends JpaRepository<GlPjDetail, GlPjDetailCompKey> {
	
    List<GlPjDetail> findByglPjDtlCode(String code);
	
	Optional<GlPjDetail> findByglPjDtlCodeAndGlPjDtlSeqNo(String code, Integer seq);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM gl_pj_det s WHERE s.pj_code = ?1 AND s.pjd_seq = ?2",nativeQuery = true)
    int getDelPjDtl(String code, Integer seq);

}

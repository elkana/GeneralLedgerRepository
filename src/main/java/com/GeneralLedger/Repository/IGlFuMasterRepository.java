package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlFuMaster;

@Repository
public interface IGlFuMasterRepository extends JpaRepository<GlFuMaster, Integer> {
	
	Optional<GlFuMaster> findByglFuSeq(Integer seq);
	
	List<GlFuMaster> findByglFuStatusAndGlFuSeq(String status,Integer Seqno);

}

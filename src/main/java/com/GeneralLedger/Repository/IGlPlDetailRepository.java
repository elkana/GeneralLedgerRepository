package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlPlDetail;

@Repository
public interface IGlPlDetailRepository extends JpaRepository<GlPlDetail, String>{
	
	public List<GlPlDetail> findByGlPlDtlStatus(String glPlDtlSts); 

}

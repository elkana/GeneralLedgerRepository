package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlPlMaster;

@Repository
public interface IGlPlMasterRepository extends JpaRepository<GlPlMaster, String>{
	
	public List<GlPlMaster> findByGlPlCode(String plCode);
	
	public List<GlPlMaster> findByGlPlStatus(String glPlSts); 
	
	@Query("select s.glPlDesc from GlPlMaster s where s.glPlCode=?1")
	public String getGlPlMstDesc(String glPlCode);

}

package com.GeneralLedger.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlCcMaster;

@Repository
public interface IGlCcMasterRepository extends JpaRepository<GlCcMaster, String>{
	
	public List<GlCcMaster> findByGlCcCode(String ccCode);
	
	public List<GlCcMaster> findByGlCcStatus(String glCcSts);
	
	@Query("select s.glCcDesc from GlCcMaster s where s.glCcCode=?1")
	public String getGlCcMstDesc(String glCcCode);

}

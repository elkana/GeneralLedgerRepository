package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlCcMaster;

@Repository
public interface IGlCcMasterRepository extends JpaRepository<GlCcMaster, String>{
	
	Optional<GlCcMaster> findByGlCcCode(String ccCode);
	
	public List<GlCcMaster> findByGlCcStatus(String glCcSts);
	
	public List<GlCcMaster> findByGlCcCodeContaining(String code);
	
	public List<GlCcMaster> findByGlCcStatusAndGlCcCodeContaining(String status, String code);
	
	public List<GlCcMaster> findByGlCcDescContaining(String desc);
	
	public List<GlCcMaster> findByGlCcStatusAndGlCcDescContaining(String status, String desc);
	
	@Query("select s.glCcDesc from GlCcMaster s where s.glCcCode=?1")
	public String getGlCcMstDesc(String glCcCode);

}

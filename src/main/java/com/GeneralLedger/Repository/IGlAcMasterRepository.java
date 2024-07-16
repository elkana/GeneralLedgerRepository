package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlAcMaster;

@Repository
public interface IGlAcMasterRepository extends JpaRepository<GlAcMaster, String> {
	
	Optional<GlAcMaster> findByglamaccode(String code);
	
	List<GlAcMaster> findByglamacstatus(String status);
	
	List<GlAcMaster> findByglamaccodeContaining(String code);
	
	List<GlAcMaster> findByglamacstatusAndGlamaccodeContaining(String status, String code);
	
	List<GlAcMaster> findByglamacdescContaining(String desc);
	
	List<GlAcMaster> findByglamacstatusAndGlamacdescContaining(String status, String desc);
	
	List<GlAcMaster> findByglamacdesc2Containing(String desc2);
	
	List<GlAcMaster> findByglamacstatusAndGlamacdesc2Containing(String status, String desc2);
    
	@Query("select s.glamacdesc from GlAcMaster s where s.glamaccode=?1")
	public String getMstAccDesc(String code);
}

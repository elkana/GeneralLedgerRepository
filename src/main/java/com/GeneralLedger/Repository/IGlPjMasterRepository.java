package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlPjMaster;

@Repository
public interface IGlPjMasterRepository extends JpaRepository<GlPjMaster, String> {
	
    Optional<GlPjMaster> findByglPjCode(String code);
	
	List<GlPjMaster> findByglPjStatus(String status);
	
	@Query("select s.glPjDesc from GlPjMaster s where s.glPjCode=?1")
	public String getMstPjDesc(String code);

}

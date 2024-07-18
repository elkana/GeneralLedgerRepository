package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlPjMaster;

import jakarta.transaction.Transactional;

@Repository
public interface IGlPjMasterRepository extends JpaRepository<GlPjMaster, String> {
	
    Optional<GlPjMaster> findByglPjCode(String code);
	
	List<GlPjMaster> findByglPjStatus(String status);
	
	List<GlPjMaster> findByglPjCodeContaining(String code);
	
	List<GlPjMaster> findByglPjStatusAndGlPjCodeContaining(String status, String code);
	
	List<GlPjMaster> findByglPjDescContaining(String desc);
	
	List<GlPjMaster> findByglPjStatusAndGlPjDescContaining(String status, String desc);
	
	@Transactional
	@Modifying
	@Query(value="SELECT * FROM GL_PJ_MSTR s WHERE TO_CHAR(PJ_START,'DD/MM/YYYY')=?1", nativeQuery = true )
	public List<GlPjMaster> getByPjStartList (String dt);
	
	@Query(value="SELECT * FROM GL_PJ_MSTR s WHERE TO_CHAR(PJ_END,'DD/MM/YYYY')=?1", nativeQuery = true )
	public List<GlPjMaster> getByPjEndList (String dt);
	
	@Query("select s.glPjDesc from GlPjMaster s where s.glPjCode=?1")
	public String getMstPjDesc(String code);
	

}

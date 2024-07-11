package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlTypeMaster;

import jakarta.transaction.Transactional;

@Repository
public interface IGlTypeMaster extends JpaRepository<GlTypeMaster, String>{
	
	Optional<GlTypeMaster> findBygltmtypecode(String code);
	
	List<GlTypeMaster> findBygltmacstatus(String status);
	
	List<GlTypeMaster> findBygltmtypecodeContaining(String code);
	
	List<GlTypeMaster> findByGltmtypedescContaining(String desc);
    
	@Query("select s.gltmtypedesc from GlTypeMaster s where s.gltmtypecode=?1")
	public String getMstTypeDesc(String code);
	
	@Transactional
	@Modifying
	@Query(value = "DELETE FROM GL_TYPE_MSTR S WHERE S.TYPE_CODE=?1",nativeQuery = true)
    int getDelByTypeCode(String code);

}

package com.GeneralLedger.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlTypeMaster;

@Repository
public interface IGlTypeMaster extends JpaRepository<GlTypeMaster, String>{
	
	Optional<GlTypeMaster> findBygltmtypecode(String code);
	
	/*@Query(value = "delete from gl_type_mstr S WHERE type_code=?1",nativeQuery = true)
    int getDelByTypeCode(String code);*/
	
	@Query(value = "DELETE FROM GL_TYPE_MSTR S WHERE S.TYPE_CODE=?1",nativeQuery = true)
    int getDelByTypeCode(String code);

}

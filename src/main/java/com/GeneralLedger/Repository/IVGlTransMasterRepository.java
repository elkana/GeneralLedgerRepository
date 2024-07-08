package com.GeneralLedger.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlFuMaster;
import com.GeneralLedger.Models.GlGltDet;
import com.GeneralLedger.Models.VGlTransMaster;

@Repository
public interface IVGlTransMasterRepository extends JpaRepository<VGlTransMaster, String>{
	
	public Optional<VGlTransMaster> findByVgtmRef(String reffNo);
	
	public List<VGlTransMaster> findByvgtmRef(String refno);
	
	@Query(value="SELECT * FROM V_GL_TRANS_MASTER s WHERE TO_CHAR(VGTM_GL_DATE,'DD/MM/YYYY')=:dt", nativeQuery = true )
	public List<VGlTransMaster> getbydateList (String dt);
	

}

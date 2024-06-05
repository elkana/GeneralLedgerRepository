package com.GeneralLedger.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlFuMaster;
import com.GeneralLedger.Models.GlGltDet;
import com.GeneralLedger.Models.VGlTransMaster;

@Repository
public interface IVGlTransMasterRepository extends JpaRepository<VGlTransMaster, String>{
	
	public List<VGlTransMaster> findByVgtmRef(String reffNo);
	

}

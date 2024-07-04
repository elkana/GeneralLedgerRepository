package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlSacMaster;
import com.GeneralLedger.Models.GlSacMasterCompKey;
import com.GeneralLedger.Models.GlTypeMaster;

@Repository
public interface IGlSacMaster extends JpaRepository<GlSacMaster, GlSacMasterCompKey> {
	
	Optional<GlSacMaster> findByglsmsacaccAndGlsmsacsub(String acc,String subacc);
	
	List<GlSacMaster> findByglsmacstatus(String status);

}

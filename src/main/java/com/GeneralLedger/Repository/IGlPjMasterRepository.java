package com.GeneralLedger.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlPjMaster;

@Repository
public interface IGlPjMasterRepository extends JpaRepository<GlPjMaster, String> {
	
    Optional<GlPjMaster> findByglPjCode(String code);
	
	List<GlPjMaster> findByglPjStatus(String status);

}

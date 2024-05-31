package com.GeneralLedger.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlAcMaster;

@Repository
public interface IGlAcMasterRepository extends JpaRepository<GlAcMaster, String> {

}

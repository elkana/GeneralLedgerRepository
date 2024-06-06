package com.GeneralLedger.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlFmMaster;

@Repository
public interface IGlFmMaster extends JpaRepository<GlFmMaster, String>{

}

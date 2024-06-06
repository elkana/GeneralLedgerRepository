package com.GeneralLedger.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlSacMaster;

@Repository
public interface IGlSacMaster extends JpaRepository<GlSacMaster, String> {

}

package com.GeneralLedger.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlAlMaster;


@Repository
public interface IGlAlMasterRepository extends JpaRepository<GlAlMaster, String> {

}

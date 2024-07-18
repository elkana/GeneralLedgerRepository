package com.GeneralLedger.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlFmMaster;
import com.GeneralLedger.Models.GlFmReport;

@Repository
public interface IGlFmReportRepository extends JpaRepository<GlFmReport, BigDecimal> {

	
	
}

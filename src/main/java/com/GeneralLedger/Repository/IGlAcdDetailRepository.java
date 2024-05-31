package com.GeneralLedger.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlAcdDetail;
import com.GeneralLedger.Models.GlAcdDetailCompKey;
import com.GeneralLedger.Models.GlAcdReport;
import com.GeneralLedger.Models.GlAcdReportCompKey;

@Repository
public interface IGlAcdDetailRepository extends JpaRepository<GlAcdDetail,GlAcdDetailCompKey> {

}

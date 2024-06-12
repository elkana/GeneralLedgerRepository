package com.GeneralLedger.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlGltDet;


@Repository
public interface IGlGltDtailRepository extends JpaRepository<GlGltDet,String> {

		public List<GlGltDet> findByGlGltDtlRef(String reffno);
		
		@Procedure(procedureName = "P_POST_JOURNAL")
		public String runPostJournal(String p_reffno, String msg);	
}


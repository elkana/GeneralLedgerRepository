package com.GeneralLedger.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlGltDet;


@Repository
public interface IGlGltDtailRepository extends JpaRepository<GlGltDet,String> {

		public List<GlGltDet> findByGlGltDtlRef(String reffno);
}


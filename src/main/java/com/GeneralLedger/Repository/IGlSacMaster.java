package com.GeneralLedger.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GeneralLedger.Models.GlSacMaster;

@Repository
public interface IGlSacMaster extends JpaRepository<GlSacMaster, String> {
	
	Optional<GlSacMaster> findByglsmsacacc(String acc);

}

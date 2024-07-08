package com.GeneralLedger.Controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event.ID;

import com.GeneralLedger.Models.VGlTransMaster;
import com.GeneralLedger.Services.ServiceVGlTransMaster;


@RestController
public class ControllerVGlTransMaster {	
	@Autowired
	ServiceVGlTransMaster servVgtm;
	
	@GetMapping("/vgtm/getlistall")
	public List<VGlTransMaster> GgtVTransList(){
		return servVgtm.GgtVTransList();
	}
	
	@GetMapping("/vgtm/getlistcu")
	public Optional<VGlTransMaster> GgtVTransCU(String reffNo){
		return servVgtm.GgtVTransCU(reffNo);
	}
	
	@GetMapping("/vgtm/getRefNoList")
	public List<VGlTransMaster> getRefNoList(String refno){
		return servVgtm.getRefNoList(refno);
	}
	
	@GetMapping("/vgtm/getbydateList")
	public List<VGlTransMaster> getByDateist(String dt){
		return servVgtm.getByDateList(dt);
	}

}

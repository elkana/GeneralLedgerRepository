package Controllers;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Services.ServiceGlAcMaster;

import java.util.List;

@RestController
public class ControllerGlAcMaster {
	@Autowired
	ServiceGlAcMaster servGlAcMst;
	
	@GetMapping("/glac/test123")
	public String getTest() {
		return servGlAcMst.getTest();
	}
	
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Models.GlAcMaster;
import Services.ServiceGlAcMaster;

@RestController
public class ControllerGlAcMaster {
	
	@Autowired
	ServiceGlAcMaster Servglam;
	
	@GetMapping("/getacmasterall")
	public List<GlAcMaster> getBaseQueryVis(){
		return Servglam.getAcMasterAll();		
	}

>>>>>>> 7a6d038cbec5e61b6e48b2997df46500c965bf09
}

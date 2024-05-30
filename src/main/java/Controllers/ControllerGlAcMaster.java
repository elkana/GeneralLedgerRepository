package Controllers;

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

}

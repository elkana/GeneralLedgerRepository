package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Models.GlAcMaster;
import Repository.IGlAcMasterRepository;

@Service
public class ServiceGlAcMaster {
	
	@Autowired
	IGlAcMasterRepository repoglam;
	
	public List<GlAcMaster> getAcMasterAll(){
		return repoglam.findAll();
	}

}

package Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.IGlAcMasterRepository;

import java.util.List;

@Service
public class ServiceGlAcMaster {
	@Autowired
	IGlAcMasterRepository repoGlAcMst;
	
	public String getTest() {
		return "test 13fsdfasdfsadfasdf";
	}

}

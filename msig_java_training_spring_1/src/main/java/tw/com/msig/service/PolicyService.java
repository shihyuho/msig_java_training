package tw.com.msig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tw.com.msig.dao.PolicyDao;
import tw.com.msig.entity.PolicyEntity;

public class PolicyService {
	
//	@Qualifier("policyDa")
	@Autowired
	private PolicyDao dao;

	public List<PolicyEntity> getAll() {
		//System.out.println("another: " + another());
		return dao.findAll();
	}
	
	public List<PolicyEntity> another() {
		return dao.findAll();
	}
	
//	public PolicyDao getDao() {
//		return dao;
//	}
//
//	public void setDao(PolicyDao dao) {
//		this.dao = dao;
//	}
	
	

}

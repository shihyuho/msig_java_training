package tw.com.msig.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import tw.com.msig.dao.PolicyDao;
import tw.com.msig.entity.Policy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Matt S.Y Ho
 */
public class PolicyService {

    @Autowired
    private PolicyDao dao;

    public List<Policy> getAll() {
        System.out.println("get all");
        List<Policy> all = new ArrayList<>();
        all.add(((PolicyService)AopContext.currentProxy()).generatePolicyNo("Matt"));
        return all;
    }

    public Policy generatePolicyNo(String applicantName) {
        System.out.println("generatePolicyNo");
        Policy policy = new Policy();
        policy.setApplicantName(applicantName);
        return policy;
    }


}

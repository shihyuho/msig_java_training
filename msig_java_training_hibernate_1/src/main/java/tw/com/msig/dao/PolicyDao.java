package tw.com.msig.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import tw.com.msig.entity.Policy;
import tw.com.msig.util.HibernateUtil;

import java.util.List;

/** @author Matt S.Y Ho */
public class PolicyDao {

  public List<Policy> findAll() {
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      return (List<Policy>) session.createQuery("from Policy").list();
    } finally {
      session.close();
    }
  }

  public void insert(Policy policy) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      session.beginTransaction();
      session.save(policy);
      session.getTransaction().commit();
    } catch (RuntimeException e) {
      session.getTransaction().rollback();
      throw e;
    } finally {
      session.close();
    }
  }

  public void delete(Policy policy) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      session.beginTransaction();
      session.delete(policy);
      session.getTransaction().commit();
    } catch (RuntimeException e) {
      session.getTransaction().rollback();
      throw e;
    } finally {
      session.close();
    }
  }

  public List<Policy> findByCondition(String policyNo, String applicantName) {
    Session session = HibernateUtil.getSessionFactory().openSession();
    try {
      Criteria criteria = session.createCriteria(Policy.class);
      if (policyNo != null && !policyNo.isEmpty()) {
        criteria = criteria.add(
                Restrictions.eq("policyNo", policyNo));
      }
      if (applicantName != null && !applicantName.isEmpty()) {
        criteria = criteria.add(
                Restrictions.like("applicantName",
                        applicantName + "%"));
      }
      return (List<Policy>) criteria.list();
    } finally {
      session.close();
    }
  }
}

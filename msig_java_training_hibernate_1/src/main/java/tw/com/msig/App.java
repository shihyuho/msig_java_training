package tw.com.msig;

import tw.com.msig.entity.Item;
import tw.com.msig.entity.Policy;
import tw.com.msig.service.PolicyService;
import tw.com.msig.util.HibernateUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** @author Matt S.Y Ho */
public class App {

  public static void main(String... args) {
    try {
      final PolicyService service = new PolicyService();

      System.out.println("initial policy count: " + service.getAll());

      Policy policy = new Policy();
      policy.setPolicyNo("0000ABC00099");
      policy.setApplicantName("Gary");

      Set<Item> items = new HashSet<>();

      Item item = new Item();
      item.setName("強制險");
      item.setCode("ABC");

      items.add(item);

      policy.setItems(items);

      service.insert(policy);

      //      for (Policy p : service.getAll()) {
      //        System.out.println(p);
      //      }

      List<Policy> policies =
          service.getByCondition(null, policy.getApplicantName());

      for (Policy p : policies) {
        System.out.println(p);
      }

      service.delete(policy);
    } finally {
      HibernateUtil.close();
    }
  }
}

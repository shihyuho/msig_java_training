package tw.com.msig;

import tw.com.msig.entity.Item;
import tw.com.msig.entity.Policy;
import tw.com.msig.service.PolicyService;
import tw.com.msig.util.HibernateUtil;

import java.util.HashSet;
import java.util.Set;

/** @author Matt S.Y Ho */
public class App {

  public static void main(String... args) {
    try {
      PolicyService service = new PolicyService();

      System.out.println("initial policy count: " + service.getAll());

      Policy policy = new Policy();
      policy.setPolicyNo("0000ABC00099");
      policy.setApplicantName("Gary");
      service.insert(policy);

      for (Policy p : service.getAll()) {
        System.out.println("inserted policy: " + p);
      }

      policy.setApplicantName("Gary Lee");
      Item item = new Item();
      item.setName("車體損失");
      Set<Item> items = new HashSet<>();
      items.add(item);
      policy.setItems(items);
      service.update(policy);

      System.out.println(
          "updated policy: "
              + service.getByCondition(policy.getPolicyNo(), policy.getApplicantName()));

      service.delete(policy);
    } finally {
      HibernateUtil.close();
    }
  }
}

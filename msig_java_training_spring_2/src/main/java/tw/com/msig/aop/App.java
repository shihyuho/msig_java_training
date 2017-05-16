package tw.com.msig.aop;

/**
 * @author Matt S.Y Ho
 */
public class App {

    public static void main(String... args) {
        System.out.println("====start====");

        Service service = new ServiceProxy();
        service.generatePolicyNo();

        System.out.println("====end====");
    }

}

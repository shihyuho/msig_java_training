package tw.com.msig.aop;

import java.util.Date;

/**
 * @author Matt S.Y Ho
 */
public class Service {

    public void generatePolicyNo() {
        System.out.println("policy no >>> " + new Date());
    }
}

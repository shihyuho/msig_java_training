package tw.com.msig.aop;

/**
 * @author Matt S.Y Ho
 */
public class TxManager {

    public void beginTx() {
        System.out.println("begin tx");
    }

    public void commitTx() {
        System.out.println("commit tx");
    }
}

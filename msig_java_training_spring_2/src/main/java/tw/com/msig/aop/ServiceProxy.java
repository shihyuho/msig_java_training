package tw.com.msig.aop;

/**
 * @author Matt S.Y Ho
 */
public class ServiceProxy extends Service {
    @Override
    public void generatePolicyNo() {
        TxManager manager = new TxManager();
        manager.beginTx();
        super.generatePolicyNo();
        manager.commitTx();
    }
}

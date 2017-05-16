package tw.com.msig.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class TxAOP {

	public Object handleTx(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Tx begin...");
		try {
			Object ret = joinPoint.proceed();
			System.out.println("commit");
			return ret;
		} catch (Throwable t) {
			System.out.println("rollback");
			throw t;
		}
	}

}

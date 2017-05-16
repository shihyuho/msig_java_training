package tw.com.msig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.com.msig.service.PolicyService;

public class App {

	public static void main(String[] args) {

		// 整理 import: ctrl + shift + o
		// 產生程式碼: alt + /
		// 自動排版: ctrl + shift + f

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml",
				"spring-dao.xml", "spring-service.xml");

		try {
			PolicyService service = context.getBean(PolicyService.class);
			System.out.println(service.getAll());
			System.out.println(service.another());
		} finally {
			context.close();
		}

	}

}

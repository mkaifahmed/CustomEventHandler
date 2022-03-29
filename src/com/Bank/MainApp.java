package com.Bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		 WithdrawlEventPublisher publisher = (WithdrawlEventPublisher) context.getBean("customEventPublisher");
		BankAccount acc1 = new SavingsAccount(101, "Kaif", 2000000);
		double withdraw=acc1.withdraw(300000);
		publisher.publish(withdraw,acc1);
	}

}

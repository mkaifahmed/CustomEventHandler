package com.Bank;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
public class WithdrawlEventPublisher implements ApplicationEventPublisherAware  {
	private ApplicationEventPublisher publisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
	}
	public void publish(double amount,  BankAccount acc1) {
		WithdrawlEvent event = new WithdrawlEvent(this,amount,acc1);
		this.publisher.publishEvent(event);
	}
}

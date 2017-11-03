package com.woyi.xjhub.common.job;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTaskDemo {

	//@Scheduled(cron="0/5 * * * * *")
	private void run() {
		System.out.println(new Date());
	}
	
}

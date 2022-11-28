package com.nh.fk.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 * 
 * Api: http://localhost:16100/nh-loan/swagger-ui.html
 * 
 * @author nhtc.soft
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class TbCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TbCloudApplication.class, args);
	}

}

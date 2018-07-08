package org.lsh.dubhe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 启动类；
 * 可以将此类放到其他包内，但须指定扫描路径
 * 如把此类放置在org.lsh.dubhe.runner包下：@SpringBootApplication(scanBasePackages = "org.lsh.dubhe")
 */
@SpringBootApplication
public class DubheApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubheApplication.class, args);
	}
}

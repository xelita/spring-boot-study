package com.xelita.study.spring.boot;

import com.xelita.study.spring.boot.domain.*;
import com.xelita.study.spring.boot.repository.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	@Value("${app.env}")
	private String env;

	@Value("${app.env.info}")
	private String envInfo;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

	// *************************************************************************
	//
	// Methods from CommandLineRunner interface
	//
	// *************************************************************************

	@Override
	public void run(String... strings) throws Exception {
		LOGGER.info("{}", this.envInfo);
		if ("dev".equalsIgnoreCase(this.env)) {
			this.userRepository.save(new User("user1@spring.io", "password1"));
			this.userRepository.save(new User("user2@spring.io", "password2"));
			this.userRepository.save(new User("user3@spring.io", "password3"));
		}
	}
}


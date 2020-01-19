package com.raksit.tryitgradletestsetsplugin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.PostgreSQLContainer;

@SpringBootTest
class TryitGradleTestsetsPluginIntegrationTests {

	@Test
	void someIntegrationTest() {
		try (PostgreSQLContainer<?> postgreSQLContainer = new PostgreSQLContainer<>()) {
			postgreSQLContainer.start();

			// do something with database
		}
	}

}

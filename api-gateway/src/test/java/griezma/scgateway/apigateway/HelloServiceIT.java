package griezma.scgateway.apigateway;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloServiceIT {
    @Autowired
    WebTestClient client;

    /* Note: Discovery server and Hello-Service must be running. */
    @Test
    void repliesHelloViaApiGateway() {
        client.get().uri("/hello/Foo").exchange()
                .expectStatus().isOk()
                .expectBody(String.class).isEqualTo("Hello Foo");
    }
}

package ahmed.com.helloworld;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HttpResponseTest {
    @LocalServerPort
    int port;
    private static RestTemplate restTemplate;
    @BeforeAll
    public static void init() {

        restTemplate = new RestTemplate();
    }

    @Test
    public void shouldPassIfStringMatches()
    {
        String result = restTemplate.getForObject("http://localhost:"+port+"/hello",String.class);
        assertEquals("Hello World", result);
    }
}

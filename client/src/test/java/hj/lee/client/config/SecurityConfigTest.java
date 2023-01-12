package hj.lee.client.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootTest
public class SecurityConfigTest {

    @Autowired
    private WebSecurityCustomizer webSecurityCustomizer;
    @Autowired
    private SecurityFilterChain securityFilterChain;

    @Test
    public void testSecurityConfig() {
        System.out.println("webSecurityCustomizer = " + webSecurityCustomizer);
        System.out.println("securityFilterChain = " + securityFilterChain);

    }
}

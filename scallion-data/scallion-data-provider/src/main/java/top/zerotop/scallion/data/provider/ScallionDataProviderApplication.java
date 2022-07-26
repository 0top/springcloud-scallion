package top.zerotop.scallion.data.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ScallionDataProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScallionDataProviderApplication.class, args);
    }

}

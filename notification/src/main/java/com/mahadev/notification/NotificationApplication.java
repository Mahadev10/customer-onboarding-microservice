package com.mahadev.notification;

import com.mahadev.amqp.RabbitMQMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(
        scanBasePackages = {
                "com.mahadev.notification",
                "com.mahadev.amqp"
        }
)
@EnableEurekaClient
public class NotificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class,args);
    }
//    @Bean
//    CommandLineRunner commandLineRunner(RabbitMQMessageProducer producer,NotificationConfig notificationConfig){
//        return args -> {
//            producer.publish(new Person("Messi",36),
//                    notificationConfig.getInternalExchange(),
//                    notificationConfig.getInternalNotificationRoutingKey()
//                    );
//        };
//
//    }
//    record Person(String name,int age){}
}

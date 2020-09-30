package com.fk.training.netflixeureka;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(NetflixEurekaApplication.class, args);
  }
  @Bean
  public Sampler defaultSampler(){
    return  Sampler.ALWAYS_SAMPLE;
  }
}

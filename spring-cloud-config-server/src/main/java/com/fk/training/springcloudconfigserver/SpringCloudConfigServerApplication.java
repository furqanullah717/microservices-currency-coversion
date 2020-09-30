package com.fk.training.springcloudconfigserver;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(SpringCloudConfigServerApplication.class, args);
  }
  @Bean
  public Sampler defaultSampler(){
    return  Sampler.ALWAYS_SAMPLE;
  }
}
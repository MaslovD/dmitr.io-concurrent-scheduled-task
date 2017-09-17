package io.dmitr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by dmaslov on 9/17/17.
 */
@Configuration

public class BeanConfig {
    @Bean
    public Executor taskScheduler() {
        return Executors.newScheduledThreadPool(5);
    }
}

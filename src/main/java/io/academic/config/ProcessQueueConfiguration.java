package io.academic.config;

import io.academic.dao.OaiDataProviderDao;
import io.academic.entity.OaiDataProvider;
import org.openarchives.oai._2.RecordType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

@Configuration
public class ProcessQueueConfiguration {

    @Bean
    ArrayBlockingQueue<List<RecordType>> recordListQueue() {
        return new ArrayBlockingQueue<>(20);
    }

    @Bean
    ArrayBlockingQueue<OaiDataProviderDao> oaiDataProviderQueue() {
        return new ArrayBlockingQueue<>(20);
    }

    @Bean
    ArrayBlockingQueue<String> urlQueue() {
        return new ArrayBlockingQueue<>(10);
    }
}

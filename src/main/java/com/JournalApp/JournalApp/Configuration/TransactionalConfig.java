package com.JournalApp.JournalApp.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class TransactionalConfig {
    @Bean
    public PlatformTransactionManager add(MongoDatabaseFactory databaseFactory){
        return new MongoTransactionManager(databaseFactory);
    }
}

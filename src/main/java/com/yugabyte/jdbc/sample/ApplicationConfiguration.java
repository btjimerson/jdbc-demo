package com.yugabyte.jdbc.sample;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableJdbcRepositories
public class ApplicationConfiguration extends AbstractJdbcConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "app.datasource")
    DataSource dataSource() {

        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }
}

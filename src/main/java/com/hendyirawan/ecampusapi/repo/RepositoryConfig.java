package com.hendyirawan.ecampusapi.repo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    /**
     * Expose ID field, see https://stackoverflow.com/a/25066565/122441
     * @param config
     */
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(
                MahasiswaRepository.class,
                BiodataMahasiswaRepository.class
        );
    }
}

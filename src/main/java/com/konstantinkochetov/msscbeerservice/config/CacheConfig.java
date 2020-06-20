package com.konstantinkochetov.msscbeerservice.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

// you can also put it into MsscBeerServiceApplication class
@EnableCaching
@Configuration
public class CacheConfig {
}

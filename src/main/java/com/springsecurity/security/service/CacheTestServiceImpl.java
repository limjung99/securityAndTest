package com.springsecurity.security.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.sql.Time;

@Service
public class CacheTestServiceImpl implements CacheTestService {
    @Override
    @Cacheable("time")
    public int checkTime(int id) throws InterruptedException {
        Thread.sleep(5000);
        return 1;
    }
}

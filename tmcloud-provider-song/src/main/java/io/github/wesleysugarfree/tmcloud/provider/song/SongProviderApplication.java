/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.song;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "io.github.wesleysugarfree.tmcloud")
@EnableEurekaClient
@MapperScan("io.github.wesleysugarfree.tmcloud.provider.song.dao.mapper")
public class SongProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SongProviderApplication.class, args);
    }
}

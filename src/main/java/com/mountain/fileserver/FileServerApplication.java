package com.mountain.fileserver;

import com.mountain.fileserver.config.MyBatisConfig;
import com.mountain.fileserver.config.WebMvcConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import(value = WebMvcConfig.class)
//@Import(value = MyBatisConfig.class)
@MapperScan("com.mountain.fileserver.dao")
public class FileServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileServerApplication.class, args);
    }

}

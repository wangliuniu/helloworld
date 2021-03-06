package com.spring.annotation;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by ASUS on 2019/2/28.
 *
 * 采用注解和Lombok 开发的Phone类
 */
@Component
@Data
public class Phone {
    @Value("iPhoneX")
    private String brand;
    @Value("6666")
    private double price;

}

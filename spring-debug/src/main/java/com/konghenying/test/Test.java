package com.konghenying.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: yingb
 * @date: Created in 2021/3/22 12:49
 * @modified By:
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");


    }
}

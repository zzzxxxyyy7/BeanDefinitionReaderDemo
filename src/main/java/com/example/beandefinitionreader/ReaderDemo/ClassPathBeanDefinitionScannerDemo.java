package com.example.beandefinitionreader.ReaderDemo;

import com.example.beandefinitionreader.Bean.MyController;
import com.example.beandefinitionreader.Bean.MyRepository;
import com.example.beandefinitionreader.Bean.MyService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

public class ClassPathBeanDefinitionScannerDemo {
    public static void main(String[] args) {
        // 创建一个 AnnotationConfigApplicationContext
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        // 创建 ClassPathBeanDefinitionScanner 并将其关联到容器
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(factory);

        // 使用 ClassPathBeanDefinitionScanner的scan方法扫描Bean对象
        scanner.scan("com.example.beandefinitionreader.Bean");

        System.out.println("MyController = " + factory.getBean(MyController.class));
        System.out.println("MyService = " + factory.getBean(MyService.class));
        System.out.println("MyRepository = " + factory.getBean(MyRepository.class));
    }
}

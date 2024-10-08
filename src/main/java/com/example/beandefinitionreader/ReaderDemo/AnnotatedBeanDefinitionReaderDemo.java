package com.example.beandefinitionreader.ReaderDemo;

import com.example.beandefinitionreader.Bean.MyBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;

public class AnnotatedBeanDefinitionReaderDemo {
    public static void main(String[] args) {
        // 创建一个 AnnotationConfigApplicationContext
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        // 创建 AnnotatedBeanDefinitionReader 并将其关联到容器
        AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(factory);

        // 使用 AnnotatedBeanDefinitionReader 注册Bean对象
        reader.registerBean(MyBean.class);

        // 获取并打印 MyBean
        System.out.println("MyBean = " + factory.getBean(MyBean.class));
    }
}

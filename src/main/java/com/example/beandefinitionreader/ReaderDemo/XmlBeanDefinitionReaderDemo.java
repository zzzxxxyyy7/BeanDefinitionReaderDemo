package com.example.beandefinitionreader.ReaderDemo;

import com.example.beandefinitionreader.Bean.MyBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class XmlBeanDefinitionReaderDemo {
    public static void main(String[] args) {
        // 创建一个DefaultListableBeanFactory作为Spring容器
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        // 创建XmlBeanDefinitionReader实例用于解析XML配置，并绑定对应 BeanFactory
        XmlBeanDefinitionReader reader  = new XmlBeanDefinitionReader(factory);

        // 加载XML配置文件
        reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));

        // 获取并使用Bean
        MyBean myBean = factory.getBean("myBean", MyBean.class);
        System.out.println("myBean = " + myBean);
    }
}

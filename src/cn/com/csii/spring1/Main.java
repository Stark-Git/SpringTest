package cn.com.csii.spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.AppContext;

/**
 * Created by Administrator on 2016/8/2.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Adress adress = (Adress)context.getBean("adress");
        Car car = (Car) context.getBean("car3");
        System.out.println(adress);
        System.out.println(car);
    }
}

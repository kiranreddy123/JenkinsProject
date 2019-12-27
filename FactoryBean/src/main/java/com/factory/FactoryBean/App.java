package com.factory.FactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
      EmployeeDto dto=(EmployeeDto) ctx.getBean("manager");
      System.out.println(dto);
      EmployeeDto dto1=(EmployeeDto) ctx.getBean("director");
      System.out.println(dto1);
    }
}

package com.factory.FactoryBean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.ResolvableType;

public class EmployeeFactory extends AbstractFactoryBean<Object> {

	private String designation;
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public Class<EmployeeDto> getObjectType() {
		
		return EmployeeDto.class;
	}

	@Override
	protected Object createInstance() throws Exception {
			
		EmployeeDto dto=new EmployeeDto();
		dto.setId(01);
		dto.setName("kiran");
		dto.setDesignation(designation);
		return dto;
	}
	

	
}

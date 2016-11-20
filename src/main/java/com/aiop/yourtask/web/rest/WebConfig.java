package com.aiop.yourtask.web.rest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.aiop.yourtask.domain.Product;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
            converters.add(marshallingMessageConverter());
    }

    @Bean
    public MarshallingHttpMessageConverter marshallingMessageConverter() {
        MarshallingHttpMessageConverter converter = new MarshallingHttpMessageConverter();
        converter.setMarshaller(jaxbMarshaller());
        converter.setUnmarshaller(jaxbMarshaller());
        return converter;
    }

    @Bean 
    public Jaxb2Marshaller jaxbMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setClassesToBeBound(Product.class);
        Map<String, Object> props = new HashMap<>();
        props.put(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setMarshallerProperties(props);
        return marshaller;
    }
}
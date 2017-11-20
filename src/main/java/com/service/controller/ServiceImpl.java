package com.service.controller;

import com.service.model.Person;

import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoCodegen", date = "2017-11-20T09:05:08.327Z")

@RpcSchema(schemaId = "service")
public class ServiceImpl implements Service{

    @Autowired
    private ServiceDelegate serviceDelegate;


    public Integer add(Integer a, Integer b) {

        return serviceDelegate.add(a, b);
    }


    public String sayHei(String name) {

        return serviceDelegate.sayHei(name);
    }


    public String sayHello(String name) {

        return serviceDelegate.sayHello(name);
    }


    public String sayHi(String name) {

        return serviceDelegate.sayHi(name);
    }


    public String saySomething(String prefix, Person user) {

        return serviceDelegate.saySomething(prefix, user);
    }

}

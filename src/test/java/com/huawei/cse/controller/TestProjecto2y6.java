package com.huawei.cse.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecto2y6 {

        Projecto2y6Delegate projecto2y6Delegate = new Projecto2y6Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecto2y6Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
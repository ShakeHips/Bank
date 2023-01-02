package com.solvd.bank.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void printFields(Object obj){
        Field[] fields = obj.getClass().getDeclaredFields();

        for(Field field: fields){
            System.out.println(field);
        }
    }

    public static void printMethods(Object obj){
        Method[] declaredMethods = obj.getClass().getDeclaredMethods();

        for(Method method: declaredMethods){
            System.out.println(method);
        }
    }

    public static void changeName(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();
        for(Field field: fields){
            if(field.getName().equals("pension")){
                field.setAccessible(true);
                field.set(obj, 10000);
            }
        }
    }

    public void invokeMethod(Object obj) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Method declaredMethods = obj.getClass().getDeclaredMethod("balanceGetter", null);
        declaredMethods.setAccessible(true);
        declaredMethods.invoke(obj);
        }
    }


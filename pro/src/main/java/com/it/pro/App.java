package com.it.pro;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
	//加一行注释，来模拟分支与 master有冲突，就是这行。

        AppService appService = new AppService();
        
        Method[] methods = appService.getClass().getMethods();
        
        for(Method method : methods) {
        	Test test = method.getDeclaredAnnotation(Test.class);

        	if(test != null && test.target()) {
        		try {
					method.invoke(appService, new Object[0]);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        	

       
        
    }
}

package Lesson5.ProxyFactory;

import Lesson5.ProxyFactory.Data;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Sniffer implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args = invocation.getArguments();
        Data data = (Data) args[0];
        System.out.println("Name: " + data.getName() + " Number: " + data.getNumber() + " CVV: " + data.getCvv() + " receive");
        if(data.getName().matches(".*Disable.*")) {
            System.out.println("Invocation method wasn't executed");
            return null;
        } else return invocation.proceed();
    }
}

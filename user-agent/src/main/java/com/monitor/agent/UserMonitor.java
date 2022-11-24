package com.monitor.agent;

import net.bytebuddy.asm.Advice;

public class UserMonitor {

    @Advice.OnMethodEnter
    public static void enter(@Advice.Origin Class clazz, @Advice.Origin("#m") String methodName) {
        if(methodName.equals("doSomething")){
            System.out.println("doSomething method used");
        }
    }
}

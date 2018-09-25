package com.kobe.L1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Tester {
    public enum Status implements IDiss{
        ini("初始化") , start("開始") , doing("正在做") , process("生產中") ,destory("消除");

        private String des ;

        private Status(String des){
            this.des=des;
        }

        public String getDes(){
            return this.des;
        }
    };

    Status status() default Status.ini;
    String name() default "Jone doe";
    boolean ok() default false;

}

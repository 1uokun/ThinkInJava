package com.annotations;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 * <a href="http://blog.52python.cn/2015/12/09/%E4%BD%BF%E7%94%A8Java%E5%8E%9F%E7%94%9F%E4%BB%A3%E7%90%86%E5%AE%9E%E7%8E%B0%E6%B3%A8%E5%85%A5/">
 *     使用Java原生代理实现注入
 * </a>
 * **/
public class Testable {
    @SimulatingNull(id=1)
    private int id;

    void execute() {
        System.out.println("Executing..");
    }

    @Test

    void testExecute(){
        execute();
        System.out.println(this.id);
    }
}

/**
 * 定义注解
 *
 * 元注解
 *
 * @Target  表示该注解可以做为什么，参数传ElementType
 *          CONSTRUCTOR：构造器的声明
 *          FIELD：域声明（包括enum实例）
 *          LOCAL_VARIABLE：局部变量声明
 *          METHOD：方法声明
 *          PACKAGE：包声明
 *          PARAMETER：参数声明
 *          TYPE：类、接口（包括注解类型）或enum声明
 *
 * @Retention 表示需要在什么级别保存该注解信息。可选的RetentionPolicy参数包括：
 *            SOURCE：注解将被编译器丢弃。
 *            CLASS：注解在class文件中可用，但会被VM丢弃
 *            RUNTIME：VM将在运行期也保留注解，因此可以通过反射
 *
 * @Documented 将此注解包含在Javadoc中
 *
 * @Inherited 允许子类继承父类中的注解
 * **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test {};



@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@interface SimulatingNull {
    public int id() default -1;
}

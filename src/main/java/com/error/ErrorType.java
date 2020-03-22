package com.error;

/**
 * 通过异常处理错误
 *
 * Exception继承自Throwable对象
 *
 * 有可通过继承Exception对象自定义异常类型
 * **/
public class ErrorType {
    //未初始化
    void nullPointer(){
        //if(t == null)
        throw new NullPointerException();
    }

    //异常参数
    void args(){
        Throwable a = new Throwable();
        Exception e = new Exception();

        throw new IllegalArgumentException();
    }

    //捕获异常
    void catchError(){
        try{
//            throw new Throwable("message:123");
            throw new Exception("message;456");
        }catch (Exception e){
            System.out.println(e instanceof Throwable); // true
//        }catch (Exception a){
//            // 处理上面catch内的代码
        } catch (Throwable throwable) {//捕获Throwable类型的错误
            throwable.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ErrorType().catchError();
    }
}

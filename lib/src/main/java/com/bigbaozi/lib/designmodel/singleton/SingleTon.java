package com.bigbaozi.lib.designmodel.singleton;

/**
 * Name: SingleTon
 * Author: zhangfenglin
 * Email: zhfenglin@163.com
 * Comment: //单例模式
 * Date: 2018-05-24 13:34
 */
public class SingleTon {

   private  static SingleTon singleTon;

   private SingleTon(){

   }


    public  static  synchronized SingleTon getInstance(){
        if(singleTon==null){
            singleTon = new SingleTon();
        }
        return  singleTon;

    }

}

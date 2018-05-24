package com.bigbaozi.lib.designmodel.factory;

/**
 * Name: FactoryC
 * Author: zhangfenglin
 * Email: zhfenglin@163.com
 * Comment: //TODO
 * Date: 2018-05-24 16:14
 */
public class FactoryC {
    public  static  final  int TYPE_A=1;
    public  static  final  int TYPE_B=2;
    public  IProduct CreatProductByType(int type){
        switch (type){
            case TYPE_A:

                return  new ProductA();

            case TYPE_B:
               return  new ProductB();
        }


        return null;
    }

}

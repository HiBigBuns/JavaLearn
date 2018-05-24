package com.bigbaozi.lib.designmodel.factory;

/**
 * Name: JavaExe
 * Author: zhangfenglin
 * Email: zhfenglin@163.com
 * Comment: // 工厂模式 测试类
 *
 *  在面向对象编程中, 最通常的方法是一个new操作符产生一个对象实例,new操作符就是用来构造对象实例的。但是在一些情况下, new操作符直接生成对象会带来一些问题。
 *
 *
 *   如何能轻松方便地构造对象实例，而不必关心构造对象实例的细节和复杂过程。
 *
 *                                          -------使用工厂模式
 *
 *   在使用工厂模式时，只需要关心降低耦合度的目的是否达到了。
 *
 *  工厂模式缺点： 产品多了  工厂就多了  类就多了
 * Date: 2018-05-24 13:43
 */
public class JavaExe {

    public static void main(String[] args){

        /** 复杂工厂模式的情形*/
      FactoryA mFactoryA=new FactoryA();
        ProductA iProduct = (ProductA) mFactoryA.CreatProduct();
        iProduct.Creat();

        FactoryB mFactoryB=new FactoryB();
        ProductB iProduct1 = (ProductB) mFactoryB.CreatProduct();
        iProduct1.Creat();


        /** 简单工厂模式的情形*/
        ProductA product = (ProductA) new FactoryC().CreatProductByType(FactoryC.TYPE_A);
        product.Creat();
    }
}


package com.bigbaozi.lib.designmodel.factory;

/**
 * Name: FactoryC
 * Author: zhangfenglin
 * Email: zhfenglin@163.com
 * Comment: //工厂模式
 * Date: 2018-05-24 13:43
 */
public class FactoryA implements IFactory {


    @Override
    public IProduct CreatProduct() {
        System.out.print("");


        return new ProductA();
    }
}

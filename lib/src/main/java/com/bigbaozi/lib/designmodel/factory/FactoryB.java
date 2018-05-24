package com.bigbaozi.lib.designmodel.factory;

/**
 * Name: FactoryB
 * Author: zhangfenglin
 * Email: zhfenglin@163.com
 * Comment: //TODO
 * Date: 2018-05-24 16:04
 */
public class FactoryB implements IFactory {
    @Override
    public IProduct CreatProduct() {
        return new ProductB();
    }
}

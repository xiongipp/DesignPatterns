package com.xxh.Strategy;

public class MultiBlade  implements ICutFruit{
    @Override
    public void CutStrategy(String fruitName) {
        System.out.println("把水果："+fruitName+"切成渣渣");
    }
}

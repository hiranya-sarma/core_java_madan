package com.mypractice.lambda;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {

    R execute(T t);
}

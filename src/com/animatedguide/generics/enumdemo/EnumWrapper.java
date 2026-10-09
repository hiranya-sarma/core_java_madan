package com.animatedguide.generics.enumdemo;

public class EnumWrapper<T extends Enum<T>> {

    private  final T enumValue;

    public EnumWrapper(T enumValue) {
        this.enumValue = enumValue;
    }

    public T getEnumValue() {
        return enumValue;
    }
}

package com.prototype.deepclone;


public class Clinet {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType protoType = new DeepProtoType();
        protoType.name="p";
        protoType.deepCloneTarget=new DeepCloneTarget("s","l");

        System.out.println(((DeepProtoType)protoType.clone()).hashCode());
        System.out.println(((DeepProtoType)protoType.clone()).hashCode());

        System.out.println(((DeepProtoType)protoType.deepClone()).hashCode());
        System.out.println(((DeepProtoType)protoType.deepClone()).hashCode());

    }
}

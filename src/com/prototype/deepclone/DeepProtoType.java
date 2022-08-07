package com.prototype.deepclone;

import java.io.*;

/**
 * @author 对象
 */
public class DeepProtoType implements Serializable, Cloneable {
    public String name;
    public DeepCloneTarget deepCloneTarget;

    public DeepProtoType() {
        super();
    }

    // 方式1
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object deep = null;
        deep = super.clone();

        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneTarget = (DeepCloneTarget) deepCloneTarget.clone();
        return deep;
    }

    public Object deepClone() {
        Object object = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            object = (DeepProtoType) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return object;
    }
}

package com.prototype.deepclone;

import java.io.Serializable;

/**
 * @author 深拷贝
 */
public class DeepCloneTarget implements Serializable, Cloneable {
    private String cloneName;
    private String cloneClass;

    public DeepCloneTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

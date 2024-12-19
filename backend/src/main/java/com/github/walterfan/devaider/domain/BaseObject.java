package com.github.walterfan.devaider.domain;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public abstract class BaseObject implements Serializable {
    private static final long serialVersionUID = 1L;

    public boolean equals(Object object) {
        return EqualsBuilder.reflectionEquals(this, object);
    }

    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Object getField(String strField) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return PropertyUtils.getProperty(this, strField);
    }

    public void setField(String strField, Object value) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        PropertyUtils.setProperty(this, strField, value);
    }

    public Object invokeMethod(String strMethod, Object... args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException {
        Method method = getClass().getMethod(strMethod, new Class[]{(Class) null});
        return method.invoke(this, args);
    }

    protected String readString(ObjectInput in, int len) throws IOException {
        if (len > 0) {
            byte[] bytes = new byte[len];
            in.read(bytes, 0, len);
            return new String(bytes);
        }
        return null;
    }

    protected void writeString(ObjectOutput buf, String str) throws IOException {
        if (null == str) {
            buf.writeInt(0);
        } else {
            byte[] bytes = str.getBytes();
            buf.writeInt(bytes.length);
            buf.write(bytes);
        }
    }
}

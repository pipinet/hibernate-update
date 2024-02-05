package com.qwlabs;

import java.util.Objects;

public class RoleAttributes {
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        RoleAttributes that = (RoleAttributes) o;
        return Objects.equals( code, that.code );
    }

    @Override
    public int hashCode() {
        return Objects.hash( code );
    }
}

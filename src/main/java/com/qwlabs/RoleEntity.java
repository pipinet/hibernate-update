package com.qwlabs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UuidGenerator;
import org.hibernate.type.SqlTypes;

import static org.hibernate.annotations.UuidGenerator.Style.TIME;


@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @UuidGenerator(style = TIME)
    private String id;
    private String name;
    @JdbcTypeCode(SqlTypes.JSON)
    private RoleAttributes attributes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleAttributes getAttributes() {
        return attributes;
    }
}

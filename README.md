

# Start Application
```shell script
./gradlew quarkusDev
```

# Access any url like http://localhost:8080/q in browser will got error message in console
```log
2024-02-03 00:56:16,429 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2024-02-03 00:56:16,429 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [agroal, cdi, config-yaml, flyway, hibernate-orm, hibernate-orm-panache, hibernate-validator, jdbc-postgresql, narayana-jta, security, smallrye-context-propagation, smallrye-graphql, smallrye-jwt, vertx]
     Hibernate:
    select
        r1_0.id,
        r1_0.attributes,
        r1_0.name
    from
        role r1_0
Hibernate:
    update
        role
    set
        attributes=?,
        name=?
    where
        id=?
Hibernate:
    update
        role
    set
        attributes=?,
        name=?
    where
        id=?
Hibernate:
    update
        role
    set
        attributes=?,
        name=?
    where
        id=?
Hibernate:
    select
        r1_0.id,
        r1_0.attributes,
        r1_0.name
    from
        role r1_0
Hibernate:
    update
        role
    set
        attributes=?,
        name=?
    where
        id=?
Hibernate:
    update
        role
    set
        attributes=?,
        name=?
    where
        id=?
Hibernate:
    update
        role
    set
        attributes=?,
        name=?
    where
        id=?
```
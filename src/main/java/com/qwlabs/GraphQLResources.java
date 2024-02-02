package com.qwlabs;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import java.util.Set;

@GraphQLApi
@Transactional
public class GraphQLResources {
    private final PermissionLoader permissionLoader;

    @Inject
    public GraphQLResources(PermissionLoader permissionLoader) {
        this.permissionLoader = permissionLoader;
    }

    @Query
    @RolesAllowed({"P1"})
    public Set<String> roles() {
        return permissionLoader.load();
    }
}
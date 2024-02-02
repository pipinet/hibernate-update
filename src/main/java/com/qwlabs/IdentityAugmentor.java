package com.qwlabs;

import io.quarkus.security.identity.AuthenticationRequestContext;
import io.quarkus.security.identity.SecurityIdentity;
import io.quarkus.security.identity.SecurityIdentityAugmentor;
import io.quarkus.security.runtime.QuarkusSecurityIdentity;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class IdentityAugmentor implements SecurityIdentityAugmentor {
    private final PermissionLoader permissionLoader;

    public IdentityAugmentor(PermissionLoader permissionLoader) {
        this.permissionLoader = permissionLoader;
    }

    @Override
    public Uni<SecurityIdentity> augment(SecurityIdentity securityIdentity, AuthenticationRequestContext authenticationRequestContext) {
        return authenticationRequestContext.runBlocking(() -> {
            return this.doAugment(securityIdentity);
        });
    }

    private SecurityIdentity doAugment(SecurityIdentity securityIdentity) {
        var permissions = permissionLoader.load();
        return QuarkusSecurityIdentity.builder(securityIdentity)
                .addRoles(permissions)
                .build();
    }
}

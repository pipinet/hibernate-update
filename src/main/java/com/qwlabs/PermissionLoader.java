package com.qwlabs;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@ApplicationScoped
public class PermissionLoader {
    private final RoleRepository roleRepository;

    public PermissionLoader(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Transactional
    public Set<String> load() {
        return roleRepository.findAll().stream()
                .map(RoleEntity::getAttributes)
                .map(RoleAttributes::getCode)
                .collect(Collectors.toSet());
    }
}

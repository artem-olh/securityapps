package ru.spring.security.app.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.spring.security.app.entities.Role;
import ru.spring.security.app.repositories.RoleRepository;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role getUserRole() {
        return roleRepository.findByName("ROLE_USER").get();
    }
}

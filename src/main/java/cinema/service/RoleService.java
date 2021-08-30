package cinema.service;

import cinema.model.Role;

public interface RoleService {
    void add(Role role);

    Role getRoleByName(Role.RoleName roleName);
}

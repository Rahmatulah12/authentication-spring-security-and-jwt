package id.latihan.jwtauth.repository;

import id.latihan.jwtauth.entity.ERole;
import id.latihan.jwtauth.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

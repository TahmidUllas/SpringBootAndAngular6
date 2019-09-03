package com.misl.DOS.repository;

import java.util.Optional;
import com.misl.DOS.model.DosUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DosRepository extends JpaRepository<DosUser, Long>{
    Optional<DosUser> findByUsername(String username);
    Optional<DosUser> findById(Long id);
    Boolean existsByUsername(String username);
    Boolean existsByEmailId(String emailId);
}
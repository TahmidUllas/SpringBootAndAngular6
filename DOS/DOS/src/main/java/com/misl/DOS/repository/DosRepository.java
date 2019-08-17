package com.misl.DOS.repository;

import com.misl.DOS.model.DosUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DosRepository extends JpaRepository<DosUser, Long>{

}
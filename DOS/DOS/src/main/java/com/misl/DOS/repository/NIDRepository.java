package com.misl.DOS.repository;

import com.misl.DOS.model.DosUser;
import com.misl.DOS.model.NID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NIDRepository extends JpaRepository<NID, Long>{

}
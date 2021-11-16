package com.SOnB.bazaZdjec.repository;

import com.SOnB.bazaZdjec.model.Galeria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface GaleriaRepository extends JpaRepository<Galeria, Long> {
}

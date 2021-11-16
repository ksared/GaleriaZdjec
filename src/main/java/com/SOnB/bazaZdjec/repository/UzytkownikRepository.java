package com.SOnB.bazaZdjec.repository;

import com.SOnB.bazaZdjec.model.Uzytkownik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UzytkownikRepository extends JpaRepository<Uzytkownik, Long> {
}

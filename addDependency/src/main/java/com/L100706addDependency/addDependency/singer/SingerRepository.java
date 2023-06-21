package com.L100706addDependency.addDependency.singer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SingerRepository extends JpaRepository<Singer, Long> {
    List<Singer> findByLastName(String lastName);
}

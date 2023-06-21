package com.L100706addDependency.addDependency.producer;

import com.L100706addDependency.addDependency.song.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProducerRepository extends JpaRepository<Producer, Long> {
    Producer findByName(String name);

}

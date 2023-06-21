package com.L100706addDependency.addDependency.singer;

import com.L100706addDependency.addDependency.producer.Producer;

import java.util.List;
import java.util.Optional;

public interface SingerService {
        Singer sava(Singer singer);

        List<Singer> savaAll(List<Singer> singers);

        Optional<Singer> findById(Long id);

        void deleteById(Long id);
        List<Singer> findByLastName(String lastName);
        List<Singer> getSingers();

}

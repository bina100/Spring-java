package com.L100706addDependency.addDependency.producer;

import java.util.List;
import java.util.Optional;

public interface ProducerService {
    Producer sava(Producer producer);

    List<Producer> savaAll(List<Producer> producers);

    Optional<Producer> findById(Long id);

    void deleteById(Long id);
}

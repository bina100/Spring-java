package com.L100706addDependency.addDependency.producer;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProducerServiceImpl implements ProducerService {
    private final ProducerRepository producerRepository;

    public ProducerServiceImpl(ProducerRepository producerRepository) {
        this.producerRepository = producerRepository;
    }

    @Override
    public Producer sava(Producer producer) {
        return producerRepository.save(producer);
    }

    @Override
    public List<Producer> savaAll(List<Producer> producers) {
        return producerRepository.saveAll(producers);
    }

    @Override
    public Optional<Producer> findById(Long id) {
        return producerRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        producerRepository.deleteById(id);
    }
}

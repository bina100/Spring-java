package com.L100706addDependency.addDependency.singer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
// במקום הבנאי שסילשנו
@RequiredArgsConstructor
@Service
public class SingerServiceImpl implements SingerService {

    private final SingerRepository singerRepository;

//    public SingerServiceImpl(SingerRepository singerRepository) {
//        this.singerRepository = singerRepository;
//    }

    @Override
    public Singer sava(Singer singer) {
        return singerRepository.save(singer);
    }

    @Override
    public List<Singer> savaAll(List<Singer> singers) {
        return singerRepository.saveAll(singers);
    }

    @Override
    public Optional<Singer> findById(Long id) {
        return singerRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        singerRepository.deleteById(id);
    }

    @Override
    public List<Singer> findByLastName(String lastName) {
        return singerRepository.findByLastName(lastName);
    }

    @Override
    public List<Singer> getSingers() {
        return singerRepository.findAll();
    }
}

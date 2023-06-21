package com.L100706addDependency.addDependency.song;

import com.L100706addDependency.addDependency.producer.Producer;

import java.util.List;
import java.util.Optional;

public interface SongService {
        Song sava(Song song);

        List<Song> savaAll(List<Song> songs);

        Optional<Song> findById(Long id);

        void deleteById(Long id);

        List<Song> findByLengthGreaterThan(Double length);

}

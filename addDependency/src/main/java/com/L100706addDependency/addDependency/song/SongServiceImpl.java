package com.L100706addDependency.addDependency.song;

import java.util.List;
import java.util.Optional;

public class SongServiceImpl implements SongService {

    private final SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public Song sava(Song song) {
        return songRepository.save(song);
    }

    @Override
    public List<Song> savaAll(List<Song> songs) {
        return songRepository.saveAll(songs);
    }

    @Override
    public Optional<Song> findById(Long id) {
        return songRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        songRepository.deleteById(id);
    }

    @Override
    public List<Song> findByLengthGreaterThan(Double length) {
        return songRepository.findByLengthGreaterThan(length);
    }
}

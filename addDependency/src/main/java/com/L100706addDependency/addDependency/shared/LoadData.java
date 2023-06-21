package com.L100706addDependency.addDependency.shared;

import com.L100706addDependency.addDependency.producer.Producer;
import com.L100706addDependency.addDependency.producer.ProducerRepository;
import com.L100706addDependency.addDependency.singer.Singer;
import com.L100706addDependency.addDependency.singer.SingerRepository;
import com.L100706addDependency.addDependency.song.Song;
import com.L100706addDependency.addDependency.song.SongRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LoadData implements CommandLineRunner {

    private final SingerRepository singerRepository;
    private final SongRepository songRepository;

    private final ProducerRepository producerRepository;

    public LoadData(SingerRepository singerRepository, SongRepository songRepository, ProducerRepository producerRepository) {
        this.singerRepository = singerRepository;
        this.songRepository = songRepository;
        this.producerRepository = producerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    @Transactional
    private void loadData() {
        Singer singer = new Singer();
        singer.setFirstName("Bob");
        singer.setLastName("Marly");

        Song song = new Song();
        song.setName("Big brown eyes");
        song.setLength(2.3);

        song.getSingers().add(singer);
        singer.getSongs().add(song);

        Producer producer = new Producer();
        producer.setName("Bina");
        producer.getSongs().add(song);
        song.setProducer(producer);

        singerRepository.save(singer);
        producerRepository.save(producer);
        songRepository.save(song);


        List<Song> songsGreaterThen2 = songRepository.findByLengthGreaterThan(2D);
        songsGreaterThen2.stream().forEach(song1 -> System.out.println(song1.getLength()));

        Producer producer1 = producerRepository.findByName("Bina");
        System.out.println(producer1.getName());

    }
}

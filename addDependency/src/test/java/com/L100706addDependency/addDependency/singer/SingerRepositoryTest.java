package com.L100706addDependency.addDependency.singer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//מרים db יעודי לטסטים
@DataJpaTest
class SingerRepositoryTest {
    private SingerRepository singerRepository;
    private Singer testedSinger;
    private final String FIRST_NAME ="Israel";
    private final String LAST_NAME ="Israeli";
    @BeforeEach
    void setUp() {
        testedSinger = Singer.builder().firstName(FIRST_NAME).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {
//            singerRepository.save(testedSinger);
//            List<Singer> singers = singerRepository.findByLastName(LAST_NAME);
//            assertTrue(singers.size()==1);
//            assertEquals(singers.get(0).getLastName(), "Israeli");
    }
}
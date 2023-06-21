package com.L100706addDependency.addDependency.producer;

import com.L100706addDependency.addDependency.singer.Singer;
import com.L100706addDependency.addDependency.song.Song;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Producer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        @OneToMany(mappedBy = "producer")
        //השם של הרשימה חייב להיות כמו השם שנתנו ב mappedBy במחלקה של singer
        private List<Song> songs = new ArrayList<>();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Singer singer)) return false;

            return getId() != null ? getId().equals(singer.getId()) : singer.getId() == null;
        }

        @Override
        public int hashCode() {
            return getId() != null ? getId().hashCode() : 0;
        }
    }



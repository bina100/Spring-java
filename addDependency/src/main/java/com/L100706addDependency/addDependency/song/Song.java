package com.L100706addDependency.addDependency.song;

import com.L100706addDependency.addDependency.producer.Producer;
import com.L100706addDependency.addDependency.singer.Singer;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
//בגלל שיש לי lombok dependency הוא חוסך לי ליצור את כל הדברים באלו לבד
//את equals נעשה לבד כי נרצה רק equal לפי id והדיפולטיבי הוא equals לפי כל הנתונים
@Getter
@Setter
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Song {
    //בשביל להגדיר טבלה עם id
    @Id
    //ניצור מנגנון במסד נתונים שיוצר מזהה עבור ה id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double length;
    @ManyToMany
    //מגדיר את הטבלה עם העמודות
    @JoinTable(name = "singer_song",
    joinColumns = @JoinColumn(name = "song_id"),
    inverseJoinColumns = @JoinColumn(name="singer_id"))
    //השם של הרשימה חייב להיות כמו השם שנתנו ב mappedBy במחלקה של singer
    private List<Singer> singers = new ArrayList<>();

    @ManyToOne
    private Producer producer = new Producer();

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

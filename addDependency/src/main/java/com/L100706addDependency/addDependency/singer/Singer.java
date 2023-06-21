package com.L100706addDependency.addDependency.singer;

import com.L100706addDependency.addDependency.song.Song;
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
@Builder
public class Singer {
    //בשביל להגדיר טבלה עם id
    @Id
    //ניצור מנגנון במסד נתונים שיוצר מזהה עבור ה id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    //אני אומר ל song איך למצוא את ה singer
    @ManyToMany(mappedBy = "singers")
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

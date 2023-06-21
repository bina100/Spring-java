package com.L100706addDependency.addDependency.song;

import com.L100706addDependency.addDependency.singer.Singer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongRepository extends JpaRepository<Song, Long>{
//חייב להיות מוגדר ככה ב song רק עם אות קטנה בהתחלה - Length
List<Song> findByLengthGreaterThan(Double length);
}

package com.L100706addDependency.addDependency.song;

public class SongController {
    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }
}

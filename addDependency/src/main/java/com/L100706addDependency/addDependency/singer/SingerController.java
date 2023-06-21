package com.L100706addDependency.addDependency.singer;

public class SingerController {
    private final SingerService singerService;

    public SingerController(SingerService singerService) {
        this.singerService = singerService;
    }
}

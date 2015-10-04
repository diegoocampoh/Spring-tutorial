package com.qualisys.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by diego on 10/4/2015.
 */
@Component
public class Meteora implements CompactDisc {

    private String title = "Meteora";
    private String artist = "Linkin Park";

    @Override
    public void play() {
        System.out.println("Playing "+title +" by "+ artist);
    }
}

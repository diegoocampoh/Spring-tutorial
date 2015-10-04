package com.qualisys.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.inject.Named;

/**
 * Created by diego on 10/4/2015.
 */
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing "+title +" by "+ artist);
    }
}

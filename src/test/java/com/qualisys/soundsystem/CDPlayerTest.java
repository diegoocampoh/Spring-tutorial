package com.qualisys.soundsystem;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by diego on 10/4/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    @Qualifier("lonelyHeartsClub")
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(cd);
    }

    @Test
    public void play(){
        player.play();
        Assert.assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\r\n", log.getLog());
    }
}

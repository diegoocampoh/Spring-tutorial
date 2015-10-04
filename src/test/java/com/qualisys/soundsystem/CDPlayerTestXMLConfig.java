package com.qualisys.soundsystem;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by diego on 10/4/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:cdplayer-config.xml" })
public class CDPlayerTestXMLConfig {

    @Autowired
    private Meteora cd;

    @Test
    public void cdShouldNotBeNull(){
        Assert.assertNotNull(cd);
        cd.play();
    }

}

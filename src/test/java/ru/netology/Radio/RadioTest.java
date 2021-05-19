package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //Radio radio = new Radio();

    @Test
    void ShouldSetCurrentRadioStationNumber() {
        Radio radio = new Radio("Volna", 5, 0,
                20,50,0,
                100,true);
        int expected = 5;
        //assertEquals(expected, radio.getCurrentRadioStationNumber());
        //radio.setCurrentRadioStationNumber();
        assertEquals(expected, radio.getCurrentRadioStationNumber());

    }
    @Test
    void ShouldSetCurrentRadioStationNumberDefaultConst() {
        Radio radio = new Radio();
        int expected = 0;
        //assertEquals(expected, radio.getCurrentRadioStationNumber());
        radio.setCurrentRadioStationNumber(50);
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    void ShouldChangeNextRadioStationNumberAllArgs() {
        Radio radio = new Radio("Volna", 250, 0,
                200,50,0,
                100,true);
        int expected = 0;
        //radio.setCurrentRadioStationNumber(200);
        int actual = radio.nextRadioStationNumber();
        assertEquals(expected, actual);

    }
    @Test
    void ShouldChangeNextRadioStationNumberAllArgs2() {
        Radio radio = new Radio("Volna", -1, 0,
                200,50,0,
                100,true);
        int expected = 0;
        //radio.setCurrentRadioStationNumber(200);
        int actual = radio.nextRadioStationNumber();
        assertEquals(expected, actual);

    }
    @Test
    void ShouldChangeNextRadioStationNumberNoArgs() {
        Radio radio = new Radio();
        int expected = 6;
        //radio.setCurrentRadioStationNumber(200);
        int actual = radio.nextRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldChangePrevRadioStationNumberAllArgs() {
        Radio radio = new Radio("Volna", 205, 0,
                200,50,0,
                100,true);
        int expected = 0;
        int actual = radio.prevRadioStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    void ShouldChangePrevRadioStationNumberAllArgs2() {
        Radio radio = new Radio("Volna", -1, 0,
                200,50,0,
                100,true);
        int expected = 200;
        int actual = radio.prevRadioStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    void ShouldChangePrevRadioStationNumberNoArgs() {
        Radio radio = new Radio();
        int expected = 4;
        //radio.setCurrentRadioStationNumber();
        int actual = radio.prevRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldSetCurrentVolumeAllArgs() {
        Radio radio = new Radio("Volna", 200, 0,
                200,100,0,
                100,true);
        int expected = 100;
        //radio.setCurrentVolume(-1);
        assertEquals(expected, radio.getCurrentVolume());
    }
    @Test
    void ShouldSetCurrentVolumeNoArgs() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setCurrentVolume(102);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void ShouldMinusVolumeAllArgs() {
        Radio radio = new Radio("Volna", 200, 0,
                200,50,0,
                100,true);
        int expected = 49;
        //radio.setCurrentVolume(0);
        int actual = radio.minusVolume();
        assertEquals(expected, actual);
    }
    @Test
    void ShouldMinusVolumeAllArgs2() {
        Radio radio = new Radio("Volna", 200, 0,
                200,-1,0,
                100,true);
        int expected = 0;
        //radio.setCurrentVolume(0);
        int actual = radio.minusVolume();
        assertEquals(expected, actual);
    }
    @Test
    void ShouldMinusVolumeNoArgs() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setCurrentVolume(150);
        int actual = radio.minusVolume();
        assertEquals(expected, actual);
    }
    @Test
    void ShouldPlusVolumeAllArgs() {
        Radio radio = new Radio("Volna", 200, 0,
                200,-1,0,
                100,true);
        int expected = 0;
        //radio.setCurrentVolume(100);
        int actual = radio.plusVolume();
        assertEquals(expected, actual);
    }
    @Test
    void ShouldPlusVolumeAllArgs2() {
        Radio radio = new Radio("Volna", 200, 0,
                200,150,0,
                100,true);
        int expected = 100;
        //radio.setCurrentVolume(100);
        int actual = radio.plusVolume();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldPlusVolumeNoArgs() {
        Radio radio = new Radio();
        int expected = 51;
        radio.setCurrentVolume(50);
        int actual = radio.plusVolume();
        assertEquals(expected, actual);
    }
}


package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void ShouldSetCurrentRadioStationNumber() {
        Radio radio = new Radio();
        int expected = 9;
        //assertEquals(expected, radio.getCurrentRadioStationNumber());
        radio.setCurrentRadioStationNumber(-1);
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    void ShouldChangeNextRadioStationNumber() {
        Radio radio = new Radio();
        int expected = 1;
        int actual = radio.nextRadioStationNumber(0);
        assertEquals(expected, actual);
    }

    @Test
    void ShouldChangePrevRadioStationNumber() {
        Radio radio = new Radio();
        int expected = 8;
        int actual = radio.prevRadioStationNumber(9);
        assertEquals(expected, actual);
    }

    @Test
    void ShouldSetCurrentVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(-1);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void ShouldMinusVolume() {
        Radio radio = new Radio();
        int expected = 10;
        int actual = radio.minusVolume(15);
        assertEquals(expected, actual);
    }
    @Test
    void ShouldPlusVolume() {
        Radio radio = new Radio();
        int expected = 10;
        int actual = radio.plusVolume(10);
        assertEquals(expected, actual);
    }
}


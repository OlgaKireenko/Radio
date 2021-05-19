package ru.netology.Radio;

public class Radio {
    //private int numberRadioStation = 10;
    private String name;
    //
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber = 10;
    private int currentRadioStationNumber = maxRadioStationNumber/2;

    //
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    //
    private boolean on;

    public Radio() {
    }

    public Radio(String name, int currentRadioStationNumber,
                 int minRadioStationNumber,
                 int maxRadioStationNumber, int currentVolume,
                 int minVolume, int maxVolume, boolean on) {
        //this.numberRadioStation = numberRadioStation;
        this.name = name;
        this.currentRadioStationNumber = currentRadioStationNumber;
        this.minRadioStationNumber = minRadioStationNumber;
        this.maxRadioStationNumber = maxRadioStationNumber;
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.on = on;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinRadioStationNumber() {
        return minRadioStationNumber;
    }

    public void setMinRadioStationNumber(int minRadioStationNumber) {
        this.minRadioStationNumber = minRadioStationNumber;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public void setMaxRadioStationNumber(int maxRadioStationNumber) {
        this.maxRadioStationNumber = maxRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber > maxRadioStationNumber) {
            currentRadioStationNumber = minRadioStationNumber;
        }
        if (currentRadioStationNumber < minRadioStationNumber) {
            currentRadioStationNumber = maxRadioStationNumber;
        }
        // здесь уверены, что все проверки прошли
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

//Переключаем на следующую станцию

    public int nextRadioStationNumber() {
        if (currentRadioStationNumber >= maxRadioStationNumber) {
            currentRadioStationNumber = minRadioStationNumber;
        } else if (currentRadioStationNumber < minRadioStationNumber) {
            currentRadioStationNumber = minRadioStationNumber;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
        return currentRadioStationNumber;
    }
//Переключаем на предыдущую станцию

    public int prevRadioStationNumber() {
        if (currentRadioStationNumber <= minRadioStationNumber) {
            currentRadioStationNumber = maxRadioStationNumber;
        } else if (currentRadioStationNumber > maxRadioStationNumber) {
            currentRadioStationNumber = maxRadioStationNumber;
        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
        return currentRadioStationNumber;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    public int minusVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume = currentVolume - 1;
        }

        return currentVolume;
    }


    public int plusVolume() {
        if (currentVolume >= maxVolume) {

            currentVolume = maxVolume;
        } else if (currentVolume < minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume = currentVolume + 1;
        }

        return currentVolume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

}
//public Radio() {

//}


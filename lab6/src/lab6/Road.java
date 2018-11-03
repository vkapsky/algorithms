package lab6;

import java.util.Random;

public class Road {
    public int firstHouse;
    public int secondHouse;
    public int length;

    public Road(int firstHouse, int secondHouse, int length) {
        this.firstHouse = firstHouse;
        this.secondHouse = secondHouse;
        this.length = length;
    }

    public int getFirstHouse() {
        return firstHouse;
    }

    public int getSecondHouse() {
        return secondHouse;
    }

    public int getLength() {
        return length;
    }

    public void setFirstHouse() {
        this.firstHouse = firstHouse;
    }

    public void setSecondHouse() {
        this.secondHouse = secondHouse;
    }

    public void setLength() {
        this.length = 1 +length;
    }
}

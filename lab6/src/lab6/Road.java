package lab6;

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

    public void setFirstHouse(int firstHouse) {
        this.firstHouse = firstHouse;
    }

    public void setSecondHouse(int secondHouse) {
        this.secondHouse = secondHouse;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

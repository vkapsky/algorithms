package lab6;

import java.util.Random;

public class Run {

    public static void main(String args[]) {
        Variables V = new Variables();
        V.setRoads();
        V.setHouses();
        Random rnd = new Random(System.currentTimeMillis());
        House[] Houses = new House[V.getHouses()];
        Road[] Roads = new Road[V.getRoads()];
        for (int i = 0; i < V.getRoads(); i++) {
            int a=0,b=0;
            while (a==b){
                a=0 + rnd.nextInt(V.getHouses());
                b=0 + rnd.nextInt(V.getHouses());
            }
            Roads[i] = new Road(a, b, 1 + rnd.nextInt(100));
        }
        for (int i = 0; i < V.getHouses(); i++) {
            Houses[i] = new House(i);
        }
        for (int i = 0; i < V.getRoads(); i++) {
            System.out.println(Roads[i].getFirstHouse() + " " + Roads[i].getSecondHouse() + " " + Roads[i].getLength());
        }
        for (int i = 0; i < V.getHouses(); i++) {
            System.out.println(Houses[i].getHouseNumber());
        }
    }
}

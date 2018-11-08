package lab6;
import java.util.Scanner;

public class Run {

    public static void main(String args[]) {
        Variables V = new Variables();
        V.setRoads();
        V.setHouses();
        Scanner in = new Scanner(System.in);
        Road[] Roads = new Road[V.getRoads()];
        for (int i = 0; i < V.getRoads(); i++) {
            Roads[i] = new Road(0, 0, 0);
        }
        for (int i = 0; i < V.getRoads(); i++) {
            System.out.println("Введите дорогу " + i);
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            Roads[i].setFirstHouse(a);
            Roads[i].setSecondHouse(b);
            Roads[i].setLength(c);
        }
        Dijkstra(Roads, V);
    }


    public static void Dijkstra(Road[] Roads, Variables V) {
        int[] k = new int[V.getHouses()];
        int[] sum = new int[V.getHouses()];
        int[] n = new int[V.getHouses()];
        //int s = 0;
        for (int i = 0; i < V.getHouses(); i++) {
            for (int j = 0; j < V.getHouses(); j++) {
                if (i == Roads[j].getFirstHouse()) {
                    if (j == 0) {
                        n[i] = 0;
                    } else {
                        n[j] = Roads[j - 1].getLength();
                    }
                    k[j] = Roads[j].getLength() + n[j];
                }
            }
            for(int j=0;j<V.getHouses();j++){
                sum[i]=sum[i]+k[j];
            }
        }
        int min = sum[0];
        int minHouse=0;
        for (int i=0;i<V.getHouses();i++){
            if(min>sum[i]){
                min=sum[i];
                minHouse=i;
            }
        }
        /*for (
                int i = 0; i < V.getHouses(); i++) {
            System.out.print(k[i]);
        }
        System.out.println();
        for (
                int i = 0; i < V.getHouses(); i++) {
            System.out.print(sum[i]);
        }
        System.out.println();
        for (
                int i = 0; i < V.getRoads(); i++) {
            System.out.println(Roads[i].getFirstHouse() + " " + Roads[i].getSecondHouse() + " " + Roads[i].getLength());
        }*/
        System.out.println();
        System.out.print("От домика номер "+minHouse+" минимальное суммарное расстаяние "+min);
    }
}

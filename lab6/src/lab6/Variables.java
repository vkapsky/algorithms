package lab6;
import java.util.Scanner;
public class Variables {
    public static int nHouses, nRoads;
    public int setHouses()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число домов");
        nHouses=in.nextInt();
        return (nHouses);
    }
    public int getHouses(){
        return (nHouses);
    }
    public int setRoads()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число дорог");
        nRoads=in.nextInt();
        return (nRoads);
    }
    public int getRoads(){
        return (nRoads);
    }
}

package lab5;

import java.util.*;

public class Algorithm {

    public String[] cities;
    public int citiesLength;

    Algorithm(String[] w) {
        this.cities = w;
        this.citiesLength = this.cities.length;
    }

    public void getEulerCycle(String e) {//начало алгоритма
        String u;
        Deque<String> stack = new ArrayDeque<>();//стек
        Deque<String> queue = new ArrayDeque<>();//очередь
        boolean[] used = new boolean[citiesLength]; // массив пометок
        used[getArrayIndex(cities, e)] = true; // помечаем исходную вершину
        stack.push(e);
        while (!stack.isEmpty()) {
            int k = 0;
            u = stack.peek();
            for (int i = 0; i < citiesLength; i++) {
                if (canBeConnected(u, cities[i]) && !used[i]) {
                    k = i;
                    break;
                }
            }
            if (canBeConnected(u, cities[k]) && !used[k]) {
                used[k] = true;
                stack.push(cities[k]);
            } else {
                queue.push(u);
                stack.pop();
            }
        }
        if (isUsed(used)) {
            System.out.println("Можно выстроить цепочку.");
        } else {
            System.out.println("Нельзя выстроить цепочку.");
        }
        System.out.println(queue);
    }

    public boolean canBeConnected(String a, String b) {
        return a.charAt(a.length() - 1) == b.charAt(0);
    }

    public int getArrayIndex(String[] arr, String value) {

        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(value)) {
                k = i;
                break;
            }
        }
        return k;
    }

    public boolean isUsed(boolean[] u) {
        int k = 0;
        for (int i = 0; i < citiesLength; i++) {
            if (u[i]) {
                k++;
            }
        }
        return k == citiesLength;
    }

}

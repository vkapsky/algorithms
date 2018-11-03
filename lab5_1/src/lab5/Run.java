package lab5;

public class Run {

    public static void main(String[] args) {

        int[][] graphMatrix = {
                {1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 1}
        };
        int graphLength = graphMatrix.length;
        Algorithm Graph = new Algorithm(graphLength,graphMatrix);
        if(Graph.isConnected()){
            System.out.print("Все могут перезнакомиться");
        }
        else {
            System.out.print("Не могут перезнакомиться, максимальное число знакомых: " + Graph.getMaxVertexes());
        }

    }
}

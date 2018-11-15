package lab6;

import java.util.Random;

import static java.lang.StrictMath.min;
import static java.util.Arrays.fill;

public class Run {
    static int PrimAlgorithm() {
        int nVertexes = 10;
        Random r = new Random();
        int[][] matrix;
        matrix = new int[nVertexes][nVertexes];
        for (int i = 0; i < nVertexes; i++) {
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = r.nextInt(100 - 1) + 1;
            }
        }
        for (int i = 0; i < nVertexes; i++) {
            for (int j = 0; j < nVertexes; j++) {
                if (matrix[i][j] == 0)
                    matrix[i][j] = matrix[j][i];
            }
        }
        boolean[] used = new boolean[nVertexes];
        int[] Weight = new int[nVertexes];
        int P = Integer.MAX_VALUE / 2;
        fill(Weight, P);
        Weight[0] = 0;
        for (; ; ) {
            int v = -1;
            for (int nv = 0; nv < nVertexes; nv++)
                if (!used[nv] && Weight[nv] < P && (v == -1 || Weight[v] > Weight[nv]))
                    v = nv;
            if (v == -1) break;
            used[v] = true;
            for (int nv = 0; nv < nVertexes; nv++)
                if (!used[nv] && matrix[v][nv] < P)
                    Weight[nv] = min(Weight[nv], matrix[v][nv]);
        }
        int result = 0;
        for (int v = 0; v < nVertexes; v++)
            result += Weight[v];
        return result;
    }

    public static void main(String args[]) {
        System.out.println("Минимальный вес остовного дерева: " + PrimAlgorithm());
    }
}

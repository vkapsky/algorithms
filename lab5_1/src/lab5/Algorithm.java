package lab5;

public class Algorithm {

    private int graphLength;
    private int[][] graphMatrix;
    private int MaxVertexes = 1;

    Algorithm(int graphLength, int[][] graphMatrix) {
        this.graphLength = graphLength;
        this.graphMatrix = graphMatrix;
    }

    public void BFS(int v) {

        boolean[] used = new boolean[graphLength]; // массив пометок была ли использована вершина

        int[] queue = new int[graphLength]; // очередь
        for ( int i = 0; i < graphLength; i++){ queue[i] = -1; }//заполнение очереди

        int qH = 0; // голова
        int qT = 0; // хвост

        used[v] = true; // пометка вершины
        queue[qT++] = v; // помещаем ее в очередь
        while (qH < qT) { // пока очередь не пуста
            v = queue[qH++]; // извлекаем текущую вершину
            for (int nv = 0; nv < graphLength; nv++) { // перебираем вершины
                if (!used[nv] && isEdge(v, nv)) { // если nv не помечена и смежна с v
                    /* <обработка вершины nv> */
                    used[nv] = true; // помечаем ее
                    queue[qT++] = nv; // и добавляем в очередь
                }
            }
        }
        this.setMaxVertexes(this.vertexCount(queue));//устанавливаем максимальное число вершин
    }

    public void setMaxVertexes(int MaxVertexes) { this.MaxVertexes = MaxVertexes; }

    public int getMaxVertexes() { return MaxVertexes; }

    public boolean isEdge(int v1, int v2) { return graphMatrix[v1][v2] == 1; }//проверка на смежность

    public int vertexCount(int[] q){//считает количество вершин
        int k = 0;
        for (int i = 0; i < graphLength; i++){
            if (q[i] >= 0) {
                k++;
            }
        }
        return k;
    }

    public boolean isConnected(){//случай, если граф связен, те максимальное число знакомых - число всех вершин
        int max = 0;
        int k;
        for (int i = 0; i < graphLength;i++){//прогоняем алгоритм для каждой вершины, чтобы определить сколько максимально людей могут быть знакомы
            this.BFS(i);
            k = this.getMaxVertexes();
            if ( k > max){ max = k; }
            this.setMaxVertexes(max);
        }
        return graphLength == max;
    }

}

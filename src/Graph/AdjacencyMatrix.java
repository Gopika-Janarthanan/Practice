package Graph;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int[][] graph = { {1,2,3},
                {2,5,7,8},
                {3,5,12},
                {18,39,44}};
        display(graph);

    }
    static void display(int[][] gra){
        for(int[] i: gra){
            for(int j:i){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

}

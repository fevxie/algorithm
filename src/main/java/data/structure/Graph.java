package data.structure;

import java.util.ArrayList;

/*
* 图数据结构
* */
public class Graph {
    private boolean[] isVisisted;
    private ArrayList<String> vertexs;
    private int[][] edges;
    public Graph(int n){
        this.vertexs = new ArrayList<>(n);
        this.edges = new int[n][n];
        this.isVisisted = new boolean[n];
    }

    /*
    * 深度优先遍历（DFS)
    * */
    public void dfs(){
        for(int i=0; i<vertexs.size();i++){
            if(!isVisisted[i]){
                dfs(i);
            }
        }
    }

    public void dfs(int i){
        isVisisted[i] = true;
        for(int j=0;j<vertexs.size(); j++){
            if(!isVisisted[j] && edges[i][j]==1){
                dfs(j);
            }
        }
    }
}

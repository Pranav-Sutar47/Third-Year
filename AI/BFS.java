
import java.util.*;

class BFS{
    LinkedList<Integer> list[];
    Queue<Integer> queue;
    int node;
    
    public BFS(int node){
        this.node = node;
        list = new LinkedList[node];
        queue = new LinkedList<>();
        for(int i=0;i<node;i++)
            list[i] = new LinkedList<>();
    }
    
    public void insertEdge(int v,int w){
        list[v].add(w);
    }
    
    public void bfsTraversal(int n){
        int a = 0;
        boolean visit[] = new boolean[node];
        visit[n] = true;
        queue.add(n);
        
        while(queue.size() != 0){
            n = queue.poll();
            System.out.print(n+" ");
            for(int i=0;i<list[n].size();i++){
                a = list[n].get(i);
                
                if(!visit[a]){
                    visit[a] = true;
                    queue.add(a);
                }
            }
        }
    }
    
}

public class Main
{
	public static void main(String[] args) {
		BFS graph = new BFS(6);
		graph.insertEdge(0, 1);  
        graph.insertEdge(0, 3);  
        graph.insertEdge(0, 4);  
        graph.insertEdge(4, 5);  
        graph.insertEdge(3, 5);  
        graph.insertEdge(1, 2);  
        graph.insertEdge(1, 0);  
        graph.insertEdge(2, 1);  
        graph.insertEdge(4, 1);  
        graph.insertEdge(3, 1);  
        graph.insertEdge(5, 4);  
        graph.insertEdge(5, 3);  
        
        graph.bfsTraversal(0);
	}
}

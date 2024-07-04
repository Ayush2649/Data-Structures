import java.util.*;

public class Course_Schedule_II{

    static class Edge{
        int src;
        int dest;

        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public int[] findOrder(int numCourses, int[][] prerequisites){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int indegrees[] = new int[numCourses];

        for(int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] prerequisite : prerequisites){
            int course = prerequisite[0];
            int prereq = prerequisite[1];
            graph.get(prereq).add(course);
            indegrees[course]++;
        }

        Queue<Integer> q = new LinkedList<>();

        
            for(int i = 0; i < numCourses; i++){
                if(indegrees[i] == 0){
                    q.add(i);
                }
            }

            int order[] = new int[numCourses];
            int index  = 0;

            while(!q.isEmpty()){
            int curr = q.remove();
            order[index++] = curr;

            for(int i = 0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                indegrees[e.dest]--;
                if(indegrees[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        
        if(index != numCourses){
            return new int[0];
        }
        return order;
    }
}

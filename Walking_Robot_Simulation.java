import java.util.*;

public class Walking_Robot_Simulation{

    public static int robotSim(int[]commands, int[][] obstacles){
        int x = 0;
        int y = 0;
        int d = 0;
        int directions[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int maxDistance = 0;
        Set<String> ObstacleSet = new HashSet<String>();

        for(int[] obstacle : obstacles){
            ObstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        for(int cmd : commands){
            if(cmd == -1){
                d = (d + 1) % 4;
            } else if(cmd == -2){
                d = (d + 3) % 4;
            } else {
                for(int i = 0; i< cmd; i++){
                    int nx = x + directions[d][0];
                    int ny = y + directions[d][1];
                    if(ObstacleSet.contains(nx + "," + "ny")){
                        break;
                    }
                    x = nx;
                    y = ny;
                    maxDistance = Math.max(maxDistance, x*x+y*y);
                }
            }
        }
        return maxDistance;
    }

    public static void main(String[] args){
        int[] commands = {4, -1, 3};
        int[][] obstacles = {};
        System.out.println(robotSim(commands, obstacles));
    }
}
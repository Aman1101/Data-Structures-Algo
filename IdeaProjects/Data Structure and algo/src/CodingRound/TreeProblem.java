package CodingRound;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeProblem {

    static int  answer = Integer.MIN_VALUE;

    public int solution (int [] A, int [] E){
        int size = A.length;

        List<List<Integer>> allEdges = new ArrayList<>();

        for(int i = 0; i <= size; i++){
            allEdges.add(new ArrayList<>());
        }

        for (int i = 0; i < size-1; i++){
            allEdges.get(E[i*2]).add(E[i * 2 + 1]);
            allEdges.get(E[i*2+1]).add(E[i*2]);
        }

        int max = dfs(1, 0, A, allEdges);
        answer = Math.max(answer, max);
        return answer -1;
    }

    public static int dfs(int prevVal,int nextVal,int[] A, List<List<Integer>> allEdges){
        List<Integer> v = new ArrayList<>();
        for (int son: allEdges.get(prevVal)){
            if (son != nextVal){
                if (A[son - 1] == A[prevVal - 1]){
                    v.add(dfs(son,prevVal,A,allEdges));
                }
                else{
                    dfs(son,prevVal,A,allEdges);
                }
            }
        }
        v.add(0);
        v.add(0);
        Collections.sort(v);
        Collections.reverse(v);
        answer = Math.max(answer,v.get(0)+v.get(1)+1);
        return v.get(0)+1;
    }
}

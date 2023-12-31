// 2391. Minimum Amount of Time to Collect Garbage

// You are given a 0-indexed array of strings garbage where garbage[i] represents the assortment of garbage at the ith house. garbage[i] consists only of the 
// characters 'M', 'P' and 'G' representing one unit of metal, paper and glass garbage respectively. Picking up one unit of any type of garbage takes 1 minute.
// You are also given a 0-indexed integer array travel where travel[i] is the number of minutes needed to go from house i to house i + 1.
// There are three garbage trucks in the city, each responsible for picking up one type of garbage. Each garbage truck starts at house 0 
// and must visit each house in order; however, they do not need to visit every house.
// Only one garbage truck may be used at any given moment. While one truck is driving or picking up garbage, the other two trucks cannot do anything.
// Return the minimum number of minutes needed to pick up all the garbage.
// Example 1:
// Input: garbage = ["MMM","PGM","GP"], travel = [3,10]
// Output: 37
// Explanation:
// The metal garbage truck takes 7 minutes to pick up all the metal garbage.
// The paper garbage truck takes 15 minutes to pick up all the paper garbage.
// The glass garbage truck takes 15 minutes to pick up all the glass garbage.
// It takes a total of 7 + 15 + 15 = 37 minutes to collect all the garbage.
// Constraints:
// 2 <= garbage.length <= 105
// garbage[i] consists of only the letters 'M', 'P', and 'G'.
// 1 <= garbage[i].length <= 10
// travel.length == garbage.length - 1
// 1 <= travel[i] <= 100



// Time:O(10n + n)   [ as max length of one string can not be more than 10]
// Space:O(1)
public class Q2391_minimum_time_collect_garbage {
    public int garbageCollection(String[] garb, int[] trav) {
        int n=trav.length;
        int time = 0, p=0, m=0, g=0;

        for(int i=0; i<=n; i++){
            for(int j=0; j<garb[i].length(); j++){
                time++;

                if(garb[i].charAt(j) == 'P') p=i;
                else if(garb[i].charAt(j) == 'M') m=i;
                else if(garb[i].charAt(j) == 'G') g=i;
            }
        }

        for(int i=1; i<n; i++) trav[i] = trav[i]+trav[i-1];

        if(p!=0) time += trav[p-1];
        if(m!=0) time += trav[m-1];
        if(g!=0) time += trav[g-1];

        return time;
    }
}

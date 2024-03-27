//https://leetcode.com/problems/maximum-population-year/
class Solution {
    public int maximumPopulation(int[][] logs) {
        //Initializing an array to store population change for each year
        int []populationChange=new int[101];//2050-1950+1=101
        // Calculate population change for each year based on logs
        for(int[] log:logs)
        {
            populationChange[log[0]-1950]++;// Increment for birth year
            populationChange[log[1]-1950]--;// Decrement for death year
        }
        int maxPopulation=0;
        int maxPopulationYear=0;
        int currentPopulation=0;
        // Iterate through the populationChange array to find the year with maximum population
        for(int i=0;i<populationChange.length;i++)
        {
            currentPopulation+=populationChange[i];
            if(currentPopulation>maxPopulation)
            {
                maxPopulation=currentPopulation;
                maxPopulationYear=1950+i;// Convert index back to year
            }
        }
        return maxPopulationYear;
    }
}
import java.util.*;

public class SubsetwithoutRepetition {
    public static void main(String[] args) {
        int []arr={1,2,2};
        System.out.println(subseq(arr));
    }
    static List<List<Integer>> subseq(int[] arr)
    {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int n=arr.length;
        int start=0;
        int end=0;
        for(int i=0;i<n;i++)
        {

            int len=outer.size();
            start=0;
            if(i>0&&arr[i]==arr[i-1]){
                start=end+1;
                
            }
            else{
                end=outer.size()-1;
            }
            for(int j=start;j<len;j++){
            List<Integer> inner=new ArrayList<>(outer.get(j));
            inner.add(arr[i]);
            outer.add(inner);
            }

        }

        return outer;
    }
}

// With better naming
/*
 import java.util.*;

public class SubsetWithoutDuplicates {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2};
        System.out.println(generateSubsets(inputArray));
    }

    static List<List<Integer>> generateSubsets(int[] array) {
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        
        int arrayLength = array.length;
        int subsetStartIndex = 0;
        int previousEndIndex = 0;

        for (int i = 0; i < arrayLength; i++) {
            subsetStartIndex = 0;

            if (i > 0 && array[i] == array[i - 1]) {
                subsetStartIndex = previousEndIndex + 1;
            }

            previousEndIndex = subsets.size() - 1;
            int currentSubsetsSize = subsets.size();

            for (int j = subsetStartIndex; j < currentSubsetsSize; j++) {
                List<Integer> newSubset = new ArrayList<>(subsets.get(j));
                newSubset.add(array[i]);
                subsets.add(newSubset);
            }
        }

        return subsets;
    }
}

 */

//  Class name: Changed to SubsetWithoutDuplicates to better describe its purpose.
// Function name: Changed to generateSubsets to reflect the action performed.
// Variable names: Changed to more descriptive names:
// arr to array
// outer to subsets
// n to arrayLength
// start to subsetStartIndex
// end to previousEndIndex
// len to currentSubsetsSize
// inner to newSubset
// https://leetcode.com/problems/sorting-the-sentence/description/

class Solution {
    public String sortSentence(String s) {
        String[] stringArray = s.split(" ");
        int n = stringArray.length;

        for (int i = 0; i < n; i++) {
            while (true) {
                int correctIndex = Character.getNumericValue(stringArray[i].charAt(stringArray[i].length() - 1)) - 1;
                if (correctIndex == i) {
                    break;
                }
                swap(stringArray, i, correctIndex);
            }
        }

        // Remove the digits from the words after sorting
        for (int i = 0; i < n; i++) {
            stringArray[i] = stringArray[i].substring(0, stringArray[i].length() - 1);
        }

        return String.join(" ", stringArray);
    }

    void swap(String[] stringArray, int i, int j) {
        String temp = stringArray[i];
        stringArray[i] = stringArray[j];
        stringArray[j] = temp;
    }
}

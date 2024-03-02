public class Contains {
    /**
     * Searches the given array to check if it contains the target value.
     *
     * @param arr    array to be searched.
     * @param target the value that the method should be searching for.
     * @return true if arr contains target, false otherwise.
     */
    public boolean arrayContains(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return false; // Return false for an empty or null array.
        }

        for (int value : arr) {
            if (value == target) {
                return true; // Return true if the target value is found.
            }
        }

        return false; // Return false if the target value is not found in the array.
    }
}
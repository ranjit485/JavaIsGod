package two;

//Write a Java program to find the smallest and second smallest elements of a given array.
public class SmallestSecondSmallest {
    public static void main(String[] args) {
// Example array
        int[] array = {12, 3, 5, 7, 19, 3, 10};
// Call the method to find the smallest and second smallest elements
        int[] result = findSmallestAndSecondSmallest(array);
// Display the results
        if (result != null) {
            System.out.println("Smallest element: " + result[0]);
            System.out.println("Second smallest element: " + result[1]);
        } else {
            System.out.println("Array doesn't have a second smallest element.");
        }
    }
    // Method to find the smallest and second smallest elements in an array
    public static int[] findSmallestAndSecondSmallest(int[] array) {
// If the array has less than two elements, return null
        if (array.length < 2) {
            return null;
        }
// Initialize the smallest and second smallest to maximum value
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
// Loop through the array to find smallest and second smallest
        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest; // Update second smallest
                smallest = num; // Update smallest
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num; // Update second smallest
            }
        }
// If second smallest is not updated, return null (indicating no second smallest)
        if (secondSmallest == Integer.MAX_VALUE) {
            return null;
        }
// Return the smallest and second smallest as an array
        return new int[]{smallest, secondSmallest};
    }
}
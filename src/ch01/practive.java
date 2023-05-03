package ch01;

public class practive {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {2,3,4,5,6};
		int target = 7;
		int count = findParisWithtargetSum(arr1, arr2, target);
				System.out.println(count);
	}
	public static int findParisWithtargetSum(int[] arr1, int []arr2, int target) {
		int count = 0;
		int n1 = arr1.length;
		int n2 = arr1.length;
		int i = 0;
		int j = n2-1;
		while(i<n1 && j>=0) {
			int sum = arr1[i]+arr2[j];
			if (sum == target) {
				count++;
				i++;
				j--;
			}else if (sum<target) {
				i++;
			}else {
				j--;
			}
		}
		return count;
	}
}

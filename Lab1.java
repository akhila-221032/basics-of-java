
//....................................................
/*import java.util.Scanner;
class Lab1{
	public static void main(String[] args){
		int arr[],i,j,temp;
		System.out.println("hello world and enter a value");
	Scanner sc=new Scanner(System.in);
	arr=new int[5];
	for(i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
		
	}
	
	for(i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
System.out.println("reverse array");
for(i=arr.length-1;i>=0;i--){
		System.out.println(arr[i]);
	}
}
}
//......................................................
import java.util.Arrays;
import java.util.Scanner;

class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter 'L' to reverse left half or 'R' to reverse right half:");
        char choice = scanner.next().charAt(0);

        int mid = n / 2;

        if (choice == 'L' || choice == 'l') {
            reverseArray(arr, 0, mid - 1);
        } else if (choice == 'R' || choice == 'r') {
            reverseArray(arr, mid, n - 1);
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}*/

//....................................................................................
/*import java.util.Arrays;
import java.util.Scanner;
class Lab1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int temp;
        for (int i = 0; i < n; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 1; i < n; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}*/
//.....................................................................
/*import java.util.Scanner;

class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[n - 1];
                    n--;
                    j--;
                }
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//..........................................................................

import java.util.Arrays;
import java.util.Scanner;

class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter 'L' to reverse left half or 'R' to reverse right half:");
       char choice=scanner.next().charAt(0);

        int mid = n / 2,i;

        if (choice == 'L' || choice == 'l') {
		reverse(arr,0,mid-1);
			
          } 
	else if (choice == 'R' || choice == 'r') {
	reverse(arr,mid,n-1);
	}		
 
  System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
*/
import java.util.Scanner;
class Lab1{
	public static void main(String[] args){
		int arr[],i,j,temp;
		System.out.println("hello world and enter a value");
	Scanner sc=new Scanner(System.in);
System.out.println("enter");
	int n=sc.nextInt();
	arr=new int[n];
	for(i=0;i<n;i++){
		arr[i]=sc.nextInt();
		
	}
	
	for(i=0;i<n;i++){
		System.out.println(arr[i]);
	}
	for(i=0;i<n;i++){
	for(j=i+1;j<n;j++){
		if(arr[i]==arr[j]){
			arr[j]=arr[n-1];
				n--;
				j--;
}
}
}
System.out.println("enter");
for(i=0;i<n;i++){
		System.out.println(arr[i]);
	}
	}
}












	
















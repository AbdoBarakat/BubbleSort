
package bubblesort;

public class BubbleSort {
    
    public static void print (int [] a) {        
        System.out.printf("{%d", a[0]);        
        for (int i = 1; i < a.length; i++) {
            System.out.printf(", %d", a[i]);
        }        
        System.out.println("}");
    }
    
    public static void swap (int [] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
    }
    
    public static void bubbleSort (int [] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length - i; j++) {
                 if (a[j-1] > a[j]) {
                swap(a, j-1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
          int [] a = {42, 77, 35, 12, 101, 5};
          print(a);
          bubbleSort(a);  
          print(a);
    }
}
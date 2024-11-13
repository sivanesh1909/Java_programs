public class Selectionsort {
    void selection(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int s = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[s] > a[j]) {
                    s = j;
                }
            }
            int temp = a[s];
            a[s] = a[i];
            a[i] = temp;
        }
        System.out.println("Array after sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]) {
        int a[] = {12, 6, 7, 13, 4};
        Selectionsort obj = new Selectionsort();
        obj.selection(a);
    }
}

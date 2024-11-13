class Binary_search 
{
public int binary_search(int arr[], int x) 
{
int low = 0, high = arr.length - 1;
while (low <= high) 
{
int mid = low + (high - low) / 2;
if (arr[mid] == x) 
{
return mid;
} 
else if (arr[mid] < x) 
{
low = mid + 1;
} 
else 
{
high = mid - 1;
}
}
return -1;
}
public static void main(String args[]) {
int target = 3;
int[] arr = {0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
Binary_search s = new Binary_search();
int result = s.binary_search(arr, target);
if (result == -1) {
System.out.println("Target not found");
} 
else 
{
System.out.println("Target found at position " + result);
}
}
}

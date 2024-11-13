/* Linear Search */
class Linear_search
{
public static void main(String args[])
{
int target=55;
int[] arr={1,2,3,4,5,6,7,8,9,10};
int arr_length=arr.length;
for(int i=0;i < arr_length;i++)
{
if(arr[i] == target)
{
System.out.println("Target found in "+i+" position");
return;
}
}
System.out.println("Target not found");
}
}



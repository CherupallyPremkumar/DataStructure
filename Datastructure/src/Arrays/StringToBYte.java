package Arrays;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.*;

class Sort {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void sort(String str)
    {
//        char[] c=str.toCharArray();
//        List<Character[]> ll= (List<Character[]>) List.of(c);
//        System.out.println(ll.get(0));
//
//       String[] a={"1","2"};
//       List<String> l=new ArrayList<>();
//       Collections.addAll(l,a);
//        System.out.println(l);

    }
    public static void subListInList(List<Integer> l)
    {
        List<Integer> sunblist=l.subList(2,5);
        System.out.println(Collections.max(l));//max
        System.out.println(Collections.min(l));//min
        System.out.println(sunblist);
    }
    public static int[] swap(int[] arr ,int left ,int right)
    {
       int temp=0;
       temp=arr[left];
       arr[left]=arr[right];
       arr[right]=temp;
       return arr;
    }

    public static void segregation0sAnd1s(int[] arr)//{1,0,0,1,0,1,0,1,0};
    {
        int left =0;
        int right=arr.length-1;
     while(left<right)
     {
         if(arr[left] > arr[right])
         {
             swap(arr ,left ,right);
             left++;
             right--;
             continue;

         }else if(arr[left] <arr[right])
         {
             left++;
             right--;
             continue;
         }
         else if(arr[left]==arr[right]);
         {
             if(arr[left]==1)
             {
                 right--;
             }else if(arr[right]==0)
             {
                 left++;
             }
         }
     }
        System.out.println(Arrays.toString(arr));
    }

}
public class StringToBYte {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*int[][] arr
                = { { 5, 2, 0, 7, 1 }, { 3, 4, 2, 9, 14 },
                { 5, 1, 3, 5, 2 }, { 4, 2, 6, 2, 1 },
                { 0, 6, 3, 5, 1 }, { 1, 4, 7, 2, 8 } };
        for (int i = 0; i < arr.length; i++) {
            int[] a = new int[arr.length];
            for (int j = 0; j < arr.length; j++) {
                a[j] = arr[j][i];
            }
            Sort.sort(a);
            for (int j = 0; j < a.length; j++) {
                arr[j][i] = a[j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();*/
        Sort.sort("Premkumar");
        ArrayList<Integer>
                arrlist = new ArrayList<Integer>();
        int arr[] = new int[] { 1,1,1,1,1,0,0,1,0,1,0, 1, 0, 1, 1, 1 };
        // Populating arrlist1
        arrlist.add(1);
        arrlist.add(4);
        arrlist.add(9);
        arrlist.add(25);
        arrlist.add(36);
        Sort.segregation0sAnd1s(arr);
    }
    }



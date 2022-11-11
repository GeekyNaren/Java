import java.util.*;
import java.util.Map.Entry;

//2 1 2 3 3 4 4 4 fre of element, 3 2
public class secondHeighestFreq 
{
    static int frequncies(int arr[],int n)
    {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i=0;i<n;i++)
            {
                int key = arr[i];
                if(map.containsKey(key))
                {
                    int freq = map.get(key);
                    freq++;
                    map.put(key,freq);
                }
                else
                {
                    map.put(key,1);
                }

            }
            int max_first = 0, max_second=0, max_third=0,res=1;

            for(Entry<Integer,Integer> val:map.entrySet())
            {
                if(max_first < val.getValue())
                {
                    res = val.getKey();
                    max_first = val.getValue();
                }
                if(max_second < max_first){
                    res = val.getKey();
                    max_second = val.getValue();
                }
                if(max_third < max_second){
                    res = val.getKey();
                    max_third = val.getValue();
                }
            }
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        System.out.print("Enter array elements: ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print(frequncies(arr,size));
        sc.close();
    }
}

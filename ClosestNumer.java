import java.util.*;
import java.io.*;

class ClosestNumber{
public static void main(String args[])
{
int[] arr = {0,2,3,4,5};

int cz = 0;
int diff = Integer.MAX_VALUE;
for (int i = 0; i < arr.length; ++i) {
    int abs = Math.abs(arr[i]);
    if (abs < diff) {
        cz= i;
        diff = abs;
    } else if (abs == diff && arr[i] > 0 && arr[cz] < 0) {
        //same distance to zero but positive 
        cz =i;
    }
}   
System.out.println(arr[cz ]);
}
}
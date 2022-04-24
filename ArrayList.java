import java.util.*;
int[] arr = {1,4,5,6,7,-1};

int closestIndex = 0;
int diff = Integer.MAX_VALUE;
for (int i = 0; i < arr.length; ++i) {
    int abs = Math.abs(arr[i]);
    if (abs < diff) {
        closestIndex = i;
        diff = abs;
    } else if (abs == diff && arr[i] > 0 && arr[closestIndex] < 0) {
        //same distance to zero but positive 
        closestIndex =i;
    }
}   
System.out.println(arr[closestIndex ]);
//closest to zero
                

import java.util.*;
import java.lang.*;
import java.io.*;


class QUESTION
{   // start is 0 and end is length of array -1
	public static int [] reverse( int [] arr, int start, int end ) 
	{ 
        int temp;
        while (start < end)
        {
            temp = arr[start]; 
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
	}
}

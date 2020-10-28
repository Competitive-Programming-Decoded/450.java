
import java.util.*;
import java.lang.*;
import java.io.*;


class QUESTION
{
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

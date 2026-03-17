/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception{
		//code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t > 0){
		    int n = Integer.parseInt(br.readLine());
		    String s = br.readLine();
		    String sArr[] = s.trim().split("\\s+");
		    int[] arr = new int[n];
		    for(int i = 0; i < n; i++){
		        arr[i] = Integer.parseInt(sArr[i]);
		    }
		    doRearrange(arr, n);
		    t--;
		}
	}
	public static void doRearrange(int[] arr, int n){
	    HashMap<Integer, Integer> mp = new HashMap<>();
	    for(int num : arr){
	        mp.put(num, mp.getOrDefault(num, 0)+1);
	    }
	    
	    int[] unique = new int[mp.size()];
	    int idx = 0;
	    for(int key : mp.keySet()){
	        unique[idx++] = key;
	    }
	    Arrays.sort(unique);
	    int maxFrequency = 0;
	    for(int val : mp.values()){
	        if(val > maxFrequency){
	            maxFrequency = val;
	        }
	    }
	    
	    for(int f = maxFrequency; f >= 1; f--){
	        for(int i = 0; i < unique.length; i++){
	            if(mp.get(unique[i]) == f){
	                for(int j = 0; j < f; j++){
	                    System.out.print(unique[i] + " ");
	                }
	            }
	        }
	    }
	    System.out.println();
	}
}

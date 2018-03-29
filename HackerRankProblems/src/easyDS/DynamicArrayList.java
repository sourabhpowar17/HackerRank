package easyDS;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayList {
	
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	 Scanner sc=new Scanner(System.in);
	 int N=sc.nextInt();
	 int Q=sc.nextInt();
	 int array[][]=new int[Q][3];
	 for (int i=0;i<Q;i++)
		 for(int j=0;j<3;j++)
		 {
			 array[i][j]=sc.nextInt();
		 }
	 /*for (int i=0;i<Q;i++)
		 for(int j=0;j<3;j++)
		 {
			 System.out.print(array[i][j]);
		 }*/
	 ArrayList<ArrayList<Integer>> seqlist=new ArrayList<ArrayList<Integer>>(N);
	 //for (int i=0; i<N;i++)
		//seqlist.add(new ArrayList<Integer>(1));

	 int lastanswer=0;
		 for(int i=0;i<Q;i++)
		 {
			 if(array[i][0]==1)
			 {
				 //System.out.println("index="+(array[i][1]^lastanswer)%N);
				 try {
				 seqlist.get(((array[i][1]^lastanswer)%N)).add(array[i][2]);
				 }
				 catch (IndexOutOfBoundsException e) {
					// TODO: handle exception
					 System.out.println(((array[i][1]^lastanswer)%N));
					 
					 seqlist.add(855, new ArrayList<Integer>(N));
					 seqlist.get(((array[i][1]^lastanswer)%N)).add(array[i][2]);
				}
				 
			 }
			 if(array[i][0]==2)
			 {
				// System.out.println(seqlist.get(((array[i][1]^lastanswer)%N)));
				 lastanswer=seqlist.get(((array[i][1]^lastanswer)%N)).get(array[i][2]%N);
				 System.out.println(lastanswer);
				 
			 }
		 }
	 }

}

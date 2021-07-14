package ram;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
      
       for (int i = 0; i < n; i++)
       {
		  String sc=s.next();
		  int a[]=new int[128];
		  char b[]=new char[128];
		  for (int j = 0; j < sc.length(); j++)
		   {
			  a[sc.charAt(j)]=0;
			  int count=0;
			  for (int k = 0; k < sc.length(); k++)
			  {
				if(sc.charAt(k)==sc.charAt(j) && a[sc.charAt(j)]==0)
				{
					count++;
				}
			   }
			  a[sc.charAt(j)]=count;
			  b[sc.charAt(j)]=sc.charAt(j);
		   }
		  int arraycnt=0;
		  for (int j = 0; j < a.length; j++) 
		  {
			if(a[j]>0)
				arraycnt++;
		   }
		  System.out.println(arraycnt);
		  char c[]=new char[arraycnt];
		  int index=0;
		  for (int k = 0; k < sc.length(); k++)
		  { 
			   int rank=0;
			   for (int j = 0; j < k; j++) 
			   {
				 if(sc.charAt(k)==sc.charAt(j))
					 rank++;
			   }
			   if(rank==0)
				   c[index++]=sc.charAt(k);
			
		   }
		  int d[]=new int[arraycnt];
		  int index1=0;
		  for (int k = 0; k < a.length; k++) 
		  {
			if(a[k]>0)
				d[index1++]=a[k];
		  }
		  for (int k = 0; k < d.length; k++) 
		  {
			for (int j = k+1; j < d.length; j++) 
			{
				if(d[k]>d[j])
				{
					int temp=d[k];
					d[k]=d[j];
					d[j]=temp;
					
					char temp1=c[k];
					c[k]=c[j];
					c[j]=temp1;
				}
			}
		}
		  System.out.println(Arrays.toString(c));
		  System.out.println(Arrays.toString(d));
		  int count2=d[0];
		  int count3=d[1];
		  int total=0;
		  for (int k = 2; k < d.length; k++) 
		  {
			total=count2+count3;
			count2=count3;
			count3=total;
		  }
		  if(total==d[d.length-1])
			  System.out.println("Dynamic");
		  else
			  System.out.println("Not");
	    }
       
	}

}

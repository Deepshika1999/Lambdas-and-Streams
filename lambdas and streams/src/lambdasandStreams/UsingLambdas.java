package lambdasandStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


public class UsingLambdas {

	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the no. of Strings in a List:");
		int n=Integer.parseInt(br.readLine());
		ArrayList<String>List1=new ArrayList<String>();
		//System.out.println("Enter any "+n+"Strings:");
		while(n!=0)
		{
			System.out.println("Enter any "+n+"String:");
			String s=br.readLine();
			List1.add(s);
			n--;
		}
		System.out.println("Enter the no. of integers in a list:");
		int n1=Integer.parseInt(br.readLine());
		ArrayList<Integer>List2=new ArrayList<Integer>();
		//System.out.println("Enter any "+n1+"integers:");
		while(n1!=0)
		{
			System.out.println("Enter any "+n1+"integer:");
			int t=Integer.parseInt(br.readLine());
			List2.add(t);
			n1--;
		}
		UsingLambdas obj=new UsingLambdas();
		System.out.println("Average of List of Integers:"+"  "+obj.averageOfIntegers(List2));
		System.out.println("List of Strings Starting with 'a' and containg excating 3letters:"+"  "+obj.lambdasStreams(List1));
		System.out.println("List of palindromic Strings:"+"  "+obj.palindromeOrNot(List1));
		
	}
	ArrayList lambdasStreams(ArrayList List1)
	{
		ArrayList<String> newList=(ArrayList<String>) List1.stream()
		.filter(p -> ((String) p).startsWith("a"))
		.filter(p ->((String)p).length()==3)
		.collect(Collectors.toList());
		return newList;
	}
	int averageOfIntegers(ArrayList List2)
	{
		int c=0;
		for(int i=0;i<List2.size();i++)
		{
			int k=(int) List2.get(i);
			c=c+k;
			
		}
		c=c/List2.size();
		return c;
		
	}
	public static ArrayList palindromeOrNot(ArrayList List1)
	{
		ArrayList<String> newList=new ArrayList<>();
		int f=0;
		for(int i=0;i<List1.size();i++)
		{
			String s=(String) List1.get(i);
			for(int j=0;j<(s.length())/2;j++)
			{
				if(s.charAt(j)!=s.charAt((s.length())-j-1))
				{
					f=1;
				}
			}
			if(f==0)
			{
				newList.add(s);
			}
			else
				f=0;
		}
		return newList;
	}
}

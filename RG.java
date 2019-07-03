
public class RG{

 
	     final static int NO_OF_CHARS=256;
	     static int max_distinct_char(String str,int n)
	     {
	         int count[]=new int[NO_OF_CHARS];
	         for(int i=0;i<n;i++)
	         {
	             count str.charAt(i)++;
	         }
	         int max_distinct=0;
	         for(int i=0;I<NO_OF_CHARS;i++)
	         {
	            if(count[i]!=0)
	            {
	                max_distinct++;
	            }}
	            return max_distinct;
	     }
	     static int smallestSubstr_maxDistintChar(String str)
	     {
	         int n=str.length();
	         int max_distinct=max_distinct_char(str,n);
	         int min1=n;
	         for(int i=0;i<n;i++)
	         for(int j=0;j<n;j++)
	         {
	             String subs=null;
	             if(i<j)
	             subs=str.substring(i,j);
	             elsesubs=str.substring(j,i);
	             int subs.length=subs.length();
	             int sub_distinct_char=max_distinct_char(subs,subs_length);
	             if(subs_length<min1 && max_distinct==sub_distinct_char)
	             {
	                 min1+subs_length_length;
	             }
	         }}
	         return min1;
	}
	       static public void main(String[]args)
	       {
	           String str="abcda";
	           int len=smallesteSuubstr_maxDistinctChar(str);
	           System.out.println("The length of smallest substring"+"consisting of maximum distinct"+"characters:"+len);}
}
	       }
	       }

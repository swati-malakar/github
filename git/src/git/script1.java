package git;

public class script1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String a="hello hi how are you";
     String arr[]=a.split(" ");
     for(int i=0; i<=arr.length-1; i++)
     {
    	 if(i==3)
    	 {
    		 String k=arr[i];
    		 String rev=" ";
    		 for(int l=k.length()-1; l>=0; l--)
    		 {
    			 rev=rev+k.charAt(l);
    		 }
    		 System.out.println(rev);
    	 }
     }
	}

}

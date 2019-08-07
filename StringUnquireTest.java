/**
 * @author govind.sharma
 */
public class StringUnquireTest {

    
    public static void main(String[] args) {
	
	   String str="chaining ";
	   boolean flag=false;
	   char [] ch=str.toCharArray();
	   
	   for (int i = 0; i < ch.length; i++) {
	          for (int j= i+1; j < ch.length; j++) {
		        if(ch[i]==ch[j])
		               flag=true;
		   }
	   }
	String  s= (flag==false)  ? "Unique" : "Not Unique" ;
	   System.out.println("Val "+str+" "+s);
	   
    }

}


public class UserDefinedException {
public static void main(String[] args) {
	int i,j;
	i=8;
	j=9; 
	try {
	int k=i/j;
	
	if(k==0) {
		throw new MyOwnException("This is not possuble");
	}
	System.out.println(k);
     
	}
	 catch(MyOwnException e){
		 System.out.println("Error");
		 System.out.println(e.getMessage());
	 }
}
}

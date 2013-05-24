public class FatorialRecursivo{
	
 public static void main(String args[]){
 
	for(int i=0; i < args.length; i++){
		int n = Integer.parseInt(args[i]);
		//System.out.print("Fatorial de: "+args[i]+" eh :");
		System.out.println(fatorial(n));
	}

 }
 
 public static int fatorial (int n){
	if(n==1)
		return 1;
	else
		return n * fatorial(n-1); 
 }

}
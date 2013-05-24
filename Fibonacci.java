public class FibonacciRecursivo{
	
 public static void main(String args[]){
	
	int n = Integer.parseInt(args[0]);
	
	for(int i=0; i < n; i++){
		//System.out.println("Fibonacci de: "+i+" eh: ");
		System.out.println(fibonacci(i)););
	}
	
 }
 
 public static int fibonacci (int n){
	//Utilizando operador ternário
	return (n < 2) ? n : fibonacci(n - 1) + fibonacci(n - 2);
	
	//Modo tradicional
	/*if(n < 2) 
		return n;
	else 
		return fibonacci(n-1)+fibonacci(n-2);*/
		
 }

}
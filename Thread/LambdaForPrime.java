package Lambda;

	interface Prime{
		boolean isPrime(int num);
	}
	public class LambdaForPrime {
		
		public static void main(String args[]) {
			Prime prime=(num)->{
				boolean check=false;
				if(num==1 || num==2) {
					check=false;
				}
				else {
							
					for(int i=2;i<=num/2;i++) {
						if(num%i==0) {
							check=true;
							break;
						}
						
					}
				}
				return check;
			};
			boolean result=prime.isPrime(9);
			System.out.println("The given number is : "+(result==true?"Not Prime":"Prime"));
		}

	}



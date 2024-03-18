package com.javaex;

import java.util.Scanner;

public class Practice3_Loop {
	
/*			
 * 			[Ex01.java]
				아래의 출력결과를 예상하여 작성하세요.(코드를 작성해서 예상과 맞는지 확인해 보세요.)
				
					정답: 
					
					public static void main(String[] args) {
		
					System.out.println(" While문 ");
		
					int index = 0;
					while(index < 3) {
					System.out.println(" index = " + index );
					index++;
						}	
		
					System.out.println(" for문 ");
					for(int order = 0; order < 3; order++) {
					System.out.println(" order= " + order);
					}
					
					 While문 
					 index = 0
					 index = 1
					 index = 2
					 for문 
					 order= 0
					 order= 1
					 order= 2
					 
			[Ex02.java]
				아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.)
				
				정답: *이 두개씩 네쌍으로 나옴 
				
				public static void main(String[] args) {
					
					int x, y;
					for(x=0;x<4; x++) {
						for(y=0; y<2; y++) {
							System.out.println("*");
						}
						System.out.println("");
					}
					
				}
				
				
				
			[Ex03.java]
				아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.)
			정답: *이 무한정 나옴 
			
			public static void main(String[] args) {
			
			int x, y;
			for(x=0; x<4;x--) {
				for(y=2; y>0; y--)
				System.out.println("*");
			}
			
				System.out.println("");
			}
				
			[Ex04.java]
				아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.)
			정답: 1
				2
				3
				4
				============
				10
				8
				6
				4
				2
				
			public static void main(String[] args) {
			for(int i=1; i<5; i++) {
				System.out.println(i);
			}
			System.out.println("=================");
			
			for(int i = 10; i>0; i=i-2) {
				System.out.println(i);
			}
			
			
			[Ex05.java]
				아래의 출력결과를 예상하여 작성하세요. (코드를 작성해서 예상과 맞는지 확인해 보세요.)
			 	정답:
				public static void main(String[] args) {
					int i=1;
					boolean flag = true;
					
					while(flag) {
						if(i>=5) {
							flag = false;
						}
						System.out.println(i);
						i = i+1;
					}
					
		
			[Ex06.java]
				1에서 100까지의 수에서 5의배수 이면서 7의 배수인 수를 출력하세요
				정답:
				
					public static void main(String[] args) {
					for(int i = 1; i<=100; i++) {
						if(i%5==0 && i%7==0) {
							System.out.println(i);
						}
					}
					
					
 			[Ex07.java]
				숫자를 입력 받아 아래와 같이 출력하세요
					
				정답: 
						
					public static void main(String[] args) {
		
					Scanner scanner = new Scanner(System.in);
		
					System.out.println("숫자를 입력하세요.");
					int num = scanner.nextInt();
		
					for(int i = 1; i <= num; ++i) {
						System.out.println(i);
					}	
		
					scanner.close();
	}
}
	
	
			[Ex08.java]
				아래와 같이 구구단을 출력하세요
				
				정답: 
				public static void main(String[] args) {
					for(int dan = 1; dan <10; dan++) {
					 for(int i = 1; i <10; i++) {
						System.out.print(dan + "*" + i + "=" + dan*i);
						System.out.print('\t');
					}
					System.out.println();
					}
					
					
			  [Ex09.java]
				다음과 같이 출력하세요
				
				정답: 
				
				  for(int i = 1; i <= 10 ; i++) {
					for(int e = 1; e <= 10; e++) {
						System.out.print(e + " " + '\t');
						}
					System.out.println(i + " " + '\t');
					}
					
					
					
					
					
			 [Ex10.java]
				다음과 같이 출력하세요
				
				정답: 
					Scanner scanner = new Scanner(System.in);
					
					System.out.println(" 숫자를 입력하세요. \n 숫자: \n 숫자: \n 숫자: \n 숫자: \n");
					int a,b,c,d,e = scanner.nextInt();
					int max = scanner.nextInt();
					
					if(a <= b && a <= c) {
						System.out.println("최대값은 " + max + "입니다.");
					} 
					
					
					scanner.close();
					
					
			[Ex11.java]
				다음과 같은 프로그램을 작성하세요
				a. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
				- 예) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 )
				b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
				- 예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )	
				
				정답: 
				
							
			[Ex12.java]
				팩토리얼은 다음과 같이 정의된다. 숫자를 1개 입력 받아 팩토리얼 값을 출력하세요.
				5 입력시 1*2*3*4*5 의 값이 출력됩니다.
				7 입력시 1*2*3*4*5*6*7 의 값이 출력됩니다.
				팩토리얼 공식 𝐧! = 𝟏 × 𝟐 × 𝟑 × ⋯ × 𝐧
				
				정답: 
			
			
			
			
			
					
					
					
					
			[Ex13.java]
				아래와 설명에 맞는 프로그램을 작성하세요
				숫자를 1개 입력 받아 입력한 숫자까지 누적합계를 구하는 프로그램을 작성하세요.
				예를 들어 100을 입력 받는다면 아래와 같이 계산됩니다.
				𝟏 + 𝟐 + 𝟑 + 𝟒 + 𝟓 + ⋯ + 𝟗𝟗 + 𝟏𝟎𝟎
				
				정답: 
								
					Scanner scanner = new Scanner(System.in);
					int num;
					
					System.out.print("숫자를 입력하세요: ");
					num = scanner.nextInt();
					
					int sum=0;
					
						for(int i = 1; i <= num; i++  ) {
							
							sum += i;
						}
							System.out.println("결과값: " + sum );
							
							
			[Ex15.java]
				아래와 설명에 맞는 프로그램을 작성하세요
				숫자를 1개 입력 받아 입력한 수의 약수를 모두 출력하세요
				예를 들어 10을 입력한 경우 1, 2, 5, 10 이 출력된다.
				
				정답: 
					Scanner sc = new Scanner(System.in);
				     
				    System.out.print("숫자를 입력하세요: ");   
				        int num = sc.nextInt();
				        
				        for(int i = 1; i<=num; i++){
				            if(num % i ==0){
				                System.out.print(i + "\n");
				            }
				        }
				        
			[Ex16.java]
				아래와 설명에 맞는 프로그램을 작성하세요
				숫자를 1개 입력 받아 5의 배수의 개수와 합을 출력하는 프로그램을 작성하세요
				예를 들어 22을 입력한 경우 5의배수 개수: 4, 5의배수 합: 50 이 출력된다.
				- 5의배수 개수 : 5, 10, 15, 20 → 4개
				- 5의배수 합 : 5+10+15+20 → 50	    
				정답:
				
				
				        
				        
				        
				        
			[Ex17.java]
				숫자 하나를 입력 받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요.
				정답: 
				    Scanner sc = new Scanner(System.in);
				     
				    System.out.print("숫자를 입력하세요: ");   
				    int num = sc.nextInt();
				    
				    for(int i=0;i<=num;i++){
				    	for(int j=0;j<i;j++){
				    		System.out.print("*");
				    	}
				    	System.out.println("");
				    }
			
						
		
		
				
							
						
		
				
					
					
	
	*/
	
	public static void main(String[]args) {

	     Scanner sc = new Scanner(System.in);
	     
	    System.out.print("숫자를 입력하세요: ");   
	    int num = sc.nextInt();
	    
	    for(int i=0;i<=num;i++){
	    	for(int j=0;j<i;j++){
	    		System.out.print("*");
	    	}
	    	System.out.println("");
	    }

			
		
		
		
		
		
		
			}



		

}

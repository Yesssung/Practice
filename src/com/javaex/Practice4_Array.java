package com.javaex;

import java.util.Scanner;

public class Practice4_Array {

	
/*			
			[문제] Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 오류 수정 후 출력결과를 예상하고 코드로
					   확인해 보세요.
				[코드]
				[오류메세지]
				정답: 인덱스 길이 가 맞지 않음 5개 공간인데 3개 뿐임
					int[] intArray = new int[5];
						intArray[0] = 3;
						intArray[1] = 7;
						intArray[2] = 12;
						intArray[3] = 12;
						intArray[4] = 12;
		
							
						int result = 0;
						
						for(int i = 0; i < intArray.length; i++) {
							result = result + intArray[i];
						}
					System.out.println(result);
				
 			
 			[문제] Ex02 double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문
					   을 작성하세요.
					   
				정답: 	
				double num[] = {
				1.2,
				3.3,
				6.7
				}; 
				for(int i = 2; i <= num.length; i-- ) {
					System.out.printf("%.1f %n",
							num[i]
									);
				
				}
						
			[문제] Ex03 아래코드의 출력 값을 예상하고 코드로 확인해 보세요.
			
				정답: 20
					 6
					 10
					int[] intA = {3,6,9};
					
					int[] intB;
					intB = intA;
					intB[0] = 20;
					intB[2] = 10;
					
					for(int i=0; i<intA.length; i++) {
						System.out.println(intA[i]);
					}
					intA의 값이 intB로 대체되면서 0번과 2번의 숫자가 대체되고 intA출력시 바뀐 숫자로 출력된다.

			[문제] Ex04 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 아래와 같이 출력하는 프로
				       그램을 작성하세요.
				       int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
				
				정답: ****************************미완성
									
					int[] data = {1,3,5,8,9,11,15,19,18,20,30,33,31};
					
					
					for(int i = 0; i < data.length; i++) {
						if( data[i] % 3 == 0)
							System.out.printf("주어진 배열에서 3의 배수의 개수 => %d",
								data[i]);
					
					}
					
			[문제] Ex05 5개의 숫자를 키보드로 입력 받아 평균을 구하는 프로그램을 작성하세요.
				
				정답: 
				Scanner scanner = new Scanner(System.in);
				
				int[]arr = new int[5];
				double sum = 0;
				
				
				for(int i = 0; i < 5; i++) {
					arr[i] = scanner.nextInt();
					
					sum += arr[i];
				}
				
			  	System.out.println();
			  	System.out.println("평균은 " + sum/5 + "입니다. ");
			  

			[문제] Ex06 주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요.
					   char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
					   
				정답: 
				char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
				
				System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%n", 
						c[0],
						c[1],
						c[2],
						c[3],
						c[4],
						c[5],
						c[6],
						c[7],
						c[8],
						c[9],
						c[10],
						c[11],
						c[12],
						c[13],
						c[14],
						c[15]
						);
				
				char c2[];
				c2 = c;
				c2[4] = ',';
				c2[7] = ',';
				c2[9] = ',';
				
				System.out.printf("%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c%c", 
						c[0],
						c[1],
						c[2],
						c[3],
						c[4],
						c[5],
						c[6],
						c[7],
						c[8],
						c[9],
						c[10],
						c[11],
						c[12],
						c[13],
						c[14],
						c[15]
						);
		
		

			[문제] Ex07 키보드에서 정수로 된 돈의 액수를 입력 받아 50000원권, 10000원권, 5000원권, 1000원권, 500원
				  동전, 100원동전, 50원동전, 1원동전 각 몇 개로 변환 되는지 작성 하세요. (아래의 배열을 사용하여 코딩하세요.)
			
				정답: ******************************미완성
					Scanner scanner = new Scanner(System.in);
					
					System.out.println("금액: \n");
					int i = scanner.nextInt();
					
					int[] wonArray = new int[10];
					
						wonArray[0] = 50000;
						wonArray[1] = 10000;
						wonArray[2] = 5000;
						wonArray[3] = 1000;
						wonArray[4] = 500;
						wonArray[5] = 100;
						wonArray[6] = 50;
						wonArray[7] = 10;
						wonArray[8] = 5;
						wonArray[9] = 1;
						
					for(int a = 0; a < wonArray[a]; a++) {
						if( i ) {
							System.out.printf("50000원:%d%n10000원:%d%n5000원:%d%n1000원:%d%n500원:%d%n100원:%d%n50원:%d%n10원:%d%n5원:%d%n1원:%d%n",
												)
						}
					}

				
		
		
			[문제] Ex08 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
				  (중복체크 할 것)
				  
				  정답: *********************미완성 배열 추가하기!!!!!!! 
				  
				    while 문에서 중복체크 가능
					int i = 0;
						
						while( i < 6) {
							System.out.print((int)(Math.random()*45)+1 + " ");
							i +=1 ;
						}

 */

	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[]arr = new int[5];
		double sum = 0;
		
		
		for(int i = 0; i < 5; i++) {
			arr[i] = scanner.nextInt();
			
			sum += arr[i];
		}
		
	  System.out.println();
	  System.out.println("평균은 " + sum/5 + "입니다. ");
	  
	 
	 

		
	}

}

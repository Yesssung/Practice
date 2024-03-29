
package com.javaex;

import java.util.Scanner;

public class Practice2_Conditional {
			
			// 조건문

			
			/*
			[Ex06.java]
				나이를 입력 받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을
				작성하세요.
				
				정답: 
				public static void main(String[] args) { 
				Scanner scanner = new Scanner(System.in);
					
				System.out.println("나이를 입력해주세요: ");
				int age = scanner.nextInt();
					
				if(age >= 19 && age < 65 ) {
					System.out.println("1번 그룹");
				} else{
					System.out.println("2번 그룹");
				} 
				
				scanner.close();
				}
				
			[Ex07.java]
				나이를 입력 받아 아래와 같이 입장료가 출력되도록 프로그램을 작성하세요
				
				정답: 
				public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
			
				System.out.println("나이를 입력해주세요. \n 나이:  ");
				int age = scanner.nextInt();
			
				if(age <= 7 ) {
					System.out.println("취학전 아동 / 무료입니다.");
				} else if(age <= 13 ){
					System.out.println("초등학생 / 2,000원 입니다.");
				}  else if(age <= 16 ){
					System.out.println("중학생 / 3,000원 입니다.");
				} else if(age <= 19  ){
					System.out.println("고등학생 / 4,000원 입니다.");
				} else {
					System.out.println("성인 / 5,000원 입니다.");
				}
					
					scanner.close();
					}
					
					
			[Ex08.java]
				사용자로 키와 몸무게를 입력 받아 BMI을 계산한 후에 저체중, 정상체중, 과체중을 구분하여 출력하
				프로그램을 작성하세요. (정상체중의 범위는 18.5 <= BMI <= 24.9)
				BMI = 체중(kg) / 키(m)2
				
				정답:
					Scanner scanner = new Scanner(System.in);
					
					System.out.print("키와 몸무게를 입력해 주십시오. \n키: \n몸무게: \n");
					int height = scanner.nextInt();
					int weight = scanner.nextInt();
					double result = weight / height;
					
					if(result <= 18.5) {
						System.out.println("저체중 입니다.");
					} else if( result >= 24.9 ) {
						System.out.println("과체중 입니다.");
					} else {
						System.out.println("정상체중 입니다.");
					}
						System.out.println("BMI: " + result);
					scanner.close();
	
				}
				
					
					
			[Ex09.java]
				아래의 조건과 같이 출력되도록 프로그램을 작성하세요
				⚫ 태어난 년도를 입력 받습니다.
				⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
				⚫ 15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력합
				   니다.
				⚫ 이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.	
				
				정답: 
					public static void main(String[] args) { 
					Scanner scanner = new Scanner(System.in);
			
					System.out.println("태어난 년도를 입력해주세요. \n 년도: ");
					int year = scanner.nextInt();
					int age = 2024;
					
					if(age-year < 15 || age-year >= 65) {
						System.out.println(year + "무료예방접종 대상자 입니다.");
					} else {
						System.out.println((age-year) + "무료예방접종 대상자가 아닙니다.");
					}
						
					
					scanner.close();
			
					}
						
			[Ex10.java]
				두개의 숫자를 입력 받아 큰 수와 작은 수를 분류하여 출력하세요
				정답: 
					Scanner scanner = new Scanner(System.in);
				
					System.out.println("숫자 2개를 입력해주세요. \n 숫자1: \n 숫자2: ");
				
					int a,b; 
					int max;
					int min;
					
					a = scanner.nextInt();
					b = scanner.nextInt();
				
					if(a > b ) {
						max = a;
						min = b;
						}else  {
						max = b;
						min = a;
						}
					
					System.out.print("큰 수: " + max + " 작은 수: " + min  + "입니다.");
					
			[Ex11.java]
				두 개의 정수를 입력 받아 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
				
				정답:
					Scanner scanner = new Scanner(System.in);
					
					System.out.print("첫번째 숫자: \n");
					System.out.print("두번째 숫자:");
				
					int a,b; 
					int max;
					int min;
					
					a = scanner.nextInt();
					b = scanner.nextInt();
					
					if(a > b) {
						max = a;
						
					} else { 
					}
					
					System.out.println("몫: " + a/b + "\n" + "나머지: " + a%b);
	
				}

			[Ex12.java]
				숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요
				정답: 		
					Scanner scanner = new Scanner(System.in);
					
					System.out.print("숫자 3개를 입력해 주세요 \n");
					System.out.print("숫자1: \n숫자2: \n숫자3: ");
				
					int a,b,c; 
					int max;
					int min;
					
					a = scanner.nextInt();
					b = scanner.nextInt();
					c = scanner.nextInt();
					
					if(a > b ) {
						max = a;	
						min = b;
					} else if (a < b){
						max = b;
						min = a;
					} else if(b > c){
						max = b;
						min = c;
					} else if(b < c){
						max = c;
						min = b;
					} else if(a > c){
						max = a;
						min = c;
					} else {
						max = c;
						min = a;
					}
					
					System.out.println("가장 작은 수는" + min + "입니다.");
	
				}		
				
			[Ex13.java]
				두 개의 정수를 입력 받은 후에 작은 수가 큰 수의 약수인지 확인하는 프로그램을 작성하세요.
				(0은 입력하지 않습니다.)
				정답:
					Scanner scanner = new Scanner(System.in);
					
					System.out.print("첫번째 숫자1: \n두번째 숫자2:");
				
					int a,b;
					
					a = scanner.nextInt();
					b = scanner.nextInt();
					
					if (a % b == 0) {
						System.out.println(b + "는(은)" + a + "의 약수입니다.");
					} else {
						System.out.println(b + "는(은)" + a + "의 약수가 아닙니다.");
					}
					
			[Ex14.java]
				사번(양의정수)을 입력하면 팀을 확인할 수 있는 프로그램을 작성하세요.
				⚫ 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
				⚫ 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀 으로 구분합니다.
				(사번 0은 고려하지 않습니다.)
				정답: 
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("사번을 입력해주세요. \n사번:");
			
				double a;
				a = scanner.nextInt();
				
				if (a % 3 == 0 ) {
					System.out.println("A팀 입니다.");
				} else if(a % 3 == 1){
					System.out.println("B팀 입니다.");
				} else {
					System.out.println("C팀 입니다.");
				} 
				scanner.close();
			}

				
				
							
					
			[Ex15.java]
				아래와 같은 계산기 프로그램을 작성하세요.
				⚫ 기호, 숫자1, 숫자2 순서로 입력 받습니다.
				⚫ 기호는 ( + - * / ) 4가지 입니다.
				⚫ 입력된 내용으로 계산하여 결과값을 출력합니다.
				⚫ 나눗셈의 경우 분모가 0이면 “계산할 수 없습니다” 를 출력합니다.
				정답:
					Scanner scanner = new Scanner(System.in);
					
					System.out.print("출력되는 내용을 입력하세요 \n기호: \n숫자1: \n숫자2: \n 결과는: ");
	
					String i = scanner.next();
					int a,b = scanner.nextInt();
					int result,result2, result3, result4;
					result = a+b;
					result2 = a-b;
					result3 = a*b;
					result4 = a/b;
					
					
					if(i == "+") {
							System.out.println(result);
						} else if (i == "-") {
							System.out.println(result2);
						} else if (i == "*") {
							System.out.println(result3);
						} else if (i == "/") {
							System.out.println(result4);
						} else {
							System.out.println("잘못 입력했습니다.");
						}
					
					
					scanner.close();
	
				}
				
				
			[Ex16.java]
				다음과 같이 정의되는 함수의 함수 값을 계산해보자
				
				f(x) = {
				x
				3 − 9x + 2 , x ≤ 0 (x가 0보다 작거나 같으면 이식을 사용)
				7x + 2 , x > 0 (x가 0보다 크면 이식을 사용)
				정답: 
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("숫자를 입력해주세요. \n숫자:");
				int num = scanner.nextInt();
				double result = 7 * num +2;
				double result2 = (num * num* num) - (9*num) + 2;
				
				if( num > 0 ) {
					System.out.println("계산 결과는 " + result + "입니다.");
				} else {
					System.out.println("계산 결과는 " + result2 + "입니다.");
				}
				
	
				scanner.close();
			}

				
				
				
				
								
				
			[Ex17.java]
				다음과 같이 수익을 입력 받아 소득세를 계산하는 프로그램을 작성하세요
				⚫ 세금계산법
				⚫ 0원이상 1000만원 이하인 경우 tax: 0.09*수익
				⚫ 1000만원 초과 4000만원 이하인 경우 tax: 1000*0.09 + 0.18*(수익-1000)
				⚫ 4000만원 초과 8000만원 미만인 경우 tax: 1000*0.09 + 3000*0.18 + 0.27*(수익-4000)
				⚫ 8000만원 이상인 경우 tax: 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(수익-8000)
				정답:
					Scanner scanner = new Scanner(System.in);
					
					System.out.print("수익을 입력하세요. \n금액: ");
					double a = scanner.nextDouble();
					
					if(a <= 1000) {
						System.out.println("소득세는 " + (a*0.09) + "입니다." );
					} else if(a <= 4000) {
						System.out.println("소득세는 " + (1000*0.09 + 0.18*(a-1000)) + "입니다.");
					} else if(a < 8000 ) {
						System.out.println("소득세는 " + (1000*0.09 + 3000*0.18 + 0.27*(a-4000)) + "입니다." );
					} else if(a >=8000){
						System.out.println("소득세는 " + (1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(a-8000)) + "입니다." );
					} else {
						System.out.println("잘못 입력했습니다." );
					}
					
					
					scanner.close();

			[Ex18.java]
				알파벳을 입력 받아 자음 모음을 구분하세요.
				⚫ switch~case문을 사용합니다.
				⚫ 영문 소문자 이외의 입력 값은 고려하지 않습니다.
				정답:
				Scanner scanner = new Scanner(System.in);
				System.out.println("알파벳 1글자(소문자)를 입력하세요. \n알파벳: ");
				String a = scanner.next();
				
				switch(a) {
				case "a" :
				case "e" :
				case "i" :
				case "o" :
				case "u" :
					System.out.println("모음입니다.");
					break;
				default :
					System.out.println("자음입니다.");
				} 
	
				scanner.close();
			}

				
				
				
				
			[Ex19.java]
				아래의 조건과 같이 출력되도록 프로그램을 작성하세요
				⚫ 태어난 년도를 입력 받습니다.
				⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
				⚫ 15세미만의 경우와 65세이상인 경우에는 "(나이)살 무료예방접종 대상자 입니다" 메시지를 출력
				⚫ 이외의 경우에는 " (나이)살 무료예방접종 대상자가 아닙니다" 메시지를 출력합니다.
				정답:
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("태어난 년도를 입력해주세요. \n년도:");
				int year = scanner.nextInt();
				int result = 2024-year;
				
				if((2024 - year) < 15) {
					System.out.println(result + "살 무료입니다.");
				} else if((2024 - year) >= 65 ) {
					System.out.println(result + "살 무료입니다.");
				} else {
					System.out.println(result + "접종대상자가 아닙니다.");
				}
				
				scanner.close();
				
			
									
									
									
			[Ex20.java]
				알파벳을 입력 받아 자음 모음을 구분하세요.
				⚫ if~else문을 사용합니다.
				⚫ 영문 소문자 이외의 입력 값은 고려하지 않습니다.
				정답: 
				
				
				
				
									
			[Ex21.java]
				사번(양의정수)을 입력하면 팀을 확인할 수 있는 프로그램을 작성하세요.
				⚫ 팀은 A팀, B팀, C팀 3개의 팀으로 구성합니다.
				⚫ 사번을 3으로 나누어서 나머지가 0이면 A팀, 1이면 B팀, 2이면 C팀 으로 구분합니다.
				(사번 0은 고려하지 않습니다.)
				정답: 
		
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("사번을 입력해주세요. \n사번:");
			
				int a;
				a = scanner.nextInt();
			
				
				if (a % 3 == 0 ) {
					System.out.println("A팀 입니다.");
				} else if(a % 3 == 1){
					System.out.println("B팀 입니다.");
				} else if( a % 3 == 2 ){
					System.out.println("C팀 입니다.");
				} else if() {
					System.out.println("잘못된 사번입니다. ");
				} else {
					System.out.println("잘못 입력하셨습니다. ");
				}
				scanner.close();
					
					
			[Ex22.java]
				숫자(정수) 3개를 입력 받아 가장 큰 수를 출력하세요
				정답:
					Scanner scanner = new Scanner(System.in);
					System.out.print("숫자 3개를 입력해 주세요 \n");
					System.out.print("숫자1: \n숫자2: \n숫자3: ");
					
					int a = scanner.nextInt();
					int b = scanner.nextInt();
					int c = scanner.nextInt();
					
					int max;
					
					if(a >= b && a >=c ) {
						max = a;
					} else if(b >= a && b >=c) {
						max = b;
					} else {
						max = c;
					}
					
		
					System.out.println("가장 큰 수는" + max + "입니다.");
					
					scanner.close();
				}
	

			[Ex23.java]
				아래의 조건과 같이 출력되도록 프로그램을 작성하세요
				⚫ 태어난 년도를 입력 받습니다.
				⚫ 나이는 생일과 관계없이 계산됩니다. 올해2023년, 2020년생 ➔ 3살 (2023-2020 = 3)
				⚫ 성인(20세 이상) 이면 무료료 건강검진을 받을 수 있습니다.
				⚫ 짝수해 태어난 사람은 올해가 짝수해 이면 검사대상이고 올해가 홀수해 이면 검사대상이 아닙니다.
				(홀수해 태어난 사람이 올해가 홀수해 이면 검사대상 올해가 짝수해 이면 검사대상이 아닙니다.)
				⚫ 40세 이상의 경우에는 암 검사도 무료료 검사 받을 수 있습니다.
				정답:
								
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("태어난 년도를 입력해주세요. \n년도: \n올해: 2024 \n태어난해: \n나이: \n");
				System.out.print("==========================================\n");
				
				int year = scanner.nextInt();
				int result = 2024 - year;
				
				if(result >= 20) {
					if(result % 2 == 0) {
						System.out.println("건강검진 해입니다.");
					} else if(result % 2 == 1) {
						System.out.println("건강검진 해가 아닙니다.");
					} else if(result >= 40) {
						System.out.println("암검사 x");
					}
				
				 }
				
				
			 
				 scanner.close();

			     }

					
				
				
			 * 
			 */
			
			
			public static void main(String[] args) {
				
				Scanner scanner = new Scanner(System.in);
				
				System.out.print("사번을 입력해주세요. \n사번:");
			
				int a;
				a = scanner.nextInt();
			
				
				if (a % 3 == 0 ) {
					System.out.println("A팀 입니다.");
				} else if(a % 3 == 1){
					System.out.println("B팀 입니다.");
				} else if( a % 3 == 2 ){
					System.out.println("C팀 입니다.");
				} else if(a ==0 ) {
					System.out.println("잘못된 사번입니다. ");
				} else {
					System.out.println("잘못 입력하셨습니다. ");
				}
				scanner.close();
			}

	}


package com.javaex;

import java.util.Scanner;

public class Practice2_Conditional {
			
			// 조건문

			
			/*
			 * [Ex06.java]
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

					
				
				
			 * 
			 */
			
			
			public static void main(String[] args) {
				// 
				Scanner scanner = new Scanner(System.in);
				
				System.out.println("숫자 2개를 입력해주세요. \n 숫자1: \n 숫자2: ");
				int b= scanner.nextInt();
				int s= scanner.nextInt();
				
				//int result;
				// result = b < s;
				
				if(b < s) {
					System.out.println("큰 수: " + ( b < s ) + "작은 수: " + ( b < s ) + "입니다.");
				}
				
				
				scanner.close();

			}


	}



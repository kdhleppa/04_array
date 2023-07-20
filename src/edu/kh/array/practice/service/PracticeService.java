package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;


public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int[] arr = new int[9];
		
		int sum = 0;
		
		for (int i = 1; i < arr.length+1; i++) {
			arr[i-1] = i;
			
		}
		for (int x = 0; x < arr.length; x++) {
			if (x %2 == 0 ) {
				sum += arr[x];
			}
		}
		 
		
		System.out.println(Arrays.toString(arr));
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2() {
		int[] arr = new int[9];
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 9-i;
		}
		for (int x = 0; x < arr.length; x++) {
				if (x %2 == 1 ) {
					sum += arr[x];
				}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("홀수 번째 인덱스 합 : " + sum);
			
		
	}
	
	
	
	public void practice3() {
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			
			
		}
		System.out.print(Arrays.toString(arr));
	}
	
	public void practice4() {
		
		System.out.print("입력 0 : ");
		int input0 = sc.nextInt();
		System.out.print("입력 1 : ");
		int input1 = sc.nextInt();
		System.out.print("입력 2 : ");
		int input2 = sc.nextInt();
		System.out.print("입력 3 : ");
		int input3 = sc.nextInt();
		System.out.print("입력 4 : ");
		int input4 = sc.nextInt();
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = false;
		
		int[] arr = {input0,input1,input2,input3,input4};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				System.out.println("인덱스 : " + i);

			} else {
				System.out.println("일치하는 값이 존재하지 않습니다.");
			} break;

		}

			
	}
	
	
	public void practice5() {
		
		System.out.print("문자열: ");
		String input = sc.nextLine();
		
		System.out.print("문자: ");
		char search = sc.next().charAt(0);
		
		char[] arr = new char[input.length()];
		
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			
		}

		for (int x = 0; x < arr.length; x++) {
			
			if (arr[x] == search) {
				System.out.printf("%s에 %s가 존재하는 위치(인덱스) : \n", input, search);
				
			}
			if (arr[x] == search) {
				count++;
				System.out.print(x +" ");

			}
			

		}
		System.out.println();
		System.out.printf("%s 개수: %d", search, count);

		
	}
}

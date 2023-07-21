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
			
			if (arr[i] == search) {
				
				count++;
				
			}
		}
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ", input, search);
		
		for (int x = 0; x < arr.length; x++) {
			
			
				for (int y = 0; y < count; y ++) {
					if (arr[x] == search) {
						System.out.print(x + " ");
						break;
				}
				
				
				
			}
		}
			
		
		System.out.println();
		System.out.printf("%s 개수: %d", search, count);

		
	}
	
	public void practice6() {
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			
			sum += arr[i];
		}
		System.out.print(Arrays.toString(arr));
		System.out.println();
		System.out.printf("총 합 : %d", sum);
		
	}
	
	public void practice7() {
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		
		char[] arr = new char[input.length()];
				
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
			
			if (i > 7) {
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
		
	}
	
	public void practice8() {
		
		
		int input;
		
		do {
		
			System.out.print("정수 : ");
			input = sc.nextInt();
		
			if (input < 3 || input % 2 != 1) {
			System.out.println("다시 입력하세요.");
			}
		} while (input  < 3 || input % 2 != 1);
		
		int[] arr = new int[input];
		
		int count = 1;

		
		if (input >= 3 && input % 2 == 1) { // input 데이터가 3이상이고 홀수일때
			for (int i = 0; i < arr.length; i++) { // i증가값이 0~ arr길이까지 증가반복할때
				if (i >= 0 && i <= input /2) { // i가 0보다 크면서 인풋값 절반까지는 
					arr[i] = i + 1; // arr[i] 값은 1씩 증가하는 i값
				} else if (i > input /2 && i < input){ // i가 인풋절반값보다 크면서 인풋보다 작을때
					arr[i] = arr[input / 2 ] - count;
					count++;
				}
			}
			
		} 
		
		System.out.println(Arrays.toString(arr));
			
	}
	
	
	public void practice9() {
		int[] arr = new int[10];
		
		
		
		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1 );
			arr[i] = random;
		}
		
		System.out.println("발생한 난수 : " + Arrays.toString(arr));
	}
	
	
	public void practice10() {
		int [] arr = new int[10];
		
		
		
		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1 );
			arr[i] = random;
		}
		
		
		int max = arr[0];
		
		int min = arr[0];
		
		
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
				
			}
			if (arr[x] < min) {
				min = arr[x];
				
			}
		}
		
		System.out.println("발생한 난수 : " + Arrays.toString(arr));
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void practice11() {
		
	}
	
}

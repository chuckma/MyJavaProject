package org.test.array;

import java.util.Arrays;

/**
 * 数组的排序和查找
 */
public class FindArraySort {
	public static void main(String[] args) {
		int array[] = {2,5,-2,6,-3,8,0,-7,-9,4};
		Arrays.sort(array);
		
		printArray("数组排序结果为:",array);
		int index = Arrays.binarySearch(array,2);
		System.out.println("元素2 在 第"+index+"个位置上");
	}
	public static void printArray(String message,int array[]){
		System.out.println(message+":[length:"+array.length+"]");
		for (int i = 0; i < array.length; i++) {
			if (i!=0) {
				System.out.print(",");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
}

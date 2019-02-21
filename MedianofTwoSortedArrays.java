package com.general.solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = new int[] {};
		int[] nums2 = new int[] {2,4,6};
		
		double res = solution(nums1,nums2);
		System.out.println(res);
	}

	private static double solution(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		int i=0;
		double median=0;
		for(i=0;i<nums1.length;i++){
			list.add(nums1[i]);
		}
		for(int j=0;j<nums2.length;j++){
			list.add(nums2[j]);
		}
		Collections.sort(list);
		/*
		 * for(i=0;i<list.size();i++) {
		 * 
		 * System.out.println(i+" "+list.get(i)); }
		 */
		int k = list.size()/2;
		if(list.size()%2 == 0) {
			median = (list.get(k) + list.get(k-1))/2.0;
		}else {
			median = list.get(k);
		}
		return median;
	}

}

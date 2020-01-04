package com.wuyuting.common.utils;

import java.util.Random;

//随机数工具类
public class RandomUtil {

	//获取随机数区间的随机数
	public static int random(int min,int max) {
		Random random = new Random();
		int nexInt = random.nextInt(max-min+1);
		if(nexInt<min) {
			return random(min,max);
		}
		return nexInt;
 	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(random(1,2));
		}
	}
	
}

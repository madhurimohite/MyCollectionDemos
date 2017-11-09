package com.scp.collectionDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hset = new HashSet<>();
		hset.add(10);
		hset.add(40);
		hset.add(20);
		hset.add(null);
		hset.add(40);
		hset.add(30);
		hset.add(null);

		System.out.println(hset);
	}

}

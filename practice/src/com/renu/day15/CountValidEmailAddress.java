package com.renu.day15;

import java.util.HashSet;

public class CountValidEmailAddress {

	public static void main(String[] args) {
		String[] str = {"renu@gmail.com","navaneeth.002@gmail.com","renu.b@gmail.com","renu+dname@gmail.com","test.email+alex@leetcode.com"
				,"test.e.mail+bob.cathy@leetcode.com"};
		int count =countValidMail(str);
		System.out.println(count);

	}
public static int countValidMail(String[] emails) {
	HashSet<String> set = new HashSet<String>();
	for(String email:emails) {
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<email.length();i++) {
			char c=email.charAt(i);
			if(c=='.') {
				continue;
			}else if(email.charAt(i)=='+') {
				while(email.charAt(i)!='@') {
					i++;
				}
				sb.append(email.substring(i+1));
			}
			else {
				sb.append(c);
			}
		}
		set.add(sb.toString());
	}
	return set.size();
}
}

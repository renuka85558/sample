package com.renu.day2;

public class DominoesPush {

	public static void main(String[] args) {
		String dominoes="..R...L..R.";
		String outputDomineos =pushDominoes(dominoes);
		System.out.println(outputDomineos);

	}
	public static String pushDominoes(String str) {
	    char[] s = str.toCharArray();
	    int N =str.length();
	    int[] forces =new int[N];
	    int force=0;
	    for(int i=0;i<N;i++) {
	    	if(s[i]=='R') {
	    		force=N;
	    	}else if(s[i]=='L') {
	    		force =0;
	    	}else {
	    		force= Math.max(force-1, 0);
	    	}
	    	forces[i]+= force;
	    }
	    force=0;
	    for(int i=N-1;i>=0;i--) {
	    	if(s[i]=='L') {
	    		force=N;
	    	}else if(s[i]=='R') {
	    		force =0;
	    	}else {
	    		force= Math.max(force-1, 0);
	    	}
	    	forces[i]-= force;
	    }
	    StringBuilder result =new StringBuilder();
	    for(Integer f:forces) {
	    	if(f>0) {
	    		result.append('R');
	    	}else if(f<0) {
	    		result.append('L');
	    	}else {
	    		result.append('.');
	    	}
	    }
	    return result.toString();
	}
}

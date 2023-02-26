package practice;

public class ReverseChar {

	public static void main(String[] args) {
		
		char[] s= {'s','r','n','f','g'};
		int low = 0, high = s.length-1;
        while(low<=high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
            }
        System.out.println(" "+s);
	}

}

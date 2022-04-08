public class Self_Number {
	public static void main(String[] args) {
		 
        boolean [] a = new boolean[10001];
 
        for (int i = 1; i<10001; i++) {
            int n = d_function(i);
            if (n < 10001) {
                a[n] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
        	if (a[i]==false) {
        		System.out.println(i);
            }
        }
    }
	
    public static int d_function(int num){
        int sum = num;
        while (num != 0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
}

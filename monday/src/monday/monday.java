package monday;

public class monday {
	
	public static int twice(int n) {
		return n + n;
	}
	
	public static int binarysearch(int [] a, int n, int l , int r) {

        int m = (l+r)/2;
        if(a[l] == n)
             return l ;
        else if(a[r] == n)
             return r ;
        else if (a[m] == n)
            return m;
        if(l != r) {
            if(n< a[m])
                binarysearch(a,n,l, m-1);
            else if(n > a[m])
                binarysearch(a,n,m+1,r);
        }
        return -1;
    }


	public static void main(String[] args) {
		
		int[] b = new int [5];
        b[0] = 2;
        b[1] = 10;
        b[2] = 5;
        b[3] = 4;
        b[4] = 3;
        int n = 6;// the number I am looking for
        int r = b.length - 1;
        int l = 0;
        System.out.println(binarysearch(b, n, l, r ));
        
        int [] a = new int [5];
        for(int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()* 100);
            System.out.print(a[i]+ ", ");
        }
        System.out.println(binarysearch(a, n, l, r ));
        
		  
	}
			
}

public class Solution{
    public static boolean isPalindrom(int x){
        if (x<0)
            return false;
        if (x==0) 
            return true;
        int temp = x;
        int y = 0;
        while (x!=0){
           y = y*10 + x%10;
           x = x/10;
        }
        if(y == temp)
            return true;
        else 
            return false;
    }
    public static void main(String [] args){
        int [] x = new int [9];
        x[0] = 12;  x[1] = 1237745; x[2] = 123454321;
        x[3] = -1;  x[4] = 0; x[5] = 1235654321;
        x[6] = 1233321;  x[7] = 10; x[8] =222221;

        for (int i =0;i<9;i++){
            System.out.println("x = " + x[i] + " is Palindrom?  " + isPalindrom(x[i]) + "! ");
        }
    }
}

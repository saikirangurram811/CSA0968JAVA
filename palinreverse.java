//reverse and add a number until you get a palindrome
     import java.util.Scanner;
     public class palin_reverse
     {
           public static void main(String[] args)  
           {
              try{
              int z;
              Scanner s=new Scanner(System.in);
              System.out.println("Enter the number");
              int n=s.nextInt();
              int m=n;
              int a=hell(m);
              while(a!=m)
              {
                 m=a+m;
                 a=hell(m);
               }
             System.out.println("reversed palindrome: "+a);
           }
             catch(Exception e)
             {
                 System.out.println("Invalid");
              }
        }
        public static int hell(int x)
        {
             int y=0,r,i=10;
             while(x>0)
             {
                r=x%10;
                y=y*i;
                y=y+r;
                x=x/10;
              }
           return y;
         }
}

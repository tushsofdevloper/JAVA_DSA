//print sum of even number from 1 to 50
//bruitforce approch

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SumDemo{
    static int sumeven(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main(String[]args){
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("enter an number");
          int num=0;
          try{
                      num=Integer.parseInt(br.readLine());

          }
          catch(IOException ie){
                
          }
          int  sum=sumeven(num);
          System.out.println(sum);
    }
}

//Time Complexity=O(N)
//Space Complexity=O(1)
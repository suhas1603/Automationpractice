package day6.loops;

public class PrimeNum{

public static void main(String[] args){
 for(int i=1;i<=50;i++){
   int temp=0;
   for(int k=2;k<i-1;k++){
      if(i%k==0){
         temp=temp+1;
    }
  } 
   if(temp==0){
   System.out.println(i);
    }
  }

 } 
}
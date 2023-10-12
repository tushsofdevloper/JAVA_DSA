
class Bruitforce {

   static int equLib(int arr[]){
      for(int i=0;i<arr.length;i++){
         int leftsum=0;
         int rightsum=0;
         for(int j=0;j<i;j++){
            leftsum=leftsum+arr[j];
         }
         for(int j=i+1;j<arr.length;j++){
            rightsum=rightsum+arr[j];
         }
         if(leftsum==rightsum){
            return i;
         }
      }
      return -1;
   }
   public static void main(String[]args){
      int arr[]=new int[]{-7,1,5,2,-4,3,0};
      int result=equLib(arr);
      System.out.println(result);
   }
}

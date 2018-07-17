public class MyJava {
    public static void main(String[] args){
        int [] result=new int[100];
        int  count=0;
        for(int i=2;i<1000;i++)
        {
             boolean isPrime=true;
             for(int k=2;k<i;k++){
                 if(i%k==0) {
                    isPrime=false;
                    break;
                 }
             }
             if(isPrime){
                 result[count]=i;
                 count++;
               if(count>=result.length){
                   break;
               }
             }
        }
        for(int i=0;i<count;i++){
        System.out.println(result[i]);}
    }
}





public class  MyArray{
    private int[] arr;
//    [1,4,5,6,7,8,9]


//    public MyArry(){
////       方法的构造函数
//        System.out.println("this is a gouzao fangfa");
//        return;
//    }
    public int[] getArr(){
        return this.arr;
    }

    public void setArr(int []arr){
        this.arr = arr;
    }

    public int getArrLen(){
        return this.arr.length;
    }

    public int getMaxNum() {
        int max = this.arr[0];
        int len = this.getArrLen();
        for (int i = 0; i < len; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int getNumOfArrIndex(int index){
        if (index >= this.getArrLen() || index < 0){
            return -1;
        }
        return this.arr[index];
    }

    public void printArr(){
        int len = this.getArrLen();
        for (int index = 0 ; index < len ; index++){
            System.out.println(this.getNumOfArrIndex(index));
        }
    }
}
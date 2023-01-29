

class MyArray<T>{
    T A[]=(T[]) new Object[10];
    int length=0;

    public void Appned(T v){
      A[length]=v;
      length++;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }

}



public class Myarray {
    public static void main(String[] args) {
        MyArray<Integer> MA=new MyArray<Integer>();
        MA.Appned(10);
        MA.Appned(10);
        MA.Appned(10);
        MA.Appned(10);


    }
}

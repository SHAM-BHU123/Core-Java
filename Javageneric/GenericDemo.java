class Data<T>{
    private T obj;

    public void setData(T v){
        obj=v;
    }
    public T getData(){
        return obj;
    }
}


public class GenericDemo {
    public static void main(String[] args) {
   Data<Integer> d=new Data<Integer>();
        Data<String> d1=new Data<String>();

   d.setData(10);
   d1.setData("MY name is shambhu pandey");
        System.out.println(d.getData());
        System.out.println(d1.getData());
    }
}

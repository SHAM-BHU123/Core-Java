 class singleThreadClass extends Thread {

    public void run(){
        int i=1;
        while (true){
            System.out.println(i+"hello");
            i++;
        }
    }

    public static void main(String[] args) {
        singleThreadClass t=new singleThreadClass();
        t.start();
        int i=1;
        while (true){
            System.out.println(i+"world");
            i++;
        }

    }
}

enum Day {
       SUNDAY("6:00 AM","Coding three hours");

        String wakeup;
        String work;

        private Day(String daytime, String work) {
            this.wakeup = daytime;
            this.work = work;
        }

        public String getdaytime() {
            return wakeup;
        }

        public String getwork() {
            return work;
        }
        public void display(){
            System.out.println(this.name()+" "+this.wakeup+" "+this.work);
        }
    }



public  class EnumDemo {

    public static void main(String[] args) {
        Day d= Day.SUNDAY;
        d.display();


    }
}


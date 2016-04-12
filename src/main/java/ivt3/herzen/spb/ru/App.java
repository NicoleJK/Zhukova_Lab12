package ivt3.herzen.spb.ru;

    class MyThread extends Thread
    {
        @Override
        public void run(){
            int i, s;
            s=0;
            for (i=1; i<=100; i++){
                s+=i;
            }
            System.out.println("Сумма:" + s);
        }
    }

    public class App
    {
        public static void main( String[] args )
        {
            MyThread MySecondThread = new MyThread();
            MySecondThread.start();
            try {
                MySecondThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Сообщение");

        }
    }

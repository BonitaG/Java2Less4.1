public class Main {
    public static void main(String[] args) {
        //Thread.currentThread().setPriority(1);
        System.out.println("Запуск потока - " + Thread.currentThread().getName());


        try {
            for (int i = 1; i <=5; i++) {
                MyThread th = new MyThread("Поток " + i);
                th.start();
                th.setPriority(i);
                th.join();
            }
        } catch (Exception e) {

        }
        System.out.println("Завершение потока - " + Thread.currentThread().getName());
    }
}






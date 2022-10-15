public class Main {

   private Object obj = new Object();

   public void doSomething() {

       //...какая-то логика, доступная для всех потоков

       synchronized (obj) {

           //логика, которая одновременно доступна только для одного потока
       }
   }
}

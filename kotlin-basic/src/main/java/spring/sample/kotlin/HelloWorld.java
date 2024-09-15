package spring.sample.kotlin;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Java says 'hello!'");
    KotlinGreeting kotlinGreeting = new KotlinGreeting();
    kotlinGreeting.sayHello();
  }
}

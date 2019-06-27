package omar.mebarki.docker;

public class HelloWorld {
    public static void main(String[] args) throws Exception{
        while (true) {
            System.out.println("Hello World ! " + System.getenv("APP_MESSAGE"));
            Thread.sleep(20000);
        }
    }
}

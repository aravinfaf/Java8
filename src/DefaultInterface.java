
interface Phone{
    void message();
    default void call(){
        System.out.println("Calling....");
    }
}

class AndroidPhone implements Phone{

    @Override
    public void message() {
        System.out.println("Message sent...");
    }
}
public class DefaultInterface {

    public static void main(String[] args) {
        Phone phone = new AndroidPhone();
        phone.call();
        phone.message();
    }
}

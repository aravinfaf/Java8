package method_reference;

public class MethodReferenceDemo {

    //Method reference is replacement of lambda expression

    public static void main(String[] args) {

        //Method reference
        Finterface f = ReferenceClass::referenceMethod;
        f.singleAbstractMethod();

        //Lambda expression
        Finterface finterface = () -> System.out.println("SAM");
        finterface.singleAbstractMethod();
    }
}

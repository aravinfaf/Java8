public class Ragul {

    public static void main(String[] args) {
        String a = "ragul123@kal12345678leri";

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if (!Character.isDigit(c) && Character.isLetterOrDigit(c))
            {
                System.out.print(c);
            }
            //System.out.println(c);
        }

        //System.out.println(a);

    }
}



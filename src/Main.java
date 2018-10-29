public class Main {

    public static void main(String[] args) {
        Person aneczka = new Person("Ania", 16, Gender.FEMALE);
        Person aneczka2 = new Person("Ania", 16, Gender.FEMALE);
        System.out.println(aneczka.equals(aneczka2));

        System.out.println(aneczka.toString());
        String a =new String("Java");
        String b = new String("Java");
        // tu nowe obiekty, niżej maszyna stwarza jeden obiekt, bo widzi, że są takie same - optymalizacja
        String c = "Java";
        String d = "Java";
        System.out.println(a==b);
        System.out.println(c==d);
    }
}

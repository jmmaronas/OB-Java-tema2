public class Main {
    public static void main(String[] args) {

        System.out.println(sumarIva(100));
    }

    public static double sumarIva( double precio){
        return precio * 1.21;
    }
}
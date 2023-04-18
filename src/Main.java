public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = service.calculate(68, 1.73);
        System.out.println(" Индекс массы тела " + index);
    }
}

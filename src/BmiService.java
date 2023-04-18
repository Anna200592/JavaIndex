public class BmiService {
    public int calculate(double weight, double height) {
        int index = (int) (weight / (height * height));
        System.out.println(" Вес " + weight + " кг ");
        System.out.println(" Рост " + height + " м ");
        return index;

    }
}

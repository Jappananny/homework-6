import java.util.zip.CheckedOutputStream;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int moneyForEat = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + total / 100;
            total = total + moneyForEat;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Итого " + total);
        //Задача 2
        System.out.println("Задача 2");
        int i2 = 0;
        while (i2 < 10){
            i2++;
            System.out.print(i2+" ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        //Задача 3
        System.out.println("Задача 3");
        int countryY = 12_000_000;
        int total2 = countryY;
        while ( i < 10) {
            i++;
            int born = (countryY / 1000 * 17);
            int deat = (countryY / 1000 * 8);
            int people = (born - deat);
            total2 = people+total2;

            System.out.println("Год " + i + " , численность населения составляет " + total2);
        }



    }
}
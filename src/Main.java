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
            total = total + (total / 100)+moneyForEat;
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
            total2 = (countryY / 1000 * 17)-(countryY / 1000 * 8)+total2;
            System.out.println("Год " + i + " , численность населения составляет " + total2);
        }
        //Задача 4
        System.out.println("Задача 4");
        int many = 15000;
        int i5 = 0;
        while (i5 <= 12*9) {
            i5++;
            many = many + (many / 100) * 7;
            if (i5 % 6 == 0) {
                System.out.println("За " + i5 + " месяц, Вася накопил " + many + " рублей");
            }
        }
        //Задача 7
        System.out.println("Задача 7");
        int mount = 1;
        while (mount < 31) {
            mount++;
            if (mount % 7 == 5) {
                System.out.println("Сегодня пятница, " + mount + "-е число. Необходимо подготовить отчет.");
            }
        }
        //Задача 8
        System.out.println("Задача 8");
        int yearCurent = 2022;
        int yearPast = yearCurent-200;
        int yearFuture = yearCurent + 100;
        int i3 = 0;
        while (i3<yearFuture){
            i3++;
            if ((i3>yearPast) && (i3 % 79 == 0))
            System.out.println(i3);
        }
        //Задача 9
        System.out.println("Задача 9");
        int a = 2;
        int b;
        int result;
        for (b=1;b<=10;b++) {
            result = a * b;
            System.out.println(a + "*"+b+"="+result);
        }



    }
}
//        6) Сделать класс, который будет искать площадь треугольника, прямоугольника и окружности

import java.util.Scanner;

public class Geometry {
Scanner scanner = new Scanner(System.in);
    public void triangle(){
        System.out.println("Введіть довжину основи трикутника в см : ");
        int a = scanner.nextInt();
        System.out.println("Введіть висоту трикутника в см : ");
        int h = scanner.nextInt();
double S = (a*h)/2;
        System.out.println("Площа вашого трикутника дорівнює : " + S + "см2");



    }
    public void rectangle(){
        System.out.println("Введіть довжину першої сторони в см : ");
        int a = scanner.nextInt();
        System.out.println("Введіть довжину другої сторони в см : ");
        int b = scanner.nextInt();
        double S = (a*b);
        System.out.println("Площа вашого прямокутника дорівнює : " + S + "см2");



    }

    public void circle(){
        System.out.println("Введіть радіус вашого кола в см : ");
        int r = scanner.nextInt();
        double S = (3.14 * (r*r));
        System.out.println("Площа вашого круга дорівнює : " + S + " см2");
    }
    public void figureChoose(){
        System.out.println("Оберіть фігуру для обчислення її площі : ");
        System.out.println("Для вибору Трикутника, введіть 1");
        System.out.println("Для вибору Прямокутника, введіть 2");
        System.out.println("Для вибору Круга, введіть 3");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                choice =1;
                break;
            case 2:
                choice =2;
                break;
            case 3:
                choice =3;
                break;
            default:
                System.out.println("Incorrect value");
                System.out.println("Enter value from 1 to 3");

        }

        if(choice == 1){
            triangle();
        }
        if(choice == 2){
            rectangle();
        }
        if(choice == 3){
            circle();
        }
    }


}

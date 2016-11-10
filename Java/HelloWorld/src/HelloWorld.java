import sun.jvm.hotspot.debugger.win32.coff.Characteristics;

import java.util.Scanner;

/**
 * Created by kamilszymczak on 10.11.2016.
 */
public class HelloWorld {
    public static void main(String args[]) {

//        1 zajecia - zadania do wykonania

//        System.out.println("Brawo Ja!");
//        System.out.println(args[1]);
//        for(int i=0;i<args.length;i++){
//            System.out.println(args[i]);
//        }

//        2 zajecia


//        System.out.println("Podaj liczby do sumowania");
//        System.out.print("Podaj 1 liczbe: ");
//        Scanner scanner = new Scanner(System.in);
//        Double number = scanner.nextDouble();
//        System.out.print("Podaj 2 liczbe: ");
//        Double number1 = scanner.nextDouble();
//        System.out.println(number+number1);
//
//
//        System.out.println("");
//
//        Scanner scanner1 = new Scanner(System.in);
//        String something = scanner1.nextLine();
//        System.out.println(Double.parseDouble(something));
//    }

//        kalkulator


//        System.out.println("Witaj w kalkulatorze");
//        System.out.println("Wybierz co chcesz zrobic:");
//        System.out.println("1. Mnożenie");
//        System.out.println("2. Dzielenie");
//        System.out.println("3. Dodawanie");
//        System.out.println("4. Odejmowanie ");
//        Scanner scanner = new Scanner(System.in);
//        int choise = scanner.nextInt();
//        System.out.print("Podaj 1 liczbę: ");
//        System.out.println("");
//        double number = scanner.nextDouble();
//        System.out.println("Podaj 2 liczbę: ");
//        double number2 = scanner.nextDouble();
//        if (choise == 1) {
//            System.out.print(number * number2);
//        }
//        else if (choise==2){
//            System.out.print(number/number2);
//        }
//        else if (choise==3){
//            System.out.print(number+number2);
//        }
//        else if(choise==4){
//            System.out.print(number-number2);
//        }
//    }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj 1 liczbę: ");
        double number = scanner.nextDouble();
        System.out.print("Podaj 2 liczbę: ");
        double number2 = scanner.nextDouble();
        System.out.println("");
        System.out.println("Witaj w kalkulatorze");
        System.out.println("Wybierz działanie");
        System.out.println("---------------------");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        System.out.println("5. Wyjście");
        System.out.println("---------------------");
        int zmienna = scanner.nextInt();
        if (zmienna < 5) {
            if (zmienna == 4) {
                if (number2 == 0) {
                    System.out.println("Nie dzielimy przez zero!");
                    System.out.println("Popraw dane");
                    System.out.println("Pierwsza liczba to: " + number);
                    System.out.print("Podaj 2 liczbę: ");
                    number2 = scanner.nextDouble();
                }
            }



                switch (zmienna) {
                    case 1:
                        System.out.print(number + number2);
                        break;
                    case 2:
                        System.out.println(number - number2);
                        break;
                    case 3:
                        System.out.println(number * number2);
                        break;
                    case 4:
                        System.out.println(number / number2);
                        break;

                }
        }
        else{
            System.out.print("Dziękuje za skorzystanie z kalkulatora");
        }
        System.out.print("Dziękuje za skorzystanie z kalkulatora");
    }
}


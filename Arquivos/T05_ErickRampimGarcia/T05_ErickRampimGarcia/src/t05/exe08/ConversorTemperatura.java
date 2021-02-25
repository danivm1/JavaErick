package t05.exe08;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor da temperatura: ");
        String a;
        double temp;
        do{
            a = sc.next();
            try{
                temp = Double.parseDouble(a);
                break;
            }catch(NumberFormatException e){
                System.out.println("Insira apenas números.");
            }
        }while(true);

        System.out.println("Escolha a opção de converção:\n1 - Farenheit para Celsius\n2 - Farenheit para Kelvin\n3 - Kelvin para Celsius\n4 - Kelvin para Farenheit\n5 - Celsius para Kelvin\n6 - Celsius para Farenheit");
        int conv=0;
        do{
            a = sc.next();
            try{
                conv = Integer.parseInt(a);
                if(conv>0 && conv<7){
                    break;
                }else{
                    System.out.print("Opção inválida, digite novamente: ");
                }
            }catch(NumberFormatException e){
                System.out.println("Insira apenas números inteiros.");
            }
        }while(true);

        switch(conv){
            case 1:
                System.out.println(String.format("%.2f °F = %.2f °C", temp, Converte.farenheitToCelsius(temp)));
                break;
            
            case 2:
                System.out.println(String.format("%.2f °F = %.2f K", temp, Converte.farenheitToKelvin(temp)));
                break;

            case 3:
                System.out.println(String.format("%.2f K = %.2f °C", temp, Converte.kelvinToCelsius(temp)));
                break;

            case 4:
                System.out.println(String.format("%.2f K = %.2f °F", temp, Converte.kelvinToFarenheit(temp)));
                break;

            case 5:
                System.out.println(String.format("%.2f °C = %.2f K", temp, Converte.celsiusToKelvin(temp)));
                break;

            case 6:
                System.out.println(String.format("%.2f °C = %.2f °F", temp, Converte.celsiusToFarenheit(temp)));
                break;
        
            default:
                break;
        }

        sc.close();
    }
}

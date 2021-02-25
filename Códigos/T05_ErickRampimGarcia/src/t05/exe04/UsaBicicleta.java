package t05.exe04;

import java.util.Scanner;

public class UsaBicicleta {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo de bicicleta:\n1 - Padrão\n2 - Personalizada");
        String a;
        int tipo;
        do{
            a = sc.next();
            try{
                tipo = Integer.parseInt(a);
                if(tipo < 1 || tipo > 2){
                    System.out.println("Insira apenas 1 ou 2.");
                }else{
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("Entrada inválida.");
            }
        }while(true);
        
        Bicicleta bicicleta = new Bicicleta();
        switch(tipo){
            case 1:
                bicicleta = new Bicicleta();

                break;
        
            case 2:
                System.out.print("Quantas marchas deseja? ");
                int maxMarcha;
                do{
                    a = sc.next();
                    try{
                        maxMarcha = Integer.parseInt(a);
                        if(maxMarcha<0){
                            System.out.println("O número de marchas não pode ser negativo.");
                        }else{
                            break;
                        }
                    }catch(NumberFormatException e){
                        System.out.println("Entrada inválida, insira um número natural.");
                    }
                }while(true);

                bicicleta = new Bicicleta(maxMarcha);

                break;
                
            default:
                break;
        }

        System.out.println("\n1 - Diminuir marcha\n2 - Aumentar marcha\n3 - Finalizar");
        int acao=0;
        boolean x;
        do{
            x=true;
            do{
                a = sc.next();
                try{
                    acao = Integer.parseInt(a);
                    if(acao < 1 || acao > 3){
                        System.out.println("Insira apenas 1, 2 ou 3.");
                    }else{
                        break;
                    }
                }catch(NumberFormatException e){
                    System.out.println("Entrada inválida.");
                }
            }while(true);

            switch(acao){
                case 1:
                    System.out.println(bicicleta.diminuiMarcha() + "\nAtual: " + bicicleta.getAtualMarcha());
                    break;
            
                case 2:
                    System.out.println(bicicleta.aumentaMarcha() + "\nAtual: " + bicicleta.getAtualMarcha());
                    break;

                case 3:
                    x = false;
                    break;

                default:
                    break;
            }
        }while(x);



        sc.close();
    }
}

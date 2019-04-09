package br.com.digitalhouse;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Normal normal = new Normal(800);
        Vip vip = new Vip(800,1500);




        int num;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero do seu ingresso: Para ingresso normal digite 1, caso o ingresso for VIP digite 2");
        num = scanner.nextInt();

        System.out.println("O numero do seu ingresso é: " + num);

        if(num == 1){
            System.out.println("Seu ingresso é normal, bom show!!" + normal);
        }if(num == 2){
            System.out.println("Seu ingresso é VIP!! no valor R$: " + vip );
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Agora escolha 1 para camarote superior ou 2 para camarote inferior.");
            num2 = scanner1.nextInt();
            if(num2 ==1){
                System.out.println("Seu ingresso é VIP do Camarote Superior, bom show !!" + num2);
            }if(num2 ==2){
                System.out.println("Seu ingresso é VIP do Camarote Inferior, bom show !!" + num2);

            }

        }

    }
}

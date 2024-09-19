package call;

import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int moedas = 30;
        
        System.out.println("Moedas: " + moedas);
        System.out.println("----------------------");
        System.out.println("  CASSINO JAVA");
        System.out.println("----------------------");
        
        System.out.println("  1 - Aposta");
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();

        if (code == 1) {
            try {
                limparTerminal(); 
            } catch (Exception e) {
                e.printStackTrace();
            }
            moedas = aposta(moedas);
            System.out.println("Moedas restantes: " + moedas);
        } else {
            System.out.println("Opção inválida.");
        }
        
        scanner.close(); 
    }
    
    public static void limparTerminal() throws Exception {
        
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }
    }

    public static int aposta(int moedas) { 
        Random random = new Random();
        
        int n1 = random.nextInt(10); 
        int n2 = random.nextInt(10);
        int n3 = random.nextInt(10);
        
        if (n1 == n2 && n2 == n3) {
            System.out.println("Você ganhou! Números: " + n1 + " " + n2 + " " + n3);
            moedas += 10; 
        } else {
            System.out.println("Você Perseu" + n1 + " " + n2 + " " + n3);
            moedas -= 5; 
        }
        
        return moedas;
    }
          }

package banken;
import java.util.Scanner;

public class banken{

    
    public static void main(String[] args) throws Exception {

    boolean run = true;
    Scanner input = new Scanner(System.in);
    int saldo = 1000;

    while (run) {
        System.out.println("________________________________________________");
        System.out.println("Hej och välkommen till Dennis ondskefulla bank!");
        System.out.println("Välj ett av fyra ondskefulla alternativ!");
        System.out.println("1. Se saldo");
        System.out.println("2. Sätt in pengar");
        System.out.println("3. Ta ut pengar");
        System.out.println("4. Avsluta");
        System.out.println("________________________________________________");

        String val = input.nextLine();

        switch (val) {
            case "1":
                saldoV();
                System.out.println(saldo + " kr");
                continue;

            case "2":
                saldo = saldo + plusSaldo();
                continue;
            
            case "3": 
                int minusMain = minusSaldo();
                int newSaldo = saldo - minusMain;
                if (newSaldo >= 0){
                    saldo = newSaldo;
                }
                else {
                    System.out.println("Det gick inte igenom, ändra summa eller lägg in mer stulna pengar!");
                }
            continue;
                    
            case "4":
                avsluta();
                run = false;
                input.close();
                break;

            default:
                System.out.println("Välj en siffra 1-4 därefter enter tack!");
                continue;
        }
    }
    }

    public static void saldoV(){
        System.out.println("Ditt saldo just nu är: ");
    }

    public static int plusSaldo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv hur mycket pengar du vill sätta in:");
        if (checkInt(input)) {
            int plus = input.nextInt();
            if (plus >= 0){
                return plus;
            }
            else{
                System.out.println("Skriv ett positivt tal!");
            }
        }

        else{
            System.out.println("Nej, skriv en siffra!");
        }
        return 0;
        }    

    public static int minusSaldo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv hur mycket pengar du vill ta ut:");
        if (checkInt(input)) {
            int minus = input.nextInt();
            if (minus >= 0){
                return minus;
            }
            else{
                System.out.println("Skriv ett positivt tal!");
            }
  
        }

        else{
            System.out.println("Nej, skriv en siffra!");
        }
        return 0;
        }

    public static void avsluta(){
            System.out.println("Avslutar nu, ha en ondskefull dag ^-^ !");
    }

    public static boolean checkInt(Scanner input){
        if(input.hasNextInt()){
            return true; }
        else{ 
            return false;
        }
    }


}
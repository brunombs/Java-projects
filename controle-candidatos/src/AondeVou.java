public class AondeVou {
    public static void main(String[] args) {
        aondevou(4000);
        aondevou(14500);
        aondevou(50000);
        aondevou(2000);
    }

    static void aondevou(double SalarioGanho){
        if (SalarioGanho >= 3500 && SalarioGanho <= 7500) {
            System.out.println("Você vai para o shopping");
        }else if(SalarioGanho > 7500 && SalarioGanho < 15000){
            System.out.println("Você vai para Cancún");
        } else if (SalarioGanho < 3500) {
            System.out.println("Você vai para a praia da Barra");
        }else
            System.out.println("Você vai para a Austrália");
    }
}

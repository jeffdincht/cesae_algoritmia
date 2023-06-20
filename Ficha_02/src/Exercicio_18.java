import java.util.Scanner;

public class Exercicio_18 {
    public static void main(String[] args) {
        System.out.println("Exercicio_18");
        Scanner input = new Scanner(System.in);

        String cargo;
        int dia, codigo;
        double venc = 0, alim = 0, irs, ssfunc = 0, ssemp = 0, liq = 0, total = 0;

        System.out.println("Quantos dias trabalhou? ");
        dia = input.nextInt();

        System.out.println("Qual o Codigo do funcionario? ");
        codigo = input.nextInt();

        System.out.println("Qual seu cargo? \nE - Empregado, \nC - Chefe \nA - Administrador \n");
        cargo = input.next();

        switch (cargo) {
            case "E":
                venc = 40 * dia;
                alim = 5 * dia;
                total = venc + alim;
                ssfunc = total * 0.11;
                ssemp = total * 0.2375;
                liq = venc + alim - ssfunc - ssemp;
                cargo = "Empregado";

                break;
            case "C":
                venc = 60 * dia;
                alim = 7.5 * dia;
                total = venc + alim;
                ssfunc = total * 0.11;
                ssemp = total * 0.2375;
                liq = venc + alim - ssfunc - ssemp;
                cargo = "Chefe";

                break;
            case "A":
                venc = 80 * dia;
                alim = 7.5 * dia;
                total = venc + alim;
                ssfunc = total * 0.11;
                ssemp = total * 0.2375;
                liq = venc + alim - ssfunc - ssemp;
                cargo = "Admin";
                break;
            default:
                System.out.println("Diga o cargo correto");
                break;
        }

        if (total > 0) {
            if (total > 1000) {
                irs = total * 0.2;
            } else {
                irs = total * 0.1;
            }
            liq = liq - irs;

            System.out.println("Codigo: "+codigo);
            System.out.println("Cargo: "+cargo);
            System.out.println("Vencimento: "+venc);
            System.out.println("Alimentacao: "+alim);
            System.out.println("IRS: "+irs);
            System.out.println("S.S Funcionario: "+ssfunc+"\nS.S Empresa: "+ssemp);
            System.out.println("Liquido: "+liq);
        }


    }
}

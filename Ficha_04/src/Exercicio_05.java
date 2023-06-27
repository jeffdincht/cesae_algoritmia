import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        System.out.println("Exercicio_18");
        Scanner input = new Scanner(System.in);

        String cargo = "E";
        boolean valid = false;
        int codigo;
        double dia = 0, venc = 0, alim = 0, irs = 0, ssfunc = 0, ssemp = 0, liq = 0, total = 0, totalGasto = 0;

        do {
            do {
                System.out.println("Codigo do funcionario");
                codigo = input.nextInt();

                if (codigo != 0) {
                    System.out.println("Qual cargo? \nE - Empregado, \nC - Chefe \nA - Administrador \nS - Sair");
                    cargo = input.next();

                    if (cargo.equals("S")) {
                        codigo = 0;
                    } else {
                        while (dia < 0 || dia > 31) {
                            System.out.println("Quantos dias trabalhou? ");
                            dia = input.nextInt();

                            if (dia < 0 || dia > 31) {

                            }


                        }

                    }


                }

            } while (codigo < 0);


            switch (cargo) {
                case "E":
                    venc = 40 * dia;
                    alim = 5 * dia;
                    if (dia >= 20) {
                        venc = venc + (venc * 0.05);
                    }
                    if (dia >= 17 && dia < 20) {
                        venc = venc + (venc * 0.02);
                    }
                    total = venc + alim;
                    ssfunc = total * 0.11;
                    ssemp = total * 0.2375;
                    liq = venc + alim - ssfunc - ssemp;

                    break;
                case "C":
                    venc = 60 * dia;
                    alim = 7.5 * dia;
                    if (dia >= 20) {
                        venc = venc + (venc * 0.05);
                    }
                    if (dia >= 17 && dia < 20) {
                        venc = venc + (venc * 0.02);
                    }
                    total = venc + alim;
                    ssfunc = total * 0.11;
                    ssemp = total * 0.2375;
                    liq = venc + alim - ssfunc - ssemp;
                    break;
                case "A":
                    venc = 80 * dia;
                    alim = 7.5 * dia;
                    if (dia >= 20) {
                        venc = venc + (venc * 0.05);
                    }
                    if (dia >= 17 && dia < 20) {
                        venc = venc + (venc * 0.02);
                    }
                    total = venc + alim;
                    ssfunc = total * 0.11;
                    ssemp = total * 0.2375;
                    liq = venc + alim - ssfunc - ssemp;
                    break;
            }

            if (total > 0) {
                if (total >= 1000 && total < 2500) {
                    irs = total * 0.2;
                }
                if (total < 1000) {
                    irs = total * 0.1;
                } else {
                    irs = total * 0.3;
                }
                liq = liq - irs;

                totalGasto = totalGasto + (total + ssemp);

                System.out.println("Codigo Func: " + codigo);
                System.out.println("Vencimento: " + venc);
                System.out.println("Alimentacao: " + alim);
                System.out.println("IRS: " + irs);
                System.out.println("S.S Funcionario: " + ssfunc + "\nS.S Empresa: " + ssemp);
                System.out.println("Liquido: " + liq);
                System.out.println("Total gasto pela Empresa: " + totalGasto);
            }

        } while (codigo != 0);


    }
}
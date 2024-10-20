import Evento.SistemaEventos;


import java.util.Scanner;

public class CentraldoSistema {
    public static void main(String[] args) {
        // Uso do try-with-resources para fechar o Scanner automaticamente
        try (Scanner sc = new Scanner(System.in)) {
            SistemaRestaurante res = new SistemaRestaurante();
            SistemaClinica scl = new SistemaClinica();
            SistemaEventos se = new SistemaEventos();

            System.out.println("========================================");
            System.out.println("            Central de Sistema          ");
            System.out.println("========================================");
            System.out.println("1. Sistema de Restaurante");
            System.out.println("2. Sistema de Clínica");
            System.out.println("3. Sistema de Eventos");
            System.out.println("0. Sair");
            System.out.println("========================================");
            System.out.print("Escolha uma opção: ");
            int option = sc.nextInt();
            sc.nextLine(); // Limpar o buffer

            switch (option) {
                case 1:
                    res.iniciarSistema();
                    break;
                case 2:
                    scl.iniciarSistema();
                    break;
                case 3:
                    se.iniciarSistema();
                    break;
                case 0:
                    System.out.println("Obrigado por usar nosso Sistema!!!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            sc.close();
        }
    }
}

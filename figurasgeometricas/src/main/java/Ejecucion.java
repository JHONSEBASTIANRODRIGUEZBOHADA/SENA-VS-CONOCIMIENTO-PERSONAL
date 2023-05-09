import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        do {
            System.out.println("\nAREA Y PERIMETRO DE FIGURAS");
            System.out.println("\nIngrese la opcion que desea:");
            System.out.println("1. Trapecio area y perimetro");
            System.out.println("2. Paralelogramo area y perimetro");
            System.out.println("3. Octagono perimetro y area");

            switch (opcion) {
                case 1:
                    Trapecio trapecio = new Trapecio();

                    System.out.println("\nTRAPECIO = AREA Y PERIMETRO");
                    System.out.print("ladoA: ");
                    trapecio.setLadoA(scanner.nextDouble());
                    System.out.print("ladoB: ");
                    trapecio.setLadoB(scanner.nextDouble());
                    System.out.print("ladoH: ");
                    trapecio.setLadoH(scanner.nextDouble());
                    System.out.print("ladoC: ");
                    trapecio.setLadoC(scanner.nextDouble());
                    System.out.print("ladoD: ");
                    trapecio.setLadoD(scanner.nextDouble());

                    System.out.println("--------------------------");
                    System.out.println("\nAREA");
                    trapecio.calcularArea();

                    System.out.println("--------------------------");
                    System.out.println("\nPERIMETRO");
                    trapecio.calcularPerimetro();

                    break;

                case 2:
                    Paralelogramo paralelogramo = new Paralelogramo();

                    System.out.println("\nPARALELOGRAMO = AREA Y PERIMETRO");
                    System.out.print("ladoB: ");
                    paralelogramo.setLadoB(scanner.nextDouble());
                    System.out.print("ladoH: ");
                    paralelogramo.setLadoH(scanner.nextDouble());
                    System.out.print("ladoA: ");
                    paralelogramo.setLadoA(scanner.nextDouble());

                    System.out.println("--------------------------");
                    System.out.println("\nAREA");
                    paralelogramo.calcularArea();

                    System.out.println("--------------------------");
                    System.out.println("\nPERIMETRO");
                    paralelogramo.calcularPerimetro();

                    break;

                case 3:
                    Octagono octagono = new Octagono();

                    System.out.println("\nOCTAGONO = PERIMETRO Y AREA");
                    System.out.print("ladoL: ");
                    octagono.setLadoL(scanner.nextDouble());
                    System.out.print("apotema: ");
                    octagono.setApotema(scanner.nextDouble());

                    System.out.println("--------------------------");
                    System.out.println("\nPERIMETRO");
                    octagono.calcularPerimetro();

                    System.out.println("--------------------------");
                    System.out.println("\nAREA");
                    octagono.calcularArea();

                    break;

                default:
                    System.out.println("No ingreso un valor correcto");
                    break;
            }

            System.out.println("\nDesea calcular el area y perimetro de otra figura?");
            System.out.println("0. Si");
            System.out.println("1. No");

            opcion = scanner.nextInt();
        } while (opcion == 0);

        scanner.close();
    }
}

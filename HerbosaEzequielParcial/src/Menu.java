import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int opcion = 0;

    public void iniciarMenu() {

        System.out.println("GESTION PILETAS JAVA:\n" +
                "1) INGRESAR VENTA\n" +
                "2) PILETAS VENDIDAS\n" +
                "3) INGRESOS TOTALES\n\n");

        System.out.printf("Opcion: ");

        opcion = scanner.nextInt();

        while ((opcion<1) || (opcion>3)){
            System.out.printf("debe ingresar un numero entre 1 y 3... Pruebe nuevamente: ");
            opcion = scanner.nextInt();
            }

        switch (opcion) {
            case 1:
                System.out.println("asd"); //crear cliente y pileta
                break;
            case 2:
                System.out.println("asd"); // imprimir piletas en lista de piletas
                break;
            case 3:
                System.out.println("asdasd"); // sumatoria de venta.precio
                break;

        }
    }

    public void ingresarVenta(){
        System.out.println("datos cliente: ");
        System.out.printf("Nombre: ");
        String nombre = scanner.next();
        System.out.printf("Apellido: ");
        String apellido = scanner.next();
        System.out.printf("DNI: ");
        int dni = scanner.nextInt();

        Cliente cliente = new Cliente(nombre,apellido,dni);


        System.out.println("Especificaciones Pileta: cemento/fibra");
        String material = scanner.next();

        if (material == "cemento"){
            //PiletaCemento pileta = new PiletaCemento();
        }







    }

    public void piletasVendidas(){

    }

    public void calcularIngresos(){

    }



}



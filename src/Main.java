import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MostrarMenuPrincipal();
    }

    private static void MostrarMenuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("------Menu------");
            System.out.println("1.Agregar articulo");
            System.out.println("2.Modificar articulo");
            System.out.println("3.Consultar todos los articulos");
            System.out.println("0.Salir");
            System.out.print("Opcion>> ");
            opcion = sc;
            try {
            switch (opcion) {
                case 1:
                    AgregarArticulo();
                    break;
                case 2:
                    ModificarArticulo();
                    break;
                case 3:
                    ConsultarArticulo();
                    break;
            }
            } catch(){
                System.out.println("Por favor ingrese una opcion valida");
            }
        }
    }

    private static void ConsultarArticulo() {
        System.out.println("Estos son todos los articulos en el inventario:");

    }

    private static void ModificarArticulo() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el modelo del articulo a modificar: ");

    }

    private static void AgregarArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que tipo de dispositivo desea agregar?");
        System.out.println("1.Telefono Movil");
        System.out.println("2.Laptop");
    }
//Hice lo que pude hacer,con lo poco que recuerdo

}


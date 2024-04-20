//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MostrarMenuPrincipal();
    }

    private static void MostrarMenuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("------Menu------");
        System.out.println("1.Agregar articulo");
        System.out.println("2.Modificar articulo");
        System.out.println("3.Consultar todos los articulos");
        System.out.println("0.Salir");
        System.out.print("Opcion>> ");
        opcion = sc;
        switch (opcion){
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
    }

    private static void ConsultarArticulo() {
        System.out.println("Estos son todos los articulos en el inventario:");

    }

    private static void ModificarArticulo() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el modelo del articulo a modificar: ");

    }

    private static void AgregarArticulo() {
        System.out.println("Ingrese el modelo del articulo: ");
    }


}


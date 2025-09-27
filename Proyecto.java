
import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) {
        int precio, opcion;
        String articulo;
        Scanner sc = new Scanner(System.in);
        precio = 15;
        articulo = "picafresa";
        Carrito p  = new Carrito(precio, articulo);
        p.agregar();
        do { 
            System.out.println("Elija una opcion: 1.Agregar artículo 2.Eliminar articulo 3.Mostrar carrito 4.Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese un artículo y un precio");
                    articulo = sc.next();
                    precio = sc.nextInt();
                    p.precio = precio;
                    p.articulo = articulo;
                    p.agregar();
                    break;
                case 2:
                    System.out.println("Ingrese un articulo a eliminar: ");
                    articulo = sc.next();
                    precio = 0;
                    p.precio = precio;
                    p.articulo = articulo;
                    p.eliminar();
                    break;
                case 3:
                    p.imprimir();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Esa opción no existe");
            }
        } while (opcion != 4);
        sc.close();
    } 
}

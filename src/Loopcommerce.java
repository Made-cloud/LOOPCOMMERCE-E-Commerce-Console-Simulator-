import java.util.Scanner;

public class Loopcommerce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variables de Ecommerce
        String[] Mercancia = {"Zapatos blancos", "poleron negro", "corbatas", "bolso de mano"};
        double[] Precios= { 35.500, 17.500, 9.990, 10.500};
        double subtotal= 0.0; // variable para acumular el total de carrito
        int opcion;//variable para guardadr la opción del menu que eligio

        // Do-while para el menú principal
        do {
            System.out.println("\n 🌓 Moonstroe 🌗");
            System.out.println(" 1. Ver productos");
            System.out.println(" 2. Agregar a carrito");
            System.out.println(" 3. Ver subtotal actual");
            System.out.println(" 4. Hacer un Checkout");
            System.out.println(" 5. Salir de la compra");
            System.out.print (" Seleccione una opción");

            opcion = input.nextInt();
            input.nextLine(); // limpiar el buffer

            switch (opcion) {
                case 1:
                    // for each para listar mercancias
                    System.out.println(" \n 📦 ** Stock de productos **");
                    int contador = 1;
                    for (int i = 0; i < Mercancia.length; i++) {
                        System.out.println(contador + " - " + Mercancia[i]);
                        contador++;
                    }

                    break;
                    case 2:
                        // while para agregar productos
                        System.out.println("\n ** Agregar a carrito**");
                        System.out.println("Ingrese el número del producto (1-4) o 0 para terminar");
                        int numero = input.nextInt();
                        while (true){
                            System.out.println("producto # (1-4, 0=salir): ");
                            numero = input.nextInt();
                            if (numero == 0){
                                System.out.println("Productos agregados con exito. subtotal actual $" + subtotal);
                                break;

                            } else if (numero >=1 && numero <=4 ) {
                                subtotal += Precios[numero-1];
                                System.out.println("✅ \" + productos[seleccion - 1] + \" agregado.");
                                System.out.println("Subtotal parcial: $" + subtotal);
                            }else {
                                System.out.println(" X Opción inválida. Intente de nuevo.");
                            }
                        }
                        break;
                        case 3:
                            // mostral el subtotal
                            System.out.println("\n💰 ** SUBTOTAL ACTUAL **");
                            System.out.println("Carrito: $" + subtotal);

                            // if/else para mostrar mensaje adicional
                            if (subtotal == 0) {
                                System.out.println("El carrito está vacío. ¡Agrega productos!");
                            } else if (subtotal > 100) {
                                System.out.println("¡Felicidades! Tienes envío gratis.");
                            }
                            break;

                case 4:
                    // FOR para proceso de checkout
                    System.out.println("\n✅ ** PROCESO DE CHECKOUT **");
                    String[] pasos = {
                            "Validación de stock...",
                            "Confirmación de datos...",
                            "Procesamiento de pago...",
                            "Generación de envío..."
                    };

                    for (int i = 0; i < pasos.length; i++) {
                        System.out.println("Paso " + (i + 1) + ": " + pasos[i]);
                        // Simular espera
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("\n🎉 ** COMPRA COMPLETADA **");
                    System.out.println("Total pagado: $" + subtotal);
                    System.out.println("Gracias por su compra.");
                    subtotal = 0; // Reiniciar carrito
                    break;

                case 5:
                    System.out.println("\n👋 ¡Gracias por usar LoopCommerce!");
                    break;

                default:
                    System.out.println("\n❌ Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 5); // do-while continúa hasta que elija salir

        input.close();
    }
}






package tarea;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Principal {

    Scanner teclado = new Scanner(System.in);
    LinkedList<Vendedor> lista = new LinkedList();
    Vector<Ventas> ventas = new Vector();
    Vector<Ventas> temporal = new Vector();

    int id = 0;

    public int menu() {
        System.out.println("---------------MENU------------------");
        System.out.println("1.  Agregar inicio");
        System.out.println("2.  Agregar final");
        System.out.println("3.  Agregar antes de referencia");
        System.out.println("4.  Agregar despues de referencia");
        System.out.println("5.  Borrar referencia");
        System.out.println("6.  Borrar inicio");
        System.out.println("7.  Borrar final");
        System.out.println("8.  Borrar antes de una refrencia");
        System.out.println("9.  Borrar despues de una referencia");
        System.out.println("10. Imprimir");
        System.out.println("11. Salir");
        System.out.println("\nIngrese la opción deseada: ");
        int opcion = teclado.nextInt();

        return opcion;

    }

    public void agregarInicio() {
        temporal.clear();
        Vendedor vendedor = new Vendedor();
        String articulo;
        double precio;
        double comision = 0;
        boolean bandera = false;
        String respuesta;

        System.out.println("---------------AGREGAR INICIO--------------");
        System.out.println("nombre del vendedor:");
        vendedor.setNombre(teclado.next());
        System.out.println("sexo del vendedor: ");
        vendedor.setSexo(teclado.next());
        System.out.println("edad del vendedor: ");
        vendedor.setEdad(teclado.nextInt());
        id++;

        do {
            System.out.println("articulo que vendio: ");
            articulo = teclado.next();
            System.out.println("precio del articulo: ");
            precio = teclado.nextDouble();
            comision = comision + precio;
            temporal.add(new Ventas(id, articulo, precio));
            System.out.println("desaeas agregar otro artiulo- si,no");
            respuesta = teclado.next();

            if (respuesta.equals("no")) {
                bandera = true;

            }

        } while (bandera == false);

        comision = comision * 0.08;

        if (comision >= 100) {
            vendedor.setId(id);
            vendedor.setComision(comision);
            lista.addFirst(vendedor);

            for (int i = 0; i < temporal.size(); i++) {
                ventas.add(temporal.get(i));
            }
        } else {
            id--;
        }
    }

    public void agregarFinal() {
        temporal.clear();
        Vendedor vendedor = new Vendedor();
        String articulo;
        double precio;
        double comision = 0;
        boolean bandera = false;
        String respuesta;
        System.out.println("---------------AGREGAR FINAL--------------");
        System.out.println("nombre del vendedor:");
        vendedor.setNombre(teclado.next());
        System.out.println("sexo del vendedor: ");
        vendedor.setSexo(teclado.next());
        System.out.println("edad del vendedor: ");
        vendedor.setEdad(teclado.nextInt());

        id++;

        do {
            System.out.println("articulo que vendio: ");
            articulo = teclado.next();
            System.out.println("precio del articulo: ");
            precio = teclado.nextDouble();
            comision = comision + precio;
            temporal.add(new Ventas(id, articulo, precio));
            System.out.println("desaeas agregar otro artiulo- si,no");
            respuesta = teclado.next();

            if (respuesta.equals("no")) {
                bandera = true;
            }

        } while (bandera == false);

        comision = comision * 0.08;

        if (comision >= 100) {
            vendedor.setId(id);
            vendedor.setComision(comision);
            lista.addLast(vendedor);

            for (int i = 0; i < temporal.size(); i++) {
                ventas.add(temporal.get(i));
            }
        } else {
            id--;
        }
    }

    public void agregarAntesReferencia() {
        System.out.println("-----AGREGAR ANTES DE REFERENCIA---------");
        System.out.println("Nombre del vendedor: ");
        String nombre = teclado.next();
        boolean bandera = false;
        int i;

        for (i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equals(nombre)) {
                bandera = true;
                System.out.println("Vendedor encontrado!");
                break;
            }
        }

        if (bandera == true) {
            temporal.clear();
            Vendedor vendedor = new Vendedor();
            String articulo;
            double precio;
            double comision = 0;
            bandera = false;
            String respuesta;

            System.out.println("--------AGREGAR ANTES DE REFERENCIA--------");
            System.out.println("nombre del vendedor:");
            vendedor.setNombre(teclado.next());
            System.out.println("sexo del vendedor: ");
            vendedor.setSexo(teclado.next());
            System.out.println("edad del vendedor: ");
            vendedor.setEdad(teclado.nextInt());

            id++;

            do {
                System.out.println("articulo que vendio: ");
                articulo = teclado.next();
                System.out.println("precio del articulo: ");
                precio = teclado.nextDouble();
                comision = comision + precio;
                temporal.add(new Ventas(id, articulo, precio));
                System.out.println("desaeas agregar otro artiulo- si,no");
                respuesta = teclado.next();

                if (respuesta.equals("no")) {
                    bandera = true;
                }

            } while (bandera == false);

            comision = comision * 0.08;

            if (comision >= 100) {
                vendedor.setId(id);
                vendedor.setComision(comision);
                lista.add(i, vendedor);

                for (i = 0; i < temporal.size(); i++) {
                    ventas.add(temporal.get(i));
                }
            } else {
                id--;
            }
        } else {
            System.out.println("El vendedor no se ha encontrado");
        }
    }

    public void agregarDespuesReferencia() {
        System.out.println("-----AGREGAR DESPUES DE REFERENCIA---------");
        System.out.println("Nombre del vendedor: ");
        String nombre = teclado.next();
        boolean bandera = false;
        int i;

        for (i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equals(nombre)) {
                bandera = true;
                System.out.println("Vendedor encontrado!");
                break;
            }
        }

        if (bandera == true) {
            temporal.clear();
            Vendedor vendedor = new Vendedor();
            String articulo;
            double precio;
            double comision = 0;
            bandera = false;
            String respuesta;

            System.out.println("--------AGREGAR DESPUES DE REFERENCIA--------");
            System.out.println("nombre del vendedor:");
            vendedor.setNombre(teclado.next());
            System.out.println("sexo del vendedor: ");
            vendedor.setSexo(teclado.next());
            System.out.println("edad del vendedor: ");
            vendedor.setEdad(teclado.nextInt());

            id++;

            do {
                System.out.println("articulo que vendio: ");
                articulo = teclado.next();
                System.out.println("precio del articulo: ");
                precio = teclado.nextDouble();
                comision = comision + precio;
                temporal.add(new Ventas(id, articulo, precio));
                System.out.println("desaeas agregar otro artiulo- si,no");
                respuesta = teclado.next();

                if (respuesta.equals("no")) {
                    bandera = true;
                }

            } while (bandera == false);

            comision = comision * 0.08;

            if (comision >= 100) {
                vendedor.setId(id);
                vendedor.setComision(comision);

                if (i == lista.size() - 1) {
                    lista.addLast(vendedor);
                } else {
                    lista.add(i + 1, vendedor);
                }

                for (i = 0; i < temporal.size(); i++) {
                    ventas.add(temporal.get(i));
                }
            } else {
                id--;
            }
        } else {
            System.out.println("El vendedor no se ha encontrado");
        }
    }

    public void eliminarReferencia() {
        System.out.println("------ELiminar Referencia---------");
        boolean bandera = false;

        if (lista.isEmpty()) {
            System.out.println("La Lista está vacia");
        } else {
            System.out.println("nombre de vendedor que desea eliminar: ");
            String nombre = teclado.next();

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getNombre().equals(nombre)) {
                    lista.remove(i);
                    bandera = true;
                    break;
                }
            }

            if (bandera) {
                System.out.println("Elemento eliminado");
            } else {
                System.out.println("Elemento no econtrado");
            }
        }
    }

    public void eliminarInicio() {
        System.out.println("------ELiminar INICIO-------");
        if (lista.isEmpty()) {
            System.out.println("La Lista está vacia");
        } else {
            lista.removeFirst();
            System.out.println("Elemento eliminado");
        }
    }

    public void eliminarFinal() {
        System.out.println("-----Eliminar Final------");
        if (lista.isEmpty()) {
            System.out.println("La Lista está vacia");
        } else {
            lista.removeLast();
            System.out.println("Elemento eliminado");
        }
    }

    public void eliminarAntesReferencia() {
        System.out.println("------ELiminar ANTES DE REFERENCIA-------");
        boolean bandera = false;
        int i;

        if (lista.isEmpty()) {
            System.out.println("La Lista está vacia");
        } else {
            System.out.println("nombre de vendedor que desea eliminar: ");
            String nombre = teclado.next();

            for (i = 0; i < lista.size(); i++) {
                if (lista.get(i).getNombre().equals(nombre)) {
                    bandera = true;
                    break;
                }
            }

            if (bandera) {
                if (i == 0) {
                    System.out.println("No se puede eliminar un elemento que está antes del inicio");
                } else {
                    lista.remove(i - 1);
                    System.out.println("Elemento eliminado");
                }
            } else {
                System.out.println("Elemento no econtrado");
            }
        }
    }

    public void eliminarDespuesReferencia() {
        System.out.println("------ELIMINAR DESPUES DE REFERENCIA---------");
        boolean bandera = false;
        int i;

        if (lista.isEmpty()) {
            System.out.println("La Lista está vacia");
        } else {
            System.out.println("nombre de vendedor que desea eliminar: ");
            String nombre = teclado.next();

            for (i = 0; i < lista.size(); i++) {
                if (lista.get(i).getNombre().equals(nombre)) {
                    bandera = true;
                    break;
                }
            }

            if (bandera) {
                if (i == lista.size() - 1) {
                    System.out.println("No se puede eliminar un elemento que está despues del ultimo");
                } else {
                    lista.remove(i + 1);
                    System.out.println("Elemento eliminado");
                }
            } else {
                System.out.println("Elemento no econtrado");
            }
        }
    }

    public void imprimir() {
        System.out.println("---LISTA DE EMPLEADO Y VENTAS-----");
        if (lista.isEmpty()) {
            System.out.println("La lista se encuentra vacia");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("***************************");
                System.out.println(lista.get(i).toString());
                for (int j = 0; j < ventas.size(); j++) {
                    if (ventas.get(j).getId() == lista.get(i).getId()) {
                        System.out.println("      -----        ");
                        System.out.println(ventas.get(j).toString());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        int opcion;

        do {
            opcion = p.menu();

            switch (opcion) {
                case 1:
                    p.agregarInicio();
                    break;

                case 2:
                    p.agregarFinal();
                    break;

                case 3:
                    p.agregarAntesReferencia();
                    break;

                case 4:
                    p.agregarDespuesReferencia();
                    break;

                case 5:
                    p.eliminarReferencia();
                    break;

                case 6:
                    p.eliminarInicio();
                    break;

                case 7:
                    p.eliminarFinal();
                    break;

                case 8:
                    p.eliminarAntesReferencia();
                    break;

                case 9:
                    p.eliminarDespuesReferencia();
                    break;

                case 10:
                    p.imprimir();
                    break;

                case 11:
                    System.out.println("bye");
                    break;

                default:
                    System.out.println("opcion erronea");
                    break;
            }
        } while (opcion != 11);
    }
}
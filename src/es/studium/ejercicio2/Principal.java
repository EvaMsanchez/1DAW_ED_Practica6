package es.studium.ejercicio2;

import es.studium.ejercicio1.Carrito;

public class Principal
{
    private static Producto crearProducto(String nombre, double precio)
    {
        Producto producto = new Producto();
        producto.nombre = nombre;
        producto.precio = precio;
        return producto;
    }


    public static void main(String[] args)
    {
        Producto producto1 = crearProducto("Arroz", 0.55);
        System.out.println("El nombre del producto que queremos crear es: " + producto1.nombre
            + " y su precio es: " + producto1.precio);
    }
}





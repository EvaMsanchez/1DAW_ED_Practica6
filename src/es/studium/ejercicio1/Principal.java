package es.studium.ejercicio1;

public class Principal
{
    private static Carrito crearCarrito(int numPedido)
    {
        Carrito carrito = new Carrito();
        carrito.numPedido = numPedido;
        return carrito;
    }


    public static void main(String[] args)
    {
        Carrito carrito1 = crearCarrito(120);
        System.out.println("El número de pedido del carrito es: " + carrito1.numPedido);
    }
}




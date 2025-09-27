
import java.util.Enumeration;
import java.util.Hashtable;


public class Carrito {
    int precio;
    String articulo;
    String llave;
    Integer valor;
    Hashtable<String, Integer> articles = new Hashtable <String, Integer>();
    
    public Carrito(int precio,String articulo){
        this.precio = precio;
        this.articulo = articulo;

    }
    public void agregar(){
        articles.put(articulo, precio);
        return;
    } 
    public void eliminar(){
        if (articles.containsKey(articulo) == false){
            System.out.println("El carrito no contiene el articulo especificado");
            return;
        }
        else{
            articles.remove(articulo);
        }
        return;
    }
    public void imprimir(){
        Enumeration<String> llaves = articles.keys();
        while (llaves.hasMoreElements()) {
            llave = llaves.nextElement();
            valor = articles.get(llave);
            System.out.println("Articulo: " + llave + "\tPrecio: " + valor);
        }
        return;
    }
}

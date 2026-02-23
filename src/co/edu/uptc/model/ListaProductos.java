package co.edu.uptc.model;

import co.edu.uptc.interfaces.ModelInterface;

public class ListaProductos implements ModelInterface {

    private Nodo header;

    public ListaProductos(){
        header= null;
    }

    private Nodo createNode(Producto producto){
        return new Nodo(producto);
    }

    private Nodo getLastNode(){
        Nodo last = header;
        while (last.sig !=null){
            last = last.sig;
        }
        return last;
    }

    @Override
    public void addProduct(Producto producto) {
        Nodo aux = createNode(producto);
        if(header==null){
            header= aux;
        }else{
            Nodo last = getLastNode();
            last.sig = aux;
        }
    }

    @Override
    public String[] getProducts() {
        int size= getSize();
        String[] result =new String [size];
        Nodo aux = header;
        int i= 0;
        while (aux != null){
            result[i] = aux.producto.toString();
            aux=aux.sig;
            i++;

        }
        return result;
    }

    @Override
    public int deleteProduct(String nombre) {
        int count=0;
        String search = nombre.toLowerCase();

        while(header!= null && header.producto.getDescripcion().toLowerCase().contains(search)){
            header = header.sig;
            count++;
        }
        if(header==null){
            return count;
        }

        Nodo prev= header;
        Nodo current = header.sig;

        while(current!= null){
            if(current.producto.getDescripcion().toLowerCase().contains(search)){
                prev.sig=current.sig;
                count++;
            }else{
                prev= current;
            }
            current=current.sig;
        }
        return count;
    }

    private int getSize(){
        int count=0;
        Nodo aux= header;
        while(aux !=null){
            count++;
            aux=aux.sig;
        }
        return count;
    }
}
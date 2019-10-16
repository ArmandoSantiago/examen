import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws XmlRpcException, IOException {
        System.out.println("Iniciando el servidor...");
        //Es un archivo de propiedades para un manipulador
        PropertyHandlerMapping mapeo = new PropertyHandlerMapping();
        //Se agrega un manipulador con el nombre de la llave, seguido de la clase a la que apunta
        mapeo.addHandler("Metodos", Metodos.class);
        //Se crea e inicializa un RPC WebService en el puerto 1200
        WebServer servidor = new WebServer(1200);
        //Se asigna el manipulador al servidor
        servidor.getXmlRpcServer().setHandlerMapping(mapeo);
        //Se inicia el servidor
        servidor.start();
        System.out.println("Esperando petición...");
    }

}

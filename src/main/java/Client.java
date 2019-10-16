import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        //Se crea una instancia de XmlRpcClientConfigImpl para la configuracín de solicitud del cliente
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        //Se indica la URL de comunicación con el servidor en este caso como es local es localhost seguido del puerto
        config.setServerURL(new URL("http://localhost:1200"));
        //Se crea una instancia de RPC cliente
        XmlRpcClient client = new XmlRpcClient();
        //Se le pasa la configuración de XmlRpcClientConfigImpl
        client.setConfig(config);
        //Se recuperan los datos a mandar
        Scanner leerScanner = new Scanner(System.in);
        System.out.println("Ingresa el tipo de sangre");
        String tipo = leerScanner.next();
        Object[] params = {tipo};
        //Se ejecuta el cliente Mandando el nombre el Manipulador anterior, seguido del nombre del
        // metodo terminando con los parametros a mandar
        String result = (String) client.execute("Metodos.grupo", params);
        System.out.println("Resultado " + result);

    }
}

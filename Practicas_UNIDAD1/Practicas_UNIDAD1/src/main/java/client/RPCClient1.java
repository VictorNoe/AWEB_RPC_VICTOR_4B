package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.print("Ingresa tu nombre: ");
        String name = sc.next();
        System.out.print("Ingresa tu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Ingresa tu altura: ");
        double altura = sc.nextDouble();
        Object[] mc = {name,peso,altura};
        String response = (String) client.execute("Methods.persons",mc);
        System.out.println(response);
        
        //flores toledo victor noe
    }
}

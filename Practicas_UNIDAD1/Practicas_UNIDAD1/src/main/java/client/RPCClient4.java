package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.print("Ingresa el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        int num3 = sc.nextInt();
        System.out.print("Ingresa el cuarto numero: ");
        int num4 = sc.nextInt();
        System.out.print("Ingresa el quinto numero: ");
        int num5 = sc.nextInt();
        Object[] datos = {num1,num2,num3,num4,num5};
        String response = (String) client.execute("Methods.ascendencia",datos);
        System.out.println(response);

        //flores toledo victor noe
    }
}

package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.print("Ingresa el primer valor: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa el segundo valor: ");
        int num2 = sc.nextInt();
        Object[] datos = {num1,num2};
        int response = (int) client.execute("Methods.sumatoria",datos);
        System.out.println(response);
        //flores toledo victor noe
    }
}

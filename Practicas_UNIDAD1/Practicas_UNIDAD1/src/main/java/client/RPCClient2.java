package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
import java.util.Scanner;

import java.net.MalformedURLException;
import java.net.URL;

public class RPCClient2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.print("Dame el primer numero:");
        double num1 = sc.nextDouble();
        System.out.print("Dame el segundo numero:");
        double num2 = sc.nextDouble();
        System.out.print("Dame el trecer numero:");
        double num3 = sc.nextDouble();
        System.out.print("Dame el cuarto numero:");
        double num4 = sc.nextDouble();
        Object[] datos = {num1, num2, num3, num4};
        String response = (String) client.execute("Methods.multiplicacion",datos);
        System.out.println(response);

        //flores toledo victor noe
    }
}

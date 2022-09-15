package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RpcClient {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        Object[] numbers = {5.0, 5D,4,10};

        System.out.println("Introduce numero 1");
        double numero1 = sc.nextDouble();
        System.out.println("Introduce numero 2");
        double numero2 = sc.nextDouble();
        System.out.println("Introduce numero 3");
        double numero3 = sc.nextDouble();
        System.out.println("Introduce numero 4");
        double numero4 = sc.nextDouble();
        Double response = (Double)
                client.execute("methods.operacion", numbers);
        System.out.println(response);



        System.out.println("Introduce numero 1");
        numero1 =sc.nextDouble();
        System.out.println("Introduce numero 2");
        numero2 =sc.nextDouble();

        Object[] number ={numero1, numero2};
        String responses = (String) client.execute("methods.suma2", number);
        System.out.println(responses);



        double cifra=4;
        System.out.println("Introduce el Numero 1");
        numero1 = sc.nextInt();
        System.out.println("Introduce el Numero 2");
        numero2 = sc.nextInt();
        System.out.println("Introduce el Numero 3");
        numero3 = sc.nextInt();
        System.out.println("Introduce el Numero 4");
        numero4 = sc.nextInt();
        System.out.println("Introduce el Numero 5");
        double numero5 = sc.nextInt();

        number = new Object[]{cifra, numero1, numero2, numero3, numero4, numero5 };
        String response2 = (String) client.execute("methods.arreglo", number);
        System.out.println(response2);


    }}

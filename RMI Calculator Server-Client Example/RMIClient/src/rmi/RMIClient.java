package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;

public class RMIClient {

    public static void main(String[] args) {
        try {
            // 1) Connect to the RMI Registry created on the server
            Registry registry = LocateRegistry.getRegistry("localhost", 500);
            // (add "localhost" explicitly, just to be clear)

            // 2) Search for the stub "calc"
            CalculatorInterface c = (CalculatorInterface) registry.lookup("calc");

            // 3) List all remote objects
            System.out.println("Objects in registry: " + Arrays.toString(registry.list()));

            // 4) Invoke the remote methods on the remote object

            // getLastResult (initially 0)
            Result res = c.getLastResult();
            System.out.println("The last result was " + res.getResult());

            // add(5, 3)
            res = c.add(5, 3);
            System.out.println("The new result is " + res.getResult());

            // getLastResult again
            res = c.getLastResult();
            System.out.println("The last result was " + res.getResult());

            // sub(10, 5)
            Result subRes = c.sub(10, 5);
            System.out.println("Sub = " + subRes.getResult());

        } catch (Exception ex) {
            System.out.println("Exception occured");
            ex.printStackTrace();
        }
    }
}

package Array_ArrayList.Q19_Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo_Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        while (true) {
            int id = scanner.nextInt();
            if (id < 0) break;
            scanner.nextLine();
            String nome = scanner.nextLine();
            int idade = scanner.nextInt();
            scanner.nextLine();
            String telefone = scanner.nextLine();
            
            clientes.add(new Cliente(id, nome, idade, telefone));
        }
        
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        
        scanner.close();
    }
}

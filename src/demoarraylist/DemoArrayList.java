package demoarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList {

    public static void main(String[] args) {
        
        ArrayList <String> minhaLista = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        String aux = "";
        
        //Inseri os itens na lista
        while (!aux.equals("0")) {            
            System.out.println("Informe a descrição do item:");
            aux = entrada.nextLine();
            if (!aux.equals("0")) {
                minhaLista.add(aux);
            }
        }
        
        //Percorre a lista
        for(int i = 0; i < minhaLista.size(); i++) {
            System.out.println(minhaLista.get(i));
        }
    }
    
}

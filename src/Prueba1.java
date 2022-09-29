import java.util.ArrayList;
import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in,"UTF-8");
        ArrayList<String> coll = new ArrayList<String>();
        String animal = "";

        System.out.println("Introduce un animal: (FIN para finalizar programa)");
        animal = sc.nextLine();

        int i = 0;

        while (!animal.equalsIgnoreCase("FIN")){
            coll.add(i, animal);
            System.out.println("Animal: ");
            animal = sc.nextLine();
            i++;
        }


        int cont = 0;

        String [] arrayA = coll.toArray(new String[0]);
        String aux = arrayA[0];
        for (int x = 0; x < arrayA.length; x++) {
            if (aux.equalsIgnoreCase(arrayA[x])) {
                cont++;
            }
            else
                aux = arrayA[x];
        }

        System.out.println("Animales repetidos: " + cont);

    }


}






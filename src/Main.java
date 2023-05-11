package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbersList = new ArrayList<Integer>();
        var scanner = new Scanner(System.in);
        var finished = Boolean.FALSE;
        List<Integer> positionExcluded = new ArrayList<Integer>();

        System.out.println("Quantos indices tem o array? ");
        var arrayLength = scanner.nextInt();

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Digite o número inteiro: ");
            numbersList.add(scanner.nextInt());
        }

        for (int i = 0; i < arrayLength - 1; i++) {
//            if (numbersList.size() > 0) {
                var num1 = numbersList.get(i);
                List<Integer> auxNumbersList = new ArrayList<Integer>(numbersList);
                auxNumbersList.remove(i);

                for (int num2 : auxNumbersList) {
                    if (num1 + num2 == 10
                        && !positionExcluded.contains(numbersList.indexOf(num1))) {

                        positionExcluded.add(numbersList.indexOf(num2));
                        finished = Boolean.TRUE;
                        System.out.printf("Par que soma 10 encontrado, são eles: %s e %s", num1, num2);
                        System.out.printf("\n");
                    }
                }
//            }
        }

        if (!finished) {
            System.out.println("Não há pares cuja soma seja igual a 10!");
        }
    }
}
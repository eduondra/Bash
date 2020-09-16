import java.util.Scanner;
import java.util.ArrayList;

class BashRedirection{
    public static void main(String args[]) {
        ArrayList<String> numbersString = new ArrayList<String>();
        ArrayList<Integer> numbersIntiger = new ArrayList<Integer>();

        boolean condition = true;
        double sum = 0;
        double average;

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej cislo, ukonci program");


        while(condition){
            String numberString = sc.nextLine();
            numbersString.add(numberString);
            if(numberString.equals("END"))
                condition = false;
        }

        int deleteEND = numbersString.size() - 1;
        numbersString.remove(deleteEND);

        for(int c = 0; c < numbersString.size(); c++){
            numbersIntiger.add(Integer.parseInt(numbersString.get(c)));
        }


        for(int vypocet = 0; vypocet < numbersIntiger.size(); vypocet++){
            sum += numbersIntiger.get(vypocet);
        }

        average = sum / numbersIntiger.size();

        int nejvetsi = numbersIntiger.get(0);
        int nejmensi = numbersIntiger.get(0);


        for(int a = 0; a < numbersIntiger.size(); a++){
            if(numbersIntiger.get(a) > nejvetsi)
                nejvetsi = numbersIntiger.get(a);
        }

        for(int b = 0; b < numbersIntiger.size(); b++){
            if(numbersIntiger.get(b) < nejmensi)
                nejmensi = numbersIntiger.get(b);
        }
        
        System.out.println("Soucet cisel :" + sum);
        System.out.println("Prumer cisel :" + average);
        System.out.println("Nejvetsi cislo z cisel :" + nejvetsi);
        System.out.println("Nejmensi cislo z cisel :" + nejmensi);

    }

}
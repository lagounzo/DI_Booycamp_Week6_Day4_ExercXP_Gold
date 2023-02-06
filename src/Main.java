public class Main {
    public static void main(String[] args) {

        System.out.println("Test of xp Gold!");

        //Exercice1_Dog
        Dog dogTao = new Dog();
        dogTao.setDrinkTime(2);
        System.out.println("Promenade possible ? " + dogTao.needsToGo());
        dogTao.setDrinkTime(5);
        System.out.println("Promenade possible ? " + dogTao.needsToGo());


        System.out.println();
        //Exercie2_PairOfDice

        PairOfDice pairOfDice1 = new PairOfDice();
        pairOfDice1.throwDiet();
        int nberLance = 0;
        int totalDiet = 0;
        do {
            pairOfDice1.throwDiet();
            totalDiet++;
        } while (pairOfDice1.dietSum() != 2);

        System.out.println("Total lancé: " + totalDiet);
    }


    }

package ChiDauKhat.bai4;

import java.util.Scanner;

public class Population {
    Long population;
    Long numberOfBirth;
    Long numberOfDeath;

    public void setNumberOfBirth(Long numberOfBirth) {
        this.numberOfBirth = numberOfBirth;
    }

    public void setNumberOfDeath(Long numberOfDeath) {
        this.numberOfDeath = numberOfDeath;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Population(){}
    public float birthRate(){
        return (float) numberOfBirth/population;
    }
    public float deathRate(){
        return (float)numberOfDeath/population;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long birth,death,total;
        Population population = new Population();

        do{
            System.out.println("Enter the population: ");
            total = scanner.nextLong();
        }while (total <= 0);

        do{
            System.out.println("Enter the number of birth: ");
            birth = scanner.nextLong();
        }while(birth <0);

        do{
            System.out.println("Enter the number of death: ");
            death = scanner.nextLong();
        }while ((death < 0));
        population.setPopulation(total);
        population.setNumberOfBirth(birth);
        population.setNumberOfDeath(death);
        System.out.printf("Birth Rate: %4.2f",population.birthRate());
        System.out.println("\n");
        System.out.printf("Death Rate: %4.2f",population.deathRate());

    }
}

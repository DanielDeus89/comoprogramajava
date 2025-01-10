package cap03.heartrates;

public class HeartratesTest {
    public static void main(String[] args) {
        Heartrates heartrates = new Heartrates("Daniel", "Deus", 20,4,1989);

        int idade = heartrates.calculaIdade(1989);

        System.out.println(idade);
    }
}

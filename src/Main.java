// em uma cidade se deseja sicronizar os semáforos, com isto, quando um semáforo abre
// os veículos que ne estavam parados tende a encontrar os próximos que precisam abrir
// um pouco depois dependendo da velocidade permitida da via e da distância entre eles
// assim ao abrir o semáforo um veiculo começa  acelerar ate atingir a velocidade da via
// que mantém até chegar ao próximo, este deve abrir um pouco antes do veículo chegar (ex 3seg)
// faça um algoritimo que informe quanto tempo depois um semáforo deve abrir, dada as seguintes
// informações -- a distância desde o semáforo anterior -- a velocidade permitida da via



import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    // Entrada de dados
    System.out.println("Informe velocidade permitida da via:\n");
    double velocidadeVia = sc.nextDouble();
    System.out.println("Informe a distância até o próximo semáforo em Km:\n");
    double distanciaKm = sc.nextDouble();

    // calculo  determina quanto tempo leva para percorrer a distancia até o proximo semáforo
    double tempo = (distanciaKm/velocidadeVia)*60;
    System.out.println("O próximo deverá abri em, "+tempo+"Seg");

    }
}
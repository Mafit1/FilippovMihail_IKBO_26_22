import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DrunkardGameQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод карт первого игрока
        System.out.print("Введите 5 карт первого игрока (без пробелов): ");
        String player1Cards = scanner.nextLine();

        // Ввод карт второго игрока
        System.out.print("Введите 5 карт второго игрока (без пробелов): ");
        String player2Cards = scanner.nextLine();

        // Создаем очереди для карт каждого игрока
        Queue<Integer> player1Deck = new LinkedList<>();
        Queue<Integer> player2Deck = new LinkedList<>();

        // Инициализируем колоды игроков
        for (int i = 0; i < 5; i++) {
            player1Deck.offer(Character.getNumericValue(player1Cards.charAt(i)));
            player2Deck.offer(Character.getNumericValue(player2Cards.charAt(i)));
        }

        // Моделируем игру
        int rounds = 0;
        while (!player1Deck.isEmpty() && !player2Deck.isEmpty() && rounds < 106) {
            int card1 = player1Deck.poll();
            int card2 = player2Deck.poll();

            if (card1 == 0 && card2 == 9) {
                // Первый игрок выигрывает раунд
                player1Deck.offer(card1);
                player1Deck.offer(card2);
            } else if (card1 == 9 && card2 == 0) {
                // Второй игрок выигрывает раунд
                player2Deck.offer(card1);
                player2Deck.offer(card2);
            } else if (card1 > card2) {
                // Первый игрок выигрывает раунд
                player1Deck.offer(card1);
                player1Deck.offer(card2);
            } else {
                // Второй игрок выигрывает раунд
                player2Deck.offer(card1);
                player2Deck.offer(card2);
            }

            rounds++;
        }

        // Проверка на длительность игры
        if (rounds >= 106) {
            System.out.println("Игра завершена после 106 ходов. Ничья.");
        } else {
            // Определяем победителя
            if (player1Deck.isEmpty()) {
                System.out.println("Победил второй игрок после " + rounds + " раундов.");
            } else {
                System.out.println("Победил первый игрок после " + rounds + " раундов.");
            }
        }

        scanner.close();
    }
}

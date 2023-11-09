import java.util.Stack;
import java.util.Scanner;

public class DrunkardGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод карт первого игрока
        System.out.print("Введите 5 карт первого игрока (без пробелов): ");
        String player1Cards = scanner.nextLine();

        // Ввод карт второго игрока
        System.out.print("Введите 5 карт второго игрока (без пробелов): ");
        String player2Cards = scanner.nextLine();

        // Создаем стеки для карт каждого игрока
        Stack<Integer> player1Deck = new Stack<>();
        Stack<Integer> player2Deck = new Stack<>();

        // Инициализируем колоды игроков
        for (int i = 4; i >= 0; i--) {
            player1Deck.push(Character.getNumericValue(player1Cards.charAt(i)));
            player2Deck.push(Character.getNumericValue(player2Cards.charAt(i)));
        }

        // Моделируем игру
        int rounds = 0;
        while (!player1Deck.isEmpty() && !player2Deck.isEmpty() && rounds < 106) {
            int card1 = player1Deck.pop();
            int card2 = player2Deck.pop();

            if (card1 == 0 && card2 == 9) {
                // Первый игрок выигрывает раунд
                player1Deck.add(0, card1);
                player1Deck.add(0, card2);
            } else if (card1 == 9 && card2 == 0) {
                // Второй игрок выигрывает раунд
                player2Deck.add(0, card1);
                player2Deck.add(0, card2);
            } else if (card1 > card2) {
                // Первый игрок выигрывает раунд
                player1Deck.add(0, card1);
                player1Deck.add(0, card2);
            } else {
                // Второй игрок выигрывает раунд
                player2Deck.add(0, card1);
                player2Deck.add(0, card2);
            }

            rounds++;
        }

        // Проверка на длительность игры
        if (rounds >= 106) {
            System.out.println("botva");
        } else {
            // Определяем победителя
            if (player1Deck.isEmpty()) {
                System.out.println("Second " + rounds);
            } else {
                System.out.println("First " + rounds);
            }
        }

        scanner.close();
    }
}

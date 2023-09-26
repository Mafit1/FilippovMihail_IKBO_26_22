public class HumanTest {
    public static void main(String[] args) {
        // Создаем голову, ноги и руки для человека
        Head head = new Head("Блонд", 2);
        Leg leftLeg = new Leg(80, 42);
        Leg rightLeg = new Leg(80, 42);
        Hand leftHand = new Hand(5, true);
        Hand rightHand = new Hand(5, true);

        // Создаем объект человека
        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        // Вызываем методы для каждой части тела
        System.out.println("Цвет волос: " + person.getHead().getHairColor());
        System.out.println("Количество глаз: " + person.getHead().getNumberOfEyes());
        person.getHead().talk();

        System.out.println("Длина левой ноги: " + person.getLeftLeg().getLengthInCentimeters() + " см");
        System.out.println("Размер левой обуви: " + person.getLeftLeg().getShoeSize());
        person.getLeftLeg().walk();

        System.out.println("Количество пальцев на левой руке: " + person.getLeftHand().getFingers());
        System.out.println("Есть ли большой палец на левой руке? " + person.getLeftHand().hasThumb());
        person.getLeftHand().wave();
    }
}


// task 2

import java.util.Scanner;

class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class Student {
    private String iDNumber;
    private String name;

    public Student(String iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public String getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public void setIDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Студент {" +
                "ID: '" + iDNumber + '\'' +
                ", Полное имя: '" + name + '\'' +
                '}';
    }
}

class LabClass {
    private Student[] students;
    private int size;

    public LabClass(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    public void addStudent(Student student) {
        students[size] = student;
        size++;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getSize() {
        return size;
    }
}

class LabClassUI {
    private LabClass labClass;
    private Scanner scanner;

    public LabClassUI(int capacity) {
        labClass = new LabClass(capacity);
        scanner = new Scanner(System.in);
    }

    public void addStudent() {
        System.out.println("Введите идентификационный номер студента: ");
        String iDNumber = scanner.nextLine();
        System.out.println("Введите имя студента: ");
        String name = scanner.nextLine();

        try {
            if (iDNumber.isEmpty() || name.isEmpty()) {
                throw new EmptyStringException("Пустой идентификационный номер или имя.");
            }

            Student student = new Student(iDNumber, name);
            labClass.addStudent(student);
            System.out.println("Студент успешно добавлен.");
        } catch (EmptyStringException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void searchStudent() {
        System.out.println("Введите имя студента: ");
        String name = scanner.nextLine();

        try {
            if (name.isEmpty()) {
                throw new EmptyStringException("Пустое имя.");
            }

            Student[] students = labClass.getStudents();
            boolean found = false;

            for (int i = 0; i < labClass.getSize(); i++) {
                if (students[i].getName().equalsIgnoreCase(name)) {
                    System.out.println("Студент найден: " + students[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new StudentNotFoundException("Студент не найден.");
            }
        } catch (EmptyStringException | StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void sortStudentsByIDNumber() {
        Student[] students = labClass.getStudents();
        int n = labClass.getSize();

        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber().compareTo(key.getIDNumber()) > 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }

            students[j + 1] = key;
        }

        System.out.println("Студенты отсортированы по идентификационному номеру.");
    }

    public void displayStudents() {
        Student[] students = labClass.getStudents();

        for (int i = 0; i < labClass.getSize(); i++) {
            System.out.println(students[i]);
        }
    }
}

class LabClassDriver {
    public static void main(String[] args) {
        LabClassUI labClassUI = new LabClassUI(5);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Добавить студента");
            System.out.println("2. Поиск студента");
            System.out.println("3. Сортировка студентов по идентификационному номеру");
            System.out.println("4. Показать студентов");
            System.out.println("0. Выход");
            System.out.println("Введите свой выбор: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    labClassUI.addStudent();
                    break;
                case 2:
                    labClassUI.searchStudent();
                    break;
                case 3:
                    labClassUI.sortStudentsByIDNumber();
                    break;
                case 4:
                    labClassUI.displayStudents();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        } while (choice != 0);
    }
}
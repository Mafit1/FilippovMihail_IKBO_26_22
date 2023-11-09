import java.util.ArrayList;

public class TestStudent {
    private  static StudentComp comp = new StudentComp();
    public static void qSort(Object[] array, int high, int low){
        if(array == null || array.length == 0) return;
        if(high <= low) return;

        Object middle = array[(low + high)/2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for(int i = low; i <= high; i++){
            if(comp.compare(array[i], middle) > 0){
                right.add(array[i]);
            }
            else if (comp.compare(array[i], middle) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if(left.size()>0) {
            leftArr = left.toArray();
            qSort(leftArr, left.size() - 1, 0);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if(right.size() > 0) {
            rightArr = right.toArray();
            qSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());

        }

    }
    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[]{
            new Student(123, 5),
            new Student(946, 4.5),
            new Student(268, 3.4),
            new Student(120, 2.3),
            new Student(124, 2.9),
            new Student(765, 3.1),
            new Student(385, 4.98)
        };
        Student[] students1 = new Student[]{
            new Student(843, 2.1),
            new Student(890, 4.12),
            new Student(472, 3.5),
            new Student(643, 4.06)
        };

        System.out.println("Исходные данные");
        for (Student s : students){
            System.out.println(s);
        }
        System.out.println("\n");

        //сортировка вставками по id
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i-1;
            for(; j >= 0 && current.compareTo(students[j]) < 0; j--) {
                students[j+1] = students[j];
            }
            students[j+1] = current;
        }
        System.out.println("Отсортированные вставками по ID");
        for (Student s : students){
            System.out.println(s);
        }
        System.out.println("\n");

        //Быстрая сортировка по GPA
        qSort(students, students.length - 1, 0);

        System.out.println("Отсортированные быстрой сортировкой по GPA");
        for (Student s : students){
            System.out.println(s);
        }
        System.out.println("\n");

        //Слияние двух списков
        Student[] students2 = new Student[students.length + students1.length];

        System.arraycopy(students, 0, students2, 0, students.length);
        System.arraycopy(students1, 0, students2, students.length, students1.length);
        mergeSort(students2, students2.length);

        System.out.println("Слияние двух списков и сортировка по ID");
        for (Student s : students2){
            System.out.println(s);
        }
    }
}
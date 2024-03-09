import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List l1 = new List();
        for (int i = 0; i < n; i += 1) {
            l1.addBack(sc.nextInt());
        }
        System.out.println("максимальный элемент");
        System.out.println(l1.maxi());
        System.out.println("проверка");
        System.out.println(l1.prov(3));
        System.out.println("сортировка");
        l1.sort(n);
        l1.printList();
        System.out.println("удаление одного элемента");
        l1.delx(4);
        l1.printList();
        System.out.println("Удалить из списка все элементы, равные x");
        l1.num7(5);
        l1.printList();
        System.out.println("после х вставить у");
        l1.num8(2, 9);
        l1.printList();
        System.out.println("перед первым элементом, равным x, вставить y");
        l1.num9(4, 2);
        l1.printList();
        System.out.println("после всех x вставить y.");
        l1.num10(6, 2);
        l1.printList();
        System.out.println("удаление первых 2 эл");
        l1.del();
        l1.printList();
        int n2 = sc.nextInt();
        Num4 l2 = new Num4();
        for (int i = 0; i < n2; i += 1) {
            l2.addSort(sc.nextInt());
        }
        l2.printList();

    }
}

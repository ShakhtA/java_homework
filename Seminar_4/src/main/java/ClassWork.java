import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ClassWork {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        ArrayList<String> famList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> oldNameList = new ArrayList<>();
        ArrayList<Integer> ageList = new ArrayList<>();
        ArrayList<Boolean> genderList = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            famList.add(scanner.nextLine());
            nameList.add(scanner.nextLine());
            oldNameList.add(scanner.nextLine());
            ageList.add(Integer.valueOf(scanner.nextLine()));
            genderList.add(scanner.nextLine().toLowerCase().contains("ж"));
            id.add(genderList.size() - 1);
        }

        System.out.println(famList);
        System.out.println(nameList);
        System.out.println(oldNameList);
        System.out.println(ageList);
        System.out.println(genderList);


        for (int i = 0; i < famList.size(); i++) {
            String person = famList.get(i)+" "+nameList.get(i).toUpperCase().charAt(0)+"."+oldNameList.get(i).toUpperCase().charAt(0)+". "+ageList.get(i)+" "+(genderList.get(i) ? "Ж":"М");
            System.out.println(person);
        }

        id.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return ageList.get(o1) - ageList.get(o2);
            }
        });
        System.out.println(id);

        for(int item:id) {
            String person = famList.get(item)+" "+nameList.get(item).toUpperCase().charAt(0)+"."+oldNameList.get(item).toUpperCase().charAt(0)+". "+ageList.get(item)+" "+(genderList.get(item) ? "Ж":"М");
            System.out.println(person);
        }
    }
}
import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random generator = new Random();
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Prijola"));
        userList.add(new User("Jaum Edu"));
        userList.add(new User("Rafaeula"));
        userList.add(new User("Manu"));
        userList.add(new User("Keven"));
        userList.add(new User("Little Predro"));
        userList.add(new User("Valderraminha"));
        userList.add(new User("Beck"));
        userList.add(new User("Alehand"));
        userList.add(new User("Felipin"));
        userList.add(new User("Santana"));
        userList.add(new User("Kethilin"));
        userList.add(new User("Macieu"));
        userList.add(new User("Byanka"));
        userList.add(new User("Pratos"));
        userList.add(new User("LEOZIN CHEI DO HACK APELAO"));
        System.out.println("DONA IS DELETING.....\n");
        int size = userList.size();
        int pair = size / 2;
        int odd = pair + 1;
        if (size % 2 == 0) {
            for (int i = 0; i <= pair; i++) {
                int rand = generator.nextInt(pair);
                Thread.sleep(1000);
                System.out.println(userList.get(rand).name + " -> WENT TO THE PISTE AREA");
                userList.remove(rand);
            }
            System.out.println("\nTHAT ARE WHO SURVIVED: \n");
            for (User element : userList) {
                Thread.sleep(1000);
                System.out.println(element.name);
            }
        } else {
            for (int j = 0; j < odd; j++) {
                int aRand = generator.nextInt(odd);
                userList.remove(aRand);
            }
            for (int cont = 0; cont <= userList.size(); cont++) {
                System.out.println(userList.get(cont).name);


            }
        }
        System.out.println("\n| THESE WERE THE NAMES THAT SURVIVED FROM THE DS7 UNIVERSE! |");
    }
}
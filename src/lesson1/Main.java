package lesson1;

public class Main {
    public static void main(String[] args) {
         User user1 = new User(1,"dwf", "dfw", 32.2,true,new String[]{"js", "KDF"} );
//        System.out.println(user1);
       User user2= new User();
       user2.setId(2);
       user2.setName("Petro");
       user2.setSurname("Huan");
       user2.setWeight(100);
       user2.setSkills(new String[]{"JS", "Java"} );
//        System.out.println(user2);
        User user3 = new User(3,"Don","Okun",85.2,true,new String[]{"js", "KDF"});
//        System.out.println(user3);

        User[]users = {user1, user2,user3};


    }
}

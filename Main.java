public class Main {


    public static void main(String[] args) {
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);
        String UpFullName = fullName.toUpperCase();
        System.out.println(UpFullName);
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println(fullName2);





    }
}
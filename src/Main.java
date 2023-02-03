public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder().
                setName("Maria").
                setSurname("Cononoc").
                setAge(50).
                setAddress("Moscow").
                build();

        Person son = mom.newChildBuilder().
                setName("Fred").
                build();

        mom.happyBirthday();

        System.out.println("The mom "+ mom + " has son " + son);

        try{
            new PersonBuilder().setAge(-199).build();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        try{
            new PersonBuilder().build();
        }catch (IllegalStateException e){
            e.printStackTrace();
        }

    }
}

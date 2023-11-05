public class Main3 {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Rex", "Bulldog");
        Dog dog2 = new Dog("Buddy", "Golden Retriever");


        dog1.setName("Max");
        dog2.setBreed("Labrador");


        System.out.println("Numele câinelui 1: " + dog1.getName());
        System.out.println("Rasa câinelui 2: " + dog2.getBreed());
    }
}
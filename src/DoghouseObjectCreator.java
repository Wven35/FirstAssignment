public class DoghouseObjectCreator {
    public static void main(String[] args) {
        DoghouseBlueprint alpaysDogHouse = new DoghouseBlueprint("AlpaysDog");
        DoghouseBlueprint secondDogHouse = new DoghouseBlueprint("WillsDog");

        // alpaysDogHouse.setName("SuperDog!");
        // alpaysDogHouse.setColor("Green");
        alpaysDogHouse.setHeight(1);
        alpaysDogHouse.setWidth(1);

        System.out.println(alpaysDogHouse.getName());

        // secondDogHouse.setName("Will Dog -- Clifford");
        // secondDogHouse.setColor("Red");
        secondDogHouse.setHeight(100);
        secondDogHouse.setWidth(100);

        System.out.println(secondDogHouse.getName());
        System.out.println(secondDogHouse.getColor());

    }
} // end public class

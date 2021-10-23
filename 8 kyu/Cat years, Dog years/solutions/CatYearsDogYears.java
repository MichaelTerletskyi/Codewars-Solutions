public class CatYearsDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        return new int[]{humanYears, getAnimalAge(humanYears, "Cat"), getAnimalAge(humanYears, "Dog")};
    }

    public static int getAnimalAge(int age, String type) {
        int animalAge = 15;
        if (age > 1) animalAge += 9;
        if (age - 2 > 0) {
            for (int i = 0; i < age - 2; i++) {
                if (type.equals("Cat")) animalAge += 4;
                if (type.equals("Dog")) animalAge += 5;
            }
        }
        return animalAge;
    }
}
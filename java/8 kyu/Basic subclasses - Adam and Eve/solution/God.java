public class God {
    public static Human[] create() {
        return new Human[]{new Man(), new Woman()};
    }
}

abstract class Human {

}

class Man extends Human {
    Man() {}
}

class Woman extends Human {
    Woman() {}
}
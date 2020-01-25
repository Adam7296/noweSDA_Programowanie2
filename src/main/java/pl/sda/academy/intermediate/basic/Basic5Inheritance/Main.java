package pl.sda.academy.intermediate.basic.Basic5Inheritance;

public class Main {
    public static void main(String[] args) {

        BackendDeveloper backendDeveloper = new BackendDeveloper("Piotr", "Ericson", 0.5, "Java");
        FrontendDeveloper frontendDeveloper = new FrontendDeveloper("Adam", "SDA", 999.99, "Angular");
        MobileDeveloper mobileDeveloper = new MobileDeveloper("Ania", "Google", 100000.0, "Android");

        backendDeveloper.makeCode();
        frontendDeveloper.makeCode();
        mobileDeveloper.makeCode();


    }
}

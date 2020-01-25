package pl.sda.academy.intermediate.basic.Basic5Inheritance;

public class BackendDeveloper extends Developer {
    protected String backendLanguage;


    public BackendDeveloper(String name, String company, double salary, String backendLanguage) {
        super(name, company, salary);
        this.backendLanguage = backendLanguage;
    }

    @Override
    void makeCode() {
        System.out.println(name + " " + "is coding for" + " " + company + " " + "for" + " " + salary + " " + backendLanguage);

    }
}

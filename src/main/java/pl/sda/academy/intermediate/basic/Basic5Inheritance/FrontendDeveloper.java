package pl.sda.academy.intermediate.basic.Basic5Inheritance;

public class FrontendDeveloper extends Developer {
    protected String javaScriptFramework;


    public FrontendDeveloper(String name, String company, double salary, String javaScriptFramework) {
        super(name, company, salary);
        this.javaScriptFramework = javaScriptFramework;
    }

    @Override
    void makeCode() {
        System.out.println(name + " " + "is coding for" + " " + company + " " + salary + " " + javaScriptFramework);
    }
}

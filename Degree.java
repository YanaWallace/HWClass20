package HWClass20;

public class Degree {
    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}

class Bachelors extends Degree {
}

class Masters extends Degree {
    @Override
    public void getPrerequisite() {
        System.out.println("To get a Master's degree you need a Bachelor's degree");
    }
}
 class Main {
    public static void main(String[] args) {
        Degree degree = new Degree();
        Bachelors bachelors = new Bachelors();
        Masters masters = new Masters();

        degree.getPrerequisite();
        bachelors.getPrerequisite();
        masters.getPrerequisite();
    }
}
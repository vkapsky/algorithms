package lab5;

public class Run {
    public static void main(String args[]) {
        String[] cities = new String[]{"караганда", "воронеж", "киев", "жданов", "витебск", "архангельск"};
        Algorithm A = new Algorithm(cities);
        A.getEulerCycle("киев");
    }

}
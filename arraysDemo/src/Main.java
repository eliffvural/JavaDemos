import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {

        String project1="lixen";
        String project2="solixen";
        String project3="soltrea";
        String project4="waşaii";

        System.out.println(project1);
        System.out.println(project2);
        System.out.println(project3);
        System.out.println(project4);

        String[] projects= new String[4];
        projects[0]="lixen";
        projects[1]="solixen";
        projects[2]="soltrea";
        projects[3]="waşaii";


        System.out.println("-----------------");

        for (int i = 0; i < projects.length; i++) {
            System.out.println(projects[i]);
        }

        System.out.println("-----------------");

        for (String project:projects){
            System.out.println(project);
        }
    }
}
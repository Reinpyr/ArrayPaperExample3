public class Main {
    public static void main(String[] args) {
        int values [] = {5,10,15,20,25,30,35};
        int q = values[1]-values[0];

        if(values[0] + (values.length-1)*q == values[values.length-1])
        {
            System.out.println("The sequence is arithmetic!");
        }
        else {
            System.out.println("The sequence isn't arithmetic!");
        }
    }
}
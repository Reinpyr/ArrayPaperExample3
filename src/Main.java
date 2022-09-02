public class Main {
    public static void main(String[] args) {
        int values [] = {5,10,15,20,25,30};
        int q = values[1]-values[0];
        boolean constant = true;

        for(int i = 1; i < values.length && constant == true; i = i + 1)
        {
            if(values[i] - values[i-1] != q)
            {
                constant = false;
            }
        }
        if(constant == true)
        {
            System.out.println("The sequence is arithmetic");
        }
        else {
            System.out.println("The sequence isn't arithmetic");
        }
    }
}
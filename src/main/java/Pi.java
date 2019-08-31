public class Pi {

    public static void main(String[] args) {

        double pi = 0.0;

        for (double i = 1 ; i <= 100000000 ; i++){
            if(i % 2 == 0 ){
                pi += -1/(2 * i - 1);
            }
            if (i % 2 == 1) {
                pi += 1/(2 * i - 1);
            }

        }
          System.out.println(pi *4);

    }
}

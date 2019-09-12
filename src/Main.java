

public class Main {
    public static void main(String[] args) {


//int[] numbers5 = new int[10];
        String[] lockerPosition = new String[100];
//        int modulusValue = 0;
        int lockerDivision = 0;
        int lockerChange = 0;


        for (int i = 0; i <= 99; i++){

            lockerPosition[i] = "open";

        }

        for (int j = 2; j <= 100; j++){
            for (int k = j ; k <= 100 ; k++){
                lockerDivision = k % j;

                if ((lockerDivision == 0) && (lockerPosition[(k - 1)].equalsIgnoreCase("open"))) {
                    lockerPosition[(k - 1)] = "close";
                    lockerChange = 1;
                }
                else if ((lockerDivision == 0) && (lockerPosition[(k - 1)].equalsIgnoreCase("close")) && (lockerChange == 0)) {
                    lockerPosition[(k - 1)] = "open";
                    lockerChange = 1;
                }
                /*if ((lockerDivision == 0) && (lockerPosition[(k - 1)] == "open")) {
                    lockerPosition[(k - 1)] = "close";*/


//                System.out.println(j + "     " + k + "     " + lockerDivision + "     " + lockerChange);
//                System.out.println("Locker # " + k + " is " + lockerPosition[k-1]);
                lockerChange = 0;
            }

//            System.out.println("-----------------------");

        }



        for (int i = 1 ; i <= 100; i++){

                if (lockerPosition[(i-1)].equalsIgnoreCase("open")) {
                    System.out.println("Locker # " + i + " is " + lockerPosition[(i - 1)]);
                }

            }






    }

}

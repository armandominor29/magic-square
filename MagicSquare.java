/**Matrix class to produce a magic square*/
public class MagicSquare {

    public static void main(String[] args) {

        //Create 3 arrays(@param oneD one dimensional, @param twoD two dimensional,@param threeD three dimensional).
        int [][] oneD = new int[1][1];
        int [][] twoD = new int[2][2];
        int [][] threeD = new int[3][3];

        // @param count variable used as navigation support for array output
        int count=0;

        //Take in user input
        Scanner in = new Scanner(System.in);
        Scanner c = new Scanner(System.in);

        /**Create a list of integers called matrix to store user input*/
        List<Integer> matrix = new ArrayList<Integer>();

        /**Do while statement holds true*/
        do {
            //Print instructions for user
            System.out.println("Matrix:" + matrix);
            System.out.println("Would you like to provide a whole number input? y/n");

            //Conditional statement executes if user inputs y
            if (c.next().equals("y")){
                System.out.println("Provide a whole number to add to the list");
                matrix.add(in.nextInt());
            }
            //Conditional statement executes if input is not y
            else {
                break;
            }
        } while (true);


        // @param testVal variable used to keep count
        double testVal=Math.sqrt(matrix.size());

        //Conditional statement executes if matrix is 1 by 1
        if (testVal==1){
            //set values from list to oneD matrix
            for (int i=0; i<testVal; i++){
                for (int j=0; j<testVal; j++){
                    oneD[i][j]=matrix.get(count);
                    count++;
                }
            }

            //Ask user for inputs
            System.out.println("A matrix will now be created with your inputs:");
            //Print values from list to oneD matrix
            for (int i=0; i<testVal; i++){
                for (int j=0; j<testVal; j++)
                    System.out.print(oneD[i][j]+ " ");
                System.out.println();
            }
        }
        //Conditional statement executes if matrix is 2 by 2
        else if(testVal==2){
            //Set values from list to twoD matrix
            for (int i=0; i<testVal; i++){
                for (int j=0; j<testVal; j++){
                    twoD[i][j]=matrix.get(count);
                    count++;
                }
            }

            //Ask user for inputs
            System.out.println("A matrix will now be created with your inputs:");
            //Print values from list to twoD matrix
            for (int i=0; i<testVal; i++){
                for (int j=0; j<testVal; j++)
                    System.out.print(twoD[i][j]+ " ");
                System.out.println();
            }
        }
        //Conditional statement executes if matrix is 3 by 3
        else if(testVal==3){
            //set values from list to threeD matrix
            for (int i=0; i<testVal; i++){
                for (int j=0; j<testVal; j++){
                    threeD[i][j]=matrix.get(count);
                    count++;
                }
            }
            //Ask user for inputs
            System.out.println("A matrix will now be created with your inputs:");
            //Print values from list to threeD matrix
            for (int i=0; i<testVal; i++){
                for (int j=0; j<testVal; j++)
                    System.out.print(threeD[i][j]+ " ");
                System.out.println();
            }
        }
        //Statement is output if the user entered the incorrect number of inputs(Not a square root)
        else {
            System.out.println("Number of inputs does not form a square function");
        }


        //Conditional statement executes if test value is 1
        if (testVal==1){
            System.out.println("Magic Square: true");
        }
        //Conditional statement executes if test value is 2
        else if (testVal==2){
            System.out.println("Magic Square: false");

            //Conditional statement executes if there exist repeated values
            if(matrix.get(0).equals(matrix.get(1))||matrix.get(1).equals(matrix.get(2))||
                    matrix.get(2).equals(matrix.get(3))){
                System.out.println("You entered the same value twice!");
            }
        }
        //Conditional statement executes if test value is 3
        else if (testVal==3){
            int row1=matrix.get(0)+matrix.get(1)+matrix.get(2);
            int row2=matrix.get(3)+matrix.get(4)+matrix.get(5);
            int row3=matrix.get(6)+matrix.get(7)+matrix.get(8);
            int col1=matrix.get(0)+matrix.get(3)+matrix.get(6);
            int col2=matrix.get(1)+matrix.get(4)+matrix.get(7);
            int col3=matrix.get(2)+matrix.get(5)+matrix.get(8);
            int diag1=matrix.get(0)+matrix.get(4)+matrix.get(8);
            int diag2=matrix.get(2)+matrix.get(4)+matrix.get(6);

            //Conditional statement executes if inputs create a magic square
            if (row1==row2&&row2==row3&&col1==col2&&col2==col3&&diag1==diag2){
                System.out.println("Magic Square: true");

                //Conditional statement executes if there exist repeated values
                if(matrix.get(0).equals(matrix.get(1))||matrix.get(1).equals(matrix.get(2))||
                        matrix.get(2).equals(matrix.get(3))||matrix.get(3).equals(matrix.get(4))
                        ||matrix.get(4).equals(matrix.get(5))||
                        matrix.get(5).equals(matrix.get(6))||
                        matrix.get(6).equals(matrix.get(7))||
                        matrix.get(7).equals(matrix.get(8))){
                    System.out.println("You entered the same value twice!");
                }
            }
            //Conditional statement executes if inputs DO NOT create a magic square
            else {
                System.out.println("Magic Square: false");

                //Conditional statement executes if there exist repeated values
                if(matrix.get(0).equals(matrix.get(1))||matrix.get(1).equals(matrix.get(2))||
                        matrix.get(2).equals(matrix.get(3))||matrix.get(3).equals(matrix.get(4))
                        ||matrix.get(4).equals(matrix.get(5))||
                        matrix.get(5).equals(matrix.get(6))||
                        matrix.get(6).equals(matrix.get(7))||
                        matrix.get(7).equals(matrix.get(8))){
                    System.out.println("You entered the same value twice!");
                }
            }
        }
    }
}

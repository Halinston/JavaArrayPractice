public class Demo {
    public static void main(String[] args) {

        int nums [] [] = new int [12] [16];


            int ArrayLenght = 1; // 12 rows
            int ArrayHeight = 12; // 16 columns

        for(int i=0; i<ArrayLenght; i++)
        { 
            for( int j = 0; j<ArrayHeight; j++)
            {
                nums [i] [j] = (int)(Math.random()  * 10000);

            }
        } 


        System.out.println();
        for(int i=0; i<ArrayLenght; i++)
        { 
            for( int j = 0; j<ArrayHeight; j++)
            {
              System.err.print(nums [i] [j] + " ");
            }
            System.out.println();
        }        System.out.println();
    }  
    
}


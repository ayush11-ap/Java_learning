package Class_05_Patterns;

public class JavaBasics {
    public static void main(String args[]){

        // Star Pattern
        // for(int row = 0; row < 4; row++){
        //     for(int col = 0; col < row + 1; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Inverted Star Pattern
        // for(int row = 0; row < 4; row++){
        //     for(int col = 4; col > row; col--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Half Pyramid
        // for(int row = 0; row < 4; row++){
        //     for(int col = 0; col < row + 1; col++){
        //         System.out.print(col+1);
        //     }
        //     System.out.println();
        // }

        // Character Pattern
        char ch = 'A';
        for(int row = 0; row< 4; row++){
            for(int col = 0; col < row+1; col++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

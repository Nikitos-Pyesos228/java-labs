public class dop
{
    public static void main(String[] args) {



        int[][] num = new int[5][4];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (i + j <= num.length - 1) {
                    sum += num[i][j];
                }

            }
        }



    }
}





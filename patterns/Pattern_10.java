package patterns;

/**
 * Created by  Govind on 26/04/2018
 */

//Staircase pattern
//   1	10	11	20	21	30	31	40	41	50	51	60	61	70	71
//   2	9	12	19	22	29	32	39	42	49	52	59	62	69	72
//   3	8	13	18	23	28	33	38	43	48	53	58	63	68	73
//   4	7	14	17	24	27	34	37	44	47	54	57	64	67	74
//   5	6	15	16	25	26	35	36	45	46	55	56	65	66	75

public class Pattern_10 {

    public static void printstaircase(int row, int col)
    {
        int[][] arr = new int[row][col];
        int count = 1;
        for (int i = 0 ; i < col ;i++)
        {
            for(int j = 0 ; j < row ; j++)
                arr[j][i] = count++;
            i++;
            if(i == col)
                break;

            for(int j = row-1 ; j>=0;j--)
            {
                arr[j][i] = count++;
            }

        }
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        printstaircase(5,15);
    }

}

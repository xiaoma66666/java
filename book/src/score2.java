public class score2 {
    public static void main(String[] args) {
        int[] score = new int[]{71, 89, 67, 53, 78, 64, 92, 56, 74, 85};
        score2 score2 = new score2();
        score2.sortArray2(score);
    }
    public void sortArray2(int[] score){
        for (int i=1;i<score.length;i++)
        {
            for (int j=0;j<score.length-i;j++)
            {
                if (score[j]<score[j+1])
                {
                    int temp=score[j];
                    score[j]=score[j+1];
                    score[j+1]=temp;
                }
            }

        }
        showArray(score);
    }

    private void showArray(int[] score) {
        for (int i:score)
        {
            System.out.print(i+"\t");
        }
    }
}

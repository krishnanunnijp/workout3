public class sortOrSearch {
    private int arraySize;
    private int[] arr;
    private int[] sortArray;

    public int[] getSortArray() {
        return sortArray;
    }

    public sortOrSearch(int arraySize, int[] arr) {
        this.arraySize = arraySize;
        this.arr = arr;
        this.sortArray = arr;
        sort();
    }

    public  void search(int element)
    {
        int start =0;
        for(int i=0;i<this.arraySize;i++)
        {
            if(this.arr[i]==element)
            {
                start =1;
            }

        }
        if(start ==1)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");

        }
    }
    private   void sort()
    {
        for(int i=0;i<this.arraySize-1;i++)
        {
            int s =this.arr[i];
            int sin =i;
            for(int j=i+1;j<this.arraySize;j++)
            {
                if(this.arr[j]< s)
                {
                    s =this.arr[j];
                    sin =j;
                }
            }
            int temp=this.arr[i];
            this.arr[i]= s;
            this.arr[sin]=temp;
        }

    }
}

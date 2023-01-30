package Containers.TextContainer;
//import Tools.ArrayAlgs;

public class Text implements Container{

    public Text() 
    {
        this.wordlist = new String[10];
        this.wordcount = 0;
    }

    public boolean isEmpty()
    {
        for (String i : this.wordlist) {
            if (i != null) return false;
        }
        return true;
    }

    public void makeEmpty()
    {
        for (int i = 0; i <= this.wordcount; i++) {
            this.wordlist[i] = null;
        }
    }

    public int size()
    {
        return this.wordcount;
    }

    public void add(String word)
    {
        if (this.wordcount == this.wordlist.length)
        {
            String[] tmp = new String[wordlist.length];
            System.arraycopy(this.wordlist, 0, tmp, 0, wordcount);
            this.wordlist = new String[this.wordlist.length*2];
            System.arraycopy(tmp, 0, this.wordlist, 0, wordcount);
        }
        this.wordlist[wordcount] = word;
        this.wordcount++;
    }

    public String toString()
    {
        String s = "";
        for (int i=0; i<this.wordcount; i++)
        {
            s += this.wordlist[i] + " ";
        }
        return s;

    }

    public void sort()
    {
        //System.out.println(":: DEBUG1 :: " + ArrayAlgs.printValues(wordlist));
        this.wordlist = mergeSort(this.wordlist, this.wordcount);
        //System.out.println(":: DEBUG3 :: " + ArrayAlgs.printValues(wordlist));
    }

    private String[] mergeSort(String[] list, int listLength)
    {
        if (listLength < 2) return list;
        String[] left = new String[(int)(listLength/2)];
        System.arraycopy(list, 0, left, 0, left.length);
        //System.out.println(":: DEBUGleft :: " + ArrayAlgs.printValues(left));
        String[] right = new String[(int)((listLength+1)/2)];
        System.arraycopy(list, left.length, right, 0, right.length);
        //System.out.println(":: DEBUGright :: " + ArrayAlgs.printValues(right));
        left = mergeSort(left, left.length);
        right = mergeSort(right, right.length);
        String[] sorted = new String[listLength];
        merge(left, right, sorted);
        //list = sorted; // not sure about this one
        //System.out.println(":: DEBUG2 :: " + ArrayAlgs.printValues(sorted));
        return sorted;
    }

    private void merge(String[] left, String[] right, String[] sorted)
    {
        int i[] = new int[2];
        i[0] = 0;
        i[1] = 0;
        while (i[0] < left.length && i[1] < right.length)
        {
            if (left[i[0]].compareTo(right[i[1]]) <= 0) 
            {
                sorted[i[0]+i[1]] = left[i[0]];
                i[0]++;
            }
            else 
            {
                sorted[i[0]+i[1]] = right[i[1]];
                i[1]++;
            }
        }

        if (i[0] >= left.length)
        {
            while (i[1] < right.length)
            {
                sorted[i[0]+i[1]] = right[i[1]];
                i[1]++;
            }
        }
        else if (i[1] >= right.length)
        {
            while (i[0] < left.length)
            {   
                sorted[i[0]+i[1]] = left[i[0]];
                i[0]++;
            }
        }
    }



    private String[] wordlist;
    private int wordcount;
}

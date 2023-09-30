import java.util.Iterator;

public class CellIterator implements Iterable<Cell>{
    Cell[][] data;
    int outer;
    int inner;
    boolean out;


    public CellIterator(Cell[][] indata){
        data = indata;
        outer = 0;
        inner = 0;
        out= false;
    }


    @Override
    public boolean hasNext(){
        return !out;
    }

    

    @Override
    public Cell next() {
        Cell cellret = data[outer][inner];
        inner++;

        if(inner >= data[outer].length){
            inner = 0;
            outer++;

        if(outer >= data.length){
            out = true;

        }
    }
        return cellret;
    }

}


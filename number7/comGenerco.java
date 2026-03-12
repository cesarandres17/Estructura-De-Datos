package number7;

public class comGenerco<T extends Comparable<T>> implements Comparador<T>{

    @Override
    public int comparar(T t1, T t2) {
        // TODO Auto-generated method stub
        return t1.compareTo(t2);
    }
}

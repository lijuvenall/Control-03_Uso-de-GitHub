package metodos;

public class Operaciones {

    public int operarSuma(int n1, int n2) {
        int suma = 0;
        if ((n1 > 10 && n1 < 20) && (n2 > 10 && n2 < 20)) {
            suma = n1 + n2;
        } else {
            suma = 0;
        }
        return suma;
    }
    
    
      public int operarMulti(int n1, int n2) {
        int mull = 0;
        if ((n1 > 10 && n1 < 20) && (n2 > 10 && n2 < 20)) {
            mull = n1 * n2;
        } else {
            mull = n1 * n2;
        }
        return mull;
    }

}

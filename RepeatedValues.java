public class RepeatedValues {
    public static void main(String[] args) {

            int[] a = { 1, 4, 5, 1, 1, 3};
            int n = a.length;

            for ( int i = 0, m = 0; i != n; i++, n = m ){
                for (int j = m = i + 1; j != n; j++){
                    if (a[j] != a[i]) {
                        if (m != j)
                            a[m] = a[j];
                            m++;
                    }
                }
            }

            if ( n != a.length )            {
                int[] b = new int[n];
                for ( int i = 0; i < n; i++ )
                    b[i] = a[i];
                    a = b;
            }
                System.out.print(n);
        }
    }
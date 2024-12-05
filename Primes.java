public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arrPrime = new boolean[n + 1 ];
        double sqrt = Math.sqrt(n);
        int p = 2; 

        for (int i = 2; i <= n; i++) {
            arrPrime [i] = true; 
        }
        while (p <= sqrt) { 
            if (arrPrime[p]) {
                int multiple = p * p;
                while (multiple <= n) { 
                    arrPrime [multiple] = false ; 
                    multiple += p; 
                } 
            } 
            p++;
        } 
        int count = 0;
        for (int i = 2; i <= n ; i++) {
            if (arrPrime [i]) {
            System.out.println(i);
            count++;
            }
        }
        double percent = ((double)count / (double)(n-1) * 100) ;
            System.out.println(" There are " + count + " primes between 2 and " + n + "(" + (int) percent + "% are primes" + ")");
             
        }
    
 }
        
public class GP {
    public static void main(String[] args) {
        System.out.println(Nth_term(2,2,4));
    }

        public static int Nth_term(int a, int r, int n)
        {
            // code here
            int count=a;
            for(int i=1;i<=n-1;i++){
                count*=r;

            }
            return count;
        }
    }

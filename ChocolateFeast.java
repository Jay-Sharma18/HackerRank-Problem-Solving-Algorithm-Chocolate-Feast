package JavaAlgorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ChocolateFeast {

    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
        // calculate no of chocs brought in first round i.e total money/cost of each choc
       int chocs=n/c;
       int originalWrappers=chocs;
       int newWrappers=originalWrappers;
       //run the loop while total wrappers are greater than or equal to wrappers                required for one choc
       while(newWrappers>=m)
       {   

           chocs=chocs+newWrappers/m;
           //new wrappers each loop would be equal to chocs brought by exchanging                   wrappers + wrappers remaining after chocs are exchanged for them
           newWrappers=(newWrappers/m)+(newWrappers%m);
       }
       return chocs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Jay\\Desktop\\Selenium and Drivers\\test test.txt"));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] ncm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(ncm[0]);

            int c = Integer.parseInt(ncm[1]);

            int m = Integer.parseInt(ncm[2]);

            int result = chocolateFeast(n, c, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

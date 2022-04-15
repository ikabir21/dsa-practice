import java.io.*;
import java.util.*;

public class Apartments {
  private static int solve(int n, int m, int k, int[] a, int[] b) {
    Arrays.sort(a);
    Arrays.sort(b);
    int ans = 0;
    int i = 0, j = 0;
    while (i < n && j < m) {
      if (Math.abs(a[i] - b[j]) <= k) {
        i++;
        j++;
        ans++;
      } else if (a[i] > b[j])
        j++;
      else
        i++;
    }
    return ans;
  }

  public static void main(String args[]) {
    FastReader fs = new FastReader();
    int n = fs.nextInt();
    int m = fs.nextInt();
    int k = fs.nextInt();
    int[] a = fs.nextArr(n);
    int[] b = fs.nextArr(m);
    System.out.println(solve(n, m, k, a, b));
  }
}

class FastReader {
  BufferedReader br;
  StringTokenizer st;

  FastReader() {
    br = new BufferedReader(new InputStreamReader(System.in));
  }

  String next() {
    while (st == null || !st.hasMoreElements()) {
      try {
        st = new StringTokenizer(br.readLine());
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return st.nextToken();
  }

  int nextInt() {
    return Integer.parseInt(next());
  }

  long nextLong() {
    return Long.parseLong(next());
  }

  double nextDouble() {
    return Double.parseDouble(next());
  }

  int[] nextArr(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = nextInt();
    }
    return a;
  }
}
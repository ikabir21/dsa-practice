import java.io.*;
import java.util.*;

public class Distinct_Numbers {
  private static int solve(int n, int[] arr) {
    if (n == 0 || n == 1) return n;
    Arrays.sort(arr);
    int ans = 1;
    for (int i=1; i<n; i++) {
      if (arr[i-1] != arr[i]) ans++;
    }
    return ans;
  }

  public static void main(String args[]) {
    FastReader fs = new FastReader();
    int n = fs.nextInt();
    int[] arr = fs.nextArr(n);
    System.out.println(solve(n, arr));
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
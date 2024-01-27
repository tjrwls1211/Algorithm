import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (hansu(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static boolean hansu(int i) {
        if (i < 100) {
            return true;
        }

        int a = i / 100;
        int b = (i % 100) / 10;
        int c = i % 10;

        return (a - b) == (b - c);
    }
}

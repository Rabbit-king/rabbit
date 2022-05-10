package lanqiaodasai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String[] s = b.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);

		int[][] data = new int[n + 1][m + 1];
		int[][] min = new int[n + 1][m + 1];
		int[][] max = new int[n + 1][m + 1];

		for (int i = 1; i < n; i++) {
			s = b.readLine().split(" ");
			for (int j = 1; j <= m; j++) {
				data[i][j] = Integer.parseInt(s[j - 1]);
			}
		}
		int limit = Integer.parseInt(b.readLine());
		int res = -1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				max[i][j] = Math.max(max[i - 1][j], Math.max(max[i][j - 1], data[i][j]));
				min[i][j] = Math.min(min[i - 1][j], Math.min(min[i][j - 1], data[i][j]));

				if (max[i][j] - min[i][j] <= limit)
					res = Math.max(i * j, res);

			}
		}
		System.out.println(res);
	}
}

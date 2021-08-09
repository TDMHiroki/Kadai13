public class JyuurokusinHyouji {
	public void update(Subject s) {
		print(((Suuchi)s).getValue());
	}
		private void print(int n) {
			System.out.println(n + "を 16 進数で表示します");
			Integer.toHexString(n);
			}

}

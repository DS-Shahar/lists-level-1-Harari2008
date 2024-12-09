import java.util.Scanner;

public class Level1 {
	public static Scanner reader = new Scanner(System.in);

	public static Node<Integer> ra(int[] arr) {
		Node<Integer> a = new Node<Integer>(arr[0]);
		Node<Integer> st = a;
		for (int i = 1; i < arr.length; i++) {
			Node<Integer> b = new Node<Integer>(arr[i]);
			a.setNext(b);
			a = b;
		}
		return st;
	}

	public static void println(Node<Integer> x) {
		while (x != null) {
			System.out.println(x.getValue());
			x = x.getNext();
		}
	}

	public static void recprintln(Node<Integer> x) {
		if (x == null) {
			return;
		}
		System.out.println(x.getValue());
		recprintln(x.getNext());

	}

	public static void revrecprintln(Node<Integer> x) {
		if (x == null) {
			return;
		}
		revrecprintln(x.getNext());
		System.out.println(x.getValue());
	}

	public static Node read() {

		Node<Integer> a = new Node<Integer>(null);
		Node<Integer> st = a;
		int num = reader.nextInt();
		while (num != -1) {
			Node<Integer> b = new Node<Integer>(num);
			a.setNext(b);
			a = b;
			num = reader.nextInt();
		}
		return st.getNext();
	}

	public static void zogi(Node<Integer> d) {
		while (d != null) {
			if (d.getValue() % 2 == 0) {
				System.out.println(d.getValue());
			}
			d = d.getNext();
		}
	}

	public static boolean find(Node k, int m) {
		while (k != null) {
			if (k.getValue()==m) {
				return true;
			}
		}
		return false;
	}
	public static boolean zfind(Node k, int m) {
		if (k==null) {
			return false;
		}
			if (k.getValue()==m) {
				return true;}
		return zfind(k.getNext(),m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

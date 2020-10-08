package day16.exam;

public class exam02 {
	public static void main(String[] args) {
		Counter cnt1 = new Counter();
		Counter cnt2 = new Counter();

		System.out.println("cnt1:" + cnt1);
		System.out.println("cnt2:" + cnt2);

		cnt1.increment(/* cnt1 */);

		cnt2.increment(/* cnt2 */);
		cnt2.increment(/* cnt2 */);

		System.out.println("cnt1.count:" + cnt1.getCount());
		System.out.println("cnt2.count:" + cnt2.getCount());
	}
}
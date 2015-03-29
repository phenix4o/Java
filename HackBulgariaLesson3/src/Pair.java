//immutable
public final class Pair {
	private final Object obj, obj1;

	private Pair(Object obj, Object obj1) {
		this.obj = obj;
		this.obj1 = obj;
	}

	public static Pair createNewInstance(Object obj, Object obj1) {
		return new Pair(obj, obj1);
	}

	public Object getObj() {
		return obj;
	}

	public Object getObj1() {
		return obj1;
	}

	@Override
	public boolean equals(Object obj) {
		if (((Pair) obj).getObj().equals(this.getObj())
				&& ((Pair) obj).getObj1().equals(this.getObj1())) {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return "Object 1: " + obj.getClass().toString() + " Object 2: "
				+ obj1.getClass().toString();
	}

}

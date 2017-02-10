package strategy_enums;

enum Math {

	ADD ((a,b) -> a+b),
	SUBTRACT ((a,b) -> a-b),
	MULTIPLY ((a,b) -> a*b);

	private GetType<Integer> getter;

	private Math(GetType<Integer> getter) {
		this.getter = getter;
	}

	interface GetType<T>{
		T get(Integer a, Integer b);
	}

	public Integer get(Integer x, Integer y) {
		return getter.get(x, y);
	}
}


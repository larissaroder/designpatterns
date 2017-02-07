package strategy_enums;

/**
 * Created by Larissa on 06/02/2017.
 */
enum Math implements Strategy {

	ADD {

		@Override
		public Integer execute(int a, int b) {
			return a + b;
		}
	},
	SUBTRACT {

		@Override
		public Integer execute(int a, int b) {
			return a - b;
		}
	},
	MULTIPLY {

		@Override
		public Integer execute(int a, int b) {
			return a * b;
		}
	};
}


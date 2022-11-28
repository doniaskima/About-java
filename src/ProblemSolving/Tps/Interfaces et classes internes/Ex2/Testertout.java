public class Testertout {
	static void test1(Interface1 I1){
		I1.f1();
		I1.g1();
	}
	static void test2(Interface2 I2){
		I2.f2();
		I2.g2();
	}
	static void test3(Interface3 I3){
		I3.f3();
		I3.g3();
	}
	static void test4(Groupe cg){
		cg.f1();cg.f2();cg.f3();cg.g1();cg.g2();cg.g3();cg.w4();
	}

}


package test;

public class Main {

	public static void main(String[] args) {

		Visitor vistor1 = new Visitor("先生", false);
		Visitor vistor2 = new Visitor("在校生", true);
		Visitor vistor3 = new Visitor("卒業生", true);
		Visitor vistor4 = new Visitor("一般人", false);
		Visitor vistor5 = new Visitor("一般人", true);

		jdugOpenGate(vistor1);
		jdugOpenGate(vistor2);
		jdugOpenGate(vistor3);
		jdugOpenGate(vistor4);
		jdugOpenGate(vistor5);

	}

	// 訪問者を確認して、条件に合えば開門する
//	public static void jdugOpenGate(Visitor visitor) {
//		// エラー処理を先に書く
//		if (!"先生".equals(visitor.getType()) 
//				&& !"在校生".equals(visitor.getType()) 
//				&& !visitor.isPermission()) {
//			// 門は開けない
//		} else {
//			// 門を開ける処理
//		}
//	}
	
	// 訪問者を確認して、条件に合えば開門する
	public static void jdugOpenGate(Visitor visitor) {
		// エラー処理を先に書く
		if ("先生".equals(visitor.getType())) {
			//先生
		}else if("在校生".equals(visitor.getType()) ) {
			//在校生
		}else if(visitor.isPermission()) {
			//その他の許可がある人
		}else {
			//門は開けない
			return;
		}
			//以下開門処理
		
		}
}

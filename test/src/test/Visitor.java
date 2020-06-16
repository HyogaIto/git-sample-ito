package test;

public class Visitor {
	
	/** 「先生」、「在校生」、「卒業生」、「退学者」、「一般人」などが入る */
	private String type;
	/** 許可を表す。 trueなら許可あり。 */
	private boolean isPermission;

	/** コンストラクタ */
	public Visitor(String type, boolean isParmission) {
		this.type = type;
		this.isPermission = isParmission;
	}

	public Visitor() {
	}

	// 以下、getter,setter,toString

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isPermission() {
		return isPermission;
	}

	public void setPermission(boolean isPermission) {
		this.isPermission = isPermission;
	}

}

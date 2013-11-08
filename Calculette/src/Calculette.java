import java.util.HashMap;

// *c'est mon 1er commit* //
public class Calculette {


	private int result;
	private int leftop=0;
	private int rightop=0;
	private Operation operation=new Addition();

	public int getResult() {
		//pushResult();
		return this.result;
	}

	public Calculette click(int i) {
		
		this.rightop=this.rightop*10+i;
		this.result=this.rightop;
		return this;
	}
	
	public Calculette click(String operateur) {
		
		this.selectOperation(operateur);
		this.pushResult();
		//leftop=rightop;
		
		
		//rightop=0;
		return this;

	}

	public void selectOperation(String operateur) {
		
		HashMap<String, Operation> operations = new HashMap<String, Operation>();
		operations.put("+", new Addition());
		operations.put("-", new Soustraction());
		operations.put("=", new NullOperation());
		this.operation = operations.get(operateur);

	}

	
	public void pushResult() {
		this.leftop=operation.calcule(this.leftop, this.rightop);
		this.rightop=0;
		this.result=this.leftop;

	//	this.result = operation.calcule(this.leftop, this.rightop);
	//	this.rightop=this.result;
		//this.op=0;

	}

}

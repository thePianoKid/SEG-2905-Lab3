/* 
SECTION 1 */
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends Activity {

	private enum Operator {none,add,minus,multiply,divide}
	private double data1 = 0, data2 = 0;
	private Operator optr = Operator.none;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	@Override
	public boolean onCreateOptionsMenu (Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void btn00Click (View view) {
		EditText eText = (EditText)findViewById(R.id.resultEdit);
		eText.setText(eText.getText()+"0");
	}


/* 
SECTION 2 */
public void btn01Click(View view) {
	EditText eText = (EditText)findViewById(R.id.resultEdit); 
	eText.setText (eText.getText()+"1");

public void btn02Click(View view) {
	EditText eText = (EditText)findViewById(R.id.resultEdit); 
	eText.setText (eText.getText()+"2");

public void btn03Click(View view) {
	EditText eText = (EditText)findViewById(R.id.resultEdit); 
	eText.setText (eText.getText()+"3");

public void btn04Click(View view) {
	EditText eText = (EditText)findViewById(R.id.resultEdit); 
	eText.setText (eText.getText()+"04");

public void btn05Click(View view) {
	EditText eText = (EditText)findViewById(R.id.resultEdit); 
	eText.setText (eText.getText()+"05");

public void btn06Click(View view) {
	EditText eText = (EditText)findViewById(R.id.resultEdit); 
	eText.setText (eText.getText()+"06");


/* 
SECTION 3 */
public void btn01Click (View view) {
    EditText eText = (EditText)findViewById(R.id.resultEdit);
    eText.setText (eText.getText ()+"1") ;
}

public void btn02Click (View view) {
    EditText Text = (EditText)findViewById(R.id.resultEdit);
    eText.setText(eText.getText()+"2");   
} 

public void btn03Click (View view) { 
    EditText eText = (EditText)findViewById(R.id. resultEdit);
    eText.setText(eText.getText()+"3");
}

public void btn04Click (View view){ 
    EditText eText = (EditText)findViewById(R.id.resultEdit);
    eText.setText(eText.getText()+"4");
} 
public void btn05Click (View view) {
    EditText eText = (EditText)findViewById(R.id.resultEdit);
    eText.setText(eText.getText()+"5");
}
public void btn06Click (View view) {
    EditText eText = (EditText)findViewById(R.id.resultEdit);
    eText.setText (eText.getText () +"6") ;
} 




/* 
SECTION 4 */
public void btn07Click (View view) {
    EditText eText = (EditText)findViewById(R.id.resultEdit);
    eText.setText (eText.getText () +"7") ;
}
public void btn08Click (View view) { 
    EditText eText = (EditText)findViewById(R.id.resultEdit);
    eText.setText (eText.getText () +"8") ;
}
public void btn09Click (View view) {
    EditText eText= (EditText)findViewById(R.id.resultEdit);
    eText.setText (eText.getText () +"9") ;
}
public void btnAddClick (View view) {
    optr = Operator. add;
    EditText eText=(EditText)findViewById(R.id.resultEdit);
    detal = = Double.parseDouble(eText.getText().toString());
    eText.setText("");

}
public void btnMinusClick (View view){
    optr = Operator.minus;
    EditText eText = (EditText)findViewById(R.id.resultEdit);
    datal = Double.parseDouble(eText.getText().toString()) :
    eText.setText("");
}




/* 
SECTION 5 */


Public void btnResultClick(View view)	{
	If (optr != Operator.none) {
		EditText eText = (EditText)findViewById(R.id.resultEdit);
		data2 = Double.parsedouble(eText.getText () .toString());
		double result = 0;
		if	 (optr == Operator.add)	{
			result = data1+data2;
		} else if (optr == Operator.minus)	{
			result = data1-data2;
		} else if (optr == Operator.multiply)	{
			result = data1*data2;
		} else if (optr == Operator.divide)	{
			result = data1/data2;
		}
		Optr = Operator.none;
		Data1 = result;
		If( (result-(int(result) ! =0)
			eText.settext( String.valueOf(result));
		else
			etext.settext(String.valueOf((int)result);
		}
	}
}



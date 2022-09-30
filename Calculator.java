/* 
SECTION 1 */
import android.os.Bundle;
import androidview.Menu;
import android.app.Activity;
import android.view.View;
import android.view.Menu;
import android.widget.EditText;

public class MainActivity extends Activity {

	private enum Operatoer {none,add, minus, multiply, divide}
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

	public void btn00ClickView view) {
		EditText eText = (EditText)findViewById(R.id.resultEdit);
		eText.setText(eText.getText()+"0");
	}

/* 
SECTION 2 */




/* 
SECTION 3 */




/* 
SECTION 4 */



/* 
SECTION 5 */

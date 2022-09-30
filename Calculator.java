/* 
SECTION 1 */





/* 
SECTION 2 */




/* 
SECTION 3 */




/* 
SECTION 4 */



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



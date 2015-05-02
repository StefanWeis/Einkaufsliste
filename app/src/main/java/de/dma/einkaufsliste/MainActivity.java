package de.dma.einkaufsliste;

import android.app.Activity;
import android.content.Context;
import android.opengl.EGLExt;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private AutoCompleteTextView textView1;
    private AutoCompleteTextView textView2;
    private AutoCompleteTextView textView3;
    private AutoCompleteTextView textView4;
    private AutoCompleteTextView textView5;
    private AutoCompleteTextView textView6;
    private AutoCompleteTextView textView7;
    private AutoCompleteTextView textView8;
    private String fertig_einkaeufe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        textView2 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
        textView3 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView3);
        textView4 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView4);
        textView5 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView5);
        textView6 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView6);
        textView7 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView7);
        textView8 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView8);

        String[] einkaeufe = getResources().getStringArray(R.array.einkaeufe);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, einkaeufe);

        textView1.setAdapter(adapter);
        textView2.setAdapter(adapter);
        textView3.setAdapter(adapter);
        textView4.setAdapter(adapter);
        textView5.setAdapter(adapter);
        textView6.setAdapter(adapter);
        textView7.setAdapter(adapter);
        textView8.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onFertigButtonClick(View v) {
        fertig_einkaeufe = "Ihre Einkäufe sind: ";

        if (textView1.getText().length() > 0)
            fertig_einkaeufe += textView1.getText().toString() + ", ";
        if (textView2.getText().length() > 0)
            fertig_einkaeufe += textView2.getText().toString() + ", ";
        if (textView3.getText().length() > 0)
            fertig_einkaeufe += textView3.getText().toString() + ", ";
        if (textView4.getText().length() > 0)
            fertig_einkaeufe += textView4.getText().toString() + ", ";
        if (textView5.getText().length() > 0)
            fertig_einkaeufe += textView5.getText().toString() + ", ";
        if (textView6.getText().length() > 0)
            fertig_einkaeufe += textView6.getText().toString() + ", ";
        if (textView7.getText().length() > 0)
            fertig_einkaeufe += textView7.getText().toString() + ", ";
        if (textView8.getText().length() > 0)
            fertig_einkaeufe += textView8.getText().toString() + ", ";

        fertig_einkaeufe = fertig_einkaeufe.substring(0, fertig_einkaeufe.length() - 2);
        fertig_einkaeufe += ".";

        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, fertig_einkaeufe, duration);
        toast.show();
    }
}

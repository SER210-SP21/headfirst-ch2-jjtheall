package edu.quinnipiac.ser210.beeradviser;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

    }

    //called when button is clicked
    public void onClickFindBeer(View view){
        //get a reference to the TextView
        TextView brands = findViewById(R.id.brands);
        //get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());
        //display selected item
        brands.setText(beerType);
        
    }
}
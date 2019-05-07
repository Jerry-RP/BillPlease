package sg.edu.rp.c346.billplease;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView totalDisplay;
    TextView splitDisplay;
    Button btnReset;
    Button btnCalc;
    EditText etInputpax;
    EditText etInputamt;
    ToggleButton tbtngst;
    ToggleButton tbtnsc;
    double gst=1;
    double sc=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalDisplay=findViewById(R.id.total);
        splitDisplay=findViewById(R.id.perperson);
        etInputamt=findViewById(R.id.amt);
        etInputpax=findViewById(R.id.pax);
        tbtngst=findViewById(R.id.gst);
        tbtnsc=findViewById(R.id.sc);
        btnReset=findViewById(R.id.btnResets);
        btnCalc=findViewById(R.id.btnCal);



        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                etInputamt.setText(null);
                etInputpax.setText(null);
                totalDisplay.setText("Total Bill");
                splitDisplay.setText("Payable Per Person");



            }
        });

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if((etInputamt.getText().toString().isEmpty())||(etInputpax.getText().toString().isEmpty())){



                }else{
                    double total=(Double.parseDouble(etInputamt.getText().toString()))*gst*sc;
                    double paxt=total/(Integer.parseInt(etInputpax.getText().toString()));

                    totalDisplay.setText("Total: $"+total);
                    splitDisplay.setText("Per Person: $"+paxt);

                }



            }
        });


        tbtngst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if(tbtngst.isChecked()){

                        gst=1.07;

                }else{
                    gst=1;

                }



            }
        });
        tbtnsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if(tbtngst.isChecked()){

                        sc=1.1;

                }else{
                    sc=1;

                }



            }
        });







    }
}

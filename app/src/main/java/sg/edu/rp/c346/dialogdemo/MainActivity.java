package sg.edu.rp.c346.dialogdemo;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button btnDemo1;
    Button btnDemo2;
    Button btnDemo3;
    Button btnDemo4;
    Button btnDemo5;
    TextView tvDemo2;
    TextView tvDemo3;
    TextView tvDemo4;
    TextView tvDemo5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDemo1=(Button)findViewById(R.id.buttonDemo1);
        tvDemo2 = (TextView)findViewById(R.id.textViewDemo2);
        btnDemo2 = (Button)findViewById(R.id.buttonDemo2);
        tvDemo3 = (TextView)findViewById(R.id.textViewDemo3);
        tvDemo4 = (TextView)findViewById(R.id.textViewDemo4);
        tvDemo5 = (TextView)findViewById(R.id.textViewDemo5);
        btnDemo3 = (Button)findViewById(R.id.buttonDemo3);
        btnDemo4 = (Button)findViewById(R.id.buttonDemo4);
        btnDemo5 = (Button)findViewById(R.id.buttonDemo5);
/******************Dialog button 1********************************************************************/

        btnDemo1.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v) {
                //Create the Dialog Builder
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                //Set the dialog details
                /*
                myBuilder.setTitle("Demo 1-Simple Dialog");
                myBuilder.setMessage("I can develop Android App");
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("Close",null);
                */
                myBuilder.setTitle("Demo 1-Simple Dialog");
                myBuilder.setMessage("I Love Android Phones.");
                myBuilder.setCancelable(false);
                myBuilder.setPositiveButton("Me too",null);

                //Create and display the Dialog
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
            });
/******************Dialog button 2********************************************************************/
        btnDemo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Point X
                // Implement your Button Dialog box
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                myBuilder.setTitle("Demo 2 Buttons Dialog");
                myBuilder.setMessage("Select one of the Button below.");
                myBuilder.setCancelable(false);
/*
                // Configure the 'positive' button
                myBuilder.setPositiveButton("POSITIVE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // IMPORTANT: Update TextView as a form of data passing betwee Dialog and MainActivity
                        tvDemo2.setText("You have selected Positive.");
                    }
                });

                myBuilder.setNegativeButton("NAGATIVE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // IMPORTANT: Update TextView as a form of data passing betwee Dialog and MainActivity
                        tvDemo2.setText("You have selected Negative.");
                    }
*/
                // Configure the 'positive' button
                myBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // IMPORTANT: Update TextView as a form of data passing betwee Dialog and MainActivity
                        tvDemo2.setText("You have selected Yes.");
                    }
                });

                myBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // IMPORTANT: Update TextView as a form of data passing betwee Dialog and MainActivity
                        tvDemo2.setText("You have selected No.");
                    }
                });



                // Configure the 'neutral' button
                                myBuilder.setNeutralButton("Cancel", null);
                                AlertDialog myDialog = myBuilder.create();
                                myDialog.show();


                            }
                        });
/******************Dialog button 3********************************************************************/
        btnDemo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*
                //Inflate the input.xml layout file
                LayoutInflater inflater =
                        (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog = inflater.inflate(R.layout.input, null);

                // Obtain the UI component in the input.xml layout
                final EditText etInput = (EditText)viewDialog.findViewById(R.id.editTextInput);
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                // Set the view of the dialog
                myBuilder.setView(viewDialog);
                myBuilder.setTitle("Demo 3-Text Input Dialog");

                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        // Extract the Text entered by the user
                        String message = etInput.getText().toString();
                        // Update the Text to TextView
                        tvDemo3.setText(message);
                    }
                });
*/
                //Worksheet exercise
                //Inflater the input.xml layout file
                LayoutInflater inflater =
                        (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog = inflater.inflate(R.layout.input2, null);

                // Obtain the UI component in the input.xml layout
                final EditText etNum1 = (EditText)viewDialog.findViewById(R.id.editTextNum1);
                final EditText etNum2 = (EditText)viewDialog.findViewById(R.id.editTextNum2);
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                // Set the view of the dialog
                myBuilder.setView(viewDialog);
                myBuilder.setTitle("Demo 3-Text Input Dialog");

                myBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        // Extract the Text entered by the user

                        String message = etNum1.getText().toString();
                        String message2 = etNum2.getText().toString();
                        int intmessage =Integer.parseInt(etNum1.getText().toString());
                        int intmessage2 =Integer.parseInt(etNum2.getText().toString());
                        int total=intmessage+intmessage2;
                        String Stringtotal=Integer.toString(total);
                        // Update the Text to TextView
                        tvDemo3.setText(Stringtotal);
                    }
                });
                myBuilder.setNegativeButton("Cancel", null);




                AlertDialog myDialog = myBuilder.create();
                myDialog.show();
            }
        });
/******************Dialog button 3********************************************************************/
        btnDemo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Creating the Listener to set the date
                DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear,
                                          int dayOfMonth) {
                        tvDemo4.setText("Date: " + dayOfMonth + "/" + (monthOfYear+1) + "/" + year);
                    }
                };

                // Create the Date Picker Dialog
                Calendar now = Calendar.getInstance();

                // get the current date
                int year = now.get(Calendar.YEAR);
                int month = now.get(Calendar.MONTH);
                int day = now.get(Calendar.DATE);
                DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this,
                        myDateListener, year, month, day);

                myDateDialog.show();
            }
        });

/******************Dialog button 3********************************************************************/
        btnDemo5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Creating the Listener to set the time
                TimePickerDialog.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        tvDemo5.setText("Time: " + hourOfDay + ":" + minute);
                    }
                };
/*
                // Create the Time Picker Dialog
                TimePickerDialog myTimeDialog = new TimePickerDialog(MainActivity.this,
                        myTimeListener, 20, 00, true);
*/
                Calendar now = Calendar.getInstance();
                int hour = now.get(Calendar.HOUR);
                int minute = now.get(Calendar.MINUTE);
                TimePickerDialog myTimeDialog = new TimePickerDialog(MainActivity.this,myTimeListener,hour,minute,true);

                myTimeDialog.show();
            }
        });


    }
}

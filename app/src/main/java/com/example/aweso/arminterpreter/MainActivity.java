package com.example.aweso.arminterpreter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText instructionET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.instructionET = (EditText)this.findViewById(R.id.instructionET);
        ARMap.init();
        //ARMap.lookupInstruction("ADD").display();
    }

    public void registersButtonPressed(View v)
    {
        Intent i = new Intent(this, RegisterScreen.class);
        this.startActivity(i);
    }

    public void executeButtonPressed(View v)
    {
        //Read the instruction from the instructionET and appropriately
        //execute it
        //For example, if instructionET contained: ADD X0, X1, X2
        //Your code should grab the value from X1 and X2, add them
        //together, and store the result in X0
        String instruction = this.instructionET.getText().toString();
        String instructionName = instruction.substring(0, 3);
        String instructionReg = instruction.substring(3);
        String[] seperated = instructionReg.split(",");
        for(int i = 0; i < ARMap.registers.length; i++)
        {
            if(ARMap.registers[i] == 
        }
        if(instruction == "ADD")
        {
            seperated[0] = seperated[2] + seperated[1];
        }
    }
}

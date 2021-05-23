package com.example.myapplication211checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText mInputMoney = findViewById(R.id.inputMoney);
        EditText mInputInfo = findViewById(R.id.inputInfo);
        Button mBtnOk = findViewById(R.id.btnOK);
        CheckBox mBankCardChkBx = findViewById(R.id.bankCardChkBx);
        CheckBox mMobilePhoneChkBx = findViewById(R.id.mobilePhoneChkBx);
        CheckBox mCashAddressChkBx = findViewById(R.id.cashAddressChkBx);

        mBankCardChkBx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBankCardChkBx.setChecked(true);
                mMobilePhoneChkBx.setChecked(false);
                mCashAddressChkBx.setChecked(false);
            }
        });
        mMobilePhoneChkBx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMobilePhoneChkBx.setChecked(true);
                mBankCardChkBx.setChecked(false);
                mCashAddressChkBx.setChecked(false);
            }
        });
        mCashAddressChkBx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCashAddressChkBx.setChecked(true);
                mBankCardChkBx.setChecked(false);
                mMobilePhoneChkBx.setChecked(false);
            }
        });

    }
}


buton.setOnClickListerner(bntClick;
btnEnableCheckBox.SetOnChechedListener((view, isChecked ->)))
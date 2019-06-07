package com.dotplays.customalertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMyAlertDialog(View view) {

        // khởi tạo AlertDialog từ đối tượng Builder. tham số truyền vào ở đây là context.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // set Message là phương thức thiết lập câu thông báo
        builder.setMessage("Hello My Alert!!!")
                // positiveButton là nút thuận : đặt là OK
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // FIRE ZE MISSILES!
                    }
                })
                // ngược lại negative là nút nghịch : đặt là cancel
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                    }
                });
        // tạo dialog và hiển thị
        builder.create().show();


    }

    public void openMyCustom(View view) {

        // khởi tạo AlertDialog từ đối tượng Builder. tham số truyền vào ở đây là context.
        AlertDialog.Builder builder = new AlertDialog.Builder(this);



        // khoi tao doi tuong View tu file mydialog.
        View alert = LayoutInflater.from(this).inflate(R.layout.mydialog, null);

        // set layout cho alert dialog
        builder.setView(alert);

        EditText edtName;
        EditText edtPhone;
        Button btnClear;
        Button btnSave;


        // tham chieu cac doi tuong co tren giao dien dialog vua duoc set
        edtName = alert.findViewById(R.id.edtName);
        edtPhone = alert.findViewById(R.id.edtPhone);
        btnClear = alert.findViewById(R.id.btnClear);
        btnSave = alert.findViewById(R.id.btnSave);

        // bat su kien click vao nut

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        // tạo dialog và hiển thị
        builder.create().show();

    }
}

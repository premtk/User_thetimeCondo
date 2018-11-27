package com.se.weapp.thetimecondo;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MaintenanceFragment extends Fragment {
    CheckBox checkBox_aircon;CheckBox checkBox_stove;CheckBox checkBox_electric;CheckBox checkBox_pipe;CheckBox checkBox_water;CheckBox checkBox_bathroom;CheckBox checkBox_other;
    EditText input_tel;EditText input_other;EditText input_numroom;


    public DatabaseReference databaseMaintenance;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_maintenance,container,false);

        databaseMaintenance = FirebaseDatabase.getInstance().getReference("Maintenance");
        Button confirmMaintenanceBt = (Button)v.findViewById(R.id.button_maintenance_submit) ;

        checkBox_aircon = (CheckBox)v.findViewById(R.id.checkBox_aircon);
        checkBox_stove = (CheckBox)v.findViewById(R.id.checkBox_stove);
        checkBox_electric = (CheckBox)v.findViewById(R.id.checkBox_electric);
        checkBox_pipe = (CheckBox)v.findViewById(R.id.checkBox_pipe);
        checkBox_water = (CheckBox)v.findViewById(R.id.checkBox_water);
        checkBox_bathroom = (CheckBox)v.findViewById(R.id.checkBox_bathroom);
        checkBox_other = (CheckBox)v.findViewById(R.id.checkBox_other);
        input_tel = (EditText)v.findViewById(R.id.input_tel);
        input_other = (EditText)v.findViewById(R.id.input_other);
        input_numroom = (EditText)v.findViewById(R.id.numroom);


        confirmMaintenanceBt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                addMaintenance();

            }
        });

        return v;
    }

    public void openAnnouncement(){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        AnnounFragment llf = new AnnounFragment();
        ft.replace(R.id.fragment, llf);
        ft.commit();
    }

    public void addMaintenance(){
        String id;
        String text_input_tel = input_tel.getText().toString();
        String text_input_numroom = input_numroom.getText().toString();
        String text_checkBox_aircon = "";
        String text_checkBox_stove = "";
        String text_checkBox_electric = "";
        String text_checkBox_pipe = "";
        String text_checkBox_water = "";
        String text_checkBox_bathroom = "";
        String text_checkBox_other = "";
        String text_input_other = "";

        if(!TextUtils.isEmpty(text_input_tel)) {
            if (checkBox_aircon.isChecked() || checkBox_stove.isChecked() || checkBox_electric.isChecked() ||
                    checkBox_pipe.isChecked() || checkBox_water.isChecked() || checkBox_bathroom.isChecked() || checkBox_other.isChecked()) {

                if (checkBox_aircon.isChecked()) {
                    text_checkBox_aircon = checkBox_aircon.getText().toString();
                }
                if (checkBox_stove.isChecked()) {
                    text_checkBox_stove = checkBox_stove.getText().toString();
                }
                if (checkBox_electric.isChecked()) {
                    text_checkBox_electric = checkBox_electric.getText().toString();

                }
                if (checkBox_pipe.isChecked()) {
                    text_checkBox_pipe = checkBox_pipe.getText().toString();

                }
                if (checkBox_water.isChecked()) {
                    text_checkBox_water = checkBox_water.getText().toString();

                }
                if (checkBox_bathroom.isChecked()) {
                    text_checkBox_bathroom = checkBox_bathroom.getText().toString();

                }
                if (checkBox_other.isChecked()) {
                    text_checkBox_other = checkBox_other.getText().toString();
                    text_input_other = input_other.getText().toString();
                }
                id = databaseMaintenance.push().getKey();
                MaintenanceCase maintenanceCase = new MaintenanceCase(id, text_checkBox_aircon, text_checkBox_stove, text_checkBox_electric,
                        text_checkBox_pipe, text_checkBox_water, text_checkBox_bathroom, text_checkBox_other, text_input_tel, text_input_other);
                databaseMaintenance.child(text_input_numroom).setValue(maintenanceCase);
                Toast.makeText(getActivity(), "ส่งคำร้องแจ้งซ่อมเรียบร้อย", Toast.LENGTH_LONG).show();
                openAnnouncement();
            }else{
                Toast.makeText(getActivity(),"กรุณาเลือกอย่างน้อยหนึ่งรายการ",Toast.LENGTH_LONG).show();
            }
        }
        else{
            Toast.makeText(getActivity(),"กรุณากรอกเบอร์ติดต่อกลับที่สะดวก",Toast.LENGTH_LONG).show();
        }

    }
}


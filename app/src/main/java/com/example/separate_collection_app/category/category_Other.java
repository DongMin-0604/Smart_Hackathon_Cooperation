package com.example.separate_collection_app.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.separate_collection_app.Activity.MainActivity;
import com.example.separate_collection_app.R;
import com.example.separate_collection_app.Select_Other.category_aluminum;
import com.example.separate_collection_app.Select_Other.category_battery;
import com.example.separate_collection_app.Select_Other.category_cosmetics;
import com.example.separate_collection_app.Select_Other.category_home_appliance;
import com.example.separate_collection_app.Select_Other.category_ice_pack;
import com.example.separate_collection_app.Select_Other.category_mask;
import com.example.separate_collection_app.Select_Other.category_medicinem;
import com.example.separate_collection_app.Select_Other.category_rubber;
import com.example.separate_collection_app.Select_Other.category_silicone;
import com.example.separate_collection_app.Select_Other.category_styrofoam;
import com.example.separate_collection_app.Select_Other.category_wet_tissue;
import com.example.separate_collection_app.Select_Other.category_wire_cloth;

public class category_Other extends Fragment {

    Button back_BT;
    Button wire_cloth_BT,mask_BT,home_appliance_BT,cosmetics_BT,wet_tissue_BT,ice_pack_BT,rubber_BT,styrofoam_BT,aluminum_BT,medicinem_BT,battery_BT,silicone_BT;

    public static category_Other newInstance(){
        return new category_Other();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category_other, null);

        back_BT = (Button)v.findViewById(R.id.bt_back);
        wire_cloth_BT = (Button)v.findViewById(R.id.wire_cloth_bt);
        mask_BT = (Button)v.findViewById(R.id.mask_bt);
        home_appliance_BT = (Button)v.findViewById(R.id.home_appliance_bt);
        cosmetics_BT = (Button)v.findViewById(R.id.cosmetics_bt);
        wet_tissue_BT = (Button)v.findViewById(R.id.wet_tissue_bt);
        ice_pack_BT = (Button)v.findViewById(R.id.ice_pack_bt);
        rubber_BT = (Button)v.findViewById(R.id.rubber_bt);
        styrofoam_BT = (Button)v.findViewById(R.id.styrofoam_bt);
        aluminum_BT = (Button)v.findViewById(R.id.aluminum_bt);
        medicinem_BT = (Button)v.findViewById(R.id.medicinem_bt);
        battery_BT = (Button)v.findViewById(R.id.battery_bt);
        silicone_BT = (Button)v.findViewById(R.id.silicone_bt);

        back_BT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().remove(category_Other.this).commit();
                fragmentManager.popBackStack();

            }
        });
        wire_cloth_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_wire_cloth.newInstance());
            }
        });

        mask_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_mask.newInstance());
            }
        });

        home_appliance_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_home_appliance.newInstance());
            }
        });

        cosmetics_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_cosmetics.newInstance());
            }
        });

        wet_tissue_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_wet_tissue.newInstance());
            }
        });

        ice_pack_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_ice_pack.newInstance());
            }
        });

        rubber_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_rubber.newInstance());
            }
        });

        styrofoam_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_styrofoam.newInstance());
            }
        });

        aluminum_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_aluminum.newInstance());
            }
        });

        medicinem_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_medicinem.newInstance());
            }
        });

        battery_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_battery.newInstance());
            }
        });

        silicone_BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).replaceFragment(category_silicone.newInstance());
            }
        });

        return v;
    }

}

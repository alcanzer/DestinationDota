package com.example.joseph.destinationdota;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by Joseph on 11/15/2016.
 */
public class hero_agi extends Fragment {

    GridView gridView;

    Integer img_id[] = {R.drawable.h_antimage_sb,R.drawable.h_arc_warden_sb, R.drawable.h_bloodseeker_sb, R.drawable.h_bounty_hunter_sb, R.drawable.h_broodmother_sb,
            R.drawable.h_clinkz_sb, R.drawable.h_drow_ranger_sb, R.drawable.h_ember_spirit_sb, R.drawable.h_faceless_void_sb, R.drawable.h_gyrocopter_sb,
            R.drawable.h_juggernaut_sb, R.drawable.h_luna_sb, R.drawable.h_medusa_sb, R.drawable.h_mirana_sb, R.drawable.h_morphling_sb, R.drawable.h_naga_siren_sb,
            R.drawable.h_phantom_assassin_sb, R.drawable.h_phantom_lancer_sb, R.drawable.h_razor_sb, R.drawable.h_riki_sb,
            R.drawable.h_shadow_fiend_sb, R.drawable.h_slark_sb, R.drawable.h_sniper_sb, R.drawable.h_spectre_sb,
            R.drawable.h_templar_assassin_sb, R.drawable.h_terror_blade_sb,  R.drawable.h_troll_warlord_sb,
            R.drawable.h_vengefulspirit_sb, R.drawable.h_venomancer_sb, R.drawable.h_viper_sb, R.drawable.h_weaver_sb, R.drawable.h_nyx_assassin_sb};

    String hero_name[] = {"Anti-Mage", "Arc-Warden", "Bloodseeker", "Bounty Hunter", "Broodmother", "Clinkz",
            "Drow Ranger", "Ember Spirit", "Faceless Void", "Gyrocopter",
            "Juggernaut", "Luna", "Medusa", "Mirana", "Morphling", "Naga Siren",
            "Phantom Assassin", "Phantom Lancer", "Razor", "Riki", "Shadow Fiend", "Slark", "Sniper", "Spectre", "Templar Assassin", "Terrorblade",
            "Troll Warlord", "Vengeful Spirit", "Venomancer", "Viper", "Weaver", "Nyx Assassin"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View v = inflater.inflate(R.layout.adapter_fragment, container, false);
        gridView = (GridView) v.findViewById(R.id.adapterGrid);
        gridView.setAdapter(new Adapter(v.getContext(), img_id, hero_name));
        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onCreateOptionsMenu (Menu menu, MenuInflater inflater) {
        menu.clear();
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.str) {
            hero_st fragment = new hero_st();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragment).commit();
        }
        else if (id == R.id.agi){
            hero_agi fragment = new hero_agi();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragment).commit();
        }
        else if (id == R.id.intel){
            hero_int fragment = new hero_int();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragment).commit();

        }

        return true;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), Main2Activity.class);
                intent.putExtra("id", i);
                intent.putExtra("page","hero");
                startActivity(intent);
            }
        });
    }

}


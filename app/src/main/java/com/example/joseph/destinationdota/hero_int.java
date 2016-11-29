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
public class hero_int extends Fragment {

    GridView gridView;
    Integer img_id[] = {R.drawable.h_ancient_apparition_sb, R.drawable.h_bane_sb, R.drawable.h_batrider_sb,
            R.drawable.h_chen_sb, R.drawable.h_crystal_maiden_sb, R.drawable.h_dark_seer_sb, R.drawable.h_dazzle_sb, R.drawable.h_death_prophet_sb, R.drawable.h_disruptor_sb,
            R.drawable.h_enchantress_sb, R.drawable.h_enigma_sb, R.drawable.h_invoker_sb, R.drawable.h_jakiro_sb, R.drawable.h_keeper_of_the_light_sb, R.drawable.h_leshrac_sb, R.drawable.h_lich_sb, R.drawable.h_lina_sb, R.drawable.h_lion_sb,
            R.drawable.h_nature_prophet_sb, R.drawable.h_necrolyte_sb, R.drawable.h_ogre_magi_sb, R.drawable.h_oracle_sb, R.drawable.h_outworld_devourer_sb, R.drawable.h_puck_sb,  R.drawable.h_pugna_sb, R.drawable.h_queenofpain_sb,
            R.drawable.h_rubick_sb, R.drawable.h_shadow_demon_sb, R.drawable.h_shadow_shaman_sb, R.drawable.h_silencer_sb, R.drawable.h_skywrath_mage_sb, R.drawable.h_storm_spirit_sb,
            R.drawable.h_techies_sb, R.drawable.h_tinker_sb, R.drawable.h_visage_sb, R.drawable.h_warlock_sb, R.drawable.h_windrunner_sb, R.drawable.h_witch_doctor_sb, R.drawable.h_ww_sb, R.drawable.h_zeus_sb};

    String hero_name[] = {"Ancient Apparition", "Bane", "Batrider", "Chen", "Crystal Maiden", "Dark Seer", "Dazzle", "Death Prophet", "Distruptor",
            "Enchantress", "Enigma", "Invoker", "Jakiro", "Keeper of the Light", "Leshrac", "Lich", "Lina", "Lion", "Nature's Prophet", "Necrophos",
            "Ogre Magi", "Oracle", "Outworld Devourer", "Puck", "Pugna", "Queen of Pain", "Rubick", "Shadow Demon", "Shadow Shaman",
            "Silencer", "Skywrath Mage", "Storm Spirit", "Techies", "Tinker", "Visage", "Warlock", "Windranger", "Witch Doctor", "Winter Wyvern", "Zeus"};

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


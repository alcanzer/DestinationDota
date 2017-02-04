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
import android.widget.ImageView;

import rm.com.longpresspopup.LongPressPopup;
import rm.com.longpresspopup.LongPressPopupBuilder;

/**
 * Created by Joseph on 11/15/2016.
 */
public class hero_agi extends Fragment {

    GridView gridView;
    ImageView imV;
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
        imV = new ImageView(getActivity());
        gridView.setAdapter(new Adapter(v.getContext(), img_id, hero_name));
        // Inflate the layout for this fragment
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                imV.setImageResource(img_id[i]);
                imV.setScaleType(ImageView.ScaleType.FIT_CENTER);
                Toaster.show(getActivity(), hero_name[i], true);
                return true;
            }
        });

        LongPressPopup popup = new LongPressPopupBuilder(getActivity())// A Context object for the builder constructor
                .setTarget(gridView)// The View which will open the popup if long pressed
                .setPopupView(imV)
                .setLongPressDuration(750)
                .setDismissOnLongPressStop(true)
                .setDismissOnBackPressed(true)
                .setCancelTouchOnDragOutsideView(false)
                .setAnimationType(LongPressPopup.ANIMATION_TYPE_FROM_CENTER)// The View to show when long pressed
                .build();
        popup.register();
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
                switch(i){
                    case 0:
                        startAct(3);
                        break;
                    case 1:
                        startAct(4);
                        break;
                    case 2:
                        startAct(9);
                        break;
                    case 3:
                        startAct(10);
                        break;
                    case 4:
                        startAct(13);
                        break;
                    case 5:
                        startAct(17);
                        break;
                    case 6:
                        startAct(26);
                        break;
                    case 7:
                        startAct(30);
                        break;
                    case 8:
                        startAct(33);
                        break;
                    case 9:
                        startAct(34);
                        break;
                    case 10:
                        startAct(39);
                        break;
                    case 11:
                        startAct(49);
                        break;
                    case 12:
                        startAct(52);
                        break;
                    case 13:
                        startAct(54);
                        break;
                    case 14:
                        startAct(55);
                        break;
                    case 15:
                        startAct(56);
                        break;
                    case 16:
                        startAct(65);
                        break;
                    case 17:
                        startAct(66);
                        break;
                    case 18:
                        startAct(72);
                        break;
                    case 19:
                        startAct(73);
                        break;
                    case 20:
                        startAct(77);
                        break;
                    case 21:
                        startAct(82);
                        break;
                    case 22:
                        startAct(83);
                        break;
                    case 23:
                        startAct(84);
                        break;
                    case 24:
                        startAct(89);
                        break;
                    case 25:
                        startAct(90);
                        break;
                    case 26:
                        startAct(96);
                        break;
                    case 27:
                        startAct(101);
                        break;
                    case 28:
                        startAct(102);
                        break;
                    case 29:
                        startAct(103);
                        break;
                    case 30:
                        startAct(106);
                        break;
                    case 31:
                        startAct(60);
                        break;
                    default:
                        startAct(i);
                }
            }
        });
    }

    public void startAct(int i){

        Intent intent = new Intent(getActivity(), Main2Activity.class);
        intent.putExtra("id", i);
        intent.putExtra("page","hero");
        startActivity(intent);

    }

}


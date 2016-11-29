package com.example.joseph.destinationdota;


import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import rm.com.longpresspopup.LongPressPopup;
import rm.com.longpresspopup.LongPressPopupBuilder;
import rm.com.longpresspopup.PopupInflaterListener;
import rm.com.longpresspopup.PopupOnHoverListener;
import rm.com.longpresspopup.PopupStateListener;

public class hero extends Fragment implements PopupInflaterListener,
        PopupStateListener, PopupOnHoverListener, View.OnClickListener{
    ImageView imV, imV1, imV2, imV3;
    GridView gridView;
    Integer img_id[] = {R.drawable.h_abbadon_sb, R.drawable.h_alchemist_sb, R.drawable.h_ancient_apparition_sb, R.drawable.h_antimage_sb, R.drawable.h_arc_warden_sb, R.drawable.h_axe_sb,
            R.drawable.h_bane_sb, R.drawable.h_batrider_sb, R.drawable.h_beastmaster_sb, R.drawable.h_bloodseeker_sb, R.drawable.h_bounty_hunter_sb, R.drawable.h_brewmaster_sb, R.drawable.h_bristleback_sb, R.drawable.h_broodmother_sb, R.drawable.h_cent_sb, R.drawable.h_chaos_knight_sb,
            R.drawable.h_chen_sb, R.drawable.h_clinkz_sb, R.drawable.h_clockwork_sb, R.drawable.h_crystal_maiden_sb, R.drawable.h_dark_seer_sb, R.drawable.h_dazzle_sb, R.drawable.h_death_prophet_sb, R.drawable.h_disruptor_sb, R.drawable.h_doom_bringer_sb,
            R.drawable.h_dragon_knight_sb, R.drawable.h_drow_ranger_sb, R.drawable.h_earth_spirit_sb, R.drawable.h_earthshaker_sb, R.drawable.h_elder_titan_sb, R.drawable.h_ember_spirit_sb, R.drawable.h_enchantress_sb, R.drawable.h_enigma_sb, R.drawable.h_faceless_void_sb, R.drawable.h_gyrocopter_sb,
            R.drawable.h_huskar_sb, R.drawable.h_invoker_sb, R.drawable.h_io_sb, R.drawable.h_jakiro_sb, R.drawable.h_juggernaut_sb, R.drawable.h_keeper_of_the_light_sb, R.drawable.h_kunkka_sb, R.drawable.h_legion_commander_sb, R.drawable.h_leshrac_sb, R.drawable.h_lich_sb, R.drawable.h_life_stealer_sb, R.drawable.h_lina_sb, R.drawable.h_lion_sb,
            R.drawable.h_lone_druid_sb, R.drawable.h_luna_sb, R.drawable.h_lycan_sb, R.drawable.h_magnataur_sb, R.drawable.h_medusa_sb, R.drawable.h_meepo_sb, R.drawable.h_mirana_sb, R.drawable.h_morphling_sb, R.drawable.h_naga_siren_sb, R.drawable.h_nature_prophet_sb, R.drawable.h_necrolyte_sb, R.drawable.h_night_stalker_sb, R.drawable.h_nyx_assassin_sb,
            R.drawable.h_ogre_magi_sb, R.drawable.h_omniknight_sb, R.drawable.h_oracle_sb, R.drawable.h_outworld_devourer_sb, R.drawable.h_phantom_assassin_sb, R.drawable.h_phantom_lancer_sb, R.drawable.h_pheonix_sb, R.drawable.h_puck_sb, R.drawable.h_pudge_sb, R.drawable.h_pugna_sb, R.drawable.h_queenofpain_sb, R.drawable.h_razor_sb, R.drawable.h_riki_sb,
            R.drawable.h_rubick_sb, R.drawable.h_sand_king_sb, R.drawable.h_shadow_demon_sb, R.drawable.h_shadow_fiend_sb, R.drawable.h_shadow_shaman_sb, R.drawable.h_silencer_sb, R.drawable.h_skywrath_mage_sb, R.drawable.h_slardar_sb, R.drawable.h_slark_sb, R.drawable.h_sniper_sb, R.drawable.h_spectre_sb, R.drawable.h_spirit_breaker_sb, R.drawable.h_storm_spirit_sb,
            R.drawable.h_sven_sb, R.drawable.h_techies_sb, R.drawable.h_templar_assassin_sb, R.drawable.h_terror_blade_sb, R.drawable.h_tidehunter_sb, R.drawable.h_timbersaw_sb, R.drawable.h_tinker_sb, R.drawable.h_tiny_sb, R.drawable.h_treant_sb, R.drawable.h_troll_warlord_sb, R.drawable.h_tusk_sb, R.drawable.h_underlord_sb, R.drawable.h_undying_sb, R.drawable.h_ursa_sb,
            R.drawable.h_vengefulspirit_sb, R.drawable.h_venomancer_sb, R.drawable.h_viper_sb, R.drawable.h_visage_sb, R.drawable.h_warlock_sb, R.drawable.h_weaver_sb, R.drawable.h_windrunner_sb, R.drawable.h_witch_doctor_sb, R.drawable.h_wraith_king_sb, R.drawable.h_ww_sb, R.drawable.h_zeus_sb};

    String hero_name[] = {"Abbadon", "Alchemist", "Ancient Apparition", "Anti-Mage", "Arc-Warden", "Axe", "Bane", "Batrider", "Beastmaster", "Bloodseeker", "Bounty Hunter", "Brewmaster",
            "Bristleback", "Broodmother", "Centaur Warrunner", "Chaos Knight", "Chen", "Clinkz", "Clockwork", "Crystal Maiden", "Dark Seer", "Dazzle", "Death Prophet", "Distruptor",
            "Doom", "Dragon Knight", "Drow Ranger", "Earth Spirit", "Earthshaker", "Elder Titan", "Ember Spirit", "Enchantress", "Enigma", "Faceless Void", "Gyrocopter", "Huskar", "Invoker", "Io",
            "Jakiro", "Juggernaut", "Keeper of the Light", "Kunkka", "Legion Commander", "Leshrac", "Lich", "Lifestealer", "Lina", "Lion", "Lone Druid", "Luna", "Lycan", "Magnus", "Medusa", "Meepo", "Mirana", "Morphling", "Naga Siren", "Nature's Prophet", "Necrophos", "Night Stalker",
            "Nyx Assassin", "Ogre Magi", "Omniknight", "Oracle", "Outworld Devourer", "Phantom Assassin", "Phantom Lancer", "Pheonix", "Puck", "Pudge", "Pugna", "Queen of Pain", "Razor", "Riki", "Rubick", "Sand King", "Shadow Demon", "Shadow Fiend", "Shadow Shaman",
            "Silencer", "Skywrath Mage", "Slardar", "Slark", "Sniper", "Spectre", "Spirit Breaker", "Storm Spirit", "Sven", "Techies", "Templar Assassin", "Terrorblade", "Tidehunter", "Timbersaw", "Tinker", "Tiny", "Treant",
            "Troll Warlord", "Tusk", "Underlord", "Undying", "Ursa", "Vengeful Spirit", "Venomancer", "Viper", "Visage", "Warlock", "Weaver", "Windranger", "Witch Doctor", "Wraith King", "Winter Wyvern", "Zeus"};

    Integer skill[] = {

    };

    public hero() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        imV = new ImageView(getActivity());
        View v = inflater.inflate(R.layout.adapter_fragment, container, false);
        gridView = (GridView) v.findViewById(R.id.adapterGrid);
        gridView.setAdapter(new Adapter(v.getContext(), img_id, hero_name));
        gridView.setLongClickable(true);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), Main2Activity.class);
                intent.putExtra("id", i);
                intent.putExtra("page", "hero");
                startActivity(intent);
            }
        });
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
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        getActivity().setTitle("Heroes");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specfy a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.str) {
            hero_st fragment = new hero_st();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment).commit();
        } else if (id == R.id.agi) {
            hero_agi fragment = new hero_agi();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment).commit();
        } else if (id == R.id.intel) {
            hero_int fragment = new hero_int();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, fragment).commit();

        }
        return true;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onClick(View view) {

    }
    @Override
    public void onViewInflated(@Nullable String popupTag, View root) {
        /*imV = (ImageView) root.findViewById(R.id.imV);
        imV1 = (ImageView) root.findViewById(R.id.imV1);
        imV2 = (ImageView) root.findViewById(R.id.imV2);
        imV3 = (ImageView) root.findViewById(R.id.imV3);*/

    }

    @Override
    public void onHoverChanged(View view, boolean isHovered) {

    }

    @Override
    public void onPopupShow(@Nullable String popupTag) {

    }

    @Override
    public void onPopupDismiss(@Nullable String popupTag) {

    }
}

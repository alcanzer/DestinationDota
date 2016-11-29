package com.example.joseph.destinationdota;

import android.app.FragmentManager;
import android.content.Intent;
import android.database.Cursor;
import android.media.Image;
import android.support.annotation.DrawableRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ImageView imageView, imageView1, imageView2, imageView3, imageView4;
    TextView textView, textView2, skills1, skills2, skills3, skills4;
    WebView engine;
    DatabaseHelper databaseHelper;
    Cursor her;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        engine = (WebView) findViewById( R.id.webview);
        engine.getSettings().setJavaScriptEnabled(true);
        String playVideo= "<html><body><br> <iframe class=\"youtube-player\" type=\"text/html\" width=\"320\" height=\"180\" src=\"http://www.youtube.com/embed/vsXekvLGIEk\" frameborder=\"0\"></body></html>";
        engine.loadData(playVideo, "text/html", "utf-8");
        imageView = (ImageView) findViewById(R.id.main2Img);
        imageView1 = (ImageView) findViewById(R.id.skill1);
        imageView2 = (ImageView) findViewById(R.id.skill2);
        imageView3 = (ImageView) findViewById(R.id.skill3);
        imageView4 = (ImageView) findViewById(R.id.skill4);
        textView = (TextView)findViewById(R.id.info);
        textView2 = (TextView) findViewById(R.id.Name);
        skills1 = (TextView) findViewById(R.id.skill1txt);
        skills2 = (TextView) findViewById(R.id.skill2txt);
        skills3 = (TextView) findViewById(R.id.skill3txt);
        skills4 = (TextView) findViewById(R.id.skill4txt);
        databaseHelper = new DatabaseHelper(Main2Activity.this);
        int i = getIntent().getExtras().getInt("id");
        String swtch = getIntent().getStringExtra("page");
        if (swtch.equals("hero")) {
            switchHouse(i);
            setUpInfo(i);
        } else {

        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                if (fm.getBackStackEntryCount() > 0) {
                    fm.popBackStack();
                }
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }



    public void switchHouse(int i){

        switch(i){
            case 0 :
                imageView.setImageResource(R.drawable.h_abbadon_sb);
                break;
            case 1:
                imageView.setImageResource(R.drawable.h_alchemist_sb);
                imageView1.setImageResource(R.drawable.acid_spray);
                imageView2.setImageResource(R.drawable.unstable_conc);
                imageView3.setImageResource(R.drawable.greevils_greed);
                imageView4.setImageResource(R.drawable.chemical_rage);
                skills1.setText("Sprays high-pressure acid across a target area. Enemy units who step across the contaminated terrain take damage per second and have their armor reduced.");
                skills2.setText("Alchemist brews up an unstable concoction that he can throw at an enemy hero, to stun and deal damage in an area around the explosion. The longer the concoction brews, the more damage it deals and the longer the stun. After 5 seconds, the brew reaches its maximum damage and stun time. However, after 5.5 seconds, the concoction will explode on Alchemist himself if not thrown.");
                skills3.setText("Alchemist synthesizes additional gold from his enemies and bounty runes. With each kill, Alchemist earns base bonus gold and extra bonus gold. If Alchemist kills another unit which yields gold within the next 30 seconds, an additional instance of Extra Bonus Gold is added to the total. Additionally, causes bounty runes to yield 3/4/5/6 times their normal gold.");
                skills4.setText("Alchemist causes his Ogre to enter a chemically induced rage, reducing base attack cooldown and increasing movement speed and regeneration.");

                break;
            case 2 :
                imageView.setImageResource(R.drawable.h_ancient_apparition_sb);
                break;
            case 3:
                imageView.setImageResource(R.drawable.h_antimage_sb);
                break;
            case 4:
                imageView.setImageResource(R.drawable.h_arc_warden_sb);
                break;
            case 5:
                imageView.setImageResource(R.drawable.h_axe_sb);
                break;
            case 6 :
                imageView.setImageResource(R.drawable.h_bane_sb);
                break;
            case 7:
                imageView.setImageResource(R.drawable.h_batrider_sb);
                break;
            case 8 :
                imageView.setImageResource(R.drawable.h_beastmaster_sb);
                break;
            case 9:
                imageView.setImageResource(R.drawable.h_bloodseeker_sb);
                break;
            case 10 :
                imageView.setImageResource(R.drawable.h_bounty_hunter_sb);
                break;
            case 11:
                imageView.setImageResource(R.drawable.h_brewmaster_sb);
                break;
            case 12 :
                imageView.setImageResource(R.drawable.h_bristleback_sb);
                break;
            case 13:
                imageView.setImageResource(R.drawable.h_broodmother_sb);
                break;
            case 14 :
                imageView.setImageResource(R.drawable.h_cent_sb);
                break;
            case 15:
                imageView.setImageResource(R.drawable.h_chaos_knight_sb);
                break;
            case 16 :
                imageView.setImageResource(R.drawable.h_chen_sb);
                break;
            case 17:
                imageView.setImageResource(R.drawable.h_clinkz_sb);
                break;
            case 18 :
                imageView.setImageResource(R.drawable.h_clockwork_sb);
                break;
            case 19:
                imageView.setImageResource(R.drawable.h_crystal_maiden_sb);
                break;
            case 20 :
                imageView.setImageResource(R.drawable.h_dark_seer_sb);
                break;
            case 21:
                imageView.setImageResource(R.drawable.h_dazzle_sb);
                break;
            case 22 :
                imageView.setImageResource(R.drawable.h_death_prophet_sb);
                break;
            case 23:
                imageView.setImageResource(R.drawable.h_disruptor_sb);
                break;
            case 24 :
                imageView.setImageResource(R.drawable.h_doom_bringer_sb);
                break;
            case 25:
                imageView.setImageResource(R.drawable.h_dragon_knight_sb);
                break;
            case 26 :
                imageView.setImageResource(R.drawable.h_drow_ranger_sb);
                break;
            case 27:
                imageView.setImageResource(R.drawable.h_earth_spirit_sb);
                break;
            case 28 :
                imageView.setImageResource(R.drawable.h_earthshaker_sb);
                break;
            case 29:
                imageView.setImageResource(R.drawable.h_elder_titan_sb);
                break;
            case 30 :
                imageView.setImageResource(R.drawable.h_ember_spirit_sb);
                break;
            case 31:
                imageView.setImageResource(R.drawable.h_enchantress_sb);
                break;
            case 32 :
                imageView.setImageResource(R.drawable.h_enigma_sb);
                break;
            case 33:
                imageView.setImageResource(R.drawable.h_faceless_void_sb);
                break;
            case 34 :
                imageView.setImageResource(R.drawable.h_gyrocopter_sb);
                break;
            case 35:
                imageView.setImageResource(R.drawable.h_huskar_sb);
                break;
            case 36 :
                imageView.setImageResource(R.drawable.h_invoker_sb);
                break;
            case 37:
                imageView.setImageResource(R.drawable.h_io_sb);
                break;
            case 38 :
                imageView.setImageResource(R.drawable.h_jakiro_sb);
                break;
            case 39:
                imageView.setImageResource(R.drawable.h_juggernaut_sb);
                break;
            case 40 :
                imageView.setImageResource(R.drawable.h_keeper_of_the_light_sb);
                break;
            case 41:
                imageView.setImageResource(R.drawable.h_kunkka_sb);
                break;
            case 42 :
                imageView.setImageResource(R.drawable.h_legion_commander_sb);
                break;
            case 43:
                imageView.setImageResource(R.drawable.h_leshrac_sb);
                break;
            case 44 :
                imageView.setImageResource(R.drawable.h_lich_sb);
                break;
            case 45:
                imageView.setImageResource(R.drawable.h_life_stealer_sb);
                break;
            case 46 :
                imageView.setImageResource(R.drawable.h_lina_sb);
                break;
            case 47:
                imageView.setImageResource(R.drawable.h_lion_sb);
                break;
            case 48 :
                imageView.setImageResource(R.drawable.h_lone_druid_sb);
                break;
            case 49:
                imageView.setImageResource(R.drawable.h_luna_sb);
                break;
            case 50 :
                imageView.setImageResource(R.drawable.h_lycan_sb);
                break;
            case 51:
                imageView.setImageResource(R.drawable.h_magnataur_sb);
                break;
            case 52 :
                imageView.setImageResource(R.drawable.h_medusa_sb);
                break;
            case 53:
                imageView.setImageResource(R.drawable.h_meepo_sb);
                break;
            case 54 :
                imageView.setImageResource(R.drawable.h_mirana_sb);
                break;
            case 55:
                imageView.setImageResource(R.drawable.h_morphling_sb);
                break;
            case 56 :
                imageView.setImageResource(R.drawable.h_naga_siren_sb);
                break;
            case 57:
                imageView.setImageResource(R.drawable.h_nature_prophet_sb);
                break;
            case 58 :
                imageView.setImageResource(R.drawable.h_necrolyte_sb);
                break;
            case 59:
                imageView.setImageResource(R.drawable.h_night_stalker_sb);
                break;
            case 60 :
                imageView.setImageResource(R.drawable.h_nyx_assassin_sb);
                break;
            case 61:
                imageView.setImageResource(R.drawable.h_ogre_magi_sb);
                break;
            case 62:
                imageView.setImageResource(R.drawable.h_omniknight_sb);
                break;
            case 63:
                imageView.setImageResource(R.drawable.h_oracle_sb);
                break;
            case 64:
                imageView.setImageResource(R.drawable.h_outworld_devourer_sb);
                break;
            case 65:
                imageView.setImageResource(R.drawable.h_phantom_assassin_sb);
                break;
            case 66:
                imageView.setImageResource(R.drawable.h_phantom_lancer_sb);
                break;
            case 67:
                imageView.setImageResource(R.drawable.h_pheonix_sb);
                break;
            case 68:
                imageView.setImageResource(R.drawable.h_puck_sb);
                break;
            case 69:
                imageView.setImageResource(R.drawable.h_pudge_sb);
                break;
            case 70:
                imageView.setImageResource(R.drawable.h_pugna_sb);
                break;
            case 71:
                imageView.setImageResource(R.drawable.h_queenofpain_sb);
                break;
            case 72:
                imageView.setImageResource(R.drawable.h_razor_sb);
                break;
            case 73:
                imageView.setImageResource(R.drawable.h_riki_sb);
                break;
            case 74:
                imageView.setImageResource(R.drawable.h_rubick_sb);
                break;
            case 75:
                imageView.setImageResource(R.drawable.h_sand_king_sb);
                break;
            case 76:
                imageView.setImageResource(R.drawable.h_shadow_demon_sb);
                break;
            case 77:
                imageView.setImageResource(R.drawable.h_shadow_fiend_sb);
                break;
            case 78:
                imageView.setImageResource(R.drawable.h_shadow_shaman_sb);
                break;
            case 79:
                imageView.setImageResource(R.drawable.h_silencer_sb);
                break;
            case 80:
                imageView.setImageResource(R.drawable.h_skywrath_mage_sb);
                break;
            case 81:
                imageView.setImageResource(R.drawable.h_slardar_sb);
                break;
            case 82:
                imageView.setImageResource(R.drawable.h_slark_sb);
                break;
            case 83:
                imageView.setImageResource(R.drawable.h_sniper_sb);
                break;
            case 84:
                imageView.setImageResource(R.drawable.h_spectre_sb);
                break;
            case 85:
                imageView.setImageResource(R.drawable.h_spirit_breaker_sb);
                break;
            case 86:
                imageView.setImageResource(R.drawable.h_storm_spirit_sb);
                break;
            case 87:
                imageView.setImageResource(R.drawable.h_sven_sb);
                break;
            case 88:
                imageView.setImageResource(R.drawable.h_techies_sb);
                break;
            case 89:
                imageView.setImageResource(R.drawable.h_templar_assassin_sb);
                break;
            case 90:
                imageView.setImageResource(R.drawable.h_terror_blade_sb);
                break;
            case 91:
                imageView.setImageResource(R.drawable.h_tidehunter_sb);
                break;
            case 92:
                imageView.setImageResource(R.drawable.h_timbersaw_sb);
                break;
            case 93:
                imageView.setImageResource(R.drawable.h_tinker_sb);
                break;
            case 94:
                imageView.setImageResource(R.drawable.h_tiny_sb);
                break;
            case 95:
                imageView.setImageResource(R.drawable.h_treant_sb);
                break;
            case 96:
                imageView.setImageResource(R.drawable.h_troll_warlord_sb);
                break;
            case 97:
                imageView.setImageResource(R.drawable.h_tusk_sb);
                break;
            case 98:
                imageView.setImageResource(R.drawable.h_underlord_sb);
                break;
            case 99:
                imageView.setImageResource(R.drawable.h_undying_sb);
                break;
            case 100:
                imageView.setImageResource(R.drawable.h_ursa_sb);
                break;
            case 101:
                imageView.setImageResource(R.drawable.h_vengefulspirit_sb);
                break;
            case 102:
                imageView.setImageResource(R.drawable.h_venomancer_sb);
                break;
            case 103:
                imageView.setImageResource(R.drawable.h_viper_sb);
                break;
            case 104:
                imageView.setImageResource(R.drawable.h_visage_sb);
                break;
            case 105:
                imageView.setImageResource(R.drawable.h_warlock_sb);
                break;
            case 106:
                imageView.setImageResource(R.drawable.h_weaver_sb);
                break;
            case 107:
                imageView.setImageResource(R.drawable.h_windrunner_sb);
                break;
            case 108:
                imageView.setImageResource(R.drawable.h_witch_doctor_sb);
                break;
            case 109:
                imageView.setImageResource(R.drawable.h_wraith_king_sb);
                break;
            case 110:
                imageView.setImageResource(R.drawable.h_ww_sb);
                break;
            case 111:
                imageView.setImageResource(R.drawable.h_zeus_sb);
                break;

            default:
                imageView.setImageResource(R.drawable.dotaart);
                textView.setText("You selected Hero 4-~");
        }
    }

    public void setUpInfo(int i){

        her = databaseHelper.getInfo(i+1);
        textView.setText(her.getString(her.getColumnIndex("Lore")));
        textView2.setText(her.getString(her.getColumnIndex("Name")));

    }
}

package com.example.joseph.destinationdota;

import android.database.Cursor;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5;
    TextView textView, textView2, skills1, skills2, skills3, skills4, skills5, skillsIntro, skillHead;
    WebView engine;
    DatabaseHelper databaseHelper;
    Cursor her, it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        imageView = (ImageView) findViewById(R.id.main2Img);
        imageView1 = (ImageView) findViewById(R.id.skill1);
        imageView2 = (ImageView) findViewById(R.id.skill2);
        imageView3 = (ImageView) findViewById(R.id.skill3);
        imageView4 = (ImageView) findViewById(R.id.skill4);
        imageView5 = (ImageView) findViewById(R.id.skill5);
        textView = (TextView)findViewById(R.id.info);
        textView2 = (TextView) findViewById(R.id.Name);
        skills1 = (TextView) findViewById(R.id.skill1txt);
        skills2 = (TextView) findViewById(R.id.skill2txt);
        skills3 = (TextView) findViewById(R.id.skill3txt);
        skills4 = (TextView) findViewById(R.id.skill4txt);
        skills5 = (TextView) findViewById(R.id.skill5txt);
        skillsIntro = (TextView) findViewById(R.id.skillIntro);
        skillHead = (TextView) findViewById(R.id.skillHeading);
        databaseHelper = new DatabaseHelper(Main2Activity.this);
        int i = getIntent().getExtras().getInt("id");
        String swtch = getIntent().getStringExtra("page");
        if (swtch.equals("hero")) {
            switchHouse(i);
            setUpInfo(i);
        }
        if (swtch.equals("item")){
            switchItem(i);
            setUpItem(i);
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
                imageView1.setImageResource(R.drawable.aphotic_shield_icon);
                imageView2.setImageResource(R.drawable.borrowed_time_icon);
                imageView3.setImageResource(R.drawable.curse_of_avernus_icon);
                imageView4.setImageResource(R.drawable.mist_coil_icon);
                break;
            case 1:
                imageView.setImageResource(R.drawable.h_alchemist_sb);
                imageView1.setImageResource(R.drawable.acid_spray);
                imageView2.setImageResource(R.drawable.unstable_conc);
                imageView3.setImageResource(R.drawable.greevils_greed);
                imageView4.setImageResource(R.drawable.chemical_rage);
                break;
            case 2 :
                imageView.setImageResource(R.drawable.h_ancient_apparition_sb);
                imageView1.setImageResource(R.drawable.aa_1);
                imageView2.setImageResource(R.drawable.aa_2);
                imageView3.setImageResource(R.drawable.aa_3);
                imageView4.setImageResource(R.drawable.aa_4);
                break;
            case 3:
                imageView.setImageResource(R.drawable.h_antimage_sb);
                imageView1.setImageResource(R.drawable.am_1);
                imageView2.setImageResource(R.drawable.am_2);
                imageView3.setImageResource(R.drawable.am_3);
                imageView4.setImageResource(R.drawable.am_4);
                break;
            case 4:
                imageView.setImageResource(R.drawable.h_arc_warden_sb);
                imageView1.setImageResource(R.drawable.ar_1);
                imageView2.setImageResource(R.drawable.ar_2);
                imageView3.setImageResource(R.drawable.ar_3);
                imageView4.setImageResource(R.drawable.ar_4);
                break;
            case 5:
                imageView.setImageResource(R.drawable.h_axe_sb);
                imageView1.setImageResource(R.drawable.ax_1);
                imageView2.setImageResource(R.drawable.ax_2);
                imageView3.setImageResource(R.drawable.ax_3);
                imageView4.setImageResource(R.drawable.ax_4);
                break;
            case 6 :
                imageView.setImageResource(R.drawable.h_bane_sb);
                imageView1.setImageResource(R.drawable.ba_1);
                imageView2.setImageResource(R.drawable.ba_2);
                imageView3.setImageResource(R.drawable.ba_3);
                imageView4.setImageResource(R.drawable.ba_4);
                break;
            case 7:
                imageView.setImageResource(R.drawable.h_batrider_sb);
                imageView1.setImageResource(R.drawable.bat_1);
                imageView2.setImageResource(R.drawable.bat_2);
                imageView3.setImageResource(R.drawable.bat_3);
                imageView4.setImageResource(R.drawable.bat_4);
                break;
            case 8 :
                imageView.setImageResource(R.drawable.h_beastmaster_sb);
                imageView1.setImageResource(R.drawable.bea_1);
                imageView2.setImageResource(R.drawable.bea_2);
                imageView3.setImageResource(R.drawable.bea_3);
                imageView4.setImageResource(R.drawable.bea_4);
                imageView5.setImageResource(R.drawable.bea_5);
                break;
            case 9:
                imageView.setImageResource(R.drawable.h_bloodseeker_sb);
                imageView1.setImageResource(R.drawable.bs_1);
                imageView2.setImageResource(R.drawable.bs_2);
                imageView3.setImageResource(R.drawable.bs_3);
                imageView4.setImageResource(R.drawable.bs_4);
                break;
            case 10 :
                imageView.setImageResource(R.drawable.h_bounty_hunter_sb);
                imageView1.setImageResource(R.drawable.bh_1);
                imageView2.setImageResource(R.drawable.bh_2);
                imageView3.setImageResource(R.drawable.bh_3);
                imageView4.setImageResource(R.drawable.bh_4);
                break;
            case 11:
                imageView.setImageResource(R.drawable.h_brewmaster_sb);
                imageView1.setImageResource(R.drawable.brew_1);
                imageView2.setImageResource(R.drawable.brew_2);
                imageView3.setImageResource(R.drawable.brew_3);
                imageView4.setImageResource(R.drawable.brew_4);
                break;
            case 12 :
                imageView.setImageResource(R.drawable.h_bristleback_sb);
                imageView1.setImageResource(R.drawable.bris_1);
                imageView2.setImageResource(R.drawable.bris_2);
                imageView3.setImageResource(R.drawable.bris_3);
                imageView4.setImageResource(R.drawable.bris_4);
                break;
            case 13:
                imageView.setImageResource(R.drawable.h_broodmother_sb);
                imageView1.setImageResource(R.drawable.bro_1);
                imageView2.setImageResource(R.drawable.bro_2);
                imageView3.setImageResource(R.drawable.bro_3);
                imageView4.setImageResource(R.drawable.bro_4);
                break;
            case 14 :
                imageView.setImageResource(R.drawable.h_cent_sb);
                imageView1.setImageResource(R.drawable.cent_1);
                imageView2.setImageResource(R.drawable.cent_2);
                imageView3.setImageResource(R.drawable.cent_3);
                imageView4.setImageResource(R.drawable.cent_4);
                break;
            case 15:
                imageView.setImageResource(R.drawable.h_chaos_knight_sb);
                imageView1.setImageResource(R.drawable.ck_1);
                imageView2.setImageResource(R.drawable.ck_2);
                imageView3.setImageResource(R.drawable.ck_3);
                imageView4.setImageResource(R.drawable.ck_4);
                break;
            case 16 :
                imageView.setImageResource(R.drawable.h_chen_sb);
                imageView1.setImageResource(R.drawable.chen_1);
                imageView2.setImageResource(R.drawable.chen_2);
                imageView3.setImageResource(R.drawable.chen_3);
                imageView4.setImageResource(R.drawable.chen_4);
                imageView5.setImageResource(R.drawable.chen_5);
                break;
            case 17:
                imageView.setImageResource(R.drawable.h_clinkz_sb);
                imageView1.setImageResource(R.drawable.clin_1);
                imageView2.setImageResource(R.drawable.clin_2);
                imageView3.setImageResource(R.drawable.clin_3);
                imageView4.setImageResource(R.drawable.clin_4);
                break;
            case 18 :
                imageView.setImageResource(R.drawable.h_clockwork_sb);
                imageView1.setImageResource(R.drawable.clk_1);
                imageView2.setImageResource(R.drawable.clk_2);
                imageView3.setImageResource(R.drawable.clk_3);
                imageView4.setImageResource(R.drawable.clk_4);
                break;
            case 19:
                imageView.setImageResource(R.drawable.h_crystal_maiden_sb);
                imageView1.setImageResource(R.drawable.cm_1);
                imageView2.setImageResource(R.drawable.cm2);
                imageView3.setImageResource(R.drawable.cm3);
                imageView4.setImageResource(R.drawable.cm4);
                break;
            case 20 :
                imageView.setImageResource(R.drawable.h_dark_seer_sb);
                imageView1.setImageResource(R.drawable.ds1);
                imageView2.setImageResource(R.drawable.ds2);
                imageView3.setImageResource(R.drawable.ds3);
                imageView4.setImageResource(R.drawable.ds4);
                break;
            case 21:
                imageView.setImageResource(R.drawable.h_dazzle_sb);
                imageView1.setImageResource(R.drawable.daz1);
                imageView2.setImageResource(R.drawable.daz2);
                imageView3.setImageResource(R.drawable.daz3);
                imageView4.setImageResource(R.drawable.daz4);
                break;
            case 22 :
                imageView.setImageResource(R.drawable.h_death_prophet_sb);
                imageView1.setImageResource(R.drawable.dp1);
                imageView2.setImageResource(R.drawable.dp2);
                imageView3.setImageResource(R.drawable.dp3);
                imageView4.setImageResource(R.drawable.dp4);
                break;
            case 23:
                imageView.setImageResource(R.drawable.h_disruptor_sb);
                imageView1.setImageResource(R.drawable.dis1);
                imageView2.setImageResource(R.drawable.dis2);
                imageView3.setImageResource(R.drawable.dis3);
                imageView4.setImageResource(R.drawable.dis4);
                break;
            case 24 :
                imageView.setImageResource(R.drawable.h_doom_bringer_sb);
                imageView1.setImageResource(R.drawable.doom1);
                imageView2.setImageResource(R.drawable.doom2);
                imageView3.setImageResource(R.drawable.doom3);
                imageView4.setImageResource(R.drawable.doom4);
                break;
            case 25:
                imageView.setImageResource(R.drawable.h_dragon_knight_sb);
                imageView1.setImageResource(R.drawable.dk1);
                imageView2.setImageResource(R.drawable.dk2);
                imageView3.setImageResource(R.drawable.dk3);
                imageView4.setImageResource(R.drawable.dk4);
                break;
            case 26 :
                imageView.setImageResource(R.drawable.h_drow_ranger_sb);
                imageView1.setImageResource(R.drawable.dr1);
                imageView2.setImageResource(R.drawable.dr2);
                imageView3.setImageResource(R.drawable.dr3);
                imageView4.setImageResource(R.drawable.dr4);
                break;
            case 27:
                imageView.setImageResource(R.drawable.h_earth_spirit_sb);
                imageView1.setImageResource(R.drawable.eas1);
                imageView2.setImageResource(R.drawable.eas2);
                imageView3.setImageResource(R.drawable.eas3);
                imageView4.setImageResource(R.drawable.eas4);
                imageView5.setImageResource(R.drawable.eas5);
                break;
            case 28 :
                imageView.setImageResource(R.drawable.h_earthshaker_sb);
                imageView1.setImageResource(R.drawable.es1);
                imageView2.setImageResource(R.drawable.es2);
                imageView3.setImageResource(R.drawable.es3);
                imageView4.setImageResource(R.drawable.es4);
                break;
            case 29:
                imageView.setImageResource(R.drawable.h_elder_titan_sb);
                imageView1.setImageResource(R.drawable.et1);
                imageView2.setImageResource(R.drawable.et2);
                imageView3.setImageResource(R.drawable.et3);
                imageView4.setImageResource(R.drawable.et4);
                imageView5.setImageResource(R.drawable.et5);
                break;
            case 30 :
                imageView.setImageResource(R.drawable.h_ember_spirit_sb);
                imageView1.setImageResource(R.drawable.em1);
                imageView2.setImageResource(R.drawable.em2);
                imageView3.setImageResource(R.drawable.em3);
                imageView4.setImageResource(R.drawable.em4);
                imageView5.setImageResource(R.drawable.em5);
                break;
            case 31:
                imageView.setImageResource(R.drawable.h_enchantress_sb);
                imageView1.setImageResource(R.drawable.ench1);
                imageView2.setImageResource(R.drawable.ench2);
                imageView3.setImageResource(R.drawable.ench3);
                imageView4.setImageResource(R.drawable.ench4);
                break;
            case 32 :
                imageView.setImageResource(R.drawable.h_enigma_sb);
                imageView1.setImageResource(R.drawable.en1);
                imageView2.setImageResource(R.drawable.en2);
                imageView3.setImageResource(R.drawable.en3);
                imageView4.setImageResource(R.drawable.en4);
                break;
            case 33:
                imageView.setImageResource(R.drawable.h_faceless_void_sb);
                imageView1.setImageResource(R.drawable.fv1);
                imageView2.setImageResource(R.drawable.fv2);
                imageView3.setImageResource(R.drawable.fv3);
                imageView4.setImageResource(R.drawable.fv4);
                break;
            case 34 :
                imageView.setImageResource(R.drawable.h_gyrocopter_sb);
                imageView1.setImageResource(R.drawable.gy1);
                imageView2.setImageResource(R.drawable.gy2);
                imageView3.setImageResource(R.drawable.gy3);
                imageView4.setImageResource(R.drawable.gy4);
                break;
            case 35:
                imageView.setImageResource(R.drawable.h_huskar_sb);
                imageView1.setImageResource(R.drawable.hus1);
                imageView2.setImageResource(R.drawable.hus2);
                imageView3.setImageResource(R.drawable.hus3);
                imageView4.setImageResource(R.drawable.hus4);
                break;
            case 36 :
                imageView.setImageResource(R.drawable.h_invoker_sb);
                imageView1.setImageResource(R.drawable.in1);
                imageView2.setImageResource(R.drawable.in2);
                imageView3.setImageResource(R.drawable.in3);
                imageView4.setImageResource(R.drawable.in4);
                break;
            case 37:
                imageView.setImageResource(R.drawable.h_io_sb);
                imageView1.setImageResource(R.drawable.io1);
                imageView2.setImageResource(R.drawable.io2);
                imageView3.setImageResource(R.drawable.io3);
                imageView4.setImageResource(R.drawable.io4);
                break;
            case 38 :
                imageView.setImageResource(R.drawable.h_jakiro_sb);
                imageView1.setImageResource(R.drawable.jak1);
                imageView2.setImageResource(R.drawable.jak2);
                imageView3.setImageResource(R.drawable.jak3);
                imageView4.setImageResource(R.drawable.jak4);
                break;
            case 39:
                imageView.setImageResource(R.drawable.h_juggernaut_sb);
                imageView1.setImageResource(R.drawable.jugg1);
                imageView2.setImageResource(R.drawable.jugg2);
                imageView3.setImageResource(R.drawable.jugg3);
                imageView4.setImageResource(R.drawable.jugg4);
                break;
            case 40 :
                imageView.setImageResource(R.drawable.h_keeper_of_the_light_sb);
                imageView1.setImageResource(R.drawable.kotl1);
                imageView2.setImageResource(R.drawable.kotl2);
                imageView3.setImageResource(R.drawable.kotl3);
                imageView4.setImageResource(R.drawable.kotl4);
                imageView5.setImageResource(R.drawable.kotl5);
                break;
            case 41:
                imageView.setImageResource(R.drawable.h_kunkka_sb);
                imageView1.setImageResource(R.drawable.kunk1);
                imageView2.setImageResource(R.drawable.kunk2);
                imageView3.setImageResource(R.drawable.kunk3);
                imageView4.setImageResource(R.drawable.kunk4);
                break;
            case 42 :
                imageView.setImageResource(R.drawable.h_legion_commander_sb);
                imageView1.setImageResource(R.drawable.lc1);
                imageView2.setImageResource(R.drawable.lc2);
                imageView3.setImageResource(R.drawable.lc3);
                imageView4.setImageResource(R.drawable.lc4);
                break;
            case 43:
                imageView.setImageResource(R.drawable.h_leshrac_sb);
                imageView1.setImageResource(R.drawable.lesh1);
                imageView2.setImageResource(R.drawable.lesh2);
                imageView3.setImageResource(R.drawable.lesh3);
                imageView4.setImageResource(R.drawable.lesh4);
                break;
            case 44 :
                imageView.setImageResource(R.drawable.h_lich_sb);
                imageView1.setImageResource(R.drawable.lich1);
                imageView2.setImageResource(R.drawable.lich2);
                imageView3.setImageResource(R.drawable.lich3);
                imageView4.setImageResource(R.drawable.lich4);
                break;
            case 45:
                imageView.setImageResource(R.drawable.h_life_stealer_sb);
                imageView1.setImageResource(R.drawable.ls1);
                imageView2.setImageResource(R.drawable.ls2);
                imageView3.setImageResource(R.drawable.ls3);
                imageView4.setImageResource(R.drawable.ls4);
                break;
            case 46 :
                imageView.setImageResource(R.drawable.h_lina_sb);
                imageView1.setImageResource(R.drawable.lna1);
                imageView2.setImageResource(R.drawable.lna2);
                imageView3.setImageResource(R.drawable.lna3);
                imageView4.setImageResource(R.drawable.lna4);
                break;
            case 47:
                imageView.setImageResource(R.drawable.h_lion_sb);
                imageView1.setImageResource(R.drawable.lion1);
                imageView2.setImageResource(R.drawable.lion2);
                imageView3.setImageResource(R.drawable.lion3);
                imageView4.setImageResource(R.drawable.lion4);
                break;
            case 48 :
                imageView.setImageResource(R.drawable.h_lone_druid_sb);
                imageView1.setImageResource(R.drawable.ld1);
                imageView2.setImageResource(R.drawable.ld2);
                imageView3.setImageResource(R.drawable.ld3);
                imageView4.setImageResource(R.drawable.ld4);
                imageView5.setImageResource(R.drawable.ld5);
                break;
            case 49:
                imageView.setImageResource(R.drawable.h_luna_sb);
                imageView1.setImageResource(R.drawable.luna1);
                imageView2.setImageResource(R.drawable.luna2);
                imageView3.setImageResource(R.drawable.luna3);
                imageView4.setImageResource(R.drawable.luna4);
                break;
            case 50 :
                imageView.setImageResource(R.drawable.h_lycan_sb);
                imageView1.setImageResource(R.drawable.ly1);
                imageView2.setImageResource(R.drawable.ly2);
                imageView3.setImageResource(R.drawable.ly3);
                imageView4.setImageResource(R.drawable.ly4);
                break;
            case 51:
                imageView.setImageResource(R.drawable.h_magnataur_sb);
                imageView1.setImageResource(R.drawable.mag1);
                imageView2.setImageResource(R.drawable.mag2);
                imageView3.setImageResource(R.drawable.mag3);
                imageView4.setImageResource(R.drawable.mag4);
                break;
            case 52 :
                imageView.setImageResource(R.drawable.h_medusa_sb);
                imageView1.setImageResource(R.drawable.med1);
                imageView2.setImageResource(R.drawable.med2);
                imageView3.setImageResource(R.drawable.med3);
                imageView4.setImageResource(R.drawable.med4);
                break;
            case 53:
                imageView.setImageResource(R.drawable.h_meepo_sb);
                imageView1.setImageResource(R.drawable.meep1);
                imageView2.setImageResource(R.drawable.meep2);
                imageView3.setImageResource(R.drawable.meep3);
                imageView4.setImageResource(R.drawable.meep4);
                break;
            case 54 :
                imageView.setImageResource(R.drawable.h_mirana_sb);
                imageView1.setImageResource(R.drawable.mir1);
                imageView2.setImageResource(R.drawable.mir2);
                imageView3.setImageResource(R.drawable.mir3);
                imageView4.setImageResource(R.drawable.mir4);
                break;
            case 55:
                imageView.setImageResource(R.drawable.h_morphling_sb);
                imageView1.setImageResource(R.drawable.mor1);
                imageView2.setImageResource(R.drawable.mor2);
                imageView3.setImageResource(R.drawable.mor3);
                imageView4.setImageResource(R.drawable.mor4);
                imageView5.setImageResource(R.drawable.mor5);
                break;
            case 56 :
                imageView.setImageResource(R.drawable.h_naga_siren_sb);
                imageView1.setImageResource(R.drawable.naga1);
                imageView2.setImageResource(R.drawable.naga2);
                imageView3.setImageResource(R.drawable.naga3);
                imageView4.setImageResource(R.drawable.naga4);
                break;
            case 57:
                imageView.setImageResource(R.drawable.h_nature_prophet_sb);
                imageView1.setImageResource(R.drawable.np1);
                imageView2.setImageResource(R.drawable.np2);
                imageView3.setImageResource(R.drawable.np3);
                imageView4.setImageResource(R.drawable.np4);
                break;
            case 58 :
                imageView.setImageResource(R.drawable.h_necrolyte_sb);
                imageView1.setImageResource(R.drawable.necro1);
                imageView2.setImageResource(R.drawable.necro2);
                imageView3.setImageResource(R.drawable.necro3);
                imageView4.setImageResource(R.drawable.necro4);
                break;
            case 59:
                imageView.setImageResource(R.drawable.h_night_stalker_sb);
                imageView1.setImageResource(R.drawable.ns1);
                imageView2.setImageResource(R.drawable.ns2);
                imageView3.setImageResource(R.drawable.ns3);
                imageView4.setImageResource(R.drawable.ns4);
                break;
            case 60 :
                imageView.setImageResource(R.drawable.h_nyx_assassin_sb);
                imageView1.setImageResource(R.drawable.nyx1);
                imageView2.setImageResource(R.drawable.nyx2);
                imageView3.setImageResource(R.drawable.nyx3);
                imageView4.setImageResource(R.drawable.nyx4);
                break;
            case 61:
                imageView.setImageResource(R.drawable.h_ogre_magi_sb);
                imageView1.setImageResource(R.drawable.ogre1);
                imageView2.setImageResource(R.drawable.ogre2);
                imageView3.setImageResource(R.drawable.ogre3);
                imageView4.setImageResource(R.drawable.ogre4);
                imageView5.setImageResource(R.drawable.ogre5);
                break;
            case 62:
                imageView.setImageResource(R.drawable.h_omniknight_sb);
                imageView1.setImageResource(R.drawable.omni1);
                imageView2.setImageResource(R.drawable.omni2);
                imageView3.setImageResource(R.drawable.omni3);
                imageView4.setImageResource(R.drawable.omni4);
                break;
            case 63:
                imageView.setImageResource(R.drawable.h_oracle_sb);
                imageView1.setImageResource(R.drawable.orac1);
                imageView2.setImageResource(R.drawable.orac2);
                imageView3.setImageResource(R.drawable.orac3);
                imageView4.setImageResource(R.drawable.orac4);
                break;
            case 64:
                imageView.setImageResource(R.drawable.h_outworld_devourer_sb);
                imageView1.setImageResource(R.drawable.od1);
                imageView2.setImageResource(R.drawable.od2);
                imageView3.setImageResource(R.drawable.od3);
                imageView4.setImageResource(R.drawable.od4);
                break;
            case 65:
                imageView.setImageResource(R.drawable.h_phantom_assassin_sb);
                imageView1.setImageResource(R.drawable.pa1);
                imageView2.setImageResource(R.drawable.pa2);
                imageView3.setImageResource(R.drawable.pa3);
                imageView4.setImageResource(R.drawable.pa4);
                break;
            case 66:
                imageView.setImageResource(R.drawable.h_phantom_lancer_sb);
                imageView1.setImageResource(R.drawable.pl1);
                imageView2.setImageResource(R.drawable.pl2);
                imageView3.setImageResource(R.drawable.pl3);
                imageView4.setImageResource(R.drawable.pl4);
                break;
            case 67:
                imageView.setImageResource(R.drawable.h_pheonix_sb);
                imageView1.setImageResource(R.drawable.ph1);
                imageView2.setImageResource(R.drawable.ph2);
                imageView3.setImageResource(R.drawable.ph3);
                imageView4.setImageResource(R.drawable.ph4);
                break;
            case 68:
                imageView.setImageResource(R.drawable.h_puck_sb);
                imageView1.setImageResource(R.drawable.puck1);
                imageView2.setImageResource(R.drawable.puck2);
                imageView3.setImageResource(R.drawable.puck3);
                imageView4.setImageResource(R.drawable.puck4);
                imageView5.setImageResource(R.drawable.puck5);
                break;
            case 69:
                imageView.setImageResource(R.drawable.h_pudge_sb);
                imageView1.setImageResource(R.drawable.pud1);
                imageView2.setImageResource(R.drawable.pud2);
                imageView3.setImageResource(R.drawable.pud3);
                imageView4.setImageResource(R.drawable.pud4);
                break;
            case 70:
                imageView.setImageResource(R.drawable.h_pugna_sb);
                imageView1.setImageResource(R.drawable.pug1);
                imageView2.setImageResource(R.drawable.pug2);
                imageView3.setImageResource(R.drawable.pug3);
                imageView4.setImageResource(R.drawable.pug4);
                break;
            case 71:
                imageView.setImageResource(R.drawable.h_queenofpain_sb);
                imageView1.setImageResource(R.drawable.qop1);
                imageView2.setImageResource(R.drawable.qop2);
                imageView3.setImageResource(R.drawable.qop3);
                imageView4.setImageResource(R.drawable.qop4);
                break;
            case 72:
                imageView.setImageResource(R.drawable.h_razor_sb);
                imageView1.setImageResource(R.drawable.raz1);
                imageView2.setImageResource(R.drawable.raz2);
                imageView3.setImageResource(R.drawable.raz3);
                imageView4.setImageResource(R.drawable.raz4);
                break;
            case 73:
                imageView.setImageResource(R.drawable.h_riki_sb);
                imageView1.setImageResource(R.drawable.rik1);
                imageView2.setImageResource(R.drawable.rik2);
                imageView3.setImageResource(R.drawable.rik3);
                imageView4.setImageResource(R.drawable.rik4);
                break;
            case 74:
                imageView.setImageResource(R.drawable.h_rubick_sb);
                imageView1.setImageResource(R.drawable.rub1);
                imageView2.setImageResource(R.drawable.rub2);
                imageView3.setImageResource(R.drawable.rub3);
                imageView4.setImageResource(R.drawable.rub4);
                imageView5.setImageResource(R.drawable.rub5);
                break;
            case 75:
                imageView.setImageResource(R.drawable.h_sand_king_sb);
                imageView1.setImageResource(R.drawable.sk1);
                imageView2.setImageResource(R.drawable.sk2);
                imageView3.setImageResource(R.drawable.sk3);
                imageView4.setImageResource(R.drawable.sk4);
                break;
            case 76:
                imageView.setImageResource(R.drawable.h_shadow_demon_sb);
                imageView1.setImageResource(R.drawable.sd1);
                imageView2.setImageResource(R.drawable.sd2);
                imageView3.setImageResource(R.drawable.sd3);
                imageView4.setImageResource(R.drawable.sd4);
                imageView5.setImageResource(R.drawable.sd5);
                break;
            case 77:
                imageView.setImageResource(R.drawable.h_shadow_fiend_sb);
                imageView1.setImageResource(R.drawable.sf1);
                imageView2.setImageResource(R.drawable.sf2);
                imageView3.setImageResource(R.drawable.sf3);
                imageView4.setImageResource(R.drawable.sf4);
                break;
            case 78:
                imageView.setImageResource(R.drawable.h_shadow_shaman_sb);
                imageView1.setImageResource(R.drawable.aphotic_shield_icon);
                imageView2.setImageResource(R.drawable.borrowed_time_icon);
                imageView3.setImageResource(R.drawable.curse_of_avernus_icon);
                imageView4.setImageResource(R.drawable.mist_coil_icon);
                break;
            case 79:
                imageView.setImageResource(R.drawable.h_silencer_sb);
                imageView1.setImageResource(R.drawable.sil1);
                imageView2.setImageResource(R.drawable.sil22);
                imageView3.setImageResource(R.drawable.sil3);
                imageView4.setImageResource(R.drawable.sil4);
                imageView5.setImageResource(R.drawable.sil5);
                break;
            case 80:
                imageView.setImageResource(R.drawable.h_skywrath_mage_sb);
                imageView1.setImageResource(R.drawable.sky1);
                imageView2.setImageResource(R.drawable.sky2);
                imageView3.setImageResource(R.drawable.sky3);
                imageView4.setImageResource(R.drawable.sky4);
                break;
            case 81:
                imageView.setImageResource(R.drawable.h_slardar_sb);
                imageView1.setImageResource(R.drawable.slar1);
                imageView2.setImageResource(R.drawable.slar2);
                imageView3.setImageResource(R.drawable.slar3);
                imageView4.setImageResource(R.drawable.slar4);
                break;
            case 82:
                imageView.setImageResource(R.drawable.h_slark_sb);
                imageView1.setImageResource(R.drawable.slark1);
                imageView2.setImageResource(R.drawable.slark2);
                imageView3.setImageResource(R.drawable.slark3);
                imageView4.setImageResource(R.drawable.slark4);
                break;
            case 83:
                imageView.setImageResource(R.drawable.h_sniper_sb);
                imageView1.setImageResource(R.drawable.sni1);
                imageView2.setImageResource(R.drawable.sni2);
                imageView3.setImageResource(R.drawable.sni3);
                imageView4.setImageResource(R.drawable.sni4);
                break;
            case 84:
                imageView.setImageResource(R.drawable.h_spectre_sb);
                imageView1.setImageResource(R.drawable.spec1);
                imageView2.setImageResource(R.drawable.spec2);
                imageView3.setImageResource(R.drawable.spec3);
                imageView4.setImageResource(R.drawable.spec4);
                imageView5.setImageResource(R.drawable.spec5);
                break;
            case 85:
                imageView.setImageResource(R.drawable.h_spirit_breaker_sb);
                imageView1.setImageResource(R.drawable.sb1);
                imageView2.setImageResource(R.drawable.sb2);
                imageView3.setImageResource(R.drawable.sb3);
                imageView4.setImageResource(R.drawable.sb4);
                break;
            case 86:
                imageView.setImageResource(R.drawable.h_storm_spirit_sb);
                imageView1.setImageResource(R.drawable.sts1);
                imageView2.setImageResource(R.drawable.sts2);
                imageView3.setImageResource(R.drawable.sts3);
                imageView4.setImageResource(R.drawable.sts4);
                break;
            case 87:
                imageView.setImageResource(R.drawable.h_sven_sb);
                imageView1.setImageResource(R.drawable.sven1);
                imageView2.setImageResource(R.drawable.sven2);
                imageView3.setImageResource(R.drawable.sven3);
                imageView4.setImageResource(R.drawable.sven4);
                break;
            case 88:
                imageView.setImageResource(R.drawable.h_techies_sb);
                imageView1.setImageResource(R.drawable.tech1);
                imageView2.setImageResource(R.drawable.tech2);
                imageView3.setImageResource(R.drawable.tech3);
                imageView4.setImageResource(R.drawable.tech4);
                imageView5.setImageResource(R.drawable.tech5);
                break;
            case 89:
                imageView.setImageResource(R.drawable.h_templar_assassin_sb);
                imageView1.setImageResource(R.drawable.ta);
                imageView2.setImageResource(R.drawable.ta2);
                imageView3.setImageResource(R.drawable.ta3);
                imageView4.setImageResource(R.drawable.ta4);
                break;
            case 90:
                imageView.setImageResource(R.drawable.h_terror_blade_sb);
                imageView1.setImageResource(R.drawable.tb1);
                imageView2.setImageResource(R.drawable.tb2);
                imageView3.setImageResource(R.drawable.tb3);
                imageView4.setImageResource(R.drawable.tb4);
                break;
            case 91:
                imageView.setImageResource(R.drawable.h_tidehunter_sb);
                imageView1.setImageResource(R.drawable.tide1);
                imageView2.setImageResource(R.drawable.tide2);
                imageView3.setImageResource(R.drawable.tide3);
                imageView4.setImageResource(R.drawable.tide4);
                break;
            case 92:
                imageView.setImageResource(R.drawable.h_timbersaw_sb);
                imageView1.setImageResource(R.drawable.tim1);
                imageView2.setImageResource(R.drawable.tim2);
                imageView3.setImageResource(R.drawable.tim3);
                imageView4.setImageResource(R.drawable.tim4);
                break;
            case 93:
                imageView.setImageResource(R.drawable.h_tinker_sb);
                imageView1.setImageResource(R.drawable.tin1);
                imageView2.setImageResource(R.drawable.tin2);
                imageView3.setImageResource(R.drawable.tin3);
                imageView4.setImageResource(R.drawable.tin4);
                break;
            case 94:
                imageView.setImageResource(R.drawable.h_tiny_sb);
                imageView1.setImageResource(R.drawable.tiny1);
                imageView2.setImageResource(R.drawable.tiny2);
                imageView3.setImageResource(R.drawable.tiny3);
                imageView4.setImageResource(R.drawable.tiny4);
                break;
            case 95:
                imageView.setImageResource(R.drawable.h_treant_sb);
                imageView1.setImageResource(R.drawable.tre1);
                imageView2.setImageResource(R.drawable.tre2);
                imageView3.setImageResource(R.drawable.tre3);
                imageView4.setImageResource(R.drawable.tre4);
                break;
            case 96:
                imageView.setImageResource(R.drawable.h_troll_warlord_sb);
                imageView1.setImageResource(R.drawable.trl1);
                imageView2.setImageResource(R.drawable.trl2);
                imageView3.setImageResource(R.drawable.trl3);
                imageView4.setImageResource(R.drawable.trl4);
                imageView5.setImageResource(R.drawable.trl5);
                break;
            case 97:
                imageView.setImageResource(R.drawable.h_tusk_sb);
                imageView1.setImageResource(R.drawable.tusk1);
                imageView2.setImageResource(R.drawable.tusk2);
                imageView3.setImageResource(R.drawable.tusk3);
                imageView4.setImageResource(R.drawable.tusk4);
                break;
            case 98:
                imageView.setImageResource(R.drawable.h_underlord_sb);
                imageView1.setImageResource(R.drawable.ud1);
                imageView2.setImageResource(R.drawable.ud2);
                imageView3.setImageResource(R.drawable.ud3);
                imageView4.setImageResource(R.drawable.ud4);
                break;
            case 99:
                imageView.setImageResource(R.drawable.h_undying_sb);
                imageView1.setImageResource(R.drawable.un1);
                imageView2.setImageResource(R.drawable.un2);
                imageView3.setImageResource(R.drawable.un3);
                imageView4.setImageResource(R.drawable.un4);
                break;
            case 100:
                imageView.setImageResource(R.drawable.h_ursa_sb);
                imageView1.setImageResource(R.drawable.ursa1);
                imageView2.setImageResource(R.drawable.ursa2);
                imageView3.setImageResource(R.drawable.ursa3);
                imageView4.setImageResource(R.drawable.ursa4);
                break;
            case 101:
                imageView.setImageResource(R.drawable.h_vengefulspirit_sb);
                imageView1.setImageResource(R.drawable.ven1);
                imageView2.setImageResource(R.drawable.ven2);
                imageView3.setImageResource(R.drawable.ven3);
                imageView4.setImageResource(R.drawable.ven4);
                break;
            case 102:
                imageView.setImageResource(R.drawable.h_venomancer_sb);
                imageView1.setImageResource(R.drawable.veno1);
                imageView2.setImageResource(R.drawable.veno2);
                imageView3.setImageResource(R.drawable.veno3);
                imageView4.setImageResource(R.drawable.veno4);
                break;
            case 103:
                imageView.setImageResource(R.drawable.h_viper_sb);
                imageView1.setImageResource(R.drawable.vip1);
                imageView2.setImageResource(R.drawable.vip2);
                imageView3.setImageResource(R.drawable.vip3);
                imageView4.setImageResource(R.drawable.vip4);
                break;
            case 104:
                imageView.setImageResource(R.drawable.h_visage_sb);
                imageView1.setImageResource(R.drawable.vis1);
                imageView2.setImageResource(R.drawable.vis2);
                imageView3.setImageResource(R.drawable.vis3);
                imageView4.setImageResource(R.drawable.vis4);
                break;
            case 105:
                imageView.setImageResource(R.drawable.h_warlock_sb);
                imageView1.setImageResource(R.drawable.war1);
                imageView2.setImageResource(R.drawable.war2);
                imageView3.setImageResource(R.drawable.war3);
                imageView4.setImageResource(R.drawable.war4);
                break;
            case 106:
                imageView.setImageResource(R.drawable.h_weaver_sb);
                imageView1.setImageResource(R.drawable.we1);
                imageView2.setImageResource(R.drawable.we2);
                imageView3.setImageResource(R.drawable.we3);
                imageView4.setImageResource(R.drawable.we4);
                break;
            case 107:
                imageView.setImageResource(R.drawable.h_windrunner_sb);
                imageView1.setImageResource(R.drawable.wr1);
                imageView2.setImageResource(R.drawable.wr2);
                imageView3.setImageResource(R.drawable.wr3);
                imageView4.setImageResource(R.drawable.wr4);
                break;
            case 108:
                imageView.setImageResource(R.drawable.h_witch_doctor_sb);
                imageView1.setImageResource(R.drawable.wd1);
                imageView2.setImageResource(R.drawable.wd2);
                imageView3.setImageResource(R.drawable.wd3);
                imageView4.setImageResource(R.drawable.wd4);
                break;
            case 109:
                imageView.setImageResource(R.drawable.h_wraith_king_sb);
                imageView1.setImageResource(R.drawable.wk1);
                imageView2.setImageResource(R.drawable.wk2);
                imageView3.setImageResource(R.drawable.wk3);
                imageView4.setImageResource(R.drawable.wk4);
                break;
            case 110:
                imageView.setImageResource(R.drawable.h_ww_sb);
                imageView1.setImageResource(R.drawable.ww1);
                imageView2.setImageResource(R.drawable.ww2);
                imageView3.setImageResource(R.drawable.ww3);
                imageView4.setImageResource(R.drawable.ww4);
                break;
            case 111:
                imageView.setImageResource(R.drawable.h_zeus_sb);
                imageView1.setImageResource(R.drawable.zeus1);
                imageView2.setImageResource(R.drawable.zeus2);
                imageView3.setImageResource(R.drawable.zeus3);
                imageView4.setImageResource(R.drawable.zeus4);
                break;

            default:
                imageView.setImageResource(R.drawable.dotaart);
                textView.setText("You selected Hero 4-~");
        }
    }

    public void setUpInfo(int i){
        String video;
        her = databaseHelper.getInfo(i+1);
        textView.setText(her.getString(her.getColumnIndex("Lore")));
        textView2.setText(her.getString(her.getColumnIndex("Name")));
        skills1.setText(her.getString(her.getColumnIndex("Skill_1")));
        skills2.setText(her.getString(her.getColumnIndex("Skill_2")));
        skills3.setText(her.getString(her.getColumnIndex("Skill_3")));
        skills4.setText(her.getString(her.getColumnIndex("Skill_4")));
        skills5.setText(her.getString(her.getColumnIndex("Skill_5")));
        video = her.getString(her.getColumnIndex("Video"));
        engine = (WebView) findViewById( R.id.webview);
        engine.getSettings().setJavaScriptEnabled(true);
        String playVideo= "<html><body><br> <iframe class=\"youtube-player\" type=\"text/html\" width=\"320\" height=\"180\" src=\"http://www.youtube.com/embed/"+video+"\" frameborder=\"0\"></body></html>";
        engine.loadData(playVideo, "text/html", "utf-8");
    }

    public void switchItem(int i){
        switch(i){
            case 0:
                imageView.setImageResource(R.drawable.i_abyssal);
                break;
            case 1:
                imageView.setImageResource(R.drawable.i_aegis);
                break;
            case 2:
                imageView.setImageResource(R.drawable.i_aether);
                break;
            case 3:
                imageView.setImageResource(R.drawable.i_aghanims);
                break;
            case 4:
                imageView.setImageResource(R.drawable.i_arcane);
                break;
            case 5:
                imageView.setImageResource(R.drawable.i_armlet);
                break;
            case 6:
                imageView.setImageResource(R.drawable.i_assault);
                break;
            case 7:
                imageView.setImageResource(R.drawable.i_banana);
                break;
            case 8:
                imageView.setImageResource(R.drawable.i_bandelven);
                break;
            case 9:
                imageView.setImageResource(R.drawable.i_battlefury);
                break;
            case 10:
                imageView.setImageResource(R.drawable.i_belt_of_strength);
                break;
            case 11:
                imageView.setImageResource(R.drawable.i_black_king);
                break;
            case 12:
                imageView.setImageResource(R.drawable.i_blade_alacrity);
                break;
            case 13:
                imageView.setImageResource(R.drawable.i_blade_attack);
                break;
            case 14:
                imageView.setImageResource(R.drawable.i_blademail);
                break;
            case 15:
                imageView.setImageResource(R.drawable.i_blight);
                break;
            case 16:
                imageView.setImageResource(R.drawable.i_blink);
                break;
            case 17:
                imageView.setImageResource(R.drawable.i_bloodstone);
                break;
            case 18:
                imageView.setImageResource(R.drawable.i_bloodthorn);
                break;
            case 19:
                imageView.setImageResource(R.drawable.i_boots_speed);
                break;
            case 20:
                imageView.setImageResource(R.drawable.i_boots_travel);
                break;
            case 21:
                imageView.setImageResource(R.drawable.i_boots_travel2);
                break;
            case 22:
                imageView.setImageResource(R.drawable.i_bottle);
                break;
            case 23:
                imageView.setImageResource(R.drawable.i_bracer);
                break;
            case 24:
                imageView.setImageResource(R.drawable.i_broadsword);
                break;
            case 25:
                imageView.setImageResource(R.drawable.i_buckler);
                break;
            case 26:
                imageView.setImageResource(R.drawable.i_butterfly);
                break;
            case 27:
                imageView.setImageResource(R.drawable.i_chainmail);
                break;
            case 28:
                imageView.setImageResource(R.drawable.i_cheese);
                break;
            case 29:
                imageView.setImageResource(R.drawable.i_circlet);
                break;
            case 30:
                imageView.setImageResource(R.drawable.i_clarity);
                break;
            case 31:
                imageView.setImageResource(R.drawable.i_claymore);
                break;
            case 32:
                imageView.setImageResource(R.drawable.i_cloak);
                break;
            case 33:
                imageView.setImageResource(R.drawable.i_courier);
                break;
            case 34:
                imageView.setImageResource(R.drawable.i_crimson);
                break;
            case 35:
                imageView.setImageResource(R.drawable.i_crystalys);
                break;
            case 36:
                imageView.setImageResource(R.drawable.i_daedalus);
                break;
            case 37:
                imageView.setImageResource(R.drawable.i_dagon);
                break;
            case 38:
                imageView.setImageResource(R.drawable.i_dagon2);
                break;
            case 39:
                imageView.setImageResource(R.drawable.i_dagon3);
                break;
            case 40:
                imageView.setImageResource(R.drawable.i_dagon4);
                break;
            case 41:
                imageView.setImageResource(R.drawable.i_dagon5);
                break;
            case 42:
                imageView.setImageResource(R.drawable.i_demon);
                break;
            case 43:
                imageView.setImageResource(R.drawable.i_deso);
                break;
            case 44:
                imageView.setImageResource(R.drawable.i_diffusal);
                break;
            case 45:
                imageView.setImageResource(R.drawable.i_diffusal2);
                break;
            case 46:
                imageView.setImageResource(R.drawable.i_divine_rapier);
                break;
            case 47:
                imageView.setImageResource(R.drawable.i_dragon_lance);
                break;
            case 48:
                imageView.setImageResource(R.drawable.i_drums);
                break;
            case 49:
                imageView.setImageResource(R.drawable.i_dust);
                break;
            case 50:
                imageView.setImageResource(R.drawable.i_eaglesong);
                break;
            case 51:
                imageView.setImageResource(R.drawable.i_echo);
                break;
            case 52:
                imageView.setImageResource(R.drawable.i_enchanted_mango);
                break;
            case 53:
                imageView.setImageResource(R.drawable.i_energy_booster);
                break;
            case 54:
                imageView.setImageResource(R.drawable.i_ethereal_blade);
                break;
            case 55:
                imageView.setImageResource(R.drawable.i_euls_scepter);
                break;
            case 56:
                imageView.setImageResource(R.drawable.i_eye_skadi);
                break;
            case 57:
                imageView.setImageResource(R.drawable.i_faerie);
                break;
            case 58:
                imageView.setImageResource(R.drawable.i_flying_cour);
                break;
            case 59:
                imageView.setImageResource(R.drawable.i_force_staff);
                break;
            case 60:
                imageView.setImageResource(R.drawable.i_gaunt);
                break;
            case 61:
                imageView.setImageResource(R.drawable.i_gem);
                break;
            case 62:
                imageView.setImageResource(R.drawable.i_ghost);
                break;
            case 63:
                imageView.setImageResource(R.drawable.i_glimmer);
                break;
            case 64:
                imageView.setImageResource(R.drawable.i_gloves);
                break;
            case 65:
                imageView.setImageResource(R.drawable.i_greaves);
                break;
            case 66:
                imageView.setImageResource(R.drawable.i_hand);
                break;
            case 67:
                imageView.setImageResource(R.drawable.i_headdress);
                break;
            case 68:
                imageView.setImageResource(R.drawable.i_healing_salve);
                break;
            case 69:
                imageView.setImageResource(R.drawable.i_heart);
                break;
            case 70:
                imageView.setImageResource(R.drawable.i_heavens);
                break;
            case 71:
                imageView.setImageResource(R.drawable.i_helm_dom);
                break;
            case 72:
                imageView.setImageResource(R.drawable.i_helm_will);
                break;
            case 73:
                imageView.setImageResource(R.drawable.i_hood);
                break;
            case 74:
                imageView.setImageResource(R.drawable.i_hurricane);
                break;
            case 75:
                imageView.setImageResource(R.drawable.i_hyper);
                break;
            case 76:
                imageView.setImageResource(R.drawable.i_infused);
                break;
            case 77:
                imageView.setImageResource(R.drawable.i_iron_branch);
                break;
            case 78:
                imageView.setImageResource(R.drawable.i_iron_talon);
                break;
            case 79:
                imageView.setImageResource(R.drawable.i_javelin);
                break;
            case 80:
                imageView.setImageResource(R.drawable.i_linkens);
                break;
            case 81:
                imageView.setImageResource(R.drawable.i_lotus);
                break;
            case 82:
                imageView.setImageResource(R.drawable.i_maelstrom);
                break;
            case 83:
                imageView.setImageResource(R.drawable.i_magic_stick);
                break;
            case 84:
                imageView.setImageResource(R.drawable.i_magic_wand);
                break;
            case 85:
                imageView.setImageResource(R.drawable.i_manta);
                break;
            case 86:
                imageView.setImageResource(R.drawable.i_mantle);
                break;
            case 87:
                imageView.setImageResource(R.drawable.i_mask_madness);
                break;
            case 88:
                imageView.setImageResource(R.drawable.i_medallion);
                break;
            case 89:
                imageView.setImageResource(R.drawable.i_mekansm);
                break;
            case 90:
                imageView.setImageResource(R.drawable.i_mithril);
                break;
            case 91:
                imageView.setImageResource(R.drawable.i_mjollnir);
                break;
            case 92:
                imageView.setImageResource(R.drawable.i_monkey);
                break;
            case 93:
                imageView.setImageResource(R.drawable.i_moon);
                break;
            case 94:
                imageView.setImageResource(R.drawable.i_morbid);
                break;
            case 95:
                imageView.setImageResource(R.drawable.i_mystic);
                break;
            case 96:
                imageView.setImageResource(R.drawable.i_necro1);
                break;
            case 97:
                imageView.setImageResource(R.drawable.i_necro2);
                break;
            case 98:
                imageView.setImageResource(R.drawable.i_necro3);
                break;
            case 99:
                imageView.setImageResource(R.drawable.i_null);
                break;
            case 100:
                imageView.setImageResource(R.drawable.i_oblivion);
                break;
            case 101:
                imageView.setImageResource(R.drawable.i_obs);
                break;
            case 102:
                imageView.setImageResource(R.drawable.i_obs_sent);
                break;
            case 103:
                imageView.setImageResource(R.drawable.i_octa);
                break;
            case 104:
                imageView.setImageResource(R.drawable.i_ogre);
                break;
            case 105:
                imageView.setImageResource(R.drawable.i_orb_venom);
                break;
            case 106:
                imageView.setImageResource(R.drawable.i_orchid);
                break;
            case 107:
                imageView.setImageResource(R.drawable.i_pers);
                break;
            case 108:
                imageView.setImageResource(R.drawable.i_phase);
                break;
            case 109:
                imageView.setImageResource(R.drawable.i_pipe);
                break;
            case 110:
                imageView.setImageResource(R.drawable.i_platemail);
                break;
            case 111:
                imageView.setImageResource(R.drawable.i_point_booster);
                break;
            case 112:
                imageView.setImageResource(R.drawable.i_poors);
                break;
            case 113:
                imageView.setImageResource(R.drawable.i_power_treads);
                break;
            case 114:
                imageView.setImageResource(R.drawable.i_quarter);
                break;
            case 115:
                imageView.setImageResource(R.drawable.i_quelling);
                break;
            case 116:
                imageView.setImageResource(R.drawable.i_radiance);
                break;
            case 117:
                imageView.setImageResource(R.drawable.i_reaver);
                break;
            case 118:
                imageView.setImageResource(R.drawable.i_refresher);
                break;
            case 119:
                imageView.setImageResource(R.drawable.i_ring_aquila);
                break;
            case 120:
                imageView.setImageResource(R.drawable.i_ring_basi);
                break;
            case 121:
                imageView.setImageResource(R.drawable.i_ring_health);
                break;
            case 122:
                imageView.setImageResource(R.drawable.i_ring_protect);
                break;
            case 123:
                imageView.setImageResource(R.drawable.i_ring_regen);
                break;
            case 124:
                imageView.setImageResource(R.drawable.i_robe);
                break;
            case 125:
                imageView.setImageResource(R.drawable.i_rod);
                break;
            case 126:
                imageView.setImageResource(R.drawable.i_sacred);
                break;
            case 127:
                imageView.setImageResource(R.drawable.i_sage);
                break;
            case 128:
                imageView.setImageResource(R.drawable.i_sange);
                break;
            case 129:
                imageView.setImageResource(R.drawable.i_sangeayasha);
                break;
            case 130:
                imageView.setImageResource(R.drawable.i_satanic);
                break;
            case 131:
                imageView.setImageResource(R.drawable.i_scythe);
                break;
            case 132:
                imageView.setImageResource(R.drawable.i_shadow_a);
                break;
            case 133:
                imageView.setImageResource(R.drawable.i_shadow_b);
                break;
            case 134:
                imageView.setImageResource(R.drawable.i_shivas);
                break;
            case 135:
                imageView.setImageResource(R.drawable.i_silver_edge);
                break;
            case 136:
                imageView.setImageResource(R.drawable.i_skull);
                break;
            case 137:
                imageView.setImageResource(R.drawable.i_slippers);
                break;
            case 138:
                imageView.setImageResource(R.drawable.i_smoke);
                break;
            case 139:
                imageView.setImageResource(R.drawable.i_solar);
                break;
            case 140:
                imageView.setImageResource(R.drawable.i_soul_booster);
                break;
            case 141:
                imageView.setImageResource(R.drawable.i_soul_ring);
                break;
            case 142:
                imageView.setImageResource(R.drawable.i_staff);
                break;
            case 143:
                imageView.setImageResource(R.drawable.i_stout);
                break;
            case 144:
                imageView.setImageResource(R.drawable.i_talisman);
                break;
            case 145:
                imageView.setImageResource(R.drawable.i_tango);
                break;
            case 146:
                imageView.setImageResource(R.drawable.i_tango_s);
                break;
            case 147:
                imageView.setImageResource(R.drawable.i_tome);
                break;
            case 148:
                imageView.setImageResource(R.drawable.i_town);
                break;
            case 149:
                imageView.setImageResource(R.drawable.i_tranquil);
                break;
            case 150:
                imageView.setImageResource(R.drawable.i_ulti);
                break;
            case 151:
                imageView.setImageResource(R.drawable.i_urn);
                break;
            case 152:
                imageView.setImageResource(R.drawable.i_vanguard);
                break;
            case 153:
                imageView.setImageResource(R.drawable.i_veil);
                break;
            case 154:
                imageView.setImageResource(R.drawable.i_vitality);
                break;
            case 155:
                imageView.setImageResource(R.drawable.i_vladmir);
                break;
            case 156:
                imageView.setImageResource(R.drawable.i_void);
                break;
            case 157:
                imageView.setImageResource(R.drawable.i_wind);
                break;
            case 158:
                imageView.setImageResource(R.drawable.i_wraith);
                break;
            case 159:
                imageView.setImageResource(R.drawable.i_yasha);
                break;
            default:
                imageView.setImageResource(R.drawable.i_abyssal);
                break;

        }
    }

    public void setUpItem(int i){
        it = databaseHelper.getItemInfo(i+1);
        textView.setText(it.getString(it.getColumnIndex("Lore")));
        textView2.setText(it.getString(it.getColumnIndex("Name")));
        skills1.setText(it.getString(it.getColumnIndex("Ability_1")));
        skills1.setTextSize(20);
        skills2.setText(it.getString(it.getColumnIndex("Desc_1")));
        skills3.setText(it.getString(it.getColumnIndex("Ability_2")));
        skills3.setTextSize(20);
        skills4.setText(it.getString(it.getColumnIndex("Desc_2")));
        skillsIntro.setText(null);
        skillHead.setText("Abilities");
    }
}

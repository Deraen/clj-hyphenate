(ns clj-hyphenate.patterns.sr-latn
  "This pattern is imported from Hyphenator.js. Original comment follows:

   For questions about the serbian latin hyphenation patterns ask Sonja Keljević (sonja dot keljevic at gmail dot com) "
  (:require [clj-hyphenate.patterns :as pat]))

(def rules'
{:leftmin 2,
 :rightmin 2,
 :specialChars "žšđćč",
 :patterns
 {7
  "3g2milj_u3s4rđ_u3s4rt3g2njev3g2njav3g2njes3g2njet3g2nječ3g2njil3g2njio_u3s4rp3g2njit3g2njur3b2djet3b2denj3k2njiž3k2njig_u3s4rn_u3s4rk_u3s4rž_u3s4ra_a4e2ro3t2mast_u3s4rd3t2mulj3h2tjev3h2tjel3h2tenj_u3s4re3h2teti3č2lanj_u3g2mi_za3g2n_be2z3j_be2z3l_be2z3m_be2z3n_u3s4ko_be2z3r_be2z3v_izd2no_be2z3b_be2z3d_be2z3g_be2z3i_be2z3o_be2z3u_izd2nu_izd2na_o2d3že_o2d3žv_o2d3ži_u3z4rn_u2z3nj_nag2nj_u2z3lj_be2s3c_be2s3k_be2s3p_be2s3t_ra2š3č_ra2š3ć_be2š3ć_be2š3č_iz3g2n_a2b3ju_i2z3lj_i2z3nj_a2b3la_a2b3lu_ra2s3t_ra2s3p_ra2s3k_ra2s3c_ra2z3v_ra2z3r_su2b3l_ra2z3n_ra2z3m_i3z4iđ_i3z4id_ra2z3l_su2b3a_ra2z3j_ra2z3i_ra2z3g_ra2z3e_ra2z3d_ra2z3b_ra2ž3đ_a2nart_po2d3j3g2nezd_a2neor_o2d3uč_o2d3um_o2d3ul_o2d3uk_o3d4rž_o3d4rt_o3d4rp_o3d4rn_o3d4rl_o2d3ok_od3g2n_od3m2n_o2b3ud_o2b3už_o2b3uz3g2nežđ_o3b4rč_o3b4rš_o3b4rt_o3b4rs_o3b4rn_o3b4rl_o3b4rk_o3b4rđ_o3b4rv_o2b3lj_po3g2n_na2j3u_i3z4un_na2j3o_po3r2đ_po3r2v_na2j3i_na2j3e_na2j3a_i2n3eg_i2n3ed_na2d3v_na2d3l_po3m2n_i3s4uš_i3s4ut_i3s4us_i3s4uk_i3s4rk_i3s4me",
  4
  "2hvs2gr_2gv_2hj_2hl_2hvp2hr_2hv_2hvn2kl_2hvm2kr_2kv_2tj_2tl_2hvk2tr_2tv_h2ljt2ljp2lj2d1b2d1c2d1dv2lj2d1f2d1g2d1hb2lj2d1k2d1m2d1nf2lj2d1p2d1s2d1tm2ljd2lj2b1ž2b1b2b1c2b1d2b1f2b1g2b1h2b1k2b1m2b1n2b1p2b1s2b1t2b1v2hvh2hvg2b1z2b1š2b1đ2b1ć2b1č2f1ž2f1b2f1c2f1d2f1f2f1g2f1h2f1k2f1m2f1n2f1p2f1s2f1t2f1v2hvf2hvd2f1z2f1š2f1đ2f1ć2f1č2m1ž2m1b2m1c2m1d2m1f2m1g2m1h2m1k2m1m2m1n2m1p2m1s2m1t2m1v2hvc2hvb2m1z2m1š2m1đ2m1ć2m1č2p1ž2p1b2p1c2p1d2p1f2p1g2p1h2p1k2p1m2p1n2p1p2p1s2p1t2p1v2ščž2ščč2p1z2p1š2p1đ2p1ć2p1č2v1ž2v1b2v1c2v1d2v1f2v1g2v1h2v1k2v1m2v1n2v1p2v1s2v1t2v1v2ščć2ščđ2v1z2v1š2v1đ2v1ć2v1č2bj_2bl_2ščš2br_2fj_2fl_2ščz2fr_2mj_2ml_2ščt2mr_2pj_2pl_2ščs2pr_2vj_2vl_2ščr2vr_2dž_2d1z2d1š2d1đ2d1ć2d1č2g1žs2lj2g1b2g1c2g1ds2nj2s1ž2s1b2s1d2s1f2s1g2s1h2s1s2ščp2s1z2s1š2s1đ2s1ć2s1č2sj_2sk_2sl_2sm_2sn_2sp_2ščn2sr_2st_2sv_2ščm2sc_2g1f2g1g2g1h2g1k2g1m2g1n2g1pz2lj2g1s2g1tz2nj2z1ž2z1c2z1f2z1h2z1k2z1p2z1s2z1t2ščl2z1z2z1š2z1đ2z1ć2z1č2zj_2zl_2zm_2zn_2ščk2zr_2zv_2ščj2zb_2zd_2zg_g2ljk2lj2g1z2g1š2g1đ2g1ćš2lj2g1č2h1žš2nj2h1b2h1c2š1ž2š1b2š1d2š1f2š1g2š1h2š1s2ščh2š1z2š1š2š1đ2š1j2š1r2šk_2šl_2šm_2šn_2šp_2ščg2št_2šv_2ščf2šć_2šč_2šc_2h1d2h1f2h1g2h1h2h1k2h1mž2lj2h1nž2nj2h1p2ž1ž2ž1c2ž1f2ž1h2ž1k2ž1p2ž1s2ž1t2ščd2ž1z2ž1š2ž1ć2ž1č2ž1j2ž1r2žl_2žm_2žn_2ščc2žv_2ščb2žđ_2žb_2žd_2žg_2h1s2h1t2hvž2c1ž2c1b2c1c2c1d2c1f2c1g2c1h2c1k2c1l2c1m2c1n2c1p2šcž2c1s2c1t2šcč2šcć2c1z2c1š2c1đ2c1ć2c1č2cj_2cr_2cv_2hvč2č1ž2č1b2č1c2č1d2č1f2č1g2č1h2č1j2č1k2č1l2č1m2č1n2č1p2šcđ2č1r2č1s2č1t2šcš2šcz2č1z2č1š2č1đ2č1ć2č1č2čv_2j1ž2j1b2j1c2j1d2j1f2j1g2j1h2j1j2j1k2j1l2j1m2j1n2j1p2šct2j1r2j1s2j1t2j1v2šcs2šcr2j1z2j1š2j1đ2j1ć2j1č2l1ž2l1b2l1c2l1d2l1f2l1g2l1h2l1k2l1l2l1m2l1n2l1p2šcp2l1r2l1s2l1t2l1v2šcn2šcm2l1z2l1š2l1đ2l1ć2l1č2n1ž2n1b2n1c2n1d2n1f2n1g2n1h2n1k2n1l2n1m2n1n2n1p2šcl2n1r2n1s2n1t2n1v2šck2šch2n1z2n1š2n1đ2n1ć2n1č2šcg2šcf2šcd2šcc2šcb2scž2scč2scć2scđ2scš2scz2sct2scs2scr2scp2scn2scm2scl2sck2sch2scg2scf2scd2scc2scb2r1ž2r1b2r1c2r1d2r1f2r1g2r1h2r1j2r1k2r1l2r1m2r1n2r1p2šmž2r1r2r1s2r1t2r1v2šmč2šmć2r1z2r1š2r1đ2r1ć2r1č2šmđ2šmš2šmz2šmv2šmt2šms2šmp2šmn2šmm2šmk2šmh2šmg2šmf2šmd2šmc2šmb2zmž2zmč2zmć2zmđ2zmš2zmz2zmv2zmt2zms2zmp2zmn2zmm2zmk2zmh2zmg2zmf2zmd2zmc2zmb2smž2smč2smć2smđ2smš2smz2smv2smt2sms2smp2smn2smm2smk2smh2smg2đ1ž2đ1b2đ1c2đ1d2đ1f2đ1g2đ1h2đ1j2đ1k2đ1l2đ1m2đ1n2đ1p2smf2đ1r2đ1s2đ1t2đ1v2smd2smc2đ1z2đ1š2đ1đ2đ1ć2đ1č2ć1ž2ć1b2ć1c2ć1d2ć1f2ć1g2ć1h2ć1j2ć1k2ć1l2ć1m2ć1n2ć1p2smb2ć1r2ć1s2ć1t2ć1v2žmž2žmč2ć1z2ć1š2ć1đ2ć1ć2ć1č2h1z2h1š2h1đ2h1ć2h1č2k1ž2k1b_lj22k1c2k1d2k1f2k1g_nj2_dž22k1h2k1k2k1m2k1n2k1p2k1s2k1t2hvć2hvđ2k1z2k1š2k1đ2k1ć2k1č2t1ž2t1b2t1c2t1d2t1f2t1g2t1h2t1k2t1m2t1n2t1p2t1s2t1t2hvš2hvz2t1z2t1š2t1đ2t1ć2t1č2dj_2dl_2hvt2dr_2dv_2gj_2gl_2skb2skc2skd2skf2skg2skh2skk2skm2skn2skp2sks2skt2žmć2žmđ2skz2skš2skđ2skć2skč2skž2stb2stc2std2stf2stg2sth2stk2stm2stn2stp2sts2stt2žmš2žmz2stz2stš2stđ2stć2stč2stž2škb2škc2škd2škf2škg2škh2škk2škm2škn2škp2šks2škt2žmv2žmt2škz2škš2škđ2škć2škč2škž2štb2štc2štd2štf2štg2šth2štk2štm2štn2štp2šts2štt2žms2žmp2štz2štš2štđ2štć2štč2štž2spb2spc2spd2spf2spg2sph2spk2spm2spn2spp2sps2spt2spv2žmn2žmm2spz2spš2spđ2spć2spč2spž2svb2svc2svd2svf2svg2svh2svk2svm2svn2svp2svs2svt2svv2žmk2žmh2svz2svš2svđ2svć2svč2svž2špb2špc2špd2špf2špg2šph2špk2špm2špn2špp2šps2špt2špv2žmg2žmf2špz2špš2špđ2špć2špč2špž2švb2švc2švd2švf2švg2švh2švk2švm2švn2švp2švs2švt2švv2žmd2žmc2švz2švš2švđ2švć2švč2švž2ždb2ždc2ždd2ždf2ždg2ždh2ždk2ždm2ždn2ždp2žds2ždt2žmb2zbž2ždz2ždš2ždđ2ždć2ždč2žgb2žgc2žgd2žgf2žgg2žgh2žgk2žgm2žgn2žgp2žgs2žgt2zbč2zbć2žgz2žgš2žgđ2žgć2žgč2žgž2zdb2zdc2zdd2zdf2zdg2zdh2zdk2zdm2zdn2zdp2zds2zdt2zbđ2zbš2zdz2zdš2zdđ2zdć2zdč2zgb2zgc2zgd2zgf2zgg2zgh2zgk2zgm2zgn2zgp2zgs2zgt2zbz2zbv2zgz2zgš2zgđ2zgć2zgč2zgž2žvb2žvc2žvd2žvf2žvg2žvh2žvk2žvm2žvn2žvp2žvs2žvt2žvv2zbt2zbs2žvz2žvš2žvđ2žvć2žvč2žvž2žbb2žbc2žbd2žbf2žbg2žbh2žbk2žbm2žbn2žbp2žbs2žbt2žbv2zbp2zbn2žbz2žbš2žbđ2žbć2žbč2žbž2zvb2zvc2zvd2zvf2zvg2zvh2zvk2zvm2zvn2zvp2zvs2zvt2zvv2zbm2zbk2zvz2zvš2zvđ2zvć2zvč2zvž2zbb2zbc2zbd2zbf2zbg2zbh",
  13 "_be2z3alkohol_pre2d3ubijeđ",
  6
  "2c3vlj2g3vlj2š3plj2lj1lj2z3vlj2ž3dlj2nj1dž2h3vlj2š3vlj2ž3glj2nj1nj2č3vlj2ž3mlj2z3dlj2lj1dž2s3vlj2lj1nj2d3vlj2z3glj2ž3blj2š3mlj2z3blj2dž1dž2dž1nj2k3vlj2dž1lj2ž3vlj2š3tlj_a2d3j_u2š3č_u2š3ć_u2s3p_u2s3k_u2s3c_izr2k_ist2k_nag2n_u2z3v_u2z3r_u2z3n_u2z3m_u2z3l_u2z3j_u2z3i_u2z3g_u2z3d_u2z3b_o2d3v_o2d3r_o2d3l_o2d3j2t3vlj_o2b3r_o2b3j_i2š3č_i2š3ć_i2ž3đ_i2s3t_i2s3p_i2s3k_i2s3c_i2z3u_i2z3o_i2z3i_i2z3v_i2z3r_i2z3n_i2z3m_i2z3l_i2z3j_i2z3g_i2z3d_i2z3b4r3je_4r3jem2nj1lj_u3g2n3č2lan3c2mok3c2mač3h2tel3h2tev3c2mak3c2miz3t2mur3t2muo3t2mul3s2fer2s3klj3p2suj3p2sov3p2sič3p2sik3m2naž3m2nog3m2nož3b2det3k2než3k2nez3g2nev3g2mil3g2naj3g2miz3g2nos3g2noz3g2noj",
  3
  "š2ćt2jt2vd2jd2ld2rd2vg2jg2lg2rg2vh2jh2lh2rh2vk2jk2lk2rk2vd2žn2jl2jt2lp2jp2lp2rv2jv2lv2rb2jb2lb2rf2jf2lf2rm2jm2lm2rs2cs2js2ks2ls2ms2ns2ps2rs2ts2vz2bz2dz2gz2jz2lz2mz2nz2rz2vš2cš2kš2lš2mš2nš2pš2tš2vt2rš2čž2bž2dž2gž2lž2mž2nž2vž2đc2jc2rc2vč2v_h2_j2_k2_l2_m2_n2_p2_r2_s2_t2_v2_z2_š2_đ2_ć2_č2_ž2_b2_c2_d2_f2_g2o3ao3eo3io3oo3uu3au3eu3iu3ou3ua3aa3ea3ia3oa3ue3ae3ee3ie3oe3ui3ai3ei3ii3oi3u2a12e12i12o12u1",
  12
  "_iz3be2z3obr_be3s4krupul_proti2v3otr_proti2v3akc_be3s4pokoja_pre2d3uvjet_pre2d3uvjer_pre2d3ubjeđ_iz3va2n3evr_ra3s4kloplj_be3s4pokojn_i3z4bleušan_po2d3ra2z3d_inte3r4ogat_inte3r4eždž_be2z3atomsk_u2z3obijest_i3z4bičkava",
  11
  "_i3s4pravlj_iz3be2z3um_u3s4porenj_obe3z4nanj_i3s4paljiv_obe3s4tran_inte3r4egn_inte3r4esi_inte3r4esn_inte3r4eso_inte3r4esu_inte3r4esa_inte3r4ese_ra3s4polož_inte3r4ije_o2b3istinj_ra3s4plinj_di2s3parit_i3s4kuplja_o2d3i2z3d_po2d3varij_po2d3lakat_po2d3lijep_i3s4kariot_po2d3lijet_po2d3lijeć_po2d3lijež_po2d3lijeg_po2st3indu_po2d3ravnj_ra3s4klopa_po2st3oper_pre3d4vest_pre3d4voji_pre3d4voja_pre3d4voje_pre2d3ispi_pre2d3isto_i3z4viiskr_pre2d3istr_pre2d3odre_be3z4bjedn_be3z4bjeda_pre2d3okus_pre2d3osje_pre2d3ubeđ_supe3r4ior_ra3s4klopi_va2n3ustav_bes4tseler_ra3s4klanj_be3s4trana_pre2d3uver_be3z4istan_be3z4isten_pre2d3ugov_pre2d3udar_pre2d3upis_ra3z4bašur_pre2d3uslo_a2n3a4e2ro_tran3s4kri_proti2v3ud_be3z4načaj_proti2v3us_proti2v3of",
  9
  "_o2b3ubož_su2b3inv_i3s4mije_i3z4vjed_i2n3just_inte2r3a_i3s4pira_i3s4plit_i3s4plić_inte2r3u_inte2r3o_i3z4vojc_inte2r3i_i2n3util3g2djekak_i2n3unda_o3d4vesn_o3d4vest_o3d4vesa_i2n3umbr_o3d4vikn_i2n3ofic_i3s4pupč3g2niježđ_i3z4gred_a2n3ovar_a2n3iridne3g2dje__o2d3isti_i3s4tavi_i2n3opse_i3s4taknni3g2dje__i3z4drav3g2nijezd_na2d3žup_o3d4laka_na2d3živ_na2d3žir_uza3t2ka_i2n3opor_tran2s3v_o2d3onl_i3s4tori_i3s4točn_i2n3oper_o3d4rani_o3d4rano_o3d4ranu_o3d4rana_o3d4rane_i3s4toča_i3s4trav_i3s4trad_o3d4rapi_a2n3izur_o3d4rapa_a2n3izom_o3d4rven_a2n3izog_o3d4rveč_i3s4tran_i3s4trić_i3s4triž_i3s4tric_i3s4trug_tran2s3u_nu2s3pro_tran2s3t_tran2s3p_iz4oanem_iz4oanom_be3s4tid_po3d2nev_i2n3okup_iz4obron_tran2s3o_tran2s3n_iz4oglos_o3d4ronj_tran2s3m_na3d4val_iz4ograf_i2n3efek_na3d4vij_na3d4vit_na3d4vla_tran2s3l_na3d4vor_na2d3igr_na2d3inž_na2d3ina_po2d3adm_a2n3este_po2d3vez_po2d3več_po2d3vež_po2d3vik_po2d3vil_po2d3vir_a2n3erit_na2d3isk_na2d3jah_po2d3voz_po2d3vođ_po2d3vož_po2d3vod_na2d3jač_a2n3ener_po2d3vrć_na2d3jek_po2d3vrg_a2n3elek_po2d3vrs_po2d3vuć_po2d3igr_po2d3izv_na2d3jez_po3d4jen_po3d4ječ_a2n3ekum_na2d3ječ_po2d3lep_po2d3let_po2d3leć_po2d3lež_po2d3leg_po2d3liz_a2n3eger_na2d3jun_na3d4lan_na3d4leš_a2n3alfa_na3d4lež_po2d3lok_po2d3lom_po2d3lup_po2d3luč_po2d3luž_a2nakron_po2d3okn_na2d3ora_na2d3oso_na2d3ose_i2n3elig_na2d3ofi_po2d3rad_a2nafila_a2n3afij_tran2s3k_po2d3ram_po2d3ran_po2d3ras_na2d3ran_po2d3rep_po2d3res_po2d3rez_po2d3rik_po2d3rit_po2d3ron_po2d3rov_po2d3rož_po2d3ruk_po2d3rub_na2d3rač_tran2s3e_iz4oklin_nu2s3pos_po2d3usm_po2d3usn_na2d3rep_na2d3ruk_na2d3ruč_a2nastom_a2nastig_na2d3rug_a2naspaz_i3z4olat_i3z4olac_i3z4olir_i3z4olov_a2n3apto_pre2d3id_iz4oleks_iz4oluks_na2d3žnj_iz4ometr_na3j4avi_i2n3evid_na3j4ava_na3j4ave_a2n3andr_na3j4adi_na3j4ada_na3j4ade_na3j4aži_na3j4azi_na3j4ako_na3j4aka_a2n3akuz_na3j4alo_na3j4ami_na3j4aml_na3j4amn_na3j4ari_na3j4arm_na3j4arc_na3j4ati_a2nadipl_na3j4auk_iz4omorf_na2d3ždr_na3j4edi_na3j4edn_na3j4edr_na3j4eda_na3j4eži_na3j4ežu_na3j4eže_na3j4ezn_na3j4ezd_i2n3afek_na3j4etk_va2n3evr_na3j4uri_i2n3aura_tran2s3c_be3z4bol_ra3z4ban_ra3z4bar_ra3z4bau_ra3z4bad_o3t2kast_ra3z4boj_ra3z4bor_ra3z4val_raza3g2n_pro3t2ka_iz4opsef_pro3t2ki_pre2d3že_iz4osint_ra3z4vit_ra3z4vić_ra3z4voj_ra3z4von_iz4osist_iz4oskel_ra3z4vrt_ra3z4vrć_ra3z4gađ_ra3z4grt_obe2z3lj_iz4oskop_iz4ostaz_tran2s3a_supe2r3e_i2n3apst_i2n3anic_i2n3amor_obe3z4ub_pre2d3ži_ra3z4laz_ra3z4lag_ra3z4lik_ra3z4lič_ra3z4loz_ra3z4lož_ra3z4log_ra3z4met_ra3z4meć_supe2r3a_ra3z4nat_ra2z3obl_ra2z3obr_ra2z3oba_supe2r3u3g2degod__a2d3verb_ra2z3ort_ra2z3oru_i2n3akce_ra3z4red_ra3z4rok_ra3z4roč_ra2z3uve_ra2z3udi_ra2z3uda_ra2z3udb_ra2z3uzi_ra2z3uzd_ra2z3uze_a2d3erac_ra2z3umr_i2n3akur_i2n3adek_pred3m2n_po3t2kav_ra3s4kak_a2b3uzus_ra3s4kin_po3t2kat_a2b3reak_a2b3orig_di2s3ton_di2s3pon_i2z3bija_i2z3biva_ra3s4koš_o3b4jesi_ra3s4paj_ra3s4pav_i2z3vedi_a2b3irit_a2b3erir_a2b3erac_a2b3evak_a2b3anac_a2b3alij_i2z3vedn_i2z3vedb_i2z3vede_ra3s4pon_ra3s4por_o2b3lakš_o2b3lask_iz4ohips_o2b3lizi_be3z4jak_ra3s4taj_ra3s4tan_ra3s4tat_ra3s4tav_i3z4rael_ra3s4til_ra3s4tir_ra3s4tis_ra3s4tit_be3z4jač_ra3s4toj_di2s3poz_i3z4rači_di2s3kur_ra3s4trt_ra3s4tup_ra3s4tur_ra3s4tuć_di2s3kri_di2s3kre_i2z3anal_u2s3treb_ra3š4čić3g2djekad_po3t2kam_u2s3tres_u2s3trep_na3t2kam_na3t2kah_na3d2nic_na3d2nič_o3t2kasm_na3d2nev_o2b3list_o2b3loka_po3t2kah_supe2r3o_o3b4ljan_o3b4ljut_u3z4vijo_u3z4viju_u3z4vija_u3z4vije_o3b4ljuz_supe2r3i_o3b4raže_u2z3inat_u2z3iskr_o3b4razi_o3b4razn_o3b4razo_o3b4razu_o3b4raza_o3b4razd_o3b4ramb_su2b3ord_o3b4ranj_i3z4bojk_u3z4neve_u2s3tral_i3s4kanj_nu2z3rje_o3b4rašč_u2s3traj_i3s4kvas_u2z3orat_u2z3orav_i3s4kvrč_i3z4vali_i3s4kita_i3z4valu_i3z4vala_i3s4kram_i3s4krit_u3z4roko_u3z4roku_u3z4roka_i3s4kriš_o3b4reti_u2z3ugar_o3b4retn_i3s4krič_i3s4kric_i3s4krat_u3s4klađ_u3s4klad_o3b4riv_i3s4kren_nu2z3bel_i3s4kroj_u4s5koko_u4s5kolu_u4s5kole_u4s5kopa_u4s5kora_u4s5kosi_u4s5kotr_i3s4krsn_i3s4krsa_u3s4palo_juri2s3p_i3z4vale_su2b3rog_i3z4vižd_su2b3rep_juri2s3k_u3s4pjeh_u3s4pjel_u3s4pjem_u3s4pjet_u3s4pjev_u3s4pješ_u3s4pent_u3s4pija_u3s4pije_inte2r3e_u2s3tvrd_o3b4ronj_u3s4pori_u3s4pora_u2s3tvrđ_u2s3tara_i3s4ljeđ_i3s4ljed_o3b4rova_a2n3opis_i3z4vija_su2b3oks_o2d3žalj_o3b4runj_raz3d2ni_i3z4vinj_po2d3vrž",
  5
  "2n1nj2zvdž2žbnj2žvdž2žvnj2zgdž2zbnj2zbdž2zgnj2zddž2zdnj2žgdž2žgnj2žddž2ždnj2švdž2švnj2špdž2špnj2svdž2svnj2spdž2spnj2štdž2štnj2škdž2šknj2žmnj2žmdž2stdž2stnj2skdž2sknj2ć1dž2ć1nj2ć1lj2đ1dž2đ1nj2đ1lj2dž1č2dž1ć2dž1đ2dž1š2dž1z2dž1v2dž1t2smnj2smdž2dž1s2dž1r2dž1p2dž1n2dž1m2dž1l2dž1k2dž1j2dž1h2dž1g2dž1f2dž1d2dž1c2dž1b2dž1ž2nj1č2nj1ć2nj1đ2zmnj2zmdž2nj1š2nj1z2nj1v2nj1t2nj1s2nj1r2nj1p2nj1n2nj1m2nj1l2nj1k2nj1j2nj1h2nj1g2nj1f2nj1d2šmnj2šmdž2nj1c2nj1b2nj1ž2r1dž2r1nj2r1lj2lj1č2lj1ć2lj1đ2lj1š2lj1z2lj1v2lj1t2lj1s2lj1r2sclj2lj1p2lj1n2scnj2scdž2lj1m2lj1l2lj1k2lj1j2lj1h2lj1g2lj1f2lj1d2lj1c2lj1b2lj1ž2n1dž2žbdž2n1lj2l1dž2l1nj2l1lj2šclj2j1dž2j1nj2j1lj2šcnj2šcdž2č1dž2č1nj2č1lj2c1dž2c1nj2c1lj2žnj_2žlj_2ž1dž2šnj_2šlj_2š1dž2znj_2zlj_2z1dž2snj_2slj_2s1dž2ščlj2vlj_2plj_2mlj_2ščnj2ščdž2flj_2blj_2v1dž2v1nj2p1dž2p1nj2m1dž2m1nj2f1dž2f1nj2b1dž2b1nj2tlj_2klj_2kj_2hlj_2glj_2dlj_2hvnj2hvdž2t1dž2t1nj2k1dž2k1nj2h1dž2h1nj2ž3vl2c3vl2z3vl2š3vl2č3vl2č3vj2d3vl2d3vr2k3vj2k3vl2t3vj2t3vl2g3vj2g3vl2g3vr2h3vj2h3vl2h3vr2ž3mj2ž3ml2ž3mr2z3ml2z3mr2š3mj2š3ml2š3cj2š3cv2š3čv2š3tj2š3tl2s3tl2s3kj2š3pj2š3pl2ž3dj2ž3dl2ž3dv2ž3gj2ž3gl2ž3gr2ž3gv2z3dl2z3dv2z3gj2g1dž2ž3bj2ž3bl2ž3br2d1nj_be4o_bi4o_ge4o2d1dž2g1nj2zvnj3r2je3r2đa",
  10
  "_u3s4prema_u3s4posob_u3s4poreč_u3s4rijed_u2s3talas3g2djegod__u3s4poren_u3s4pikuš_u3s4pijuš_u3z4rijev_u3z4rijet_raza3t2ka_u2z3obest_u3z4nevje_u3z4ludob_na3t2kasm_na3t2kast_ra3š4ćenj_ra4s5turč_ra3s4troj_ra3s4tret_ra3s4trel_ra3s4tinj_ra3s4tenj_ra3s4prem_ra3s4prav_be3z4bedn_be3z4beda_ra3s4plin_ra3s4pinj_ra3s4piku_ra3s4pete_ra3s4peta_ra3s4peto_ra3s4peti_ra3s4krop_na2d3žanj_be3z4beli_be3z4vučn_ra3s4klon_ra3s4klad_be3z4vuča_ra3s4klap_ra3s4kand_ra2z3ular_ra2z3orav_ra2z3orat_ra3z4mrsk_ra3z4vrać_ra3z4vrat_ra3z4vije_ra3z4vija_ra3z4viju_ra3z4vigo_ra3z4vest_ra3z4vede_be3z4lobn_ra2z3anal_be3z4loba_be3z4račn_proti2v3r_be3z4rača_tran3s4ud_tran3s4um_tran3s4ep_tran2s3nj_be3s4porn_be3s4pora_be3s4tvar_be3s4tija_be3s4tilu_be3s4tilj_be3s4tras_pre3t2kat_pre3t2kam_pre2d3ruč_pre2d3rad_pre2d3rač_pre2d3rat_a2n3amert_pre3t2kah_pre2d3ose_pre2d3osv_pred3m2nj_i3z4bojak_pre2d3obj_i3z4valji_i3z4vijen_su2b3junk_pre2d3izb_pre2d3igr_pre3d4jen_pre3d4vos_pre3d4vor_i3z4vitop_i3z4vojac_i3z4gomet_i3z4ježlj_pre3d4var_pre3d4vaj_po2d3upla_po2d3ruča_po2d3ručn_po2d3ruči_po2d3ranj_po2d3razu_po2d3razr_po2st3onk_po2st3lim_a2n3afrod_po2d3ravn_po2d3ljut_po2d3list_po2st3egz_i3z4lopać_iz4okolon_i3z4railj_i3s4konsk_po2d3lakt_nu2z3ljub_po2d3vris_po2d3vrać_po2d3vrat_po2d3vlaš_po2d3vlas_po2d3vinj_nu2z3bilj_o3d4rinj_o3d4rvenj_o3d4rači_o3d4raplj_i3s4krenj_o2d3i2z3v_o3d4vikav_o3b4rovc_u3s4premi_o2b3lizav_o2b3lizat_di2s3akor_di2s3junk_di2s3kval_di2s3kont_di2s3kord_o2b3leden_o2b3lijeg_o2b3lijež_o2b3lijet_di2s3orij_i3s4lijeđ_o2b3lijep_inte2r3je_di2s3prop_o2b3istin_di2s3trak_i2n3abrup_i3s4lijed_obe3s4tij_obe3s4tan_obe3z4nač_i3s4pokoj_i2n3aplik_obe3z4nan_obe3z4vij_i2n3augur_na3j4uren_na3j4esti_na3j4avlj_na2d3udar_na2d3real_na2d3rašć_na2d3rast_na2d3osje_na3d4voje_na3d4vest_na3d4vesi_i3s4polin_i3s4porav_i3s4pravi_i3s4točnj_i3s4tifan_i3s4tavlj_i3s4prava_i3s4pravk_i3s4pravn_o3b4rašn",
  8
  "_iz4omer_i3s4luž_i3s4pav_i3s4pon_i2n3unk_i3s4pur_i3s4red_i3s4luš_i3s4tam_i3s4tar_i3s4tas_i3s4tać_i3s4tin_i3s4tir_i3s4tic_i3s4tok_i3s4tup_i3s4lov_i3s4lin_i3s4lik_i3s4led_po3m2nj_i3s4leđ_i2nokor_i2nogen_i3s4lab_na2d3lj_i3s4lam_i2n3obl_i2n3epc_na2d3oč_i2n3eks_i2n3ekv_i3s4koč_nu2z3re_na2d3um_na2d3uč_i3s4kin_i3s4kat_i3s4kak_i3z4upč_nu2z3už_na3j4ah_na3j4aš_na3j4ec_iz4ohro_iz4ohor_obe2z3b_obe2z3d_obe2z3g_obe2z3j_obe2z3l_obe2z3m_obe2z3n_obe2z3o_obe2z3r_obe2z3u_obe2z3v_i2n3art_obe2s3c_obe2s3k_obe2s3p_obe2s3t_obe2š3ć_obe2š3č_o2b3igr_o3b4jek_o3b4jer_o3b4jet_o3b4ješ_o2b3laj_o2b3lam_o2b3lep_o2b3let_o2b3leć_o2b3lež_o2b3leg_di2s3lo_o2b3liv_a2n3org_a2n3oft_o2b3luk_o2b3luč_o2b3oru_o3b4ran_o3b4rat_o3b4rać_a2n3orh_iz4ohit_iz4ohim_o3b4rem_o3b4res_o3b4ređ_o3b4reč_o3b4rež_o3b4rec_o3b4red_o3b4rij_o3b4ris_o3b4rit_o3b4rič_o3b4ric_iz4ohij_iz4ohel_iz4ohaz_o3b4rlj_iz4ohal_iz4ofot_iz4ofon_iz4otro_o3b4rok_o3b4ron_o3b4roć_o3b4roč_o3b4ruk_o3b4run_iz4otop_o3b4ruš_o3b4ruč_iz4oton_iz4oter_iz4otal_o2b3umi_o2b3umj_o2b3umr_o2b3ume_o3t2kam_o3t2kah_o2d3lj_iz4otah_iz4oste_o2d3arg_o3d4vaj_o3d4važ_a2n3oks_o3d4vis_o3d4vić_o3d4voj_o2d3igr_o2d3isk_o3d4jel_o3d4jen_o3d4jev_o3d4jeć_o3d4laz_o3d4laž_o3d4lag_o3d4luk_o3d4luč_o2d3ozd_o2d3ozg_iz4osei_o2d3ono_o2d3onu_o2d3ond_o3d4raz_o3d4rać_o3d4raž_o3d4rem_o3d4ren_o3d4ret_o3d4ređ_o3d4red_iz4orah_iz4opol_iz4ople_o3d4rlj_iz4oper_iz4opat_o3d4rin_a2n3idr_o3d4riš_o3d4rič_o3d4rib_o3d4ric_o3d4ron_o3d4ruž_o3d4rug_o2d3uvi_o2d3uve_o2d3uzi_o2d3uzl_o2d3uzd_o2d3uze_iz4onom_iz4onef_i3s4mje_iz4odoz_a2n3erg_iz4odin_a2n3epi_iz4odim_iz4ogon_a2n3ekl_a2nahro_a2nahor_a2nafor_a2nakru_po2d3oš_po2d3oč_po2d3of_a2nakol_a2nafon_a2nafaz_a2natro_a2natri_a2natre_a2natoc_a2natom_pre2d3j_pre2d3v_a2natim_a2nasta_a2nasei_a2nasar_a2n3arh_iz4ogeo_a2napti_a2napro_a2napno_a2napne_a2naple_a2napla_a2n3ant_a2naneo_a2namne_a2nalit_a2nalis_a2naliz_a2nalep_a2n3ald_a2n3alg_a2nakoj_a2nakli_a2nakla_a2nakef_a2nakat_a2nakam_a2nakal_a2nadoz_a2nadem_a2nagra_a2n3ago_a2nagno_iz4ogam_iz4obat_i3z4noj_i3z4nim_i3z4log_i3z4lož_i3z4loz_i3z4imi_i3z4grt_i3z4grn_ra2z3lj_i3z4vor_su3b4aš_ra2z3nj_a2nagen_a2nabol_a2nabio_a2nabat_a2nabaz_a2nabap_a3g2noz_a3g2nos_a2d3rog_a2d3ren_ra3z4ev_ra3z4ij_ra3z4il_ra3z4in_ra3z4ir_ra3z4it_ra3z4iz_ra3z4iđ_ra3z4ić_ra3z4id_a2d3lat_ra2z3od_iza3g2n_ra2z3ot_i3z4vir_i3z4vin_i3z4bav_i2z3aka_a2b3rog_i2z3aba_a2b3lok_a2b3lep_a2b3leg_i2z3daj_pro3g2n_iza3t2k_ra3s4pn_raz3g2n_u2s3tuć_u2s3tur_ra3s4rđ_ra3s4rd_ra3s4re_u2s3tum_u2s3trč_u2s3trć_u2s3trp_u2s3trn_u2s3trk_a2n3jon_i2n3jek_oda3d2n_oda3g2n_be3z4ub_be3z4up_i2n3jur_u3z4bor_u3z4van_u3z4vat_u3z4viž_u3z4voj_u3z4dic_u2z3igr_u3z4lan_u3z4lat_u3z4lim_u3z4lit_u3z4lić_u3z4lic_u3z4lov_u2s3trg_u3z4nak_u3z4nač_u3z4nič_u3z4nic_u3z4noj_u2s3tov_u2z3oho_u3z4ret_u3z4rev_u2s3teg_u2s3teć_o2d3žal_u3z4rnj_u3z4roč_u3z4ruj_na2d3že_za3t2ka_be2z3nj_u3s4kak_be2z3lj_u4s5kom_u4s5kov_u4s5koš_u3s4kup_u3s4pav_u3s4peh_u3s4pel_u3s4pem_u3s4pet_u3s4pev_u3s4peš_u2s3ter_u3s4pon3h2tjeti3h2tjenj3g2dekak3g2dekadni3g2de_ne3g2de_3g2njilj_u3s4rlj3b2djenj_o3b4rus"},
 :patternChars "_abcdefghijklmnoprstuvzćčđšž"}
)

(def rules
  (-> rules'
      (assoc :trie (pat/build-trie rules'))
      (dissoc :patterns)))

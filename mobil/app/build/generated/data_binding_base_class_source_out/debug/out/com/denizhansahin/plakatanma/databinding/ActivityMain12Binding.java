// Generated by view binder compiler. Do not edit!
package com.denizhansahin.plakatanma.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.denizhansahin.plakatanma.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain12Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText ayOzel;

  @NonNull
  public final Button gunAyButton;

  @NonNull
  public final EditText gunOzel;

  @NonNull
  public final TextView kullaniciID;

  @NonNull
  public final TextView kullaniciID1;

  @NonNull
  public final TextView plakaTespitEdilme;

  @NonNull
  public final TextView plakaTespitEdilme1;

  @NonNull
  public final ScrollView scrollView5;

  @NonNull
  public final TableLayout tableLayout;

  @NonNull
  public final TableLayout tableLayout1;

  @NonNull
  public final TextView textViewDosyaAdi;

  @NonNull
  public final TextView textViewDosyaAdi1;

  @NonNull
  public final TextView textViewIslemAy;

  @NonNull
  public final TextView textViewIslemAy1;

  @NonNull
  public final TextView textViewIslemDakika;

  @NonNull
  public final TextView textViewIslemDakika1;

  @NonNull
  public final TextView textViewIslemGorevi;

  @NonNull
  public final TextView textViewIslemGorevi1;

  @NonNull
  public final TextView textViewIslemGun;

  @NonNull
  public final TextView textViewIslemGun1;

  @NonNull
  public final TextView textViewIslemSaat;

  @NonNull
  public final TextView textViewIslemSaat1;

  @NonNull
  public final TextView textViewPlaka;

  @NonNull
  public final TextView textViewPlaka1;

  private ActivityMain12Binding(@NonNull ConstraintLayout rootView, @NonNull EditText ayOzel,
      @NonNull Button gunAyButton, @NonNull EditText gunOzel, @NonNull TextView kullaniciID,
      @NonNull TextView kullaniciID1, @NonNull TextView plakaTespitEdilme,
      @NonNull TextView plakaTespitEdilme1, @NonNull ScrollView scrollView5,
      @NonNull TableLayout tableLayout, @NonNull TableLayout tableLayout1,
      @NonNull TextView textViewDosyaAdi, @NonNull TextView textViewDosyaAdi1,
      @NonNull TextView textViewIslemAy, @NonNull TextView textViewIslemAy1,
      @NonNull TextView textViewIslemDakika, @NonNull TextView textViewIslemDakika1,
      @NonNull TextView textViewIslemGorevi, @NonNull TextView textViewIslemGorevi1,
      @NonNull TextView textViewIslemGun, @NonNull TextView textViewIslemGun1,
      @NonNull TextView textViewIslemSaat, @NonNull TextView textViewIslemSaat1,
      @NonNull TextView textViewPlaka, @NonNull TextView textViewPlaka1) {
    this.rootView = rootView;
    this.ayOzel = ayOzel;
    this.gunAyButton = gunAyButton;
    this.gunOzel = gunOzel;
    this.kullaniciID = kullaniciID;
    this.kullaniciID1 = kullaniciID1;
    this.plakaTespitEdilme = plakaTespitEdilme;
    this.plakaTespitEdilme1 = plakaTespitEdilme1;
    this.scrollView5 = scrollView5;
    this.tableLayout = tableLayout;
    this.tableLayout1 = tableLayout1;
    this.textViewDosyaAdi = textViewDosyaAdi;
    this.textViewDosyaAdi1 = textViewDosyaAdi1;
    this.textViewIslemAy = textViewIslemAy;
    this.textViewIslemAy1 = textViewIslemAy1;
    this.textViewIslemDakika = textViewIslemDakika;
    this.textViewIslemDakika1 = textViewIslemDakika1;
    this.textViewIslemGorevi = textViewIslemGorevi;
    this.textViewIslemGorevi1 = textViewIslemGorevi1;
    this.textViewIslemGun = textViewIslemGun;
    this.textViewIslemGun1 = textViewIslemGun1;
    this.textViewIslemSaat = textViewIslemSaat;
    this.textViewIslemSaat1 = textViewIslemSaat1;
    this.textViewPlaka = textViewPlaka;
    this.textViewPlaka1 = textViewPlaka1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain12Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain12Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main12, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain12Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ay_ozel;
      EditText ayOzel = ViewBindings.findChildViewById(rootView, id);
      if (ayOzel == null) {
        break missingId;
      }

      id = R.id.gun_ay_button;
      Button gunAyButton = ViewBindings.findChildViewById(rootView, id);
      if (gunAyButton == null) {
        break missingId;
      }

      id = R.id.gun_ozel;
      EditText gunOzel = ViewBindings.findChildViewById(rootView, id);
      if (gunOzel == null) {
        break missingId;
      }

      id = R.id.kullaniciID;
      TextView kullaniciID = ViewBindings.findChildViewById(rootView, id);
      if (kullaniciID == null) {
        break missingId;
      }

      id = R.id.kullaniciID1;
      TextView kullaniciID1 = ViewBindings.findChildViewById(rootView, id);
      if (kullaniciID1 == null) {
        break missingId;
      }

      id = R.id.plakaTespitEdilme;
      TextView plakaTespitEdilme = ViewBindings.findChildViewById(rootView, id);
      if (plakaTespitEdilme == null) {
        break missingId;
      }

      id = R.id.plakaTespitEdilme1;
      TextView plakaTespitEdilme1 = ViewBindings.findChildViewById(rootView, id);
      if (plakaTespitEdilme1 == null) {
        break missingId;
      }

      id = R.id.scrollView5;
      ScrollView scrollView5 = ViewBindings.findChildViewById(rootView, id);
      if (scrollView5 == null) {
        break missingId;
      }

      id = R.id.tableLayout;
      TableLayout tableLayout = ViewBindings.findChildViewById(rootView, id);
      if (tableLayout == null) {
        break missingId;
      }

      id = R.id.tableLayout1;
      TableLayout tableLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (tableLayout1 == null) {
        break missingId;
      }

      id = R.id.textViewDosyaAdi;
      TextView textViewDosyaAdi = ViewBindings.findChildViewById(rootView, id);
      if (textViewDosyaAdi == null) {
        break missingId;
      }

      id = R.id.textViewDosyaAdi1;
      TextView textViewDosyaAdi1 = ViewBindings.findChildViewById(rootView, id);
      if (textViewDosyaAdi1 == null) {
        break missingId;
      }

      id = R.id.textViewIslemAy;
      TextView textViewIslemAy = ViewBindings.findChildViewById(rootView, id);
      if (textViewIslemAy == null) {
        break missingId;
      }

      id = R.id.textViewIslemAy1;
      TextView textViewIslemAy1 = ViewBindings.findChildViewById(rootView, id);
      if (textViewIslemAy1 == null) {
        break missingId;
      }

      id = R.id.textViewIslemDakika;
      TextView textViewIslemDakika = ViewBindings.findChildViewById(rootView, id);
      if (textViewIslemDakika == null) {
        break missingId;
      }

      id = R.id.textViewIslemDakika1;
      TextView textViewIslemDakika1 = ViewBindings.findChildViewById(rootView, id);
      if (textViewIslemDakika1 == null) {
        break missingId;
      }

      id = R.id.textViewIslemGorevi;
      TextView textViewIslemGorevi = ViewBindings.findChildViewById(rootView, id);
      if (textViewIslemGorevi == null) {
        break missingId;
      }

      id = R.id.textViewIslemGorevi1;
      TextView textViewIslemGorevi1 = ViewBindings.findChildViewById(rootView, id);
      if (textViewIslemGorevi1 == null) {
        break missingId;
      }

      id = R.id.textViewIslemGun;
      TextView textViewIslemGun = ViewBindings.findChildViewById(rootView, id);
      if (textViewIslemGun == null) {
        break missingId;
      }

      id = R.id.textViewIslemGun1;
      TextView textViewIslemGun1 = ViewBindings.findChildViewById(rootView, id);
      if (textViewIslemGun1 == null) {
        break missingId;
      }

      id = R.id.textViewIslemSaat;
      TextView textViewIslemSaat = ViewBindings.findChildViewById(rootView, id);
      if (textViewIslemSaat == null) {
        break missingId;
      }

      id = R.id.textViewIslemSaat1;
      TextView textViewIslemSaat1 = ViewBindings.findChildViewById(rootView, id);
      if (textViewIslemSaat1 == null) {
        break missingId;
      }

      id = R.id.textViewPlaka;
      TextView textViewPlaka = ViewBindings.findChildViewById(rootView, id);
      if (textViewPlaka == null) {
        break missingId;
      }

      id = R.id.textViewPlaka1;
      TextView textViewPlaka1 = ViewBindings.findChildViewById(rootView, id);
      if (textViewPlaka1 == null) {
        break missingId;
      }

      return new ActivityMain12Binding((ConstraintLayout) rootView, ayOzel, gunAyButton, gunOzel,
          kullaniciID, kullaniciID1, plakaTespitEdilme, plakaTespitEdilme1, scrollView5,
          tableLayout, tableLayout1, textViewDosyaAdi, textViewDosyaAdi1, textViewIslemAy,
          textViewIslemAy1, textViewIslemDakika, textViewIslemDakika1, textViewIslemGorevi,
          textViewIslemGorevi1, textViewIslemGun, textViewIslemGun1, textViewIslemSaat,
          textViewIslemSaat1, textViewPlaka, textViewPlaka1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

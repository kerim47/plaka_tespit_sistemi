// Generated by view binder compiler. Do not edit!
package com.denizhansahin.plakatanma.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.denizhansahin.plakatanma.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMain31Binding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button;

  @NonNull
  public final Button buttonKisi;

  @NonNull
  public final Button buttonPlakaTakip;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final LinearLayout linearLayout2;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final LinearLayout linearLayout33333;

  private ActivityMain31Binding(@NonNull ConstraintLayout rootView, @NonNull Button button,
      @NonNull Button buttonKisi, @NonNull Button buttonPlakaTakip, @NonNull ImageView imageView2,
      @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3,
      @NonNull LinearLayout linearLayout33333) {
    this.rootView = rootView;
    this.button = button;
    this.buttonKisi = buttonKisi;
    this.buttonPlakaTakip = buttonPlakaTakip;
    this.imageView2 = imageView2;
    this.linearLayout2 = linearLayout2;
    this.linearLayout3 = linearLayout3;
    this.linearLayout33333 = linearLayout33333;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMain31Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMain31Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main31, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMain31Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button_kisi;
      Button buttonKisi = ViewBindings.findChildViewById(rootView, id);
      if (buttonKisi == null) {
        break missingId;
      }

      id = R.id.button_plaka_takip;
      Button buttonPlakaTakip = ViewBindings.findChildViewById(rootView, id);
      if (buttonPlakaTakip == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.linearLayout2;
      LinearLayout linearLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout2 == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.linearLayout33333;
      LinearLayout linearLayout33333 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout33333 == null) {
        break missingId;
      }

      return new ActivityMain31Binding((ConstraintLayout) rootView, button, buttonKisi,
          buttonPlakaTakip, imageView2, linearLayout2, linearLayout3, linearLayout33333);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

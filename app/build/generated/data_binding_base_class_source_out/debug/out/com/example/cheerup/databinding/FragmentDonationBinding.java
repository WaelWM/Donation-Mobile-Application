// Generated by view binder compiler. Do not edit!
package com.example.cheerup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cheerup.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDonationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button centerBtn;

  @NonNull
  public final TextView coinsTxt;

  @NonNull
  public final Button donateMoneyBtn;

  @NonNull
  public final Button donateOthersBtn;

  private FragmentDonationBinding(@NonNull ConstraintLayout rootView, @NonNull Button centerBtn,
      @NonNull TextView coinsTxt, @NonNull Button donateMoneyBtn, @NonNull Button donateOthersBtn) {
    this.rootView = rootView;
    this.centerBtn = centerBtn;
    this.coinsTxt = coinsTxt;
    this.donateMoneyBtn = donateMoneyBtn;
    this.donateOthersBtn = donateOthersBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDonationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDonationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_donation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDonationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.centerBtn;
      Button centerBtn = ViewBindings.findChildViewById(rootView, id);
      if (centerBtn == null) {
        break missingId;
      }

      id = R.id.coinsTxt;
      TextView coinsTxt = ViewBindings.findChildViewById(rootView, id);
      if (coinsTxt == null) {
        break missingId;
      }

      id = R.id.donateMoneyBtn;
      Button donateMoneyBtn = ViewBindings.findChildViewById(rootView, id);
      if (donateMoneyBtn == null) {
        break missingId;
      }

      id = R.id.donateOthersBtn;
      Button donateOthersBtn = ViewBindings.findChildViewById(rootView, id);
      if (donateOthersBtn == null) {
        break missingId;
      }

      return new FragmentDonationBinding((ConstraintLayout) rootView, centerBtn, coinsTxt,
          donateMoneyBtn, donateOthersBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

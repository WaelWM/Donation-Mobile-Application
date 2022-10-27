// Generated by view binder compiler. Do not edit!
package com.example.cheerup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cheerup.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentEventsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button Eventsbtn;

  @NonNull
  public final ConstraintLayout recentEventbtn;

  @NonNull
  public final Button registeredEventsBtn;

  private FragmentEventsBinding(@NonNull ConstraintLayout rootView, @NonNull Button Eventsbtn,
      @NonNull ConstraintLayout recentEventbtn, @NonNull Button registeredEventsBtn) {
    this.rootView = rootView;
    this.Eventsbtn = Eventsbtn;
    this.recentEventbtn = recentEventbtn;
    this.registeredEventsBtn = registeredEventsBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEventsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEventsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_events, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEventsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Eventsbtn;
      Button Eventsbtn = ViewBindings.findChildViewById(rootView, id);
      if (Eventsbtn == null) {
        break missingId;
      }

      ConstraintLayout recentEventbtn = (ConstraintLayout) rootView;

      id = R.id.registeredEventsBtn;
      Button registeredEventsBtn = ViewBindings.findChildViewById(rootView, id);
      if (registeredEventsBtn == null) {
        break missingId;
      }

      return new FragmentEventsBinding((ConstraintLayout) rootView, Eventsbtn, recentEventbtn,
          registeredEventsBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

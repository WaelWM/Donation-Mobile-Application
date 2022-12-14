// Generated by view binder compiler. Do not edit!
package com.example.cheerup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cheerup.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class EventListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView eventImage;

  @NonNull
  public final TextView txtCity;

  @NonNull
  public final TextView txtName;

  private EventListBinding(@NonNull LinearLayout rootView, @NonNull ImageView eventImage,
      @NonNull TextView txtCity, @NonNull TextView txtName) {
    this.rootView = rootView;
    this.eventImage = eventImage;
    this.txtCity = txtCity;
    this.txtName = txtName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static EventListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static EventListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.event_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static EventListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.eventImage;
      ImageView eventImage = ViewBindings.findChildViewById(rootView, id);
      if (eventImage == null) {
        break missingId;
      }

      id = R.id.txtCity;
      TextView txtCity = ViewBindings.findChildViewById(rootView, id);
      if (txtCity == null) {
        break missingId;
      }

      id = R.id.txtName;
      TextView txtName = ViewBindings.findChildViewById(rootView, id);
      if (txtName == null) {
        break missingId;
      }

      return new EventListBinding((LinearLayout) rootView, eventImage, txtCity, txtName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
